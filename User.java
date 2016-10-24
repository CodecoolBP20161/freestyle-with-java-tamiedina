import java.util.*;

public class User {

    String name;
    int weight;
    int height;

    public User(String uName, int uWeight, int uHeight) {
        this.name = uName;
        this.weight = uWeight;
        this.height = uHeight;
        HashMap<Integer, Object> foodList = new HashMap<Integer, Object>();
    }

    public static void main(String[] args) {
        User david = new User("david", 60, 170);
        //User adam = new User("Ádám", 65, 180);
        System.out.println(david.name);
        //foodList.put(1, pizza);
        //System.out.println(foodList);
    }
}