import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, newUserName;
        String password, newPassword;

        System.out.println("Lutfen Kullaci ismini giriniz:");
        userName = input.nextLine();
        System.out.println("Lutfen sifrenizi giriniz:");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Sifre ve kullanici adiniz dogrudur. \n Başarili giris yaptiniz");
            
        } else if (!(userName.equals("patika") || password.equals("java123"))) {
            System.out.println("Sifre veya Kullanici adi hatali \n " +
                    "Sifrenizi unuttuysanız sıfırlamak için");
        }

        System.out.println("Yeni Kullanici adinizi giriniz");
        newUserName = input.nextLine();

        System.out.println("Yeni Sifrenizi giriniz.");
        newPassword = input.nextLine();

        if (!(newPassword.equals("patika") && newUserName.equals("java123"))) {
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

        } else {
            System.out.println("Sifreniz Olusturuldu");
        }

    }


}
