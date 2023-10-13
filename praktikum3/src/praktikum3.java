import java.util.Scanner;

public class praktikum3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Halo : Muhamad Fauzi");
        System.out.println("Nim : 0110222167");
        
        System.out.print("Masukkan lantai yang ingin diakses: ");
        int selectedFloor = scanner.nextInt();
        
        if (selectedFloor >= 1 && selectedFloor <= 12) {
            System.out.println("Anda akan diantar ke lantai " + selectedFloor);
        } else if (selectedFloor == 13) {
            System.out.println("Lantai 13 tidak memiliki tombol khusus, namun Anda dapat mengaksesnya dengan tombol 14.");
        } else if (selectedFloor >= 14 && selectedFloor <= 100) {
            System.out.println("Anda akan diantar ke lantai " + (selectedFloor - 1));
        } else {
            System.out.println("Lantai yang dimasukkan tidak valid.");
        }
        
        scanner.close();
    }
}