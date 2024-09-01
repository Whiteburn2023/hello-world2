import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в градусах цельсия: ");
        int temperature = sc.nextInt();
        System.out.println("Температура по Фаренгейту: " + (temperature * 1.8 + 32));

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму в рублях: ");
        int rur = sc.nextInt();
        System.out.println("По курсу в долларах: " + rur * 0.010967);
        System.out.println("По курсу в евро: " + rur * 0.009924);


    }
}