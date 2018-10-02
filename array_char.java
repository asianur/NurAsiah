package tipedata;

import java.util.Scanner;

public class array_char {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		//mendaklarasikan variabel&menginilisasi
		char [] nilai ={'A','B','C'};
		
		//contoh menginisialisasi variabel
		
		//char nilai1='A';
		
		//operasi menggunakan variabel
		int A = 80;
		if (A > 80){
		
		//menampilkan operasi menggunakan variabel
			System.out.println("nilai anda adalah : "+nilai[0]);}
		else if (A > 80){
			System.out.println("nilai anda adalah : "+nilai[1]);
		}
		else {
			System.out.println("nilai anda adalah : "+nilai[2]);
		}
		
		//melakukan inisialisasi menggunakan input dari keyboard
		Scanner sc = new Scanner (System.in);
		System.out.println("input nilai anda :");
		int Nilai = SC.nextInt();
		if (Nilai > 80){
		
		//menampilkan operasi menggunakan variabel
			System.out.println("nilai anda adalah : "+nilai[0]);}
		else if (Nilai >70){
			System.out.println("nilai anda adalah : "+nilai[1]);
		}
		else if (Nilai < 0){
			System.out.println("nilai anda adalah : "+nilai[2]);		
		}
	
	
			

	}
}
