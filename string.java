package tipedata;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		String text1="fokuslah menjadikan dirimu yang terbaik ";
		String text2="bukan berfikir kaulah yang terbaik";
		 String jawaban;
	        Scanner keyboard = new Scanner(System.in);
	    	System.out.println("bagaimana kabar anda hari ini :");
	    	jawaban = keyboard.next();
	    	System.out.println("semoga kabar anda selalu baik " );
	    	System.out.println();
	    System.out.print(text1.concat(text2));
		
	}


	}


