package tipedata;

import java.util.Scanner;

public class Short {

	public static void main(String[] args) {
		short a = 32767;
        short b = 7676;
        int hasil;
    	System.out.println("a="+a);
		System.out.println("b="+b);
        hasil = a - b;
        System.out.println("Hasil pengurangan short adalah "+hasil);
   	 String jawaban;
        Scanner keyboard = new Scanner(System.in);
    	System.out.println("apakah anda setuju :");
    	jawaban = keyboard.next();
    	System.out.println("bagus " );

}


	}

