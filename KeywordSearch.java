import java.util.ArrayList;
import java.util.Scanner;

public class KeywordSearch {
    public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong tu khoa: ");
        int numKeywords = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Nhap cac tu khoa:");
        for (int i = 0; i < numKeywords; i++) {
            System.out.print("Tu khoa " + (i + 1) + ": ");
            String keyword = scanner.nextLine();
            keywords.add(keyword);
        }
        String searchKeyword = "Python";
        boolean found = keywords.contains(searchKeyword);
        if (found) {
            System.out.println(searchKeyword + " co trong danh sach.");
        } else {
            System.out.println(searchKeyword + " khong co trong danh sach.");
        }

        scanner.close();
    }
}
