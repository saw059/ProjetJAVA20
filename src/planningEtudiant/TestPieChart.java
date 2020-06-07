package planningEtudiant;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class TestPieChart extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel pnl;
	DefaultPieDataset pieDataset = new DefaultPieDataset();
	int compteurCours = 0;
	int nombreHeureCours;
	

	public TestPieChart( String matiere ) throws Exception {
		
		addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				//System.exit(0);
			}
			
		});

		Properties props = new Properties();
		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}
		
		Class.forName( props.getProperty( "jdbc.driver.class" ) );
		
		String url = props.getProperty( "jdbc.url" );
		String dbLogin = props.getProperty( "jdbc.login" );
		String dbPassword = props.getProperty( "jdbc.password" );
		
		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
			String strSql = "SELECT * FROM cours WHERE nom = '" + matiere + "'";
			
			try ( Statement statement = connection.createStatement();
					  ResultSet resultSet = statement.executeQuery( strSql ) ) {
				
				resultSet.next();
				nombreHeureCours = Integer.parseInt( resultSet.getString( "nbr_heures" ) );
				String strSql2 = "SELECT date FROM seance WHERE id_cours = " + resultSet.getString( "id" );
				
				try ( Statement statement2 = connection.createStatement();
						  ResultSet resultSet2 = statement.executeQuery( strSql2 ) ) {
					
					while( resultSet2.next() ) {
						
						DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
						Date date = new Date();
						
						if( resultSet2.getDate( "date" ).before( date ) ) {
							compteurCours++;
						}
						
						
					}
				}
				
			}
			pnl = new JPanel (new BorderLayout() );
			setContentPane( pnl );
			setSize( 400, 250 );
			pieDataset.setValue( "nombre d'heures restantes", nombreHeureCours - compteurCours );
			
			pieDataset.setValue( "heures effectuées", compteurCours );

			JFreeChart pieChart = ChartFactory.createPieChart( matiere, pieDataset, true, true, true );
			ChartPanel cPanel = new ChartPanel( pieChart );
			pnl.add( cPanel );
		}
		
		
	}

	/*public static void main(String args[]) throws Exception {
		
		TestPieChart tpc = new TestPieChart(); 
		
		tpc.setVisible(true);
		
	}*/
}