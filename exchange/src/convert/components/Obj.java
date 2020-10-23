package convert.components;

public class Obj {
    public String currency;
    public double amount;
    public  int  id;

    public Obj(String title, double value, int currencyid) {
        this.currency = title;
        this.amount = value;
        this.id = currencyid;
    }
}
