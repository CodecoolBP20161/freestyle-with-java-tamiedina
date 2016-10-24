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

    public static void main (String[] args){
        User newUserObject = inputUSerData();
        //System.out.println(adamObject.name);





    }

}