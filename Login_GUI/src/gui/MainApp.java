package gui;
//WATKI I ANIMACJA NA NASTEPNY RAZ np okienko do rysowania jak paint 
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
@SuppressWarnings("serial")
public class MainApp extends JFrame implements ActionListener{

	Map<String,String> data=new HashMap<String,String>();
	JTextField login = new JTextField();
	JPasswordField password = new JPasswordField();
	JButton log=new JButton("Zaloguj");
	JLabel logLabel=new JLabel("Login:");
	JLabel pasLabel = new JLabel("Has³o:");
	
	String LOG="login";
	String PAS="haslo";
	String logins;
	String passwords;
	public static void main(String[] args) {
		new MainApp();
	}
	
	public MainApp()
{
		setTitle("Logowanie");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		setSize(300, 150); 
		setResizable(true);
		setLocationRelativeTo(null);
		login.setPreferredSize(new Dimension(210,25));
		password.setPreferredSize(new Dimension(210,25));
		
		log.addActionListener(this);
		
		JPanel panel= new JPanel();
		
		panel.add(logLabel);
		panel.add(login);
		panel.add(pasLabel);
		panel.add(password);
		panel.add(log);
		
		setContentPane(panel);
		setVisible(true);
		
		data.put("login", "haslo");
		
}
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent event) {
		Object eventSource = event.getSource();
		if(eventSource == log)
		{
		int t=0;
		logins=login.getText();
		passwords=password.getText();
			//for(int i=0;i<data.size();i++)
			//{
				if(logins.equals(LOG)&&passwords.equals(PAS))
				{
					JOptionPane.showMessageDialog(this,"Logowanie poprawne!");
					getContentPane().setBackground(Color.green);
				//new WindowApp(this).setVisible(true);
				//setVisible(false);
				t++;
				}
		//	}
			if(t==0)
			{
				 JOptionPane.showMessageDialog(this,"Login lub has³o niepoprawne!");
				 getContentPane().setBackground(Color.red);
				 login.setText(""); password.setText("");
			}
		}
}
}
