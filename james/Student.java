import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public int diem;

    public Student(String name, int age, int diem) {
        this.name = name;
        this.age = age;
        this.diem = diem;
    }

    public void sv11() {
        System.out.println("Sinh viên có điểm cao hơn là: " + this.name + " Tuổi: " + this.age + "Số điểm: " + this.diem);
    }
}

class main1 {
    public static void main(String[] av) {

        Scanner svDiem = new Scanner(System.in);
        System.out.println("Nhập điểm sv1: ");
        int c = svDiem.nextInt();
        Student sv1 = new Student("Nguyen", 22, c);

        Scanner svDiem2 = new Scanner(System.in);
        System.out.println("Nhập điểm sv2: ");
        int c2 = svDiem2.nextInt();
        Student sv2 = new Student("Duy", 29, c2);

        if (sv1.diem > sv2.diem) {
            sv1.sv11();
        } else {
            sv2.sv11();
        }
    }
}