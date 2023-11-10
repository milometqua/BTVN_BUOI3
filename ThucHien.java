import java.util.Scanner;

public class ThucHien {
    static int dem=0;
    static Sach[] sach = new Sach[100];
    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tieu de sach: ");
        String tieuDe = sc.nextLine();
        System.out.print("Ten tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("The loai: ");
        String theLoai = sc.nextLine();
        System.out.print("Ngay xuat ban: ");
        String ngayXuatban = sc.nextLine();
        Sach sach1 = new Sach(tieuDe, tacGia, theLoai, ngayXuatban);
        sach[++dem]= sach1;
        System.out.println("Hoan thanh them sach!");
        System.out.println("Moi ban chon chuc nang tiep theo");
    }
    public static void xoa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon so thu tu sach muon xoa: ");
        int so = sc.nextInt();
        if(so > dem || so <= 0){
            System.out.println("Sach nay khong ton tai!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
        else{
            for(int i=so-1;i<dem;i++){
                sach[i]=sach[i+1];
            }
            dem--;
            System.out.println("Da xoa sach!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
    }
    public static void fix(){
        System.out.print("Chon so thu tu sach muon sua: ");
        int so = new Scanner(System.in).nextInt();
        if(so > dem || so <= 0){
            System.out.println("Sach nay khong ton tai!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
        else{
            System.out.print("Tieu de sach: ");
            String tieuDe = new Scanner(System.in).nextLine();
            System.out.print("Ten tac gia: ");
            String tacGia = new Scanner(System.in).nextLine();
            System.out.print("The loai: ");
            String theLoai = new Scanner(System.in).nextLine();
            System.out.print("Ngay xuat ban: ");
            String ngayXuatban = new Scanner(System.in).nextLine();
            sach[so].setTieuDe(tieuDe);
            sach[so].setTacGia(tacGia);
            sach[so].setTheLoai(theLoai);
            sach[so].setNgayXuatban(ngayXuatban);
            System.out.println("Sach da duoc cap nhat!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
    }
    public static void xem(){
        for(int i=1;i<=dem;i++){
            System.out.printf("%d.\n", i);
            System.out.printf("%s\n%s\n%s\n%s\n", sach[i].getTieuDe(), sach[i].getTacGia(), sach[i].getTheLoai(), sach[i].getNgayXuatban());
        }
    }
    public static void find(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu ban muon tim kiem: ");
        String loai = sc.nextLine();
        int kt=0;
        for (int i=1; i<=dem;i++){
            if(loai.equals(sach[i].getTieuDe())){
                System.out.println("Sach ban muon tim kiem la:");
                System.out.printf("%s\n%s\n%s\n%s\n", sach[i].getTieuDe(), sach[i].getTacGia(), sach[i].getTheLoai(), sach[i].getNgayXuatban());
                kt=1;
                break;
            }
            else if (loai.equals(sach[i].getTacGia())) {
                System.out.println("Sach ban muon tim kiem la:");
                System.out.printf("%s\n%s\n%s\n%s\n", sach[i].getTieuDe(), sach[i].getTacGia(), sach[i].getTheLoai(), sach[i].getNgayXuatban());
                kt = 1;
                break;
            }
            else if (loai.equals(sach[i].getTheLoai())) {
                System.out.println("Sach ban muon tim kiem la:");
                System.out.printf("%s\n%s\n%s\n%s\n", sach[i].getTieuDe(), sach[i].getTacGia(), sach[i].getTheLoai(), sach[i].getNgayXuatban());
                kt = 1;
                break;
            }
            else if (loai.equals(sach[i].getNgayXuatban())) {
                System.out.println("Sach ban muon tim kiem la:");
                System.out.printf("%s\n%s\n%s\n%s\n", sach[i].getTieuDe(), sach[i].getTacGia(), sach[i].getTheLoai(), sach[i].getNgayXuatban());
                kt = 1;
                break;
            }
        }
        if(kt==0) System.out.println("Sach ban tim kiem khong ton tai!");
        System.out.println("Moi ban chon chuc nang tiep theo");
    }
}
