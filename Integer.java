package tipedata;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		 int barang = 25000;
	        int uang = 30000;
	        int hasil;
	    	System.out.println("harga barang "+barang);
	    	System.out.println("jumlah uang "+uang);	    
	    	hasil = uang - barang ;
	        System.out.println(" Belanja Berhasil ");
	        System.out.println(" Uang kembalian dari belanja adalah "+hasil);
	        String jawaban;
	        Scanner keyboard = new Scanner(System.in);
	    	System.out.println("Apakah benar: ");
	    	jawaban = keyboard.next();
	    	System.out.println("bagus "  );
	}




	}


