import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1 - ci tapşırıq

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }


        // 2 - ci tapşırıq

        int [] numbers = {1,5,3,6,12,24,65,23,41,10};
        int sum = 0;
        for(int i = 0;i < numbers.length;i++){
            sum = sum + i;
        }
        System.out.println(sum);



        // 5 - ci tapşırıq

        int [] number = {4,7,21,6,12,54,65,93,42,12};
        for (int i = number.length - 1;i>=0;i--){
            System.out.println(number[i]);
        }


        // 7 - ci tapşırıq
        int [][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0;i< matris.length;i++){
            System.out.println(matris[i][i]);
        }

        // 9 - ci tapşırıq
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}