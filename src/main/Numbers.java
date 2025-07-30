public class Numbers {
	public int sumNumbers (int i, int j) {
		return i + j;
	}
	
	public int multiplyNumbers (int i, int j) {
		return i * j;
	}
	
	public int subtractNumbers (int i, int j) {
		return i - j;
	}
	
	public int divideNumbers (int i, int j) {
		if (j == 0) {
			throw new ArithmeticException("Division by zero is not allowed")
		}
		
		return i / j;
	}
	
//	test eclipse
	
}