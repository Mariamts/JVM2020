package convert.components;

import convert.interfaces.IExchange;

import java.util.Scanner;

public class Exchange implements IExchange {
    public int currencyId;
    public double value;

    Obj[] data = new Obj[3];

    public Exchange() {
        data[0] = new Obj("usd", 1.7710, 1);
        data[1] = new Obj("eur", 2.2700, 2);
        data[2] = new Obj("gbp", 2.8950, 3);
    }

    public void convert() {
        Scanner scan = new Scanner(System.in);
        this.currencyId = scan.nextInt();
        this.value = scan.nextDouble();

        for(Obj i : this.data) {
            if(i.id == this.currencyId) {
                System.out.print(this.value * i.amount);
            }
        }
    }

    public void change() {
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        double val = scan.nextDouble();

        for(Obj i : this.data) {
            if(i.id == id) {
                i.amount = val;
                System.out.print(i.amount);
            }
        }
    }
}
