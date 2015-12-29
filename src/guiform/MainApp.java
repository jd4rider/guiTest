package guiform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainApp extends JFrame {

	private JPanel contentPane;
	private JTextField jTxtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp frame = new MainApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jTxtName = new JTextField();
		jTxtName.setBounds(66, 84, 299, 20);
		contentPane.add(jTxtName);
		jTxtName.setColumns(10);
		
		JLabel jLblName = new JLabel("");
		jLblName.setBounds(66, 115, 299, 14);
		contentPane.add(jLblName);
		
		JButton jBtnSayHello = new JButton("Say Hello");
		jBtnSayHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jLblName.setText("Hello " + jTxtName.getText());
			}
		});
		jBtnSayHello.setBounds(171, 164, 89, 23);
		contentPane.add(jBtnSayHello);
	}
}
