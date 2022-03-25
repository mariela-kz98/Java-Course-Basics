import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        int month = scanner1.nextInt();
        int day = scanner1.nextInt();
        ;

        if (month >= 3 && day >= 20 && month <= 6 && day <= 20) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}


