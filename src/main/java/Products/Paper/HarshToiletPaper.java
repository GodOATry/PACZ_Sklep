package Products.Paper;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class HarshToiletPaper extends ToiletPaper {
    private int Harsh;

    public HarshToiletPaper(int ID, int cost, String name, int size, int length, int absorbency, String info, int harsh) {
        super(ID, cost, name, size, length, absorbency, info);
        Harsh = harsh;
    }

    public int getHarsh() {
        return Harsh;
    }

    public void setHarsh(int harsh) {
        Harsh = harsh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        HarshToiletPaper that = (HarshToiletPaper) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(Harsh, that.Harsh)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(Harsh)
                .toHashCode();
    }

    @Override
    public String toString() {
//        return new ToStringBuilder(this)
//                .append("Harsh", Harsh)
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
        System.out.println("HarshToilet");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nCzy to dobry wybor nie wiem ale na pewno tani\n" + "Przetrwasz na nim okolo "
                + String.valueOf(3*Harsh+length/10) +" dni";
    }
}

