package kr.hs.emirim.ksoyeon621.aopcal.main;

import kr.hs.emirim.ksoyeon621.aopcal.cal.Calculator;
import kr.hs.emirim.ksoyeon621.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.ksoyeon621.aopcal.cal.RecCalculator;

public class mainStart {

	public static void main(String[] args) {
		Calculator cal1 = new ImpeCalculator();
		long f1 = cal1.factorial(100);
		System.out.println("imp"+f1);
		
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(100);
		System.out.println("rec"+f2);
	}

}
