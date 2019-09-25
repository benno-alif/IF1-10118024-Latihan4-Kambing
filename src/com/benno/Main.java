package com.benno;

    /*
    NAMA        : BENNO ALIF ANGGARA
    KELAS       : IF1
    NIM         : 10118024
    Deskripsi   : Menambah jumlah kambing
     */

public class Main {

    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing  = 0;

        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
    }

    public static void main(String[] args) {
        Main kambingJantan = new Main();
        kambingJantan.tambahKambing();
    }
}
