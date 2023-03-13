import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 1;

            while (number > 10) {
                number = number/10;
            count++;
        }
        System.out.println(count);

        /*Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while (num1<num2-1){
            num1++;
            System.out.println(num1 * num1);
        }*/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b = 0;
        while (b < num) {
            b++;
            if (b % 2 == 1) {
                System.out.println(b);
            }
        }




        /*Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        int count = 0;

        while (num>count) {
            num = sc.nextInt();
            System.out.println(num);
            count ++;
        }
        System.out.println("Salamatta kalynyz");
        }*/

    }

}