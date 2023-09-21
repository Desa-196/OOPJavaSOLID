import java.util.Scanner;

public class View {
    Scanner input;

    public void hello(){
        System.out.println("Программа Калькулятор комплексных чисел.");
    }
        public View() {
            input = new Scanner(System.in);
    }
    public int mainMenu(){
        System.out.println("Меню:");
        System.out.println("\t 1. Умножить два комплексных числа");
        System.out.println("\t 2. Разделить одно комплексное число на другое");
        System.out.println("\t 3. Вычесть одно комплексное число из другое");
        System.out.println("\t 4. Выйти из программы");
        System.out.print("Введите необходимый пункт меню:");

        return readIntFromConsole();
    }

    public float readFloatFromConsole() {
        System.out.print("Введите число: ");
        while (!input.hasNextFloat()) {
            System.out.print("Ошибка ввода, повторите ввод: ");
            input.nextLine();
        }
        float number = input.nextFloat();
        input.nextLine();
        return number;
    }

    public int readIntFromConsole() {
        System.out.print("Введите число: ");
        while (!input.hasNextInt()) {
            System.out.print("Ошибка ввода, повторите ввод: ");
            input.nextLine();
        }
        int number = input.nextInt();
        input.nextLine();
        return number;
    }
}
