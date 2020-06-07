package planningProfesseur;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class coursProfSemaine22 {

	public JPanel grilleEdT( String email, String password ) throws Exception {

		JPanel contentPane2 = new JPanel();

		contentPane2.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.weightx = gbc.weighty = 1;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		JButton but0 = new JButton( testCours_25_08_30( email, password ) );
		but0.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_25_08_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but0, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 0;
		JButton but1 = new JButton( testCours_26_08_30( email, password ) );
		but1.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_26_08_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but1, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 0;
		JButton but2 = new JButton(  testCours_27_08_30( email, password ) );
		but2.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_27_08_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but2, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 0;
		JButton but3 = new JButton( testCours_28_08_30( email, password ) );
		but3.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_28_08_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but3, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 0;
		JButton but4 = new JButton( testCours_29_08_30( email, password ) );
		but4.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_29_08_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but4, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 0;
		JButton but5 = new JButton( testCours_30_08_30( email, password ) );
		but5.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_30_08_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but5, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 1;
		JButton but6 = new JButton( testCours_25_10_15( email, password ) );
		but6.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_25_10_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but6, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 1;
		JButton but7 = new JButton( testCours_26_10_15( email, password ) );
		but7.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_26_10_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but7, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 1;
		JButton but8 = new JButton( testCours_27_10_15( email, password ) );
		but8.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_27_10_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but8, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 1;
		JButton but9 = new JButton( testCours_28_10_15( email, password ) );
		but9.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_28_10_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but9, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 1;
		JButton but10 = new JButton( testCours_29_10_15( email, password ) );
		but10.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_29_10_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but10, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 1;
		JButton but11 = new JButton( testCours_30_10_15( email, password ) );
		but11.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_30_10_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but11, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 2;
		JButton but12 = new JButton( testCours_25_12_00( email, password ) );
		but12.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_25_12_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but12, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 2;
		JButton but13 = new JButton( testCours_26_12_00( email, password ) );
		but13.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_26_12_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but13, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 2;
		JButton but14 = new JButton( testCours_27_12_00( email, password ) );
		but14.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_27_12_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but14, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 2;
		JButton but15 = new JButton( testCours_28_12_00( email, password ) );
		but15.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_28_12_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but15, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		JButton but16 = new JButton( testCours_29_12_00( email, password ) );
		but16.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_29_12_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but16, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 2;
		JButton but17 = new JButton( testCours_30_12_00( email, password ) );
		but17.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_30_12_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but17, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 3;
		JButton but18 = new JButton( testCours_25_13_45( email, password ) );
		but18.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_25_13_45( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but18, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 3;
		JButton but19 = new JButton( testCours_26_13_45( email, password ) );
		but19.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_26_13_45( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but19, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 3;
		JButton but20 = new JButton( testCours_27_13_45( email, password ) );
		but20.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_27_13_45( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but20, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 3;
		JButton but21 = new JButton( testCours_28_13_45( email, password ) );
		but21.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_28_13_45( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but21, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 3;
		JButton but22 = new JButton( testCours_29_13_45( email, password ) );
		but22.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_29_13_45( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but22, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 3;
		JButton but23 = new JButton( testCours_30_13_45( email, password ) );
		but23.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_30_13_45( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but23, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 4;
		JButton but24 = new JButton( testCours_25_15_30( email, password ) );
		but24.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_25_15_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but24, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 4;
		JButton but25 = new JButton( testCours_26_15_30( email, password ) );
		but25.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_26_15_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but25, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 4;
		JButton but26 = new JButton( testCours_27_15_30( email, password ) );
		but26.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_27_15_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but26, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 4;
		JButton but27 = new JButton( testCours_28_15_30( email, password ) );
		but27.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_28_15_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but27, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 4;
		JButton but28 = new JButton( testCours_29_15_30( email, password ) );
		but28.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_29_15_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but28, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 4;
		JButton but29 = new JButton( testCours_30_15_30( email, password ) );
		but29.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_30_15_30( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but29, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 5;
		JButton but30 = new JButton( testCours_25_17_15( email, password ) );
		but30.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_25_17_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but30, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 5;
		JButton but31 = new JButton( testCours_26_17_15( email, password ) );
		but31.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_26_17_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but31, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 5;
		JButton but32 = new JButton( testCours_27_17_15( email, password ) );
		but32.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_27_17_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but32, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 5;
		JButton but33 = new JButton( testCours_28_17_15( email, password ) );
		but33.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_28_17_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but33, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 5;
		JButton but34 = new JButton( testCours_29_17_15( email, password ) );
		but34.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_29_17_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but34, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 5;
		JButton but35 = new JButton( testCours_30_17_15( email, password ) );
		but35.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_30_17_15( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but35, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 6;
		JButton but36 = new JButton( testCours_25_19_00( email, password ) );
		but36.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_25_19_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but36, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 6;
		JButton but37 = new JButton( testCours_26_19_00( email, password ) );
		but37.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_26_19_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but37, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 6;
		JButton but38 = new JButton( testCours_27_19_00( email, password ) );
		but38.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_27_19_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but38, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 6;
		JButton but39 = new JButton( testCours_28_19_00( email, password ) );
		but39.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_28_19_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but39, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 6;
		JButton but40 = new JButton( testCours_29_19_00( email, password ) );
		but40.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_29_19_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but40, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 6;
		JButton but41 = new JButton( testCours_30_19_00( email, password ) );
		but41.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed( ActionEvent e ) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle( "COURS" );
				fen.setSize( new Dimension( 320, 240 ) );
				fen.setLocationRelativeTo( null );
				fen.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
				fen.setVisible( true );
				fen.setContentPane( pan );
				try {
					fen.add(affichageInfoCours_30_19_00( email, password));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but41, gbc);

		return contentPane2;
	}

	private String testCours_25_08_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_26_08_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_27_08_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_28_08_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_29_08_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_30_08_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}

	
	private String testCours_25_10_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_26_10_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_27_10_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_28_10_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_29_10_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_30_10_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_25_12_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_26_12_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_27_12_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_28_12_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_29_12_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_30_12_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_25_13_45( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_26_13_45( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_27_13_45( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_28_13_45( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_29_13_45( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_30_13_45( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_25_15_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_26_15_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_27_15_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_28_15_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_29_15_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_30_15_30( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_25_17_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_26_17_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_27_17_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_28_17_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_29_17_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_30_17_15( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_25_19_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_26_19_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_27_19_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_28_19_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_29_19_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	
	private String testCours_30_19_00( String email, String password ) throws Exception {

		Properties props = new Properties();

		try ( FileInputStream fis = new FileInputStream( "ecole.properties" ) ) {
			props.load( fis );
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try ( Connection connection = DriverManager.getConnection( url, dbLogin, dbPassword ) ) {
			
            String demande = "SELECT id FROM utilisateur WHERE email= '" + email + "' AND password = " + "'" + password + "'";
			
			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery( demande ) ){
				
				resultSet0.next();
				String str0 = resultSet0.getString( "id" );
				
				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + str0;

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery( strSql ) ) {

					resultSet.next();
					String str = resultSet.getString( "id_cours" );
					String strSql2 = "SELECT * FROM seance WHERE id_cours = " + str; 

					try ( Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery( strSql2 ) ) {

						while ( resultSet2.next() ) {
							
							String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance = " + resultSet2.getString( "id" );
							
							try ( Statement statement3 = connection.createStatement();
									ResultSet resultSet3 = statement3.executeQuery( strSql3 ) ) {
								
								if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
									if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
										
										while ( resultSet3.next() ) {

											String strSql4 = "SELECT nom,id_promotion FROM groupe WHERE id =" + resultSet3.getString("id_groupe");

											try ( Statement statement4 = connection.createStatement();
													ResultSet resultSet4 = statement3.executeQuery( strSql4 ) ) {
												
												while ( resultSet4.next() ) {
													
													String strSql5 = "SELECT nom FROM promotion WHERE id =" + resultSet4.getString( "id_promotion" );
													
													try ( Statement statement5 = connection.createStatement();
															ResultSet resultSet5 = statement5.executeQuery( strSql5 ) ){
														resultSet5.next();
														return resultSet5.getString( "nom" ) + " : " + resultSet4.getString( "nom" ) ;
													}
												}
											}
										}
									}
								}
								
								
							}
						}
						
					}
		
		        }
			}
				
				

		}
		return "----------------------";
	}
	public JLabel affichageInfoCours_25_08_30( String email, String password) throws Exception {
		
		JLabel infos = new JLabel();
		Properties props = new Properties();
		try (FileInputStream fis = new FileInputStream("ecole.properties")) {
			props.load(fis);
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

			String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
					+ password + "'";

			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery(demande)) {

				resultSet0.next();

				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery(strSql)) {

					resultSet.next();
					
					String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
					
					try (Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
						
						while(resultSet2.next()) {
							
							if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
								if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
									
									String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
									
									try (Statement statement3 = connection.createStatement();
											ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
										
										resultSet3.next();
										
										String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
										
										try (Statement statement4 = connection.createStatement();
												ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
											
											while( resultSet4.next()) {
												System.out.println( resultSet4.getString( "id_utilisateur") );
												
												String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
												
												try (Statement statement5 = connection.createStatement();
														ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
													
													while( resultSet5.next()) {
														infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
													}
												
												}
											}
										}
									}
								}
							}
						}
					}
					
				}
			}

			
		}
     return infos;
	}
	
public JLabel affichageInfoCours_26_08_30( String email, String password) throws Exception {
		
		JLabel infos = new JLabel();
		Properties props = new Properties();
		try (FileInputStream fis = new FileInputStream("ecole.properties")) {
			props.load(fis);
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

			String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
					+ password + "'";

			try (Statement statement0 = connection.createStatement();
					ResultSet resultSet0 = statement0.executeQuery(demande)) {

				resultSet0.next();

				String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

				try (Statement statement = connection.createStatement();
						ResultSet resultSet = statement.executeQuery(strSql)) {

					resultSet.next();
					
					String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
					
					try (Statement statement2 = connection.createStatement();
							ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
						
						while(resultSet2.next()) {
							
							if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
								if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
									
									String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
									
									try (Statement statement3 = connection.createStatement();
											ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
										
										resultSet3.next();
										
										String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
										
										try (Statement statement4 = connection.createStatement();
												ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
											
											while( resultSet4.next()) {
												System.out.println( resultSet4.getString( "id_utilisateur") );
												
												String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
												
												try (Statement statement5 = connection.createStatement();
														ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
													
													while( resultSet5.next()) {
														infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
													}
												
												}
											}
										}
									}
								}
							}
						}
					}
					
				}
			}

			
		}
     return infos;
	}

public JLabel affichageInfoCours_27_08_30( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_28_08_30( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_29_08_30( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_30_08_30( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "08:30:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_25_10_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_26_10_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_27_10_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_28_10_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_29_10_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_30_10_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "10:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_25_12_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_26_12_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_27_12_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_28_12_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_29_12_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_30_12_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "12:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_25_13_45( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_26_13_45( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_27_13_45( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_28_13_45( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_29_13_45( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_30_13_45( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "13:45:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_25_15_30( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_26_15_30( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_27_15_30( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_28_15_30( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_29_15_30( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_30_15_30( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "15:30:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_25_17_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_26_17_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_27_17_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_28_17_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_29_17_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_30_17_15( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "17:15:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_25_19_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-25" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_26_19_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-26" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_27_19_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-27" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_28_19_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-28" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_29_19_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-29" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}

public JLabel affichageInfoCours_30_19_00( String email, String password) throws Exception {
	
	JLabel infos = new JLabel();
	Properties props = new Properties();
	try (FileInputStream fis = new FileInputStream("ecole.properties")) {
		props.load(fis);
	}

	Class.forName(props.getProperty("jdbc.driver.class"));

	String url = props.getProperty("jdbc.url");
	String dbLogin = props.getProperty("jdbc.login");
	String dbPassword = props.getProperty("jdbc.password");

	try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

		String demande = "SELECT id FROM utilisateur WHERE email= " + "'" + email + "' AND password = " + "'"
				+ password + "'";

		try (Statement statement0 = connection.createStatement();
				ResultSet resultSet0 = statement0.executeQuery(demande)) {

			resultSet0.next();

			String strSql = "SELECT id_cours FROM enseignant WHERE id_utilisateur = " + resultSet0.getString("id");

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				
				String strSql2 = "SELECT * FROM seance WHERE id_cours= " + resultSet.getString( "id_cours" );
				
				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {
					
					while(resultSet2.next()) {
						
						if( resultSet2.getString( "date" ).equals( "2020-05-30" ) ) {
							if ( resultSet2.getString( "heure_debut" ).equals( "19:00:00" ) ) {
								
								String strSql3 = "SELECT id_groupe FROM seance_groupe WHERE id_seance= " + resultSet2.getString( "id" );
								
								try (Statement statement3 = connection.createStatement();
										ResultSet resultSet3 = statement3.executeQuery(strSql3)) {
									
									resultSet3.next();
									
									String strSql4 = "SELECT id_utilisateur FROM etudiant WHERE id_groupe= " + resultSet3.getString( "id_groupe" );
									
									try (Statement statement4 = connection.createStatement();
											ResultSet resultSet4 = statement4.executeQuery(strSql4)) {
										
										while( resultSet4.next()) {
											System.out.println( resultSet4.getString( "id_utilisateur") );
											
											String strSql5 = "SELECT nom, prenom FROM utilisateur WHERE id= " + resultSet4.getString( "id_utilisateur" );
											
											try (Statement statement5 = connection.createStatement();
													ResultSet resultSet5 = statement4.executeQuery(strSql5)) {
												
												while( resultSet5.next()) {
													infos.setText("<html>" + infos.getText() + "<br> Nom: " + resultSet5.getString( "nom" ) + " Prénom: " + resultSet5.getString( "prenom" ) + "<br> <html>" );
												}
											
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}

		
	}
 return infos;
}
}
