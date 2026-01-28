import java.util.Scanner;
public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();

        System.out.print("Nhap so sach dang muon: ");
        int book = sc.nextInt();

        boolean ageOk = age >= 18;
        boolean booksOk = book < 3;

        if(ageOk && booksOk) {
            System.out.println("Ket qua: Ban DU DIEU KIEN muon sach");
        } else {
            if (!ageOk) {
                System.out.println("Ket qua: KHONG DU DIEU KIEN");
                System.out.println("Ly Do: Ban phai tu 18 tuoi tro len");
            } else {
                System.out.println("Ket qua: KHONG DU DIEU KIEN");
                System.out.println("Ly Do: Ban da muon toi da 3 quyen");
            }
        }
    }
}
