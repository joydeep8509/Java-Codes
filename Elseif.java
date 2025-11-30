import java.util.*;

class Con {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int roll;

        System.out.println("Enter the roll number:");
        roll = s.nextInt();

        if (0 < roll && roll <= 50) {
            System.out.println("Welcome to block A");
        }
        else if (50 < roll && roll <= 100) {
            System.out.println("Welcome to block B");
        }
        else if (100 < roll && roll <= 150) {
            System.out.println("Welcome to block C");
        }
        else if (150 < roll && roll <= 200) {
            System.out.println("Welcome to block D");
        }
        else {
            System.out.println("Error");
        }
    }
}
