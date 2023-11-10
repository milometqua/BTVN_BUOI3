import java.util.Scanner;

public class Khach {
    public static void dsLuachon2() {
        System.out.println("1. Tim kiem sach");
        System.out.println("2. Xem danh sach");
        System.out.println("3. Thoat");
    }
    public static void chon1(){
        byte press;
        Scanner sc = new Scanner(System.in);
        while(true){
            dsLuachon2();
            press = sc.nextByte();
            if(press==3) break;
            else{
                if(press==1){
                    ThucHien.find();
                } else if (press==2) {
                    ThucHien.xem();
                }
            }
        }
    }
}
