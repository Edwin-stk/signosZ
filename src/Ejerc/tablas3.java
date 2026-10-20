package Ejerc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class tablas3 {

	private JFrame frmTablasDeMultiplicar;
	private JTextArea txtResultado;
	private JScrollBar scrBarra;
	private JLabel lblNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tablas3 window = new tablas3();
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
	public tablas3() {
		initialize();
	}

	public void calcularTabla() {
		try {
			int n=Integer.parseInt(lblNumero.getText().toString());
			txtResultado.setText(
					        n+"x 1 = "+(n*1)+"\n"+
							n+" x 2 ="+(n*2)+"\n"+
							n+" x 3 ="+(n*3)+"\n"+
							n+" x 4 ="+(n*4)+"\n"+
							n+" x 5 ="+(n*5)+"\n"+
							n+" x 6 ="+(n*6)+"\n"+
							n+" x 7 ="+(n*7)+"\n"+
							n+" x 8 ="+(n*8)+"\n"+
							n+" x 9 ="+(n*9)+"\n"+
							n+" x 10 ="+(n*10)+"\n"
					);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Algo salio mal CECYTO");
		}
		}
	private void initialize() {
		frmTablasDeMultiplicar = new JFrame();
		frmTablasDeMultiplicar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Caja.png"));
		frmTablasDeMultiplicar.setTitle("TABLAS DE MULTIPLICAR 3");
		frmTablasDeMultiplicar.setBounds(100, 100, 450, 300);
		frmTablasDeMultiplicar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTablasDeMultiplicar.setLocationRelativeTo(null);
		frmTablasDeMultiplicar.getContentPane().setLayout(null);
		
		lblNumero = new JLabel("0");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumero.setBounds(312, 24, 95, 24);
		frmTablasDeMultiplicar.getContentPane().add(lblNumero);
		
		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrBarra.setValue(0);
				lblNumero.setText("0");
				txtResultado.setText("");
			
			}
		});
		btnDel.setBounds(307, 59, 117, 31);
		frmTablasDeMultiplicar.getContentPane().add(btnDel);
		
		txtResultado = new JTextArea();
		txtResultado.setBackground(new Color(0, 255, 255));
		txtResultado.setBounds(20, 61, 277, 174);
		frmTablasDeMultiplicar.getContentPane().add(txtResultado);
		
		scrBarra = new JScrollBar();
		scrBarra.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				lblNumero.setText(""+scrBarra.getValue());
				calcularTabla();
			
			}
		});
		scrBarra.setOrientation(JScrollBar.HORIZONTAL);
		scrBarra.setBounds(20, 11, 260, 39);
		frmTablasDeMultiplicar.getContentPane().add(scrBarra);
	}
}
