package programme_17_carpet_cost_calculator;

public class Carpet {

    double price;

    public Carpet(double price){
        if (price <0)
        {this.price = 0;}
        else
        {this.price = price;}
    }

    public double getPrice (){ return this.price;}

}
