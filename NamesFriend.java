import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class NamesFriend {

    public static void main(String[] args) {
        ArrayList<String> namesfriend= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 5 nguoi trong danh sach ban: ");
        for(int i=0;i<5;i++){
            System.out.println("Nhap ten ban "+ (i+1)+ ": ");
            String name = scanner.nextLine();
            namesfriend.add(name);
        }
        scanner.close();
        System.out.println("Hien danh sach ban: "+namesfriend);
    }
    
}
