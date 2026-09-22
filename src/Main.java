import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1 - ci tapşırıq
        Scanner years = new Scanner(System.in);
        System.out.println("İl daxil edin:");
        int il = years.nextInt();
        if((il % 4 == 0 && il % 100 != 0) || (il % 400 == 0)){
            System.out.println(il + "artıq ildir");
        }
        else{
            System.out.println(il + "artıq il deyil");
        }

        // 2 - ci tapşırıq
        Scanner month = new Scanner(System.in);
        System.out.println("Rəqəm daxil edin:");
        int ay = month.nextInt();
        switch(ay){
            case 1,3,7,8,10,12:
                System.out.println("31 gün var");
                break;
            case 2:
                System.out.println("28 gün var");
                break;
            case 4,5,6,9,11:
                System.out.println("30 gün var");
            default:
                System.out.println("Yanlış rəqəm daxil etdiniz");


        // 3 - cü tapşırıq
                Scanner letter = new Scanner(System.in);
                System.out.println("Rəqəm daxil edin:");
                String hərf = letter.nextLine();
                switch(hərf){
                    case "a","ı","o","u","e","ə","i","ö","ü":
                        System.out.println("Saitdir");
                        break;
                    case "b","c","ç","d","f","g","ğ","h","x","j","k","q","l","m","n","p","r","s","ş","t","v","y","z":
                        System.out.println("Samitdir");
                        break;
                    default:
                        System.out.println("Yanlışdır");


        // 4- ci tapşırıq
        Scanner months = new Scanner(System.in);
        System.out.println("Rəqəm daxil edin:");
        int aylar = month.nextInt();
        switch(aylar){
            case 1:
                System.out.println("Yanvar");
                break;
            case 2:
                System.out.println("Fevral");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Aprel");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Iyun");
                break;
            case 7:
                System.out.println("Iyul");
                break;
            case 8:
                System.out.println("Avqust");
                break;
            case 9:
                System.out.println("Sentyabr");
                break;
            case 10:
                System.out.println("Oktyabr");
                break;
            case 11:
                System.out.println("Noyabr");
                break;
            case 12:
                System.out.println("Dekabr");
                break;
            default:
                System.out.println("Yanlış ay nömrəsi");
        }
    }
}