public class Kubus12 {
    public static int volumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }
    
    public static int luasPermukaanKubus(int sisi) {
        return 6 * sisi * sisi;
    }
    
    public static void main(String[] args) {
        int sisi = 7;
        int volume = volumeKubus(sisi);
        int luasPermukaan = luasPermukaanKubus(sisi);
        
        System.out.println("Volume kubus dengan sisi " + sisi + " adalah: " + volume);
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah: " + luasPermukaan);
    }
}
