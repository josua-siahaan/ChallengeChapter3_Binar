package Josua.test;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void menu() {
        System.out.println("pilih menu: ");
        System.out.println("1. Generate txt untuk menampilkan modus");
        System.out.println("2. Generate txt untuk menampilkan nilai rata-rata, median");
        System.out.println("3. Generate kedua file");
        System.out.println("0. exit");
    }
    public static void main(String[] args) {

        int opsi = 0;

        String path = "C:/Users/USER/Documentsdata_sekolah.csv";
        String path1 = "C:/Users/USER/Documentsupdate_data_sekolah.txt";

        /*
            Deklarasi class untuk eksekusi
         */
        ReaderCsv rc = new ReaderCsv();
        WritterTxtAndCSV wtc = new WritterTxtAndCSV();

        do {
            menu();
            System.out.print("masukan pilihan: ");
            opsi = scanner.nextInt();
            switch (opsi) {
                case 1:
                    wtc.writterTxtAndCsv(path1, rc.readerCsv(path, 1));
                    break;
                case 2:
                    wtc.writterTxtAndCsv(path1, rc.readerCsv(path, 2));
                    break;
                case 3:
                    wtc.writterTxtAndCsv(path1, rc.readerCsv(path, 3));
                    break;
                default:
                    System.out.println("thanks for today see you");
                    break;
            }
        } while (opsi != 0);



    }
}
