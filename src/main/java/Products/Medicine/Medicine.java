package Products.Medicine;

import Products.Product;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public abstract class Medicine extends Product {

    protected int power;
    protected String DayorNight;
    protected Date expirationDate;

    public Medicine(int ID, int cost, String name, int size, int power, String dayorNight, Date expirationDate) {
        super(ID, cost, name, size);
        this.power = power;
        DayorNight = dayorNight;
        this.expirationDate = expirationDate;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDayorNight() {
        return DayorNight;
    }

    public void setDayorNight(String dayorNight) {
        DayorNight = dayorNight;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Medicine medicine = (Medicine) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(power, medicine.power)
                .append(DayorNight, medicine.DayorNight)
                .append(expirationDate, medicine.expirationDate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(power)
                .append(DayorNight)
                .append(expirationDate)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("power", power)
                .append("DayorNight", DayorNight)
                .append("expirationDate", expirationDate)
                .append("cost", cost)
                .append("name", name)
                .append("size", size)
                .toString();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nLeki to ważna sprawa podczas apokalipsy\n"+
                "Ten lek mozesz dawkowac dziennie: "+getPower()*getSize();
    }
}
