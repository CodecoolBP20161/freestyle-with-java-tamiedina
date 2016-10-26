
public class Food{
    String name;
    double calory;
    String type;

    public Food(String fName, double fCalory, String fType){
        this.name = fName;
        this.calory = fCalory;
        this.type = fType;
    }

    public static class Vegetable extends Food {

        public Vegetable(String fName, double fCalory, String fType){
            super(fName, fCalory, fType);
        }
    }

    public static class Fruit extends Food {

        public Fruit(String fName, double fCalory, String fType){
            super(fName, fCalory, fType);
        }
    }

    public static class Meat extends Food {

        public Meat(String fName, double fCalory, String fType){
            super(fName, fCalory, fType);
        }
    }

    public static class Pasta extends Food {

        public Pasta(String fName, double fCalory, String fType){
            super(fName, fCalory, fType);
        }
    }

    public static void main(String[] args){
    }

};
