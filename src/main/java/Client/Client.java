package Client;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public class Client {
    protected int id;
    protected Date join;
    protected String address;
    protected String NIP;
    protected double Discount;
    protected double type;

    public Client(int id, Date join, String address,String NIP) {
        this.id = id;
        this.join = join;
        this.address = address;
        this.NIP = NIP;
    }

    public double getDiscount() {
        return Discount;
    }

    public double getType() {
        return 0d;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getJoin() {
        return join;
    }

    public void setJoin(Date join) {
        this.join = join;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return new EqualsBuilder()
                .append(id, client.id)
                .append(join, client.join)
                .append(address, client.address)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(join)
                .append(address)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("join", join)
                .append("address", address)
                .toString();
    }


    public double discount(){
        int discount=0;
        if(join.getYear()>=1){
            discount=1;
        } else if(join.getYear()>=3){
            discount=2;
        } else {
            discount = 3;
        }
        return discount;
    }

    public String getNIP() {
        return NIP;
    }
}
