import java.util.Scanner;

public class Ractangle {
    public int chieuDai;
    public int chieuRong;

    public Ractangle(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void chuVi() {
        System.out.println("Chu vi la: " + 2 * (this.chieuDai + this.chieuRong));
    }

    public void dienTich() {
        System.out.println(" Dien tich la: " + this.chieuDai * this.chieuRong);
    }
}

class main2 {
    public static void main(String[] args) {
        Scanner dai = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        int a = dai.nextInt();
        Scanner rong = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        int b = rong.nextInt();
        Ractangle hcn = new Ractangle(a, b);
        hcn.dienTich();
        hcn.chuVi();
    }
}