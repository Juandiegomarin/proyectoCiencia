
package modelo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "adjustedBytes",
    "energy",
    "co2"
})
@Generated("jsonschema2pojo")
public class Statistics {

    @JsonProperty("adjustedBytes")
    private Double adjustedBytes;
    @JsonProperty("energy")
    private Double energy;
    @JsonProperty("co2")
    private Co2 co2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Statistics() {
    }

    /**
     * 
     * @param co2
     * @param adjustedBytes
     * @param energy
     */
    public Statistics(Double adjustedBytes, Double energy, Co2 co2) {
        super();
        this.adjustedBytes = adjustedBytes;
        this.energy = energy;
        this.co2 = co2;
    }

    @JsonProperty("adjustedBytes")
    public Double getAdjustedBytes() {
        return adjustedBytes;
    }

    @JsonProperty("adjustedBytes")
    public void setAdjustedBytes(Double adjustedBytes) {
        this.adjustedBytes = adjustedBytes;
    }

    @JsonProperty("energy")
    public Double getEnergy() {
        return energy;
    }

    @JsonProperty("energy")
    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    @JsonProperty("co2")
    public Co2 getCo2() {
        return co2;
    }

    @JsonProperty("co2")
    public void setCo2(Co2 co2) {
        this.co2 = co2;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Statistics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adjustedBytes");
        sb.append('=');
        sb.append(((this.adjustedBytes == null)?"<null>":this.adjustedBytes));
        sb.append(',');
        sb.append("energy");
        sb.append('=');
        sb.append(((this.energy == null)?"<null>":this.energy));
        sb.append(',');
        sb.append("co2");
        sb.append('=');
        sb.append(((this.co2 == null)?"<null>":this.co2));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.adjustedBytes == null)? 0 :this.adjustedBytes.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.energy == null)? 0 :this.energy.hashCode()));
        result = ((result* 31)+((this.co2 == null)? 0 :this.co2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Statistics) == false) {
            return false;
        }
        Statistics rhs = ((Statistics) other);
        return (((((this.adjustedBytes == rhs.adjustedBytes)||((this.adjustedBytes!= null)&&this.adjustedBytes.equals(rhs.adjustedBytes)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.energy == rhs.energy)||((this.energy!= null)&&this.energy.equals(rhs.energy))))&&((this.co2 == rhs.co2)||((this.co2 != null)&&this.co2 .equals(rhs.co2))));
    }

}
