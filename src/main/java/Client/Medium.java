package Client;

import java.util.Date;

public class Medium extends Client {
    private final double Discount= 0.3d;


    public Medium(int id, Date join, String address,String NIP) {
        super(id, join, address, NIP);
    }

    public double getDiscount() {
        return Discount;
    }

    @Override
    public double getType() {
        return 2d;
    }

    @Override
    public double discount() {
        return super.discount()*Discount;
    }
}
