import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Автомат за напитки ===");
        System.out.println("1. Еспресо - 1.00 лв");
        System.out.println("2. Капучино - 1.50 лв");
        System.out.println("3. Лате - 2.00 лв");
        System.out.println("4. Чай - 0.80 лв");
        System.out.println("5. Шоколадово мляко - 1.20 лв");
        System.out.print("Избери напитка (1-5): ");

        int choice = input.nextInt();
        double price = 0;

        if (choice == 1) {
            price = 1.00;
        } else if (choice == 2) {
            price = 1.50;
        } else if (choice == 3) {
            price = 2.00;
        } else if (choice == 4) {
            price = 0.80;
        } else if (choice == 5) {
            price = 1.20;
        } else {
            System.out.println("Невалиден избор!");
            return;
        }

        System.out.print("Колко захар искаш? (1 до 5 лъжички): ");
        int sugar = input.nextInt();

        if (sugar < 1 || sugar > 5) {
            System.out.println("Грешка! Захарта трябва да е между 1 и 5.");
            return;
        }

        System.out.print("Въведи колко лева пускаш: ");
        double money = input.nextDouble();

        if (money < price) {
            System.out.println("Недостатъчна сума! Трябват ти още " + (price - money) + " лв.");
            return;
        }

        double change = money - price;

        System.out.println("\nЦена: " + price + " лв");
        System.out.println("Захар: " + sugar + " лъжички");
        System.out.println("Ресто: " + change + " лв");
    }
}


