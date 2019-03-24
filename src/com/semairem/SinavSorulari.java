package com.semairem;

import java.util.Random;
import java.util.Scanner;



public class SinavSorulari {
	private static int faktoriyelSonuc;
	private static int fonksiyonSonuc;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random rastgeleIslemSayisi=new Random();
		int islemSayisi=rastgeleIslemSayisi.nextInt(10);
		
		Fonksiyon islem=new Fonksiyon();
	    Faktoriyel islem2=new Faktoriyel();
	    
		for (int i = 0; i < islemSayisi; i++) {
			
			System.out.println("lütfen seçim yapýn (1-2)");
			int secim=scanner.nextInt();
			switch(secim) {
			
			case 1:

				System.out.println(islem2.faktoriyel());
				break;
				
			case 2:
				System.out.println(islem.fonksiyon());
				break;
			default :
				System.out.println("hatalý seçim yaptýnýz");
				break;
			}
			
			
		}
		
	}

}
