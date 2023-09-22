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

        return readIntFromConsole("Введите необходимый пункт меню:");
    }
    public double getRealNumberA(){
        return readFloatFromConsole("Введите действительную часть первого числа:");
    }
    public double getimagInaryNumberA(){
        return readFloatFromConsole("Введите мнимую часть первого числа:");
    }
    public double getRealNumberB(){
        return readFloatFromConsole("Введите действительную часть второго числа:");
    }
    public double getimagInaryNumberB(){
        return readFloatFromConsole("Введите мнимую часть второго числа:");
    }
    public void viewResult(ComplexNumber result){
        System.out.println("\nРезультат выполнения операции: " + result + "\n");
    }

    public float readFloatFromConsole(String text) {
        System.out.print(text);
        while (!input.hasNextFloat()) {
            System.out.print("Ошибка ввода, повторите ввод: ");
            input.nextLine();
        }
        float number = input.nextFloat();
        input.nextLine();
        return number;
    }

    public int readIntFromConsole(String text) {
        System.out.print(text);
        while (!input.hasNextInt()) {
            System.out.print("Ошибка ввода, повторите ввод: ");
            input.nextLine();
        }
        int number = input.nextInt();
        input.nextLine();
        return number;
    }
}
