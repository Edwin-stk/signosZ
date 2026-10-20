package Ejerc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Zodiac {

	private JFrame frmSignoZodiacal;
	private JSlider sldDia;
	private JComboBox cmbMes;
	private JLabel lblFecha;
	private JLabel lblSignos;
	private JLabel lblValorDia;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zodiac window = new Zodiac();
					window.frmSignoZodiacal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Zodiac() {
		initialize();
	}

	public void calcularSigno() {
		int dia=sldDia.getValue();
		lblValorDia.setText(""+dia);
		String mes=cmbMes.getSelectedItem().toString();
		lblFecha.setText(dia+" de "+mes);
		switch(mes) {
		case"ENERO":
			if(dia>=20) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Acuario-removebg-preview (1).png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Capricornio-removebg-preview (1).png"));

			}
		
		break;
		case"FEBRERO":
			if(dia>=19) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Piscis-removebg-preview (1).png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Acuario-removebg-preview (1).png"));

			}
		
		break;
		case"MARZO":
			if(dia>=21) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\ARIESss.SET.png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Piscis-removebg-preview (1).png"));

			}
		
		break;
		case"ABRIL":
			if(dia>=20) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\TAUTO.FOND-removebg-preview (1).png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\ARIESss.SET.png"));

			}
		
		break;
		
		case"MAYO":
			if(dia>=21) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Geminis-removebg-preview (1).png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\TAUTO.FOND-removebg-preview (1).png"));

			}
		
		break;
		
		case"JUNIO":
			if(dia>=21) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Cancer-removebg-preview.png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Geminis-removebg-preview (1).png"));

			}
		
		break;
		
		case"JULIO":
			if(dia>=23) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Leo-removebg-preview (1).png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Cancer-removebg-preview.png"));

			}
		
		break;
		
		case"AGOSTO":
			if(dia>=23) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Virgo-removebg-preview (1).png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Leo-removebg-preview (1).png"));

			}
		
		break;
		
		case"SEPTIEMBRE":
			if(dia>=23) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Libra-removebg-preview (1).png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Virgo-removebg-preview (1).png"));

			}
		
		break;
		
		case"OCTUBRE":
			if(dia>=20) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Escorpio-removebg-preview (2).png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Libra-removebg-preview (1).png"));

			}
		
		break;
		
		case"NOVIEMBRE":
			if(dia>=20) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Sagitario-removebg-preview (1).png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Escorpio-removebg-preview (2).png"));

			}
		
		break;
		case"DICIEMBRE":
			if(dia>=20) {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Capricornio-removebg-preview (1).png"));
			}else {
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\Sagitario-removebg-preview (1).png"));

			}
		
		break;
		}
	}
	private void initialize() {
		frmSignoZodiacal = new JFrame();
		frmSignoZodiacal.setTitle("SIGNO ZODIACAL");
		frmSignoZodiacal.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Caja.png"));
		frmSignoZodiacal.setResizable(false);
		frmSignoZodiacal.setBounds(100, 100, 594, 300);
		frmSignoZodiacal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignoZodiacal.getContentPane().setLayout(null);
		
		lblValorDia = new JLabel("1");
		lblValorDia.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblValorDia.setBounds(277, 45, 26, 14);
		frmSignoZodiacal.getContentPane().add(lblValorDia);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Día");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(21, 20, 46, 14);
		frmSignoZodiacal.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mes");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(21, 100, 46, 14);
		frmSignoZodiacal.getContentPane().add(lblNewLabel_2);
		
		cmbMes = new JComboBox();
		cmbMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularSigno();
			}
		});
		cmbMes.setModel(new DefaultComboBoxModel(new String[] {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"}));
		cmbMes.setBounds(21, 125, 167, 22);
		frmSignoZodiacal.getContentPane().add(cmbMes);
		
		lblFecha = new JLabel("");
		lblFecha.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFecha.setBounds(21, 173, 167, 26);
		frmSignoZodiacal.getContentPane().add(lblFecha);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sldDia.setValue(1);
				lblValorDia.setText("1");
				cmbMes.setSelectedIndex(0);
				lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\ARIESss.SET.png"));
				lblFecha.setText("");
			}
		});
		btnReset.setBounds(21, 213, 89, 23);
		frmSignoZodiacal.getContentPane().add(btnReset);
		
		lblSignos = new JLabel("");
		lblSignos.setIcon(new ImageIcon("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Nueva carpeta (2)\\ARIESss.SET.png"));
		lblSignos.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSignos.setBounds(313, 11, 255, 230);
		frmSignoZodiacal.getContentPane().add(lblSignos);
		sldDia = new JSlider();
		sldDia.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				calcularSigno();
			}
		});
		sldDia.setValue(1);
		sldDia.setMaximum(30);
		sldDia.setMinimum(1);
		sldDia.setBounds(21, 45, 246, 26);
		frmSignoZodiacal.getContentPane().add(sldDia);
		
	}
}
