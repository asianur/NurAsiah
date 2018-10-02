package tipedata;

import java.util.Scanner;

public class array_string {

	public static void main(String[] args) {
		String[] text = {"fokuslah menjadikan dirimu yang terbaik ", "bukan berfikir kaulah yang terbaik"};		
		for(int i=0; i<2; i++) {
			System.out.println(text[i]);
		}
			String hasil;
			hasil = (text[0]+text[1]);
			String jawaban ;
			System.out.println("jawaban: "+hasil);
			    Scanner keyboard = new Scanner(System.in);
		    	System.out.println("Apakah benar? text pertama + text ke dua hasilnya adalah "+hasil);
		    	System.out.println("jawab :");
		    	jawaban = keyboard.next();
		    	System.out.println("bagus "  );	

	}

	}

