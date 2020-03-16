
public class CalculatorModel {
	
	private int calculationValue;
	
	public void multiplyTwoNumbers(int firstNumber, int secondNumber) {
		calculationValue = firstNumber * secondNumber;
	}

	public int getCalculationValue() {
		return calculationValue;
	}
}
