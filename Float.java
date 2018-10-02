package tipedata;

import java.util.Scanner;

public class Float {

	public static void main(String[] args) {
		     float a, b, hasil;
		        a = 50;
		        b = 36000;
		    	System.out.println ("a="+a);
				System.out.println ("b="+b);
				System.out.println("a * b + b - a");
		        hasil = a * b + b - a;
		        System.out.println("Hasil dari tipe data float "+hasil);
		        String jawaban;
		        Scanner keyboard = new Scanner(System.in);
		    	System.out.println("apakah anda setuju:");
		    	jawaban = keyboard.next();
		    	System.out.println("bagus " );
		}

	}
