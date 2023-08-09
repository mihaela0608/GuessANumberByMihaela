package GuessANumberByMihaela;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random randomNumber=new Random();
        int computerNumber= randomNumber.nextInt(101);
        int count=0;
        while(true){
            System.out.print("Guess a number (1-100): ");
            String playerInput=scanner.nextLine();
            int playerNumber;
            boolean isValid=true;
            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57){
                isValid=false;
                break;
                }
            }
            if (isValid){
                playerNumber=Integer.parseInt(playerInput);
                if (playerNumber == computerNumber){
                    System.out.println("You guessed it!");
                    System.out.printf("You guess the number in %d tries",count+1);
                    break;
                } else if (playerNumber< computerNumber) {
                    System.out.println("Too Low");
                    count++;
                } else  {
                    System.out.println("Too High");
                    count++;
                }
            } else{
                System.out.println("Invalid input.");
            }
        }

    }
}
