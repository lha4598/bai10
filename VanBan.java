import java.util.Scanner;

public class VanBan {
    private String s;
    public VanBan() {

    }

    public VanBan(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String s = sc.nextLine();
        VanBan vanBan = new VanBan(s);
        System.out.println("Số từ của chuỗi là: " + vanBan.demSoTu(s));
        System.out.println("Kí tự A hoặc a xuất hiện trong văn bản là " + vanBan.demKiTuA(s) + " lần");
        System.out.println("Văn bản sau chuẩn hóa: " +vanBan.chuanHoaVanBan(s));
    }

    public int demSoTu(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        } else {
            s = s.trim();
            String[] split = s.split(" ");
            return split.length;
        }
    }

    public int demKiTuA(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        } else {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A' || s.charAt(i) == 'a') {
                    count++;
                }
            }
            return count;
        }
    }

    public String chuanHoaVanBan(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        return s.trim().replaceAll("\\s{2,}", " ");

    }
}
