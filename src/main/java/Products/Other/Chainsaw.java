package Products.Other;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Chainsaw extends Vehicle{
    private int chainLength;
    private String Color;

    public Chainsaw(int ID, int cost, String name, int size, int HP, String producent, int chainLength, String color) {
        super(ID, cost, name, size, HP, producent);
        this.chainLength = chainLength;
        Color = color;
    }

    public int getChainLength() {
        return chainLength;
    }

    public void setChainLength(int chainLength) {
        this.chainLength = chainLength;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Chainsaw chainsaw = (Chainsaw) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(chainLength, chainsaw.chainLength)
                .append(Color, chainsaw.Color)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(chainLength)
                .append(Color)
                .toHashCode();
    }

    @Override
    public String toString() {
//        return new ToStringBuilder(this)
//                .append("chainLength", chainLength)
//                .append("Color", Color)
//                .append("HP", HP)
//                .append("producent", producent)
//                .append("cost", cost)
//                .append("name", name)
//                .append("size", size)
//                .toString();
        return String.format(name+" "+cost);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nTypowe narzędzie zbrodni Leatherface byl by dumny";
    }
}
