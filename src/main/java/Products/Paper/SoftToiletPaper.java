package Products.Paper;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SoftToiletPaper extends ToiletPaper {
    private int layers;
    private int soft;

    public SoftToiletPaper(int ID, int cost, String name, int size, int length, int absorbency, String info, int layers, int soft) {
        super(ID, cost, name, size, length, absorbency, info);
        this.layers = layers;
        this.soft = soft;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public int getSoft() {
        return soft;
    }

    public void setSoft(int soft) {
        this.soft = soft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        SoftToiletPaper that = (SoftToiletPaper) o;

        return new EqualsBuilder()
                .append(layers, that.layers)
                .append(soft, that.soft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(layers)
                .append(soft)
                .toHashCode();
    }

    @Override
    public String toString() {
//        return new ToStringBuilder(this)
//                .append("layers", layers)
//                .append("soft", soft)
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
        System.out.println("SoftToilet");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nStarczy ci on na około " + String.valueOf(10*layers-soft*2)+ " dni\n"+
                "Poziom miekkosci wynosi: "+ getSoft()+ " w skali sklepu Biedronka";
    }
}
