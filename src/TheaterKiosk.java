import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userAge = 0;
        String trash = "";


        System.out.print("Enter your age: ");


        if (in.hasNextInt()) {
            userAge = in.nextInt();
            in.nextLine();


            if (userAge >= 21) {

                System.out.println("You get a paper wrist band.");
            }

        } else {

            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Run the program again and enter a valid integer!");
        }
    }
}