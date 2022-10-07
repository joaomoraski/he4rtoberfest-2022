import java.util.Scanner;

public class AgeInDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age in days: ");
        int inputDays = scanner.nextInt();
        scanner.close();

        int yearInDays = 365;
        int monthInDays = 30;

        int yDays = inputDays / yearInDays;
        int mDays = (inputDays % yearInDays) / monthInDays;
        int days = ((inputDays % yearInDays) % monthInDays);

        System.out.println(yDays + " ano(s) " + mDays + " mes(es) " + days + " dia(s)");

    }

}
