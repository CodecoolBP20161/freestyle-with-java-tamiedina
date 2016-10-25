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
        System.out.println("How many calories was in it (with decimal preision)?:  ");
        Scanner scannerTwo = new Scanner(System.in);
        double foodCalory = scannerTwo.nextDouble();
        System.out.println("What kind of food was(vegatable/fruit/meat/pasta):   ");
        Scanner scannerThree = new Scanner(System.in);
        String foodType = scannerThree.nextLine();


        if(foodType.toLowerCase().equals("vegetable")) {
            Food newFood = new Food.Vegetable(foodName, foodCalory, foodType);
            return newFood;
        }
        else if(foodType.toLowerCase().equals("fruit")) {
            Food newFood = new Food.Fruit(foodName, foodCalory, foodType);
            return newFood;
        }else if(foodType.toLowerCase().equals("pasta")) {
            Food newFood = new Food.Pasta(foodName, foodCalory, foodType);
            return newFood;
        }else if(foodType.toLowerCase().equals("Meat")) {
            Food newFood = new Food.Fruit(foodName, foodCalory, foodType);
            return newFood;
        }
        else {
            System.out.println("Please choose from vegatable/fruit/meat/pasta: ");
            return inputFoodData();
        }


    }
    public static void main (String[] args){
        User newUserObject = inputUserData();
        Food newFoodObject = inputFoodData();
        //System.out.println(adamObject.name);






    }

}