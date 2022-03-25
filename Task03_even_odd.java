import java.util.Scanner;

public class Task03_even_odd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        String result;
        result = number % 2 == 0 ? "even" : "odd";
        System.out.println("Number is " + result);
    }
}
