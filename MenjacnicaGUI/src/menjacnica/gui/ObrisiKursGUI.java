package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField jtfSifra;
	private JTextField jtfNaziv;
	private JLabel lblProdajniKurs;
	private JTextField jtfProdajni;
	private JLabel lblKupovniKurs;
	private JTextField jtfKupovni;
	private JLabel lblSrednjiKurs;
	private JTextField jtfSrednji;
	private JLabel lblSkraceniNaziv;
	private JTextField jtfSkraceniNaziv;
	private JCheckBox chckbxZaistaObrisiKurs;
	private JLabel label;
	private JButton btnObrisi;
	private JButton btnOdustani;

	private MenjacnicaGUI menjacnica;

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI menjacnica) {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(menjacnica);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(8, 2, 10, 5));
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getJtfSifra());
		contentPane.add(getJtfNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getJtfProdajni());
		contentPane.add(getJtfKupovni());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getJtfSrednji());
		contentPane.add(getJtfSkraceniNaziv());
		contentPane.add(getChckbxZaistaObrisiKurs());
		contentPane.add(getLabel());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());

		this.menjacnica = menjacnica;
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
		}
		return lblSifra;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
		}
		return lblNaziv;
	}

	private JTextField getJtfSifra() {
		if (jtfSifra == null) {
			jtfSifra = new JTextField();
			jtfSifra.setColumns(10);
		}
		return jtfSifra;
	}

	private JTextField getJtfNaziv() {
		if (jtfNaziv == null) {
			jtfNaziv = new JTextField();
			jtfNaziv.setColumns(10);
		}
		return jtfNaziv;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
		}
		return lblProdajniKurs;
	}

	private JTextField getJtfProdajni() {
		if (jtfProdajni == null) {
			jtfProdajni = new JTextField();
			jtfProdajni.setColumns(10);
		}
		return jtfProdajni;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
		}
		return lblKupovniKurs;
	}

	private JTextField getJtfKupovni() {
		if (jtfKupovni == null) {
			jtfKupovni = new JTextField();
			jtfKupovni.setColumns(10);
		}
		return jtfKupovni;
	}

	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
		}
		return lblSrednjiKurs;
	}

	private JTextField getJtfSrednji() {
		if (jtfSrednji == null) {
			jtfSrednji = new JTextField();
			jtfSrednji.setColumns(10);
		}
		return jtfSrednji;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
		}
		return lblSkraceniNaziv;
	}

	private JTextField getJtfSkraceniNaziv() {
		if (jtfSkraceniNaziv == null) {
			jtfSkraceniNaziv = new JTextField();
			jtfSkraceniNaziv.setColumns(10);
		}
		return jtfSkraceniNaziv;
	}

	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (chckbxZaistaObrisiKurs.isSelected())
						btnObrisi.setEnabled(true);
					if (!chckbxZaistaObrisiKurs.isSelected())
						btnObrisi.setEnabled(false);
				}
			});

		}
		return chckbxZaistaObrisiKurs;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
		}
		return label;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String poruka = "Obrisan kurs: Sifra: " + jtfSifra.getText() + ", Skraceni naziv: "
							+ jtfSkraceniNaziv.getText() + ", Prodajeni kurs: " + jtfProdajni.getText()
							+ ", Srednji kurs: " + jtfSrednji.getText() + ", Kupovni kurs: " + jtfKupovni.getText()
							+ ", Naziv: " + jtfNaziv.getText();

					menjacnica.upisi(poruka);
					dispose();
				}
			});
			btnObrisi.setEnabled(false);
		}
		return btnObrisi;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
		}
		return btnOdustani;
	}
}
