package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class TwoButtonsWithLambdas extends JFrame  {
	JButton btnShow, btnExit;
	JLabel lblMessage;
	
	public TwoButtonsWithLambdas() {
		super("ActionEvent Demo with Lambda");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		lblMessage = new JLabel();
		lblMessage.setHorizontalAlignment(JLabel.CENTER);
		
		
		btnShow = new JButton("Show Date and Time");
		btnShow.addActionListener
		   (e ->  lblMessage.setText(new Date().toString()));
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener
		   (e ->  System.exit(0));
		
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,2));
		p.add(btnExit);
		p.add(btnShow);
		
		c.add(p, BorderLayout.SOUTH);
		c.add(lblMessage, BorderLayout.PAGE_START);
	}

	public static void main(String[] args) {
	    TwoButtonsWithLambdas f = new TwoButtonsWithLambdas();
	    f.setSize(400,200);
	    f.setVisible(true);
	}

}
