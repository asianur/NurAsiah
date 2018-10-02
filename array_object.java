package tipedata;

	import java.util.Scanner;
	public class array_object {
			private int panjang;
			private int lebar;
			private int hasil;
			private int sethasil,sethasil1,sethasil2;
			
			//getter dan setter panjang
			public int getpanjang(){
				return panjang;
			}
			public void setpanjang(int panjang){
				this.panjang=panjang;
			}
			//getter dan setter lebar
			public int getlebar(){
				return lebar;
			}
			public void setlebar(int lebar){
				this.lebar=lebar;
			}
			//getter dan setter hasil
			public int sethasil(){
				return hasil;
			}
			public void sethasil(int hasil){
				this.hasil=hasil;
			}
			
			
			public static void main(String[] args) {
				Scanner sc = new Scanner (System.in);
				contoh andi = new contoh();
				//mendeklarasikan variabel & menganalisasi variabel
				andi.setpanjang(100);
				andi.setlebar(200);
				//operasi menggunakan variabel
				andi.sethasil=(int)(andi.getpanjang()+andi.getlebar());
				//menampilkan hasil dari variabel
				System.out.println("panjang persegi : "+andi.getpanjang());
				System.out.println("lebar persegi   : "+andi.getlebar());
				System.out.println(andi.sethasil);
				//mendeklarasikan variabel dan menganalisa melalui keyboard
				System.out.print("masukan panjang persegi : ");
				andi.hasil=sc.nextInt();
				System.out.print("masukan lebar persegi : ");
				andi.sethasil1=sc.nextInt();
				andi.sethasil2=(int)(andi.hasil+andi.sethasil1);
				System.out.println("hasilnya adalah : "+andi.sethasil2);
		}						


		}




