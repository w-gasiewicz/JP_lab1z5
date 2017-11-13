package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowApp extends JFrame implements ActionListener{

	JButton check=new JButton();
	public WindowApp(MainApp mainApp) {
		setTitle("Zalogowano poprawnie!");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		setSize(300, 200); 
		setResizable(true);
		setLocationRelativeTo(null); 

		check.setPreferredSize(new Dimension(50,25));
		check.setBackground(Color.GREEN);
		
		JPanel logged = new JPanel();

		
		logged.add(check);
		
		setContentPane(check);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
