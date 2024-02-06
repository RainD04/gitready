import java.util.Scanner;

public class CoinChanger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter change amount in pennies: ");
        int change = sc.nextInt();
        sc.close();

        if (change == 0) {
            System.out.println("No change");
            return;
        }

        int dollars = change / 100;
        change %= 100;

        int quarters = change / 25;
        change %= 25;

        int dimes = change / 10;
        change %= 10;

        int nickels = change / 5;
        change %= 5;

        int pennies = change;

        if (dollars > 0) {
            System.out.println(dollars + " " + (dollars == 1 ? "Dollar" : "Dollars"));
        }
        if (quarters > 0) {
            System.out.println(quarters + " " + (quarters == 1 ? "Quarter" : "Quarters"));
        }
        if (dimes > 0) {
            System.out.println(dimes + " " + (dimes == 1 ? "Dime" : "Dimes"));
        }
        if (nickels > 0) {
            System.out.println(nickels + " " + (nickels == 1 ? "Nickel" : "Nickels"));
        }
        if (pennies > 0) {
            System.out.println(pennies + " " + (pennies == 1 ? "Penny" : "Pennies"));
        }
    }
}