package Products.Other;

import Products.Product;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class Vehicle extends Product {
    protected int HP;
    protected String producent;

    public Vehicle(int ID, int cost, String name, int size, int HP, String producent) {
        super(ID, cost, name, size);
        this.HP = HP;
        this.producent = producent;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(HP, vehicle.HP)
                .append(producent, vehicle.producent)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(HP)
                .append(producent)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("HP", HP)
                .append("producent", producent)
                .append("cost", cost)
                .append("name", name)
                .append("size", size)
                .toString();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Produkt jest narzedziem zagłady, idealnym na apokalipse zombie\n"
                +"Specyfikacja: "+getHP()+" HP";
    }
}
