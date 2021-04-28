package Products.Groceries;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Vegetables extends Groceries{
    private boolean bulwa;

    public Vegetables(int ID, int cost, String name, int size, int weight, boolean isBio, boolean bulwa) {
        super(ID, cost, name, size, weight, isBio);
        this.bulwa = bulwa;
    }

    public boolean isBulwa() {
        return bulwa;
    }

    public void setBulwa(boolean bulwa) {
        this.bulwa = bulwa;
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
        return String.format(name+" "+cost);
    }

    @Override
    public String getInfo() {
        int tmp = 0;
        if(bulwa){
            tmp = 3;
        } else {
            tmp = 5;
        }
        return super.getInfo()+"\nWarzywo "+this.getName()+" pozwoli przetrwac " + tmp *this.getWeight()+"\n"
                + "i jest duzo lepsze niz te warzywa z grupy Szymona Depcika";
    }
}
