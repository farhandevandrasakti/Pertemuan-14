import java.util.Scanner;

public class Kafe12 {
    public static int hitungTotalHarga12(int pilihanMenu, int banyakItem) {
        int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};
        
        if (pilihanMenu < 1 || pilihanMenu > hargaMenu.length) {
            System.out.println("Menu tidak valid!");
            return 0;
        }
        
        int hargaSatuan = hargaMenu[pilihanMenu - 1];
        return hargaSatuan * banyakItem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15,000");
        System.out.println("2. Cappuccino   - Rp 20,000");
        System.out.println("3. Latte        - Rp 22,000");
        System.out.println("4. Teh Tarik    - Rp 12,000");
        System.out.println("5. Roti Bakar   - Rp 10,000");
        System.out.println("6. Mie Goreng   - Rp 18,000");
        System.out.println("===========================");
        
        System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        
        int totalHarga = hitungTotalHarga12(pilihanMenu, banyakItem);
        
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
        
        sc.close();
    }
}