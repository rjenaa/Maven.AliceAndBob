import java.util.Scanner;


/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        boolean access = false;
        Scanner userInput = new Scanner(System.in);
        do{

            try{
                System.out.println("Welcome! We are looking for certain individuals. Please state your name");
                String input = userInput.nextLine();

                if (input.equalsIgnoreCase("Alice") || input.equalsIgnoreCase("Bob")) {
                    access = true;

                    System.out.println("Welcome home, it has been very long since we have seen you.");
                }
            }
            catch (Exception e){
                System.out.println("Please type in valid Input!");
                userInput.next();

            }
        }
        while(!access);


    }
}
