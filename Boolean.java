package tipedata;

import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
	Scanner SC = new Scanner(System.in);

		// Mendeklarasikan Variabel
		boolean A;
		
		// Menginisialisasi Variabel
		A = true;
		A = false;
		
		// Operasi Menggunakan Variabel & Menampilkan Nilai Operasi Variabel & Melakukan inisialisasi variabel melalui keyboard/input melalui keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Apakah Saya Hadir: ");
		A = sc.nextBoolean();
		if(A ==true) {
			System.out.println("Bagus");
		}else {
			System.out.println("Jangan Diulangi Lagi");
		}	
	}
}
