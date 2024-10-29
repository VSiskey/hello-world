import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Введите ваш вес(кг): ");
        double weight = new Scanner(System.in).nextDouble();

        System.out.println("Введите ваш рост(метры): ");
        double height = new Scanner(System.in).nextDouble();

        System.out.println("BMI = " + weight / (height * height));
    }
}
