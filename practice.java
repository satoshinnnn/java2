import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---QUAN LI THU VIEN---");
        System.out.println("1.Đăng ký thẻ mượn sách VIP ");
        System.out.println("2.Tính tiền phạt trả sách");
        System.out.println("3. Thống kê số sách nhập kho");
        System.out.print("Moi ban nhap lua chon (1-3):");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Moi ban nhap tuoi: ");
                int age = sc.nextInt();
                System.out.print("Moi ban nhap so sach da muon: ");
                int book = sc.nextInt();
                System.out.print("Ban co the sinh vien khong (1 = co, 0 = khong): ");
                int priority = sc.nextInt();
                boolean isVip = (age >= 18 && book >= 10) || (priority == 1);
                if (isVip) {
                    System.out.println("Đủ tiêu chuẩn nâng cấp VIP");
                } else {
                    System.out.println("Chưa đủ tiêu chuẩn");
                }
                break;
            case 2:
                System.out.print("Moi ban nhap so sach da muon: ");
                int bookT = sc.nextInt();
                if (bookT < 0) {
                    while (true) {
                        if (bookT < 0) {
                            System.out.print("So sach da muon phai duong, vui long nhap lai: ");
                            bookT = sc.nextInt();
                        } else {
                            break;
                        }
                    }
                }
                int sum = 0;
                for (int i = 0; i < bookT; i++) {
                    int dayLate = Integer.MIN_VALUE;

                    System.out.print("Nhap so ngay tre cuon thu " + (i+1) + ": " );
                    dayLate = sc.nextInt();

                    if ( dayLate <= 5 && dayLate > 0) {
                        sum += (long) dayLate * 2000L;
                    } else {
                        sum += (long) dayLate * 5000L;
                    }
                }
                System.out.println("Tong tien phat la: " + sum + " VND" );
                break;
            case 3:
                int validCount = 0;
                do {
                    System.out.print("Nhap vao ma so sach nhap kho (0 - dung lai): " );
                    int code = sc.nextInt();

                    if (code < 0) {
                        System.out.println("Negative code entered — invalid. Please enter a non-negative code.");
                        continue; // ask again
                    }

                    if (code == 0) {
                        break;
                    }

                    validCount++;
                    System.out.println("Accepted code: " + code + " (total accepted: " + validCount + ")");
                } while (true);
        }
    }
}
