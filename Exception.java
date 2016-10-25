import java.util.*;

public class Exception{
    public static String getWarning(){
        String message = "Sorry, we didn't know this type of food. Please choose from:vegatable/fruit/meat/pasta";
        return message;
    }

    public static void main (String[] args){
        System.out.println(getWarning());
    }

}