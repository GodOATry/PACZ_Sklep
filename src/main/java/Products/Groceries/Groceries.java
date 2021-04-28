package Products.Groceries;

import Products.Product;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class Groceries extends Product {
    protected int weight;
    protected boolean isBio;

    public Groceries(int ID, int cost, String name, int size, int weight, boolean isBio) {
        super(ID, cost, name, size);
        this.weight = weight;
        this.isBio = isBio;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isBio() {
        return isBio;
    }

    public void setBio(boolean bio) {
        isBio = bio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Groceries groceries = (Groceries) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(weight, groceries.weight)
                .append(isBio, groceries.isBio)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(weight)
                .append(isBio)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("weight", weight)
                .append("isBio", isBio)
                .append("cost", cost)
                .append("name", name)
                .append("size", size)
                .toString();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Ryneczek Lidla zaprasza!";
    }
}
