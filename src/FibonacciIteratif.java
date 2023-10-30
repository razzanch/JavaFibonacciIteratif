import java.util.Scanner;

/**
 * Kelas yang mempresentasikan pendekatan Iteratif untuk menghitung dan
 * mencetak deret Fibonacci.
 */
public class FibonacciIteratif {

    /**
     * Metode main yang mengambil masukan pengguna dan mencetak deret Fibonacci
     * iteratif berserta waktu eksekusi.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret Fibonacci yang ingin ditampilkan: ");
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        System.out.println("Deret Fibonacci iteratif:");
        fibonacciIteratif(n);


        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Waktu eksekusi: " + executionTime + " milidetik");
    }

    /**
     * Metode ini menghitung dan mencetak deret Fibonacci iteratif dari 0 hingga ke-n
     * bilangan dalam deret tersebut.
     *
     * @param n Jumlah bilangan dalam deret Fibonacci yang akan dihitung dan
     *          dicetak.
     */
    public static void fibonacciIteratif(int n) {
        long n1 = 0, n2 = 1;

        if (n >= 1) {
            System.out.println(n1 + " ");
        }
        if (n >= 2) {
            System.out.println(n2 + " ");
        }

        for (int i = 2; i < n; i++) {
            long n3 = n1 + n2;
            if (i < n - 1) {
                System.out.println(n3 + " ");
            } else {
                System.out.println(n3); // Cetak baris terakhir
            }
            n1 = n2;
            n2 = n3;
        }
    }

    }

