package dto;

/**
 * Created by DoanNH on 8/7/2017.
 */
public class Money {
    private String type;
    private Double value;
    //


    public Money(String type, Double value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public Money setType(String type) {
        this.type = type;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public Money setValue(Double value) {
        this.value = value;
        return this;
    }
}
