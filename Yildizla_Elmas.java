import java.util.Scanner;

public class Yildizla_Elmas {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz :");
        int n = inp.nextInt();

        for (int i = 0; i <= n ; i++) {        //Elmasın üst kısmını yapıyoruz.
            for (int k = n; k > i; k--) {     //ekran çıktısının sol tarafındaki boşluklar.
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {    //yıldız şeklimiz ve yıldızların arasındaki boşluk
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for (int k=1;k<=n;k++)       //alt kkısımını yapıyoruz
        {
            for (int l =1 ; l <=k; l++)     //alt kısımının sol tarafındaki boşluklar
            {
                System.out.print(" ");
            }
            for (int m = n; m >k ; m--)   //alt kısımındaki yıldızlar ve arasındaki boşluklar
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
