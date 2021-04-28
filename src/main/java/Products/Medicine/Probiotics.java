package Products.Medicine;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public class Probiotics extends Medicine {
    private int bacteriesCapacity;

    public Probiotics(int ID, int cost, String name, int size, int power, String dayorNight, Date expirationDate,int bacteriesCapacity) {
        super(ID, cost, name, size, power, dayorNight, expirationDate);
        this.bacteriesCapacity = bacteriesCapacity;
    }

    public int getBacteriesCapacity() {
        return bacteriesCapacity;
    }

    public void setBacteriesCapacity(int bacteriesCapacity) {
        this.bacteriesCapacity = bacteriesCapacity;
    }

    @Override
    public String toString() {
//        return new ToStringBuilder(this)
//                .append("bacteriesCapacity", bacteriesCapacity)
//                .append("power", power)
//                .append("DayorNight", DayorNight)
//                .append("expirationDate", expirationDate)
//                .append("cost", cost)
//                .append("name", name)
//                .append("size", size)
//                .toString();
        return String.format(name+" "+cost);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Dosyc bezpieczny lek\n"
                +"Zawiera "+ getBacteriesCapacity()+ " milionow kultur bakterii(o ile bakterie sa kulturalne)\n" +
                "NIE MA ZWROTOW!";
    }
}
