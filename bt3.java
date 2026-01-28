import java.util.Scanner;
public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();

        int total = 0;
        int finePerDay = 5000;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số ngay tra che cua cuon thu " + (i+1) + ": ");
            int lateDay = sc.nextInt();
            total += lateDay*finePerDay;
        }

        System.out.print("===> Tong tien phat: " + total +" VND");
    }
}
