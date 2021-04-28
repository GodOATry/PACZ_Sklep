package Client;

import java.util.Date;

public class Small extends Client {
    private final double Discount= 0.0d;


    public Small(int id, Date join, String address, String NIP) {
        super(id, join, address, NIP);
    }

    @Override
    public double getType() {
        return 1d;
    }

    public double getDiscount() {
        return Discount;
    }

    @Override
        public double discount() {
        return super.discount()+Discount;
    }
}
