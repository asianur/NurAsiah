package tipedata;

import java.util.Scanner;

public class array_int {

	public static void main(String[] args) {
		int[] angka = new int[3];
		angka[0] = 15; angka[1] = 25; angka[2] = 5;
		for(int i=0; i<3; i++) {
			System.out.println(angka[i]);
		}
		int hasil;
		hasil = angka[0] - angka[1] + angka[2];
		System.out.println("jawaban "+hasil);
		 String jawaban;
	        Scanner keyboard = new Scanner(System.in);
	    	System.out.println("Apakah benar? angka pertama - angka ke dua + angka ke tiga hasilnya adalah "+hasil);
	    	System.out.println("jawab :");
	    	jawaban = keyboard.next();
	    	System.out.println("bagus "  );	
	    	
	    	
	}
}

