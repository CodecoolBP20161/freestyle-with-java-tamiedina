import java.util.*;

public class Food{
    String name;
    double calory;
    String type;

    public Food(String fName, double fCalory, String fType){
        this.name = fName;
        this.calory = fCalory;
        this.type = fType;
    }

    public static void main(String[] args){
        Food pizza = new Food("pizza", 5000.51, "pasta");

        //System.out.println(pizza.name);
    }

    };
