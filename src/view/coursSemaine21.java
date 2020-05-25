package view;

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

public class coursSemaine21 {

	public JPanel grilleEdT() throws Exception {

		JPanel contentPane2 = new JPanel();

		contentPane2.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();


		gbc.weightx = gbc.weighty = 1;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		JButton but0 = new JButton(testCours_18_08_30());
		but0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle("COURS");
				fen.setSize(new Dimension(320, 240));
				fen.setLocationRelativeTo(null);
				fen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				fen.setVisible(true);
				fen.setContentPane(pan);
				try {
					fen.add(affichageInfoCours_18_08_30());
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
		JButton but1 = new JButton();
		contentPane2.add(but1, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 0;
		JButton but2 = new JButton();
		contentPane2.add(but2, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 0;
		JButton but3 = new JButton(testCours_21_8_30());
		but3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame fen = new JFrame();
				JPanel pan = new JPanel();

				fen.setTitle("COURS");
				fen.setSize(new Dimension(320, 240));
				fen.setLocationRelativeTo(null);
				fen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				fen.setVisible(true);
				fen.setContentPane(pan);
				try {
					fen.add(affichageInfoCours_21_08_30());
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		contentPane2.add(but3, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 0;
		JButton but4 = new JButton();
		contentPane2.add(but4, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 0;
		JButton but5 = new JButton();
		contentPane2.add(but5, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 1;
		JButton but6 = new JButton();
		contentPane2.add(but6, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 1;
		JButton but7 = new JButton();
		contentPane2.add(but7, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 1;
		JButton but8 = new JButton();
		contentPane2.add(but8, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 1;
		JButton but9 = new JButton();
		contentPane2.add(but9, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 1;
		JButton but10 = new JButton();
		contentPane2.add(but10, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 1;
		JButton but11 = new JButton();
		contentPane2.add(but11, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 2;
		JButton but12 = new JButton();
		contentPane2.add(but12, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 2;
		JButton but13 = new JButton();
		contentPane2.add(but13, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 2;
		JButton but14 = new JButton();
		contentPane2.add(but14, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 2;
		JButton but15 = new JButton();
		contentPane2.add(but15, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		JButton but16 = new JButton();
		contentPane2.add(but16, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 2;
		JButton but17 = new JButton();
		contentPane2.add(but17, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 3;
		JButton but18 = new JButton();
		contentPane2.add(but18, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 3;
		JButton but19 = new JButton();
		contentPane2.add(but19, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 3;
		JButton but20 = new JButton();
		contentPane2.add(but20, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 3;
		JButton but21 = new JButton();
		contentPane2.add(but21, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 3;
		JButton but22 = new JButton();
		contentPane2.add(but22, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 3;
		JButton but23 = new JButton();
		contentPane2.add(but23, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 4;
		JButton but24 = new JButton();
		contentPane2.add(but24, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 4;
		JButton but25 = new JButton();
		contentPane2.add(but25, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 4;
		JButton but26 = new JButton();
		contentPane2.add(but26, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 4;
		JButton but27 = new JButton();
		contentPane2.add(but27, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 4;
		JButton but28 = new JButton();
		contentPane2.add(but28, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 4;
		JButton but29 = new JButton();
		contentPane2.add(but29, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 5;
		JButton but30 = new JButton();
		contentPane2.add(but30, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 5;
		JButton but31 = new JButton();
		contentPane2.add(but31, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 5;
		JButton but32 = new JButton();
		contentPane2.add(but32, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 5;
		JButton but33 = new JButton();
		contentPane2.add(but33, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 5;
		JButton but34 = new JButton();
		contentPane2.add(but34, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 5;
		JButton but35 = new JButton();
		contentPane2.add(but35, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 6;
		JButton but36 = new JButton();
		contentPane2.add(but36, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 6;
		JButton but37 = new JButton();
		contentPane2.add(but37, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 6;
		JButton but38 = new JButton();
		contentPane2.add(but38, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 6;
		JButton but39 = new JButton();
		contentPane2.add(but39, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 6;
		JButton but40 = new JButton();
		contentPane2.add(but40, gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 5;
		gbc.gridy = 6;
		JButton but41 = new JButton();
		contentPane2.add(but41, gbc);

		return contentPane2;
	}

	private String testCours_18_08_30() throws Exception {

		Properties props = new Properties();

		try (FileInputStream fis = new FileInputStream("ecole.properties")) {
			props.load(fis);
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

			String strSql = "SELECT id_groupe FROM etudiant WHERE id_utilisateur = 2";

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				String str = resultSet.getString("id_groupe");

				String strSql2 = "SELECT id_seance FROM seance_groupe WHERE id_groupe= " + str; // ici on prends tous
																								// id_seance qui
																								// correspondent aux id
																								// de l'etudiant

				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {

					while (resultSet2.next()) {

						String strSql3 = "SELECT * FROM seance WHERE id = " + resultSet2.getString("id_seance")
								+ " AND semaine = 21";

						try (Statement statement3 = connection.createStatement();
								ResultSet resultSet3 = statement3.executeQuery(strSql3)) {

							while (resultSet3.next()) {

								if (resultSet3.getString("date").equals("2020-05-18")) {
									if (resultSet3.getString("heure_debut").equals("08:30:00")) {
										String strSql4 = "SELECT nom FROM cours WHERE id ="
												+ resultSet3.getString("id_cours");

										try (Statement statement4 = connection.createStatement();
												ResultSet resultSet4 = statement4.executeQuery(strSql4)) {

											resultSet4.next();

											return resultSet4.getString("nom");
										}
									}

								}

							}
						}

					}
				}

			}
		}

		return "PAS COURS";
	}

	

	private String testCours_21_8_30() throws Exception {

		Properties props = new Properties();

		try (FileInputStream fis = new FileInputStream("ecole.properties")) {
			props.load(fis);
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

			String strSql = "SELECT id_groupe FROM etudiant WHERE id_utilisateur = 2";

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				String str = resultSet.getString("id_groupe");

				String strSql2 = "SELECT id_seance FROM seance_groupe WHERE id_groupe= " + str; // ici on prends tous
																								// id_seance qui
																								// correspondent
																								// aux id de l'etudiant

				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {

					while (resultSet2.next()) {

						String strSql3 = "SELECT * FROM seance WHERE id = " + resultSet2.getString("id_seance")
								+ " AND semaine = 21";

						try (Statement statement3 = connection.createStatement();
								ResultSet resultSet3 = statement3.executeQuery(strSql3)) {

							while (resultSet3.next()) {

								if (resultSet3.getString("date").equals("2020-05-21")) {

									if (resultSet3.getString("heure_debut").equals("08:30:00")) {

										String strSql4 = "SELECT nom FROM cours WHERE id ="
												+ resultSet3.getString("id_cours");

										try (Statement statement4 = connection.createStatement();
												ResultSet resultSet4 = statement4.executeQuery(strSql4)) {

											resultSet4.next();

											return resultSet4.getString("nom");
										}
									}

								}

							}
						}

					}
				}

			}
		}

		return "PAS COURS";
	}

	

	public JLabel affichageInfoCours_18_08_30() throws Exception {

		Properties props = new Properties();
		try (FileInputStream fis = new FileInputStream("ecole.properties")) {
			props.load(fis);
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

			String strSql = "SELECT id_groupe FROM etudiant WHERE id_utilisateur = 2";

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				String str = resultSet.getString("id_groupe");

				String strSql2 = "SELECT id_seance FROM seance_groupe WHERE id_groupe= " + str; // ici on prends tous
																								// id_seance qui
																								// correspondent aux id
																								// de l'etudiant

				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {

					while (resultSet2.next()) {

						String strSql3 = "SELECT * FROM seance WHERE id = " + resultSet2.getString("id_seance")
								+ " AND semaine = 21";

						try (Statement statement3 = connection.createStatement();
								ResultSet resultSet3 = statement3.executeQuery(strSql3)) {

							while (resultSet3.next()) {

								if (resultSet3.getString("date").equals("2020-05-18")) {

									if (resultSet3.getString("heure_debut").equals("08:30:00")) {

										String strSql4 = "SELECT nom FROM cours WHERE id ="
												+ resultSet3.getString("id_cours");

										try (Statement statement4 = connection.createStatement();
												ResultSet resultSet4 = statement4.executeQuery(strSql4)) {

											resultSet4.next();

											String strSql6 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = "
													+ resultSet3.getString("id_cours");
											String strSql6_2 = "SELECT nom FROM type_cours WHERE id  = "
													+ resultSet3.getString("id_type");
											String strSql6_3 = "SELECT id_salle FROM seance_salle WHERE id_seance  = "
													+ resultSet3.getString("id");
											String strSql6_4 = "SELECT nom,id_promotion FROM groupe WHERE id  = "
													+ resultSet.getString("id_groupe");

											try (Statement statement6 = connection.createStatement();
													Statement statement6_2 = connection.createStatement();
													Statement statement6_3 = connection.createStatement();
													Statement statement6_4 = connection.createStatement();
													ResultSet resultSet6 = statement6.executeQuery(strSql6);
													ResultSet resultSet6_2 = statement6_2.executeQuery(strSql6_2);
													ResultSet resultSet6_3 = statement6_3.executeQuery(strSql6_3);
													ResultSet resultSet6_4 = statement6_4.executeQuery(strSql6_4)) {
												resultSet6.next();
												resultSet6_2.next();
												resultSet6_4.next();
												while (resultSet6_3.next()) {

													String strSql7 = "SELECT nom,prenom FROM utilisateur WHERE id = "
															+ resultSet6.getString("id_utilisateur");
													String strSql7_2 = "SELECT nom,id_site FROM salle WHERE id = "
															+ resultSet6_3.getString("id_salle");
													String strSql7_3 = "SELECT nom FROM promotion WHERE id = "
															+ resultSet6_4.getString("id_promotion");

													try (Statement statement7 = connection.createStatement();
															Statement statement7_2 = connection.createStatement();
															Statement statement7_3 = connection.createStatement();
															ResultSet resultSet7 = statement7.executeQuery(strSql7);
															ResultSet resultSet7_2 = statement7_2
																	.executeQuery(strSql7_2);
															ResultSet resultSet7_3 = statement7_3
																	.executeQuery(strSql7_3)) {

														resultSet7.next();
														resultSet7_2.next();
														resultSet7_3.next();

														String strSql8 = "SELECT nom FROM site WHERE id = "
																+ resultSet7_2.getString("id_site");

														try (Statement statement8 = connection.createStatement();
																ResultSet resultSet8 = statement8
																		.executeQuery(strSql8)) {

															resultSet8.next();

															JLabel infos = new JLabel("<html> Cours: "
																	+ resultSet4.getString("nom") + "<br> Date: "
																	+ resultSet3.getString("date")
																	+ "<br> Heure d�but: "
																	+ resultSet3.getString("heure_debut")
																	+ "<br> Heure fin: "
																	+ resultSet3.getString("heure_fin")
																	+ "<br> Professeur: " + resultSet7.getString("nom")
																	+ " " + resultSet7.getString("prenom")
																	+ "<br> Type cours: "
																	+ resultSet6_2.getString("nom") + "<br> Salle: "
																	+ resultSet7_2.getString("nom") + "<br> Site: "
																	+ resultSet8.getString("nom") + "<br> Groupe: "
																	+ resultSet6_4.getString("nom") + "<br> Promotion: "
																	+ resultSet7_3.getString("nom") + "<html>");

															return infos;
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
		}

		return new JLabel("PAS COURS");
	}

	public JLabel affichageInfoCours_21_08_30() throws Exception {

		Properties props = new Properties();
		try (FileInputStream fis = new FileInputStream("ecole.properties")) {
			props.load(fis);
		}

		Class.forName(props.getProperty("jdbc.driver.class"));

		String url = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPassword = props.getProperty("jdbc.password");

		try (Connection connection = DriverManager.getConnection(url, dbLogin, dbPassword)) {

			String strSql = "SELECT id_groupe FROM etudiant WHERE id_utilisateur = 2";

			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(strSql)) {

				resultSet.next();
				String str = resultSet.getString("id_groupe");

				String strSql2 = "SELECT id_seance FROM seance_groupe WHERE id_groupe= " + str;

				try (Statement statement2 = connection.createStatement();
						ResultSet resultSet2 = statement2.executeQuery(strSql2)) {

					while (resultSet2.next()) {

						String strSql3 = "SELECT * FROM seance WHERE id = " + resultSet2.getString("id_seance")
								+ " AND semaine = 21";

						try (Statement statement3 = connection.createStatement();
								ResultSet resultSet3 = statement3.executeQuery(strSql3)) {

							while (resultSet3.next()) {

								if (resultSet3.getString("date").equals("2020-05-21")) {

									if (resultSet3.getString("heure_debut").equals("08:30:00")) {

										String strSql4 = "SELECT nom FROM cours WHERE id ="
												+ resultSet3.getString("id_cours");

										try (Statement statement4 = connection.createStatement();
												ResultSet resultSet4 = statement4.executeQuery(strSql4)) {

											resultSet4.next();

											String strSql6 = "SELECT id_utilisateur FROM enseignant WHERE id_cours = "
													+ resultSet3.getString("id_cours");
											String strSql6_2 = "SELECT nom FROM type_cours WHERE id  = "
													+ resultSet3.getString("id_type");
											String strSql6_3 = "SELECT id_salle FROM seance_salle WHERE id_seance  = "
													+ resultSet3.getString("id");
											String strSql6_4 = "SELECT nom,id_promotion FROM groupe WHERE id  = "
													+ resultSet.getString("id_groupe");

											try (Statement statement6 = connection.createStatement();
													Statement statement6_2 = connection.createStatement();
													Statement statement6_3 = connection.createStatement();
													Statement statement6_4 = connection.createStatement();
													ResultSet resultSet6 = statement6.executeQuery(strSql6);
													ResultSet resultSet6_2 = statement6_2.executeQuery(strSql6_2);
													ResultSet resultSet6_3 = statement6_3.executeQuery(strSql6_3);
													ResultSet resultSet6_4 = statement6_4.executeQuery(strSql6_4)) {

												resultSet6.next();
												resultSet6_2.next();
												resultSet6_4.next();
												while (resultSet6_3.next()) {
													String strSql7 = "SELECT nom,prenom FROM utilisateur WHERE id = "
															+ resultSet6.getString("id_utilisateur");
													String strSql7_2 = "SELECT nom,id_site FROM salle WHERE id = "
															+ resultSet6_3.getString("id_salle");
													String strSql7_3 = "SELECT nom FROM promotion WHERE id = "
															+ resultSet6_4.getString("id_promotion");

													try (Statement statement7 = connection.createStatement();
															Statement statement7_2 = connection.createStatement();
															Statement statement7_3 = connection.createStatement();
															ResultSet resultSet7 = statement7.executeQuery(strSql7);
															ResultSet resultSet7_2 = statement7_2
																	.executeQuery(strSql7_2);
															ResultSet resultSet7_3 = statement7_3
																	.executeQuery(strSql7_3)) {

														resultSet7.next();
														resultSet7_2.next();
														resultSet7_3.next();

														String strSql8 = "SELECT nom FROM site WHERE id = "
																+ resultSet7_2.getString("id_site");

														try (Statement statement8 = connection.createStatement();
																ResultSet resultSet8 = statement8
																		.executeQuery(strSql8)) {

															resultSet8.next();

															JLabel infos = new JLabel("<html> Cours: "
																	+ resultSet4.getString("nom") + "<br> Date: "
																	+ resultSet3.getString("date")
																	+ "<br> Heure d�but: "
																	+ resultSet3.getString("heure_debut")
																	+ "<br> Heure fin: "
																	+ resultSet3.getString("heure_fin")
																	+ "<br> Professeur: " + resultSet7.getString("nom")
																	+ " " + resultSet7.getString("prenom")
																	+ "<br> Type cours: "
																	+ resultSet6_2.getString("nom") + "<br> Salle: "
																	+ resultSet7_2.getString("nom") + "<br> Site: "
																	+ resultSet8.getString("nom") + "<br> Groupe: "
																	+ resultSet6_4.getString("nom") + "<br> Promotion: "
																	+ resultSet7_3.getString("nom") + "<html>");

															return infos;
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
		}

		return new JLabel("PAS COURS");
	}

}
