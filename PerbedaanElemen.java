import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PerbedaanElemen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pada baris pertama: ");
        String input1 = scanner.nextLine();
        
        System.out.print("Masukkan angka pada baris kedua: ");
        String input2 = scanner.nextLine();
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (String s : input1.split(" ")) {
            set1.add(Integer.parseInt(s));
        }
        
        for (String s : input2.split(" ")) {
            set2.add(Integer.parseInt(s));
        }
        
        Set<Integer> beda = new HashSet<>(set1);
        beda.addAll(set2); 
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); 
        beda.removeAll(intersection); 

        System.out.print("Angka-angka yang berbeda: ");
        for (Integer num : beda) {
            System.out.print(num + " ");
        }
    }
}
