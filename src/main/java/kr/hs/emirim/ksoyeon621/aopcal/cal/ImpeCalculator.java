package kr.hs.emirim.ksoyeon621.aopcal.cal;

public class ImpeCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();
		long result = 1;
		for (long i = 1; i <= num; i++) {
			result *= i;
		}
		long end = System.currentTimeMillis();
		System.out.println("팩토리얼 "+num+" 실행시간"+(end-start));
		return result;
	}
}
