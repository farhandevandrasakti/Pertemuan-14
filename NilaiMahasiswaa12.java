import java.util.Scanner;

public class NilaiMahasiswaa12 {
    public static void isianArray(int[] arrayNilai) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            arrayNilai[i] = input.nextInt();
        }
    }
    
    public static void tampilArray(int[] arrayNilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + arrayNilai[i]);
        }
    }
    
    public static int hitTot(int[] arrayNilai) {
        int total = 0;
        for (int i = 0; i < arrayNilai.length; i++) {
            total += arrayNilai[i];
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();
        
        int[] nilaiMahasiswa = new int[N];
        
        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);
        
        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);
        
        input.close();
    }
}