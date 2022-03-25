import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(Systrm.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        double bmi = (weight / (height ^ 2)) * 703;

        if (bmi <= 18.5) {
            System.out.println("Underweight!");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal :-)");
        } else {
            System.out.println("Overweight! ;(");

        }
    }
}
