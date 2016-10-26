import java.sql.SQLException;
import java.util.*;

public class Main {

    public static void callMenu() {
        System.out.println("CALORY REMINDER\n"+ "---------------" +"\nMAIN MENU\n"+ "---------------");
        System.out.println("a) My data\nb) Add food\nc) Food list\nd) Exit");
    }
    //switch to the menu choose

    public static void chooseMenu() {
        Scanner choice = new Scanner(System.in);
        String userChoice = choice.nextLine();

        if(userChoice.toLowerCase().equals("a")) {
            //System.out.println("Name: " + User.newUser.name + "\nWeight: " + newUser.weight + "kg" + "\nHeight: " + newUser.height + "cm");
        }else if(userChoice.toLowerCase().equals("b")) {
            //allFoodList();
            System.out.println("Food List!! :D");
        }else if(userChoice.toLowerCase().equals("c")) {
            System.out.println("Thx for the calories!");
            System.exit(0);
        }
    }

    public static void main(String[] args) throws SQLException {
        //print menu title and the app title
        System.out.println("WELLCOME TO CALORY REMINDER\nPlease add your datas.\n--------------------");
        User newUserObject = Menu.inputUserData();
        callMenu();
        //show the options (input your data/new food/all your food/exit)
        chooseMenu();

    }
}