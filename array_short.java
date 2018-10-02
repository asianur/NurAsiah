package tipedata;

import java.util.Scanner;

public class array_short {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		short[] box = {8678, 7676,32767};
		for(int i=0; i<3; i++) {
			System.out.println(box[i]);
		}
		short hasil;
		hasil = (short) (box[0] - box[1] + box[2]);
		System.out.println("jawaban "+hasil);
		 String jawaban;
	        Scanner keyboard = new Scanner(System.in);
	    	System.out.println("Apakah benar? angka pertama - angka ke dua + angka ke tiga hasilnya adalah "+hasil);
	    	System.out.println("jawab :");
	    	jawaban = keyboard.next();
	    	System.out.println("bagus "  );	
	    	

		
	}

}
