package com.sogeti.formation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class ButtonClose extends JButton implements ActionListener {

         /**
	 * 
	 */
	private static final long serialVersionUID = -4196972913624572105L;
		/**
         * obligatoire car test implémente l'interface ActionListener
         */
	
	public ButtonClose() {
		super("Close");
		// TODO Auto-generated constructor stub
	}
        public  void    actionPerformed(ActionEvent e)
        {
        	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }




}
