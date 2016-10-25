import java.util.*;



public class Menu{

    public static User inputUserData() {
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Enter your weight: ");
        Scanner scannerTwo = new Scanner(System.in);
        int userWeight = scannerTwo.nextInt();
        System.out.println("Enter your height: ");
        Scanner scannerThree = new Scanner(System.in);
        int userHeight = scannerThree.nextInt();
        User adam = new User(userName, userWeight, userHeight);
        System.out.println("User: " + adam.name + " Weight: " + adam.weight + " Height: " + adam.height);
        return adam;

    }

    public static Food inputFoodData() {
        System.out.println("What did you eat?:  ");
        Scanner scanner = new Scanner(System.in);
        String foodName = scanner.nextLine();
        System.out.println("How many calories was in it?(with decimal precision):  ");
        Scanner scannerTwo = new Scanner(System.in);
        double foodCalory = scannerTwo.nextInt();
        System.out.println("What kind of food was(vegatable/fruit/meat/pasta):   ");
        Scanner scannerThree = new Scanner(System.in);
        String foodType = scannerThree.nextInt().toLowerCase();


        if(foodType == "vegetable"){
            Vegetable foodname = new Vegetable(foodName, foodCalory, foodType);
            break;
        }
    }


    public static void main (String[] args){
        User newUserObject = inputUSerData();
        Food newFoodObject = inputFoodData();
        //System.out.println(adamObject.name);





    }

}