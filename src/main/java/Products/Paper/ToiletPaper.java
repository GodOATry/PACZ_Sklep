package Products.Paper;

import Products.Product;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ToiletPaper extends Product {

    protected int length;
    protected int absorbency;
    protected String info = "";

    public ToiletPaper(int ID, int cost, String name, int size,int length,int absorbency,String info) {
        super(ID, cost, name, size);
        this.length=length;
        this.absorbency=absorbency;
        this.info=info;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAbsorbency() {
        return absorbency;
    }

    public void setAbsorbency(int absorbency) {
        this.absorbency = absorbency;
    }

    public String getInfo() {
        return "Produkt pochodzi z rodziny papierowatych\n" +
                "Statystyki produktu:\n"
                +"Dlugosc:  " + getLength();
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ToiletPaper that = (ToiletPaper) o;

        return new EqualsBuilder()
                .append(length, that.length)
                .append(absorbency, that.absorbency)
                .append(info, that.info)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(length)
                .append(absorbency)
                .append(info)
                .toHashCode();
    }

    @Override
    public String toString() {
//        return new ToStringBuilder(this)
//                .append("length", length)
//                .append("absorbency", absorbency)
//                .append("info", info)
//                .append("cost", cost)
//                .append("name", name)
//                .append("size", size)
//                .toString();
        return String.format(name+" "+cost);
    }

    @Override
    public void modify(){
        System.out.println("ToiletPaper");
    }
}
