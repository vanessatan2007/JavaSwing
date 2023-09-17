package u3a2asttanvanessa;

/*
 * @author Vanessa Tan
 * Date: 08/09/23
 * Project: Calculates Cubes and Squares and Powers
 */
import java.util.Scanner;
public class U3A2ASTTanVanessa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true; //if true the program runs, if false the program stops
        int option; //stores option that the user picks
        int num;    //the number being raised to a power
        int power;  //the power the number is being raised to
        int answer; //answer of the operation
        while (running) {   //loops until the user wants to exit
            //options the user can choose from 
            System.out.println("Welcome to Cubes and Squares and Powers. Please choose an option below:");
            System.out.println("1… Find the value of a number squared (NOTE: 22 = 2 x 2)");
            System.out.println("2… Find the value of a number cubed (NOTE: 23 = 2 x 2 x 2)");
            System.out.println("3… Find the value of a number, to any power");
            System.out.println("4… Exit");
            option = sc.nextInt();
            switch (option) {
                case 1: //square of a number
                    System.out.println("Please enter a number to be squared: ");
                    num = sc.nextInt();
                    answer = num * num;   //2^2 = 2*2
                    System.out.println(num + " squared is " + answer);
                    System.out.println();
                    break;
                    
                case 2: //cube of a number
                    System.out.println("Please enter a number to be cubed: ");
                    num = sc.nextInt();
                    answer = num * num * num;   //2^3 = 2*2*2
                    System.out.println(num + " cubed is " + answer);
                    System.out.println();
                    break;
                    
                case 3:     //a number to any power
                    System.out.println("Please enter a number: ");
                    num = sc.nextInt();
                    System.out.println("Please enter a power: ");
                    power = sc.nextInt();
                    answer = 1;
                    for (int i = 1; i <= power; i = i + 1) {    //i equals the power what the number is being raised to
                        answer = answer * num;
                    }
                    System.out.println(num + " to the power of " + power + " is " + answer);
                    System.out.println();
                    break;
                
                case 4:     //user wants to quit
                    System.out.println("Thank you for using Cubes, Squares and Powers. Please come back later. ");
                    running = false;    //exit while loop
                    break;
                    
                default:    //when option use answers is not an option
                    System.out.println("Invalid input. Please try again.");
                    break;
                    
            }
            
        }
    }
    
}
