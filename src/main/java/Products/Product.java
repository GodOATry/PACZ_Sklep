package Products;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class Product {
    private int ID;
    protected int cost;
    protected String name;
    protected int size;

    public Product(int ID, int cost, String name, int size) {
        this.ID = ID;
        this.cost = cost;
        this.name = name;
        this.size = size;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return new EqualsBuilder()
                .append(ID, product.ID)
                .append(cost, product.cost)
                .append(size, product.size)
                .append(name, product.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(ID)
                .append(cost)
                .append(name)
                .append(size)
                .toHashCode();
    }

    @Override
    public String toString() {
//        return new ToStringBuilder(this)
//                .append("ID", ID)
//                .append("cost", cost)
//                .append("name", name)
//                .append("size", size)
//                .toString();
        return String.format("NAME : "+name+" Price : "+cost+" ID : "+ID);
    }

    public void modify(){
        System.out.println("Produkt");
    }

    public String getInfo(){
        return "";
    }
}
