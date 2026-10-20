package Ejerc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class cisios {

	private JFrame frmTablasDeMultiplicar;
	private JTextField txtNumero;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cisios window = new cisios();
					window.frmTablasDeMultiplicar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cisios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	public void calcularTabla() {
try {
	int n=Integer.parseInt(txtNumero.getText().toString());
	txtResultado.setText(
			        n+"x 1"+(n*1)+"\n"+
					n+" x 2 = "+(n*2)+"\n"+
					n+" x 3 = "+(n*3)+"\n"+
					n+" x 4 = "+(n*4)+"\n"+
					n+" x 5 ="+(n*5)+"\n"+
					n+" x 6 = "+(n*6)+"\n"+
					n+" x 7 = "+(n*7)+"\n"+
					n+" x 8 = "+(n*8)+"\n"+
					n+" x 9 = "+(n*9)+"\n"+
					n+" x 10 = "+(n*10)+"\n"
			);
} catch (Exception e) {
	JOptionPane.showMessageDialog(null,"Algo salio mal CECYTO");
}
}
	private void initialize() {
		frmTablasDeMultiplicar = new JFrame();
		frmTablasDeMultiplicar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Caja.png"));
		frmTablasDeMultiplicar.setTitle("TABLAS DE MULTIPLICAR 1");
		frmTablasDeMultiplicar.setBounds(100, 100, 470, 385);
		frmTablasDeMultiplicar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTablasDeMultiplicar.setLocationRelativeTo(null);
		frmTablasDeMultiplicar.getContentPane().setLayout(null);
		
		JLabel btnNumero = new JLabel("NUMERO:");
		btnNumero.setBounds(26, 27, 84, 14);
		frmTablasDeMultiplicar.getContentPane().add(btnNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(96, 24, 140, 20);
		frmTablasDeMultiplicar.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnVer = new JButton("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularTabla();
			}
		});
		btnVer.setBounds(245, 23, 89, 23);
		frmTablasDeMultiplicar.getContentPane().add(btnVer);
		
		txtResultado = new JTextArea();
		txtResultado.setEditable(false);
		txtResultado.setBounds(55, 52, 226, 257);
		frmTablasDeMultiplicar.getContentPane().add(txtResultado);
		
		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNumero.setText("0");
				txtResultado.setText("");
			}
		});
		btnDel.setBounds(343, 23, 89, 23);
		frmTablasDeMultiplicar.getContentPane().add(btnDel);
	}
}
