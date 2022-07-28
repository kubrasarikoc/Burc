import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ay,gun;
        String burc = "";
        boolean isError = false;
        System.out.print("Kaçıncı Ay Doğumlusunuz ? : ");
        ay = input.nextInt();
        System.out.print("Doğduğunuz Günü Giriniz : ");
        gun = input.nextInt();

        if (ay == 1) {
            if (gun>=1 && gun<22){
                burc= "Oğlak";
            } else if  (gun>=22 && gun<=31) {
                burc = "Kova";
            }else {
                isError = true;
            }

        } else if (ay == 2) {
            if (gun>=1 && gun<20){
                burc = "Kova";
            }else if (gun>=20 && gun<=29){
                burc = "Balık";
            }else{
                isError = true;
            }
        } else if (ay == 3) {
            if (gun>=1 && gun<21){
                burc = "Balık";
            } else if (gun >= 21 && gun <= 31) {
                burc = "Koç";
            }else {
                isError = true;
            }
        } else if (ay == 4) {
            if (gun>=1 && gun<21){
                burc = "Koç";
            } else if (gun >= 21 && gun <= 30) {
                burc = "Boğa";
            }else {
                isError = true;
            }
        } else if (ay == 5) {
            if(gun>=1 && gun<22){
                burc = "Boğa";
            } else if (gun >= 22 && gun <= 31) {
                burc = "İkizler";
            }else {
                isError = true;
            }
        } else if (ay == 6) {
            if (gun>=1 && gun<23){
                burc = "İkizler";
            } else if (gun >= 23 && gun <= 30) {
                burc = "Yengeç";
            }else {
                isError = true;
            }
        } else if (ay == 7) {
            if (gun>=1 && gun<23){
                burc = "Yengeç";
            } else if (gun >= 23 && gun <= 31) {
                burc = "Aslan";
            }else {
                isError = true;
            }
        } else if (ay == 8) {
            if (gun>=1 && gun <23){
                burc = "Aslan";
            } else if (gun >= 23 && gun <= 31) {
                burc = "Başak";
            }else {
                isError = true;
            }
        }else if (ay == 9){
            if (gun>=1 && gun<23){
                burc = "Başak";
            } else if (gun>=23 && gun<=30) {
                burc = "Terazi";
            }else {
                isError = true;
            }
        } else if (ay == 10) {
            if (gun>=1 && gun<23){
                burc = "Terazi";
            } else if (gun >= 23 && gun <= 31) {
                burc = "Akrep";
            }else {
                isError = true;
            }
        } else if (ay == 11) {
            if (gun>=1 && gun<22){
                burc = "Akrep";
            } else if (gun >= 22 && gun <= 30) {
                burc = "Yay";
            }else {
                isError = true;
            }
        } else if (ay == 12) {
            if (gun>=1 && gun<22){
            } else if (gun >= 22 && gun <= 31) {
                burc = "Oğlak";
            }else {
                isError = true;
            }
        }

        if (isError) {
            System.out.println("Hatalı Giriş Yaptınız Lütfen Bilgilerinizi Kontrol Ediniz!" + isError);
        }else{
            System.out.println("Burcunuz : "+burc);
        }

    }
}
