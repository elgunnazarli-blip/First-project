import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1-ci tapşırıq
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir rəqəm daxil edin: ");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("Bu cüt ədəddir");
        }
        else{
            System.out.println("Bu tək ədəddir");
        }

        // 3- cü tapşırıq
        Scanner a = new Scanner(System.in);
        System.out.println("Balınızı daxil edin:");
        int bal = a.nextInt();
        if(bal > 90 || bal == 100){
            System.out.println("Siz A qiyməti aldınız");
        }
        else if(bal > 80 || bal == 90){
            System.out.println("Siz B qiyməti aldınız");
        }
        else if(bal > 70 || bal == 80){
            System.out.println("Siz C qiyməti aldınız");
        }
        else if(bal > 60 || bal == 70){
            System.out.println("Siz D qiyməti aldınız");
        }
        else if(bal > 50 || bal == 60){
            System.out.println("Siz F qiyməti aldınız");
        }
        else{
            System.out.println("Siz kəsilmisiniz");
        }

        // 5 - ci tapşırıq
        Scanner ab = new Scanner(System.in);
        System.out.println("Birinci rəqəmi daxil edin:");
        int firstnumber = ab.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("İkinci rəqəmi daxil edin:");
        int secondnumber = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("Əməliyyat işarəsi seçin: T/Ç/V/B");
        String sign = c.nextLine();
        if (sign.equals("T")){
            System.out.println(firstnumber + secondnumber);
        }
        else if (sign.equals("Ç")){
            System.out.println(firstnumber - secondnumber);
        }
        else if (sign.equals("V")){
            System.out.println(firstnumber * secondnumber);
        }
        else if (sign.equals("B")){
            System.out.println(firstnumber / secondnumber);
        }
    }
}