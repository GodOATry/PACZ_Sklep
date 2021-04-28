package Products.Other;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Mower extends Vehicle {
    private int propellerSize;
    private String petrol;

    public Mower(int ID, int cost, String name, int size, int HP, String producent, int propellerSize, String petrol) {
        super(ID, cost, name, size, HP, producent);
        this.propellerSize = propellerSize;
        this.petrol = petrol;
    }

    public int getPropellerSize() {
        return propellerSize;
    }

    public void setPropellerSize(int propellerSize) {
        this.propellerSize = propellerSize;
    }

    public String getPetrol() {
        return petrol;
    }

    public void setPetrol(String petrol) {
        this.petrol = petrol;
    }

    @Override
    public String toString() {
//        return new ToStringBuilder(this)
//                .append("propellerSize", propellerSize)
//                .append("petrol", petrol)
//                .append("HP", HP)
//                .append("producent", producent)
//                .append("cost", cost)
//                .append("name", name)
//                .append("size", size)
//                .toString();
        return String.format(name+" "+cost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Mower mower = (Mower) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(propellerSize, mower.propellerSize)
                .append(petrol, mower.petrol)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(propellerSize)
                .append(petrol)
                .toHashCode();
    }

    @Override
    public String getInfo() {
        String tmp = "";
        if(petrol.equals("diesle")){
            tmp = " Szanaje za wybor dobrego paliwa napedowego";
        } else {
            tmp = " Ha tfu na benzynke";
        }
        return super.getInfo()+"\nMalo mobilna ale jak trafisz zabije"
                + tmp;
    }
}
