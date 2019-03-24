package com.semairem;

import java.util.Random;

public class Faktoriyel {

	int faktoriyel() {
		// TODO Auto-generated method stub
		Random rastgeleSayiFaktoriyel=new Random();
		int uretilecekSayi=rastgeleSayiFaktoriyel.nextInt(5);
		int faktoriyelSonuc=1;
		System.out.println("faktöriyel için üretilen rastgele sayý "+uretilecekSayi);
		for (int i = 1; i <= uretilecekSayi; i++) {
			faktoriyelSonuc= faktoriyelSonuc*i;
		}
		System.out.println("faktoriyelin cevabý "+faktoriyelSonuc);
		return faktoriyelSonuc;
	}

}
