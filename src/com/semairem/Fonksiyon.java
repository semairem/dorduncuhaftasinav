package com.semairem;

import java.util.Random;

public class Fonksiyon {

	int fonksiyon() {
		int fonksiyonSonuc = 0;

		Random rastgeleSayiFonksiyon = new Random();
		int x = rastgeleSayiFonksiyon.nextInt(5);
		System.out.println("fonksiyon için üretilen rastgele sayý " + x);
		fonksiyonSonuc = (x * x * x) + ((x - 3) * (x - 3)) + 5;

		System.out.println("fonksiyonun cevabý" + fonksiyonSonuc);
		return fonksiyonSonuc;
	}

}
