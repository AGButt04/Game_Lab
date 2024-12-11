import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class GameUserInterface extends JFrame implements ActionListener {
	
	public JTextArea text;
	private JPanel panel;
	private JLabel label;
	private JTextField field;
	private JButton button;

	public GameUserInterface() {
		buildWindow();
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String s = field.getText();
		Game.processCommand(s);
	}
	
	private void buildWindow() {
		this.setTitle("The Game of Curses");
		this.setLayout(new BorderLayout());

		Border border = BorderFactory.createLineBorder(java.awt.Color.BLACK, 5);
		Font font = new Font("Serif", Font.BOLD,15);
		
		text = new JTextArea();
		text.setWrapStyleWord(true);
		text.setLineWrap(true);
		text.setBorder(border);
		text.setBackground(Color.DARK_GRAY);
		text.setForeground(Color.WHITE);
		text.setFont(font);
		
		panel = new JPanel(new GridLayout(3,1));
		label = new JLabel("What are you gonna do now?");
		label.setForeground(Color.red);
		label.setFont(font);
		
		field = new JTextField();
		field.setBackground(Color.white);
		field.setFont(font);
		field.setForeground(Color.red);
		
		button = new JButton("Positive!");
		button.addActionListener(this);
		button.setBackground(Color.LIGHT_GRAY);
		button.setFont(new Font("SansSerif", Font.BOLD, 18));		
		button.setForeground(Color.DARK_GRAY);
		
		panel.add(label);
		panel.add(field);
		panel.add(button);
		
		this.add(text, BorderLayout.CENTER);
		//this.add(panel, BorderLayout.SOUTH);
		add(panel, BorderLayout.SOUTH);
		
		JScrollPane scroll = new JScrollPane(text);
		add(scroll, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits the program when you hit x on console, can do anything with this.
		this.setSize(500,500);
		this.setLocationRelativeTo(null); //Center window 
		this.setVisible(true); //Make window appear
		
	}

}
