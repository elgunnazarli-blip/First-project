import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1 - ci tapşırıq

        int a = 0;
        for(int i=1;i<=100;i++){
            System.out.println(a = a + i);
        }


        // 2 - ci tapşırıq

        for(int i=0; i<=50; i+=2){
            System.out.println(i);
        }


        // 3 - cü tapşırıq



        // 4 - ci tapşırıq

        for(int i=0;i<=5;i++){
            System.out.println("Salam");
        }


        // 5 - ci tapşırıq

        for(int i=10; i>=1; i--){
            System.out.println(i);
        }


        // 6 - ci tapşırıq

        Scanner ab = new Scanner(System.in);
        System.out.println("Ədəd daxil edin:");
        int number = ab.nextInt();
        for(int i = 1; i <= number; i++){
            System.out.println(i);
        }


        // 7 - ci tapşırıq
        Scanner eded = new Scanner(System.in);
        System.out.println("Ədəd daxil edin:");
        int numbers = eded.nextInt();

        int factorial = 1;

        for(int i = 1; i <= numbers; i++){
            factorial = factorial * i;
            System.out.println(factorial);
        }
    }
}