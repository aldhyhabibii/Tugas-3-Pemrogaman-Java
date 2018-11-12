package tugas3pengganti;

import java.util.Scanner;

public class Tugas3Pengganti {

    public static void main(String[] args) {
        Inputan obj = new Inputan();
        Mahasiswa data;
        Scanner sc = new Scanner(System.in);
        int input;
        int in = 0;
        int jumlah;
        do {
            do {
                System.out.println("==================");
                System.out.println("TUGAS CLASS-OBJECT");
                System.out.println("==================");
                System.out.println("1. Input Data");
                System.out.println("2. Tampil Data");
                System.out.println("3. Sorting Data");
                System.out.println("4. Keluar");
                System.out.print("Masukkan Pilihan Anda: ");
                input = sc.nextInt();

                if (input < 1) {
                    System.out.println("Harap pilih menu 1-4!");
                } else if (input > 4) {
                    System.out.println("Harap pilih menu 1-4!");
                }
            } while (input > 6);

            System.out.println("========================");
            System.out.println("");

            switch (input) {
                case 1:
                    do {
                        System.out.print("Jumlah Data Mahasiswa yang Ingin Dimasukkan (1-100): ");
                        jumlah = sc.nextInt();
                        obj.setINDEX(jumlah);
                        if (jumlah > 100) {
                            System.out.println("Jumlah Data Mahasiswa yang Dimasukkan Melebihi Kapasitas yang Ditentukan!");
                        }
                    } while (jumlah > 100);
                    for (int i = 0; i < jumlah; i++) {

                        data = new Mahasiswa();
                        System.out.println("Data mahasiswa ke-" + (i + 1));
                        System.out.print("Masukkan NIM  : ");
                        String nim = sc.next();
                        data.setNim(nim);
                        System.out.print("Masukkan Nama : ");
                        String nam = sc.next();
                        data.setNama(nam);
                        System.out.print("Masukkan IPK  : ");
                        double ip = sc.nextDouble();
                        data.setIpk(ip);
                        System.out.println();
                        obj.set(i, data);
                    }
                    break;

                case 2:
                    System.out.println("================");
                    System.out.println("MENAMPILKAN DATA");
                    System.out.println("================");
                    System.out.println("1. Semua");
                    System.out.println("2. Sebagian");
                    System.out.println("3. Salah satu");
                    System.out.print("Pilihan Anda: ");
                    int pil = sc.nextInt();
                    int ind = obj.getINDEX();
                    switch (pil) {
                        case 1:
                            for (int i = 0; i < ind; i++) {
                                System.out.println("=================");
                                System.out.println("DATA MAHASISWA" + (i + 1));
                                obj.get(i);
                            }
                            break;

                        case 2:
                            System.out.print("Data Index Dari: ");
                            int idx = sc.nextInt();
                            System.out.print("Sampai Index Ke: ");
                            System.out.print("=================");
                            int kidx = sc.nextInt();

                            if (idx < kidx) {
                                for (int k = idx; k <= kidx; k++) {
                                    System.out.print("Data Mahasiswa" + (k + 1) + "\n");
                                    obj.get(k);
                                }
                            } else if (idx > kidx) {
                                for (int z = kidx; z < idx; z++) {
                                    System.out.print("Data Mahasiswa" + (z + 1) + "\n");
                                    obj.get(z);
                                }
                            } else if (idx == kidx) {
                                System.out.print("Data Mahasiswa" + (kidx + 1) + "\n");
                                obj.get(kidx);
                            }

                            break;
                        case 3:
                            System.out.print("\n==================================\n");
                            System.out.print("Msukkan Index yang Ingin Ditampilkan: ");
                            int sbg = sc.nextInt();
                            System.out.print("\n==================================\n");
                            System.out.print("Data Mahasiswa" + (sbg + 1) + "\n");
                            obj.get(sbg);
                            break;
                    }

                    break;
                case 3:
                    System.out.println("=================");
                    System.out.println("SORTING DATA");
                    System.out.println("1. Sorting by NIM");
                    System.out.println("2. Sorting by Nama");
                    System.out.println("3. Sorting by IPK");
                    System.out.print("Pilihan Anda: ");
                    System.out.println("=================");
                    int car = sc.nextInt();

                    switch (car) {
                        case 1:
                            System.out.print("Masukan NIM Nahasiswa yang Ingin Dicari: ");
                            String inputNim = sc.next();
                            System.out.println("=========================================");
                            obj.SearchNim(inputNim);
                            break;

                        case 2:
                            System.out.print("Masukan Nama Mahasiswa yang Ingin Dicari: ");
                            String inputNama = sc.next();
                            System.out.println("==========================================");
                            obj.SearchNama(inputNama);
                            break;
                        case 3:
                            System.out.print("Masukan IPK Mahasiswa yang Ingin Dicari: ");
                            String inputIpk = sc.next();
                            System.out.println("=========================================");
                            obj.SearchIpk(inputIpk);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Terima Kasih!");
                    System.exit(0);
                    break;
            }
        } while (in == 0);
    }
}
