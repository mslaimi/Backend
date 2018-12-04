package com.sogeti.formation;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1628840295065670312L;
	
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");

	  public MainFrame(){
	  	this.setTitle("Animation");
	    this.setSize(1000, 500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    //Ajout du bouton à notre content pane
	    //this.getContentPane().add(bouton);
	   // pan.add(new ButtonClose(),BorderLayout.NORTH);
	   // pan.add(new ButtonPlay(),BorderLayout.SOUTH);
	    
	    this.setLayout(new GridLayout(10, 10,5,5));
	    this.getContentPane().add(new ButtonPlay(),BorderLayout.NORTH);
	    this.getContentPane().add(new ButtonClose(),BorderLayout.SOUTH);

	    //this.setContentPane(pan);
	    this.setVisible(true);


}
}