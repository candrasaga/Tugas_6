package fromzero;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("NAMA : Candra Setiawan");
        System.out.println("NIM  : 215150700111024\n");

        Scanner scan = new Scanner(System.in);

        Manusia manusia1 = new Manusia("Aku", "777777777", true, true);
        Manusia manusia2 = new Manusia("Liang Jie", "82937162", false, false);
        Manusia manusia3 = new Manusia("Dilraba Dilmurat", "819203625", false, false);

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("Shenyue", "928012388", false, false, "215150601111003", 3.9);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Xu Kai", "273737899", false, true, "215150201111004", 3.2);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Chen Zhe Yuan", "919231772", true, false, "195150301111007", 3.44);
        MahasiswaFilkom mhs4 = new MahasiswaFilkom("Qiang Lei", "999023721", true, true, "1851507011110006", 4.00);

        Pekerja pekerja_1 = new Pekerja("Cecep", "123781827", true, true, 8, 22, "215102439281");
        Pekerja pekerja_2 = new Pekerja("Andi", "231828222", true, false, 12, 25, "281102739282");
        Pekerja pekerja_3 = new Pekerja("Nana", "223000928", false, true, 5 , 19, "293102839283");
        Pekerja pekerja_4 = new Pekerja("Olivia", "928391288", false ,false, 10, 23, "897102539284");

        Manajer manajer_1 = new Manajer("Li Changge", "351703384129", false, false, 8, 20, "104837283729", 1523);
        Manajer manajer_2 = new Manajer("Ashina", "351701384322", false, true, 10, 23, "407837183728", 1591);
        Manajer manajer_3 = new Manajer("Nanase", "351708384123", false, false, 6, 25, "609837983721", 2333);

        ArrayList<Manusia> listManusia = new ArrayList<Manusia>();
        ArrayList<Pekerja> listPekerja = new ArrayList<Pekerja>();
        ArrayList<Manajer> listManajer = new ArrayList<Manajer>();
        ArrayList<MahasiswaFilkom> listMahasiswaFilkom = new ArrayList<MahasiswaFilkom>();

        listManusia.add(manusia1);
        listManusia.add(manusia2);
        listManusia.add(manusia3);

        listPekerja.add(pekerja_1);
        listPekerja.add(pekerja_2);
        listPekerja.add(pekerja_3);
        listPekerja.add(pekerja_4);

        listManajer.add(manajer_1);
        listManajer.add(manajer_2);
        listManajer.add(manajer_3);

        listMahasiswaFilkom.add(mhs1);
        listMahasiswaFilkom.add(mhs2);
        listMahasiswaFilkom.add(mhs3);
        listMahasiswaFilkom.add(mhs4);

        System.out.println("====== Data Manusia =====\n");
        listManusia.toString();
        System.out.println("=================================================\n");
        System.out.println("====== Data Pekerja =====\n");
        listPekerja.toString();
        System.out.println("=================================================\n");
        System.out.println("====== Data Manajer =====\n");
        listManajer.toString();
        System.out.println("=================================================\n");
        System.out.println("====== Data Mahasiswa Filkom =====\n");
        listMahasiswaFilkom.toString();
        System.out.println("=================================================");

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Total Manusia          : " + listManusia.size());
        System.out.println("Total Pekerja          : " + listPekerja.size());
        System.out.println("Total Manajer          : " + listManajer.size());
        System.out.println("Total Mahasiswa Filkom : " + listMahasiswaFilkom.size());
        System.out.println("---------------------------");


    }
}

