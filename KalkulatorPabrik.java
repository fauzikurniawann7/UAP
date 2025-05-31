package uap.mains;

import java.util.Scanner;
import java.util.Locale;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // memastikan titik (.) digunakan untuk desimal

        System.out.println("================================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Nama: Moch. Fauzi Kurniawan");
        System.out.println("NIM : 245150707111024");
        System.out.println("================================================");

        System.out.println("Donat dengan lubang");
        System.out.println("================================================");

        double R_major = readDoubleInput(scanner, "Isikan Radius    : ");
        double r_minor = readDoubleInput(scanner, "Isikan radius    : ");
        System.out.println("================================================");

        Torus torus = new Torus(R_major, r_minor);
        torus.printInfo();

        System.out.println("================================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("================================================");

        double r_sphere = readDoubleInput(scanner, "Isikan radius    : ");
        System.out.println("================================================");

        Sphere sphere = new Sphere(r_sphere);
        sphere.printInfo();

        System.out.println("================================================");
        scanner.close();
    }

    // Method untuk membaca input double dengan validasi
    private static double readDoubleInput(Scanner scanner, String prompt) {
        double value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                valid = true;
            } else {
                System.out.println("Input tidak valid! Masukkan angka dengan titik sebagai desimal (contoh: 3.5)");
                scanner.next(); // konsumsi input salah
            }
        }
        return value;
    }
}
