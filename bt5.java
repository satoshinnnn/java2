import java.util.Scanner;
public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 100;
        int exitCode = 999;

        System.out.println("--- HE THONG DANH GIA DOC GIA---");
        System.out.println("NHap so ngay tre. Nhap 999 de ket thuc");
        while (true) {
            System.out.print("So ngay tre lan nay: ");
            if (!sc.hasNextInt()) {
                String bad = sc.next(); // đọc và bỏ token không hợp lệ
                System.out.println("Vui lòng nhập một số nguyên. (Bạn vừa nhập: " + bad + ")");
                continue;
            }
            int day = sc.nextInt();
            if (day == exitCode) {
                break;
            }
            if (day <= 0) {
                score += 5;
                System.out.println("-> Tra dung han: +5 diem");
            } else {
                score -= day*2;
                int pal = day*2;
                System.out.println("-> Tra tre: -" + pal +" diem");
            }
       }
        System.out.println("Tong diem uy tin " + score);
        if (score > 120) {
            System.out.println("Độc giả Thân thiết");
        } else if (score>=80) {
            System.out.println("Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Xep loai: Độc giả cần lưu ý");
        }
    }
}
