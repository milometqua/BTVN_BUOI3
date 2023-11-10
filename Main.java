import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Dang nhap");
        System.out.println("2. Thoat");
        int nhap = new Scanner(System.in).nextInt();
        while (true) {
            if(nhap==1)
                DangNhap.Signin();
            else
                break;
        }
    }
}