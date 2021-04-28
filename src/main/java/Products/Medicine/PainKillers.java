package Products.Medicine;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public class PainKillers extends Medicine {
    private int allowedDailyDose;


    public PainKillers(int ID, int cost, String name, int size, int power, String dayorNight, Date expirationDate) {
        super(ID, cost, name, size, power, dayorNight, expirationDate);
    }

    public int getAllowedDailyDose() {
        return allowedDailyDose;
    }

    public void setAllowedDailyDose(int allowedDailyDose) {
        this.allowedDailyDose = allowedDailyDose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        PainKillers that = (PainKillers) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(allowedDailyDose, that.allowedDailyDose)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(allowedDailyDose)
                .toHashCode();
    }

    @Override
    public String toString() {
//        return new ToStringBuilder(this)
//                .append("allowedDailyDose", allowedDailyDose)
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
        return super.getInfo() + "\nUwaga dla tego typu leku dawkowanie moze sie roznic\n"+
                "Na ulotce pisalo "+getAllowedDailyDose()+ " ale bierz ile chcesz";
    }
}
