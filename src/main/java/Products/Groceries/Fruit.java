package Products.Groceries;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Fruit extends Groceries {
    private int sweetness;

    public Fruit(int ID, int cost, String name, int size, int weight, boolean isBio, int sweetness) {
        super(ID, cost, name, size, weight, isBio);
        this.sweetness = sweetness;
    }

    public int getSweetness() {
        return sweetness;
    }

    public void setSweetness(int sweetness) {
        this.sweetness = sweetness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(sweetness, fruit.sweetness)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(sweetness)
                .toHashCode();
    }
    @Override
    public String toString() {
//        return new ToStringBuilder(this)
//                .append("bulwa", bulwa)
//                .append("weight", weight)
//                .append("isBio", isBio)
//                .append("cost", cost)
//                .append("name", name)
//                .append("size", size)
//                .toString();
        return String.format(name + " " + cost);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nOwoc " + this.getName() + " pozwoli ci przetrwać przez "+ String.valueOf(sweetness+3+this.getWeight() + " dni");
    }
}
