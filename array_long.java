package tipedata;

import java.util.Scanner;

public class array_long {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		long[] box = {2229921, 222999,222999};
		for(int i=0; i<3; i++) {
			System.out.println(box[i]);
		}
		long hasil;
		hasil = box[0] - box[1] + box[2];
		System.out.println("jawaban "+hasil);
		 String jawaban;
	        Scanner keyboard = new Scanner(System.in);
	    	System.out.println("Apakah benar? angka pertama - angka ke dua + angka ke tiga hasilnya adalah "+hasil);
	    	System.out.println("jawab :");
	    	jawaban = keyboard.next();
	    	System.out.println("bagus "  );	
	    	
	
	}

}
