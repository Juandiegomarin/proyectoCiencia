
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
    "grams",
    "litres"
})
@Generated("jsonschema2pojo")
public class Grid {

    @JsonProperty("grams")
    private Double grams;
    @JsonProperty("litres")
    private Double litres;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Grid() {
    }

    /**
     * 
     * @param litres
     * @param grams
     */
    public Grid(Double grams, Double litres) {
        super();
        this.grams = grams;
        this.litres = litres;
    }

    @JsonProperty("grams")
    public Double getGrams() {
        return grams;
    }

    @JsonProperty("grams")
    public void setGrams(Double grams) {
        this.grams = grams;
    }

    @JsonProperty("litres")
    public Double getLitres() {
        return litres;
    }

    @JsonProperty("litres")
    public void setLitres(Double litres) {
        this.litres = litres;
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
        sb.append(Grid.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grams");
        sb.append('=');
        sb.append(((this.grams == null)?"<null>":this.grams));
        sb.append(',');
        sb.append("litres");
        sb.append('=');
        sb.append(((this.litres == null)?"<null>":this.litres));
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
        result = ((result* 31)+((this.litres == null)? 0 :this.litres.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.grams == null)? 0 :this.grams.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Grid) == false) {
            return false;
        }
        Grid rhs = ((Grid) other);
        return ((((this.litres == rhs.litres)||((this.litres!= null)&&this.litres.equals(rhs.litres)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.grams == rhs.grams)||((this.grams!= null)&&this.grams.equals(rhs.grams))));
    }

}
