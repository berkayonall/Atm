import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select ;
        while (right>0){

            System.out.println("Kullanıcı adınız :");
            userName = input.nextLine();
            System.out.println("Şifrenizi giriniz :");
            password = input.nextLine();
            if (userName.equals("beko")&& password.equals("12345")){
                System.out.println("Merhaba , Bankamıza hoş geldiniz");

                do {
                    System.out.println("Lütfen yapmak istdiğiniz işlemi seçin");
                    System.out.println("1- Para yatırma\n"+"2- Para çekme\n"+"3- Bakiye Sorgulama\n"+"4- Çıkış");
                    select = input.nextInt();
                    if (select == 1) {
                        int miktar;
                        System.out.println("Yatıracağınız miktarı giriniz");
                        miktar = input.nextInt();
                        balance = miktar+balance;

                        System.out.println("Toplam bakiyeniz :" + (balance));
                    }
                    else if (select == 2){
                        int giden;
                        System.out.println("Çekeceğiniz miktarı giriniz");
                        giden = input.nextInt();
                        if (giden > balance){
                            System.out.println("Lütfen hesabınızdaki miktardan daha yüksek bir miktar girmeyin");
                            giden = input.nextInt();

                            }else{
                            balance = balance -giden;
                        System.out.println("Toplam bakiyeniz :" + (balance));}

                        }else if (select == 3){
                        System.out.println("Bakiyeniz :" + balance);
                    }


                }while (select != 4);


                break;

            }else {
                right--;

                if (right==0){
                    System.out.println("Hesabın bloke oldu");
                }
                System.out.println("Kalan hakkınız :" + right);
            }

        }





    }
}
