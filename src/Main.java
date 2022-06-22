import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String userName;
        String password;

        System.out.println("Lütfen Kullaci ismini giriniz:");
        userName=input.nextLine();
        System.out.println("Lütfen sifrenizi giriniz:");
        password=input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Şifre ve kullanici adiniz dogrudur. \n Başarili giris yatiniz");
        } else if (!(userName.equals("patika")|| password.equals("java123"))) {
            System.out.println("Sifre veya Kullanici adi hatali \n Sifrenizi unuttuysanız sıfırlamak için \n " +
                    "yeni sifre ve kullanici aidnizi giriniz");

        }


        System.out.println("Hello world!");
    }
}