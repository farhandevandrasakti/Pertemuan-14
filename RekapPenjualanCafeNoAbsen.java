import java.util.Scanner;

public class RekapPenjualanCafeNoAbsen {
    public static void inputDataPenjualan(int[][] penjualan, String[] menu) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }
    
    public static void tampilDataPenjualan(int[][] penjualan, String[] menu) {
        System.out.println("\n=== REKAP PENJUALAN KAFE ===");
        System.out.printf("%-15s", "Menu");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%-10s", "Hari " + (i + 1));
        }
        System.out.println();
        
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-10d", penjualan[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void menuPenjualanTertinggi(int[][] penjualan, String[] menu) {
        int maxTotal = 0;
        String menuTerlaris = "";
        
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTerlaris = menu[i];
            }
        }
        
        System.out.println("\nMenu dengan penjualan tertinggi:");
        System.out.println("Menu: " + menuTerlaris);
        System.out.println("Total penjualan: " + maxTotal);
    }
    
    public static void rataRataPenjualan(int[][] penjualan, String[] menu) {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / 7;
            System.out.printf("%-15s: %.2f\n", menu[i], rataRata);
        }
    }
    
    public static void main(String[] args) {
        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        int[][] penjualan = new int[5][7];
        
        inputDataPenjualan(penjualan, menu);
        tampilDataPenjualan(penjualan, menu);
        menuPenjualanTertinggi(penjualan, menu);
        rataRataPenjualan(penjualan, menu);
    }
}