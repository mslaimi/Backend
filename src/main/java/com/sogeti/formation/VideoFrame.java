package com.sogeti.formation;
import  javax.swing.*;
import  java.awt.*;


public class VideoFrame extends JFrame{
	
	    
	    /**
	 * 
	 */
	private static final long serialVersionUID = -7947170265158955375L;
		/** Constructeur de test */
	    public VideoFrame()
	    {
	        //titre de la fenetre
	        super("VideoFrame");
	        
	        //panel
	        JPanel  pan=new JPanel();
	        pan.setLayout(new BorderLayout());
	        pan.add(new ButtonPlay());
	        //pan.add(new ButtonClose());

	        
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setContentPane(pan);
	        pack(); //permet de mettre une bonne dimension a la fenetre
	        setVisible(true);
	    }
	    

}
