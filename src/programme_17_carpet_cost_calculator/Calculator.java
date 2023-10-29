package programme_17_carpet_cost_calculator;

public class Calculator {

    Floor floor;
    Carpet carpet;

    public Calculator (Floor floor, Carpet carpet) {

        this.floor = floor;
        this.carpet = carpet;
    }
        public double TotalPrice(){
            return floor.area() * carpet.getPrice();
        }

    }






