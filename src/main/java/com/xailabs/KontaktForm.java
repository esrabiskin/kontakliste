package com.xailabs;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class KontaktForm {

	public JFrame frame;

	private JTextField geburtsdatum;
	private JTextField email;

	private DateFormat de = new SimpleDateFormat("dd.MM.yyyy");

	private Connect connect = new Connect();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public KontaktForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 814, 787);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel name = new JLabel("Name:");
		name.setHorizontalAlignment(SwingConstants.TRAILING);
		name.setForeground(new Color(139, 0, 139));
		name.setBackground(Color.BLACK);
		name.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		name.setBackground(Color.BLACK);
		name.setBounds(43, 69, 125, 45);
		frame.getContentPane().add(name);

		JLabel lblNachname = new JLabel("Nachname:");
		lblNachname.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNachname.setForeground(new Color(139, 0, 139));
		lblNachname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNachname.setBackground(Color.BLACK);
		lblNachname.setBounds(43, 115, 125, 45);
		frame.getContentPane().add(lblNachname);

		JLabel lblStrae = new JLabel("Stra\u00DFe:");
		lblStrae.setHorizontalAlignment(SwingConstants.TRAILING);
		lblStrae.setForeground(new Color(139, 0, 139));
		lblStrae.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblStrae.setBackground(Color.BLACK);
		lblStrae.setBounds(43, 158, 125, 45);
		frame.getContentPane().add(lblStrae);

		final JTextField namen = new JTextField();
		namen.setBounds(212, 83, 151, 20);
		frame.getContentPane().add(namen);
		namen.setColumns(10);

		JLabel lblNachnameCheck = new JLabel("");
		lblNachnameCheck.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNachnameCheck.setForeground(new Color(139, 0, 139));
		lblNachnameCheck.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNachnameCheck.setBackground(Color.BLACK);
		lblNachnameCheck.setBounds(212, 132, 125, 45);
		frame.getContentPane().add(lblNachnameCheck);

		JLabel lblNameCheck = new JLabel("");
		lblNameCheck.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNameCheck.setForeground(new Color(139, 0, 139));
		lblNameCheck.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNameCheck.setBackground(Color.BLACK);
		lblNameCheck.setBounds(255, 97, 177, 15);
		frame.getContentPane().add(lblNameCheck);

		final JTextField nachname = new JTextField();
		nachname.setColumns(10);
		nachname.setBounds(212, 129, 151, 20);
		frame.getContentPane().add(nachname);

		final JTextField straße = new JTextField();
		straße.setColumns(10);
		straße.setBounds(212, 172, 151, 20);
		frame.getContentPane().add(straße);

		JLabel lblStraeNr = new JLabel("Stra\u00DFe Nr:");
		lblStraeNr.setHorizontalAlignment(SwingConstants.TRAILING);
		lblStraeNr.setForeground(new Color(139, 0, 139));
		lblStraeNr.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblStraeNr.setBackground(Color.BLACK);
		lblStraeNr.setBounds(43, 200, 125, 45);
		frame.getContentPane().add(lblStraeNr);

		JLabel lblPlz = new JLabel("PLZ:");
		lblPlz.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPlz.setForeground(new Color(139, 0, 139));
		lblPlz.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPlz.setBackground(Color.BLACK);
		lblPlz.setBounds(43, 240, 125, 45);
		frame.getContentPane().add(lblPlz);

		JLabel lblOrt = new JLabel("Ort:");
		lblOrt.setHorizontalAlignment(SwingConstants.TRAILING);
		lblOrt.setForeground(new Color(139, 0, 139));
		lblOrt.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblOrt.setBackground(Color.BLACK);
		lblOrt.setBounds(43, 290, 125, 45);
		frame.getContentPane().add(lblOrt);

		JLabel lblLand = new JLabel("Land:");
		lblLand.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLand.setForeground(new Color(139, 0, 139));
		lblLand.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblLand.setBackground(Color.BLACK);
		lblLand.setBounds(43, 332, 125, 45);
		frame.getContentPane().add(lblLand);

		final JTextField straßeNr = new JTextField();
		straßeNr.setColumns(10);
		straßeNr.setBounds(212, 214, 151, 20);
		frame.getContentPane().add(straßeNr);

		final JTextField plz = new JTextField();
		plz.setColumns(10);
		plz.setBounds(212, 254, 151, 20);
		frame.getContentPane().add(plz);

		final JTextField ort = new JTextField();
		ort.setColumns(10);
		ort.setBounds(212, 297, 151, 20);
		frame.getContentPane().add(ort);

		final JTextField land = new JTextField();
		land.setColumns(10);
		land.setBounds(212, 339, 151, 20);
		frame.getContentPane().add(land);

		JLabel lblE = new JLabel("E-Mail Adresse:");
		lblE.setHorizontalAlignment(SwingConstants.TRAILING);
		lblE.setForeground(new Color(139, 0, 139));
		lblE.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblE.setBackground(Color.BLACK);
		lblE.setBounds(43, 463, 125, 45);
		frame.getContentPane().add(lblE);

		geburtsdatum = new JTextField();
		geburtsdatum.setColumns(10);
		geburtsdatum.setBounds(212, 381, 151, 20);

		frame.getContentPane().add(geburtsdatum);

		JLabel lblGeschlecht = new JLabel("Geschlecht:");
		lblGeschlecht.setHorizontalAlignment(SwingConstants.TRAILING);
		lblGeschlecht.setForeground(new Color(139, 0, 139));
		lblGeschlecht.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblGeschlecht.setBackground(Color.BLACK);
		lblGeschlecht.setBounds(43, 421, 125, 45);
		frame.getContentPane().add(lblGeschlecht);

		final JRadioButton rdbtn0 = new JRadioButton("Weiblich");
		rdbtn0.setForeground(new Color(0, 0, 128));
		rdbtn0.setBackground(new Color(255, 255, 255));
		rdbtn0.setBounds(212, 417, 76, 42);
		rdbtn0.setSelected(true);
		frame.getContentPane().add(rdbtn0);

		final JRadioButton rdbtn1 = new JRadioButton("M\u00E4nnlich");
		rdbtn1.setForeground(new Color(0, 0, 128));
		rdbtn1.setBackground(Color.WHITE);
		rdbtn1.setBounds(290, 417, 76, 42);
		frame.getContentPane().add(rdbtn1);

		final JRadioButton rdbtn2 = new JRadioButton("Divers");
		rdbtn2.setForeground(new Color(0, 0, 128));
		rdbtn2.setBackground(Color.WHITE);
		rdbtn2.setBounds(372, 417, 76, 42);
		frame.getContentPane().add(rdbtn2);

		ButtonGroup rdbtn = new ButtonGroup();
		rdbtn.add(rdbtn0);
		rdbtn.add(rdbtn1);
		rdbtn.add(rdbtn2);

		JLabel lblGeburtsdatum = new JLabel("Geburtsdatum:");
		lblGeburtsdatum.setHorizontalAlignment(SwingConstants.TRAILING);
		lblGeburtsdatum.setForeground(new Color(139, 0, 139));
		lblGeburtsdatum.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblGeburtsdatum.setBackground(Color.BLACK);
		lblGeburtsdatum.setBounds(43, 374, 125, 45);
		frame.getContentPane().add(lblGeburtsdatum);

		JLabel lblKontaktDesArtes = new JLabel("Kontaktart:");
		lblKontaktDesArtes.setHorizontalAlignment(SwingConstants.TRAILING);
		lblKontaktDesArtes.setForeground(new Color(139, 0, 139));
		lblKontaktDesArtes.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblKontaktDesArtes.setBackground(Color.BLACK);
		lblKontaktDesArtes.setBounds(43, 26, 125, 45);
		frame.getContentPane().add(lblKontaktDesArtes);

		final Checkbox chckbxBeruflicheKontakt = new Checkbox("Berufliche Kontakt");
		chckbxBeruflicheKontakt.setForeground(new Color(0, 0, 139));
		chckbxBeruflicheKontakt.setBackground(Color.WHITE);
		chckbxBeruflicheKontakt.setBounds(435, 39, 125, 23);
		frame.getContentPane().add(chckbxBeruflicheKontakt);

		final Checkbox chckbxVerwante = new Checkbox("Verwante");
		chckbxVerwante.setBackground(new Color(255, 255, 255));
		chckbxVerwante.setForeground(new Color(0, 0, 128));
		chckbxVerwante.setBounds(212, 39, 76, 23);
		frame.getContentPane().add(chckbxVerwante);

		final Checkbox chckbxFr = new Checkbox("Freunde");
		chckbxFr.setForeground(new Color(0, 0, 139));
		chckbxFr.setBackground(new Color(255, 255, 255));
		chckbxFr.setBounds(290, 39, 65, 23);
		frame.getContentPane().add(chckbxFr);

		final Checkbox chckbxBekannte = new Checkbox("Bekannte");
		chckbxBekannte.setForeground(new Color(0, 0, 139));
		chckbxBekannte.setBackground(Color.WHITE);
		chckbxBekannte.setBounds(357, 39, 76, 23);
		frame.getContentPane().add(chckbxBekannte);

		CheckboxGroup beziehung = new CheckboxGroup();
		beziehung.setSelectedCheckbox(chckbxVerwante);
		beziehung.setSelectedCheckbox(chckbxFr);
		beziehung.setSelectedCheckbox(chckbxBekannte);
		beziehung.setSelectedCheckbox(chckbxBeruflicheKontakt);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(212, 470, 151, 20);
		frame.getContentPane().add(email);

		JButton btnSpeichern = new JButton("speichern");
		btnSpeichern.addActionListener(new ActionListener() {

		
			public void actionPerformed(ActionEvent e) {

				Kontaktliste kontaktlist = new Kontaktliste();

				
				
			
					kontaktlist.setNachName(nachname.getText());
					
					kontaktlist.setStraße(straße.getText());
					kontaktlist.setStraßenNummer(straßeNr.getText());
					kontaktlist.setPlz(plz.getText());
					kontaktlist.setOrt(ort.getText());
					kontaktlist.setLand(land.getText());
					kontaktlist.setEmail(email.getText());
					kontaktlist.setGeburtsDatum(getDateInstance());

					if (rdbtn0.isSelected()) {
						kontaktlist.setGeschlecht("weiblich");
					} else if (rdbtn1.isSelected()) {
						kontaktlist.setGeschlecht("männlich");
					} else if (rdbtn2.isSelected()) {
						kontaktlist.setGeschlecht("divers");
					}

					List<Kontaktart> kontaktartenListe = connect.getAllKontaktarten();

					String art;

					for (Kontaktart element : kontaktartenListe) {
						art = element.getBeziehungen();

						if (chckbxVerwante.getState()) {
							if (art == "Verwandte") {
								kontaktlist.getKontaktarten().add(element);
							}

						}
						if (chckbxFr.getState()) {
							if (art == "freunde") {
								kontaktlist.getKontaktarten().add(element);
							}

						}
						if (chckbxBekannte.getState()) {
							if (art == "bekannte") {
								kontaktlist.getKontaktarten().add(element);
							}

						}
						if (chckbxBeruflicheKontakt.getState()) {
							if (art == "beruflichekontakt") {
								kontaktlist.getKontaktarten().add(element);
							}

						}

					}
				connect.speichern(kontaktlist);

				}
			

		});
		btnSpeichern.setBackground(new Color(255, 255, 255));
		btnSpeichern.setForeground(new Color(139, 0, 139));
		btnSpeichern.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnSpeichern.setBounds(244, 557, 89, 23);
		frame.getContentPane().add(btnSpeichern);
	}

	private Date getDateInstance() {
		Date date = null;
		String dateText = geburtsdatum.getText();
		if (dateText == null || dateText.isEmpty()) {
			return date;
		}

		try {
			date = de.parse(dateText);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
