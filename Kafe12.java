public class Kafe12 {

    static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("======= MENU RESTO KAFE =======");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte      - Rp 22,000");
        System.out.println("4. Teh Tarik  - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===============================");
        System.out.println("Pelanggan: " + namaPelanggan);

        if (isMember) {
            System.out.println("Status: Member (Mendapat potongan harga khusus)");
        } else {
            System.out.println("Status: Non-member");
        }

        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Menu("Farhan", true);
    }
}
