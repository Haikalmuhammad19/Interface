import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop = null;

        // Tampilkan menu awal
        System.out.println("Selamat datang!");
        System.out.println("Menu:");
        System.out.println("a. ON - Menyalakan laptop");
        System.out.println("b. OFF - Mematikan laptop");
        System.out.println("c. UP - Menambah volume");
        System.out.println("d. DOWN - Mengurangi volume");
        System.out.println("e. EXIT - Keluar dari program");

        String input;
        boolean isRunning = true;

        while (isRunning) {
            System.out.print("Masukkan pilihan: ");
            input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "ON":
                    if (laptop != null)
                        laptop.powerOn();
                    else
                        System.out.println("Mohon pilih laptop terlebih dahulu!");
                    break;
                case "OFF":
                    if (laptop != null)
                        laptop.powerOff();
                    else
                        System.out.println("Mohon pilih laptop terlebih dahulu!");
                    break;
                case "UP":
                    if (laptop != null)
                        laptop.volumeUp();
                    else
                        System.out.println("Mohon pilih laptop terlebih dahulu!");
                    break;
                case "DOWN":
                    if (laptop != null)
                        laptop.volumeDown();
                    else
                        System.out.println("Mohon pilih laptop terlebih dahulu!");
                    break;
                case "EXIT":
                    System.out.println("Terima kasih! Program telah keluar.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
        scanner.close();
    }
}
