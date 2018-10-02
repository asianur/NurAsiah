package tipedata;
import java.util.Scanner;
public class array_boolean {

		public static void main(String[] args) {
			Scanner SC = new Scanner(System.in);

			//mendaklarasikan variabel
			boolean pintar []= {true,false,true,false};
				
			//operasi menggunakan variabel
					System.out.println("jawab dengan: true/false ");
					Scanner scw = new Scanner(System.in);
					System.out.println("Apakah Saya baik: ");
					boolean Pintar = scw.nextBoolean();
					if(Pintar==true) {
						System.out.println("Saya baik");
					}else {
						System.out.println("Saya tidak baik tapi saya tidak jahat ");
					}
			
			

		}
		}
