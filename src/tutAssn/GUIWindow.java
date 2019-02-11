package tutAssn;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIWindow window = new GUIWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
				
		JTextPane txtpnEnterANumber = new JTextPane();
		txtpnEnterANumber.setText("Enter a number");
		txtpnEnterANumber.setBounds(74, 113, 145, 43);
		frame.getContentPane().add(txtpnEnterANumber);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Enter a number");
		textPane.setBounds(74, 231, 145, 43);
		frame.getContentPane().add(textPane);
		
		JLabel lblValue = new JLabel("Value 1");
		lblValue.setBounds(305, 113, 46, 14);
		frame.getContentPane().add(lblValue);
		
		JLabel lblValue_1 = new JLabel("Value 2");
		lblValue_1.setBounds(305, 241, 46, 14);
		frame.getContentPane().add(lblValue_1);
		
		JTextPane txtpnAnswer = new JTextPane();
		txtpnAnswer.setText("Answer");
		txtpnAnswer.setBounds(282, 325, 126, 43);
		frame.getContentPane().add(txtpnAnswer);
		
		JButton btnNewButton = new JButton("Multiply");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int numValue1 = Integer.parseInt(txtpnEnterANumber.getText()); 
				
				int numValue2 = Integer.parseInt(textPane.getText());
				
				int numAnswer = numValue1 / numValue2;
				
				txtpnAnswer.setText(Integer.toString(numAnswer));
				
				
			}
		});
		btnNewButton.setBounds(105, 325, 167, 61);
		frame.getContentPane().add(btnNewButton);

		

	}
}
