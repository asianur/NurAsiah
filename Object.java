package tipedata;

import java.util.Scanner;

public class Object {

	public static void main(String[] args) {
		Object ben = new Object();
		ben.teriak("semangat", 45);
		String jawaban;
		 Scanner keyboard = new Scanner(System.in);
	   	System.out.println("bagaimana kabar anda hari ini :");
	   	jawaban = keyboard.next();
	   	System.out.println("semoga hari anda menyenangkan " );
	   	

	}
	
		void teriak(String suara, int angka) {
			System.out.println(suara + angka);
		}
		 
		
	}

