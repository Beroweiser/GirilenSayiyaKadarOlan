/**
 * 0'dan girilen sayıya kadar olan sayılardan\n3 ve 4'e tam bölünen sayıların ortalaması
 */
import java.util.Scanner;

public class GirilenSayiyaKadarOlan {

    public static void main(String[] args) {
        int k,a = 0,b = 0, c = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("0'dan girilen sayıya kadar olan sayılardan\n3 ve 4'e tam bölünen sayıların ortalamasını bulmak istediginiz \nSayı giriniz : ");
        k = inp.nextInt();

        for (int i = 1 ; i <= k ; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                a++;
                b = i + b;
                
                
            }

        }
        c = b / a;
        System.out.println("Sayıların ortalaması : "+ c);


    }
}
