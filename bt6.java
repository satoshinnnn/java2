import java.util.Scanner;
public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = {"Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7", "Chủ nhật"};
        int max = 0;
        int min = 0;
        boolean firstOpen = true;
        int sum = 0;
        int countOpen = 0;

        for (int i = 0; i < 7; i++) {
            int borrows;

            while (true) {
                System.out.print("Nhập số lượt mượn " + days[i] + ": ");
                if (!sc.hasNextInt()) {
                    String bad = sc.next();
                    System.out.println("Vui lòng nhập số nguyên. (Bạn vừa nhập: " + bad + ")");
                    continue;
                }
                borrows = sc.nextInt();
                if (borrows < 0) {
                    System.out.println("Số lượt mượn không được âm. Nhập lại.");
                    continue;
                }
                break;
            }

            if (borrows == 0) {
                continue;
            }

            if (firstOpen) {
                max = borrows;
                min = borrows;
                firstOpen = false;
            } else {
                if (borrows > max)  max = borrows;
                if (borrows < min) min = borrows;
            }
            sum += borrows;
            countOpen++;
        }
        System.out.println("---KET QUA THONG KE---");
        if (countOpen == 0) {
            System.out.println("Không có ngày nào mở cửa (tất cả bằng 0).");
        }
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + ((double)sum/countOpen));
    }
}
