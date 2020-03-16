import java.awt.event.*;
import javax.swing.*;


public class CalculatorView extends JFrame{
	
	private JTextField firstNumber  = new JTextField(10);
	private JLabel multiplyLabel = new JLabel("x");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);

	CalculatorView(){

		        // Sets up the view and adds the components
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		
		calcPanel.add(firstNumber);
		calcPanel.add(multiplyLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);

		this.add(calcPanel);

		// End of setting up the components --------

	}

		public int getFirstNumber(){
			return Integer.parseInt(firstNumber.getText());
		}
		
		public int getSecondNumber(){
			return Integer.parseInt(secondNumber.getText());
		}

		public int getCalcSolution(){
			return Integer.parseInt(calcSolution.getText());
		}

		public void setCalcSolution(int solution){
			calcSolution.setText(Integer.toString(solution));
		}
		// If the calculateButton is clicked execute a method

		// in the Controller named actionPerformed

		void multiplyCalculateListener(ActionListener listenForCalcButton){

			calculateButton.addActionListener(listenForCalcButton);

		}

		// Open a pop-up that contains the error message passed

		void displayErrorMessage(String errorMessage){

			JOptionPane.showMessageDialog(this, errorMessage);

		}


}
