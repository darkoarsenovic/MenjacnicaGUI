package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

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
	private JButton btnDodaj;
	private JButton btnOdustani;

	private MenjacnicaGUI menjacnica;

	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI menjacnica) {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 486, 334);
		setLocationRelativeTo(menjacnica);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(7, 2, 10, 10));
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
		contentPane.add(getBtnDodaj());
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

	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String poruka = "Dodat novi kurs: Sifra: " + jtfSifra.getText() + ", Skraceni naziv: "
							+ jtfSkraceniNaziv.getText() + ", Prodajeni kurs: " + jtfProdajni.getText()
							+ ", Srednji kurs: " + jtfSrednji.getText() + ", Kupovni kurs: " + jtfKupovni.getText()
							+ ", Naziv: " + jtfNaziv.getText();

					menjacnica.upisi(poruka);

					dispose();
				}
			});
		}
		return btnDodaj;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
		return btnOdustani;
	}
}
