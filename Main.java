import java.util.ArrayList;
import java.util.Scanner;

// Lớp SinhVien quản lý thông tin sinh viên
class SinhVien248 {
    private String hoTen248;
    private String msv248;
    private String ngaySinh248;
    private String lop248;

    public void nhap248(Scanner sc248) {
        System.out.print("Nhập họ tên: ");
        hoTen248 = sc248.nextLine();
        System.out.print("Nhập MSV: ");
        msv248 = sc248.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh248 = sc248.nextLine();
        System.out.print("Nhập lớp: ");
        lop248 = sc248.nextLine();
    }

    public void hienThi248() {
        System.out.println("Họ tên: " + hoTen248);
        System.out.println("MSV: " + msv248);
        System.out.println("Ngày sinh: " + ngaySinh248);
        System.out.println("Lớp: " + lop248);
    }

    public String getHoTen248() {
        return hoTen248;
    }
}

// Lớp TheMuon quản lý việc mượn sách
class TheMuon248 {
    private String soPhieuMuon248;
    private String ngayMuon248;
    private String hanTra248;
    private String tenSach248;
    private SinhVien248 sinhVien248;

    public void nhap248(Scanner sc248) {
        System.out.print("Nhập số phiếu mượn: ");
        soPhieuMuon248 = sc248.nextLine();
        System.out.print("Nhập ngày mượn: ");
        ngayMuon248 = sc248.nextLine();
        System.out.print("Nhập hạn trả: ");
        hanTra248 = sc248.nextLine();
        System.out.print("Nhập tên sách: ");
        tenSach248 = sc248.nextLine();

        sinhVien248 = new SinhVien248();
        System.out.println("== Nhập thông tin sinh viên ==");
        sinhVien248.nhap248(sc248);
    }

    public void hienThi248() {
        System.out.println("\n=== Thông tin thẻ mượn ===");
        System.out.println("Số phiếu mượn: " + soPhieuMuon248);
        System.out.println("Ngày mượn: " + ngayMuon248);
        System.out.println("Hạn trả: " + hanTra248);
        System.out.println("Tên sách: " + tenSach248);
        sinhVien248.hienThi248();
    }

    public String getHanTra248() {
        return hanTra248;
    }

    public String getTenSach248() {
        return tenSach248;
    }

    public SinhVien248 getSinhVien248() {
        return sinhVien248;
    }
}

// Chương trình chính
public class Main {
    public static void main(String[] args) {
        Scanner sc248 = new Scanner(System.in);
        ArrayList<TheMuon248> dsTheMuon248 = new ArrayList<>();

        System.out.print("Nhập số lượng thẻ mượn: ");
        int n248 = Integer.parseInt(sc248.nextLine());

        for (int i = 0; i < n248; i++) {
            System.out.println("\n--- Nhập thẻ mượn thứ " + (i + 1) + " ---");
            TheMuon248 tm248 = new TheMuon248();
            tm248.nhap248(sc248);
            dsTheMuon248.add(tm248);
        }

        System.out.println("\n=== Danh sách sinh viên cần trả sách vào ngày cuối tháng ===");
        for (TheMuon248 tm248 : dsTheMuon248) {
            // giả sử "ngày cuối tháng" là ngày 30 hoặc 31
            if (tm248.getHanTra248().endsWith("30") || tm248.getHanTra248().endsWith("31")) {
                System.out.println("Sinh viên: " + tm248.getSinhVien248().getHoTen248() +
                        " - Tên sách: " + tm248.getTenSach248());
            }
        }
    }
}
