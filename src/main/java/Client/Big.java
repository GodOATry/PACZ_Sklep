package Client;

import java.util.Date;

public class Big extends Client {
    private final double Discount= 0.5d;


    public Big(int id, Date join, String address,String NIP) {
        super(id, join, address, NIP);

    }

    @Override
    public double getType() {
        return 3d;
    }

    @Override
    public double discount() {
        return super.discount() *Discount;
    }

    public double getDiscount() {
        return Discount;
    }




}
