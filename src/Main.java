public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача №1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача №2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задача №3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println("Четное число " + i);
            }
        }

        System.out.println("Задача №4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задача №5");
        for (int i = 1904; i <= 2096; i += 4) {
            if (i % 400 == 0 || i % 100 != 0) {
                System.out.println(i + " год является высокосным");
            }
        }

        System.out.println("Задача №6");
        for (int i = 0; i <= 98; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Задача №7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);

        }

        System.out.println("Задача №8");
        int savings = 29000;
        for (int i = 1; i <= 12; i++, savings += 29000) {
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, savings);

        }

        System.out.println("Задача №9");
        for (int i = 1, money = 0; i <= 12; i++) {
            money = (int) ((money + 29000) * 1.01);
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, money);

        }
        System.out.println("Задача №10");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2*%s=%s\n", i, 2 * i);
        }


    }
}