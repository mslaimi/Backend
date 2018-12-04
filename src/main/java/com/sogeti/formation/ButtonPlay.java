package com.sogeti.formation;

import java.awt.event.*;
import javax.swing.JButton;

public class ButtonPlay extends JButton implements ActionListener {

        /**
	 * 
	 */
	private static final long serialVersionUID = -5786974379354549397L;

		public ButtonPlay()
        {
        	super("Play");
        }

	/**
         * obligatoire car test implémente l'interface ActionListener
         */
        public  void    actionPerformed(ActionEvent e)
        {
            System.out.println("Ici !");
        }

}

