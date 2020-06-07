package planningEtudiant;


import java.awt.Graphics;

import javax.swing.JPanel;

public class heureJournee extends JPanel{
	
	private static final long serialVersionUID = 6988326117893553486L;



	  public void paintComponent(Graphics g){
		    g.drawString( "08h30", 35, 10 );
		    g.drawString( "10h00", 35, 100 );
		    g.drawString( "10h15", 35, 115 );
		    g.drawString( "11h45", 35, 205 );
		    g.drawString( "12h00", 35, 220 );
		    g.drawString( "13h30", 35, 300 );
		    g.drawString( "13h45", 35, 315 );
		    g.drawString( "15h15", 35, 400 );
		    g.drawString( "15h30", 35, 415 );
		    g.drawString( "17h00", 35, 500 );
		    g.drawString( "17h15", 35, 515 );
		    g.drawString( "18h45", 35, 600 );
		    g.drawString( "19h00", 35, 615 );
		    g.drawString( "20h30", 35, 700 );
		   
		  }  
}
