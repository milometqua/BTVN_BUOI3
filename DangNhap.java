import java.util.Scanner;

public class DangNhap {

    public static void Signin() {
        System.out.print("Ten dang nhap: ");
        Scanner sc = new Scanner(System.in);
        String uSername = sc.nextLine();
        if(uSername.equals("khach")) {
            System.out.println("Xin chao!");
            System.out.println("Moi ban chon chuc nang");
            Khach.chon1();
        }
        else if(uSername.equals("admin")){
            System.out.print("Mat khau: ");
            String mk = sc.nextLine();
            if(mk.equals("admin")) {
                System.out.println("Xin chao admin!");
                System.out.println("Moi admin chon chuc nang.");
                Admin.chon();
            }
            else {
                System.out.println("Xin loi! Tai khoan cua ban khong hop le.");
            }
        }
        else{
            System.out.println("Xin loi! Tai khoan cua ban khong hop le.");
        }
    }
}
