package app;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    static double km = 0;
    static double miles = 0;
    //Створюємо змінну choice :
    static int choice = 0;

    public static void main(String[] args) {
        valueInput();
        valueOutput();
    }

    //Оновлюємо метод для вводу даних :
    public static void valueInput() {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        //Створюємо перевірку зі змінною choice :
        do {
            System.out.println("""
                    Welcome to Miles <--> Km converter. Enter your 1 or 2 opinion :
                    1. Miles to Km
                    2. Km to miles""");
            choice = input.nextInt();
        } while (choice < 1 || choice > 2);

        //Створюємо Switch case для choice :
        switch (choice) {
            case 1:
                System.out.println("Input your miles value :");
                miles = input.nextDouble();
                break;
            case 2:
                System.out.println("Input your km value :");
                km = input.nextDouble();
                break;
        }

        input.close();
    }

    //Оновлюємо метод для виводу даних :
    public static void valueOutput() {

        //Створюємо умови здійснення бізнес логіки :
        if (choice == 1) {
            km = milesToKmConverter(miles);
            System.out.printf("Your km value equals \"%.3f\"", km);
        } else {
            miles = kmToMilesConverter(km);
            System.out.printf("Your mile value equals \"%.3f\"", miles);
        }
    }

    //Створюємо метод бізнес логіки :
    public static double milesToKmConverter(double miles) {
        return miles * 1.609;
    }

    //Створюємо другий метод бізнес логіки :
    public static double kmToMilesConverter(double km) {
        return km / 1.609;
    }
}
