package ru.mirea.task5;
import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Chair c = new Chair("Big", "Brown", 100);
        Table t = new Table("Small", "White", 150);
        Sofa s = new Sofa("Big", "Red", 200);
        Armchair a = new Armchair("Small", "Green", 180);
        c.displayInfo();
        t.displayInfo();
        s.displayInfo();
        a.displayInfo();
        System.out.print("\nВведите свой бюджет: ");
        int budget;
        Scanner in = new Scanner(System.in);
        budget = in.nextInt();
        while (budget >= c.getPrice() || budget >= t.getPrice() || budget >= s.getPrice() || budget >= a.getPrice()) {
            if (budget >= c.getPrice()) {
                System.out.print("Можно купить ");
                c.displayInfo();
                System.out.println("Нажмите 1 для покупки");
            }
            if (budget >= t.getPrice()) {
                System.out.print("Можно купить ");
                t.displayInfo();
                System.out.println("Нажмите 2 для покупки");
            }
            if (budget >= s.getPrice()) {
                System.out.print("Можно купить ");
                s.displayInfo();
                System.out.println("Нажмите 3 для покупки");
            }
            if (budget >= a.getPrice()) {
                System.out.print("Можно купить ");
                a.displayInfo();
                System.out.println("Нажмите 4 для покупки");
            }
            int i;
            i = in.nextInt();
            if (i == 1) {
                budget -= c.getPrice();
                System.out.println("Спасибо за покупку!\nОставшийся бюджет: " + budget + "$\n");
            }
            if (i == 2) {
                budget -= t.getPrice();
                System.out.println("Спасибо за покупку!\nОставшийся бюджет: " + budget + "$\n");
            }
            if (i == 3) {
                budget -= s.getPrice();
                System.out.println("Спасибо за покупку!\nОставшийся бюджет: " + budget + "$\n");
            }
            if (i == 4) {
                budget -= a.getPrice();
                System.out.println("Спасибо за покупку!\nОставшийся бюджет: " + budget + "$\n");
            }
        }
    }
}
