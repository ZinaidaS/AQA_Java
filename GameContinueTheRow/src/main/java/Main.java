import java.util.Scanner;
//game with numbers. The gamer should continue the row of numbers 2, 7, 14, 19, 38, 43, 86....
// If the entered number is correct - the "You are right!" message is displayed.
// If the entered number isn't correct - the "No, try again!" message is displayed.
public class Main {
    public static void main (String [] args){
        System.out.println("Continue the row of number.");
        int i;
        int number = 2;
        System.out.print(number +"  ");
        for (i=0; i<3; i++) {
            number = number + 5;
            System.out.print(number + "  ");
            number = number * 2;
            System.out.print(number + "  ");

        }
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == 91) {
            System.out.println("You are right!");
        }  else
            System.out.println("No, try again!");
    }


}
