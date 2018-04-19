package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JTextField jtfKupovni;
	private JLabel lblValuta;
	private JComboBox comboBox;
	private JLabel lblProdajniKurs;
	private JTextField jtfProdajni;
	private JLabel lblIznos;
	private JTextField jtfIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;	
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;

	private ButtonGroup bg;

	MenjacnicaGUI menjacnica;

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI menjacnica) {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(menjacnica);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getJtfKupovni());
		contentPane.add(getLblValuta());
		contentPane.add(getComboBox());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getJtfProdajni());
		contentPane.add(getLblIznos());
		contentPane.add(getJtfIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());

		bg = new ButtonGroup();
		bg.add(rdbtnKupovina);
		bg.add(rdbtnProdaja);

		this.menjacnica = menjacnica;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(10, 11, 75, 14);
		}
		return lblKupovniKurs;
	}

	private JTextField getJtfKupovni() {
		if (jtfKupovni == null) {
			jtfKupovni = new JTextField();
			jtfKupovni.setEnabled(false);
			jtfKupovni.setBounds(10, 31, 127, 20);
			jtfKupovni.setColumns(10);
		}
		return jtfKupovni;
	}

	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(171, 11, 80, 14);
		}
		return lblValuta;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "EUR", "USD", "CHF" }));
			comboBox.setBounds(171, 31, 80, 20);
		}
		return comboBox;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(290, 11, 98, 14);
		}
		return lblProdajniKurs;
	}

	private JTextField getJtfProdajni() {
		if (jtfProdajni == null) {
			jtfProdajni = new JTextField();
			jtfProdajni.setEnabled(false);
			jtfProdajni.setBounds(290, 31, 127, 20);
			jtfProdajni.setColumns(10);
		}
		return jtfProdajni;
	}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 86, 87, 14);
		}
		return lblIznos;
	}

	private JTextField getJtfIznos() {
		if (jtfIznos == null) {
			jtfIznos = new JTextField();
			jtfIznos.setBounds(10, 111, 175, 20);
			jtfIznos.setColumns(10);
		}
		return jtfIznos;
	}

	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(219, 86, 98, 14);
		}
		return lblVrstaTransakcije;
	}

	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setBounds(219, 110, 109, 23);
			rdbtnKupovina.setActionCommand(rdbtnKupovina.getText());
		}
		return rdbtnKupovina;
	}

	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.setBounds(219, 136, 109, 23);
			rdbtnProdaja.setActionCommand(rdbtnProdaja.getText());
		}
		return rdbtnProdaja;
	}

	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					jtfIznos.setText(String.valueOf(slider.getValue()));
				}
			});
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setSnapToTicks(true);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setBounds(10, 172, 424, 54);
		}
		return slider;
	}

	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String poruka = "Izmenjen kurs: Valuta: " + comboBox.getSelectedItem().toString() + ", Iznos: "
							+ jtfIznos.getText() + ", Vrsta transakcije: " + bg.getSelection().getActionCommand();

					menjacnica.upisi(poruka);
					dispose();
				}
			});
			btnIzvrsiZamenu.setBounds(48, 237, 137, 23);
		}
		return btnIzvrsiZamenu;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(279, 237, 116, 23);
		}
		return btnOdustani;
	}
}
