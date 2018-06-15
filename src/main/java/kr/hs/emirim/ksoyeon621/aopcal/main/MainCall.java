package kr.hs.emirim.ksoyeon621.aopcal.main;

import kr.hs.emirim.ksoyeon621.aopcal.cal.Calculator;
import kr.hs.emirim.ksoyeon621.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.ksoyeon621.aopcal.cal.RecCalculator;

public class MainCall {

	public static void main(String[] args) {
		long num=10;
		
		long start1 = System.currentTimeMillis();
		Calculator cal1 = new ImpeCalculator();
		long f1 = cal1.factorial(num);
		long end1 = System.currentTimeMillis();
		System.out.printf("imp 팩토리얼 %d 실행시간 = %d\n", num, (end1-start1));
		
		long start2 = System.currentTimeMillis();
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(num);
		long end2 = System.currentTimeMillis();
		System.out.printf("rec 팩토리얼 %d 실행시간 = %d\n", num, (end2-start2));
	}

}
