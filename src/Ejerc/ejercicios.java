package Ejerc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicios {

	private JFrame frmTablasDeMultiplicar;
	private JSlider sldNumero;
	private JTextArea txtResultado;
	private JLabel lblNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicios window = new ejercicios();
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
	public ejercicios() {
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
		frmTablasDeMultiplicar.setBackground(new Color(0, 255, 255));
		frmTablasDeMultiplicar.setTitle("TABLAS DE MULTIPLICAR 2");
		frmTablasDeMultiplicar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose Alberto\\OneDrive\\Desktop\\Caja.png"));
		frmTablasDeMultiplicar.setBounds(100, 100, 459, 360);
		frmTablasDeMultiplicar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTablasDeMultiplicar.setLocationRelativeTo(null);
		frmTablasDeMultiplicar.getContentPane().setLayout(null);
		lblNumero = new JLabel("0");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumero.setBounds(339, 21, 71, 25);
		frmTablasDeMultiplicar.getContentPane().add(lblNumero);
		
		sldNumero = new JSlider();
		sldNumero.setValue(0);
		sldNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNumero.setText(""+sldNumero.getValue());
				calcularTabla();
			}
		});
		
		sldNumero.setMajorTickSpacing(10);
		sldNumero.setSnapToTicks(true);
		sldNumero.setPaintTicks(true);
		sldNumero.setPaintLabels(true);
		sldNumero.setBounds(10, 21, 314, 39);
		frmTablasDeMultiplicar.getContentPane().add(sldNumero);
		
		
		
		txtResultado = new JTextArea();
		txtResultado.setBackground(new Color(0, 255, 255));
		txtResultado.setBounds(40, 71, 284, 204);
		frmTablasDeMultiplicar.getContentPane().add(txtResultado);
		
		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sldNumero.setValue(0);
						lblNumero.setText("0");
						txtResultado.setText("");
					
			}
		});
		btnDel.setBounds(339, 72, 89, 23);
		frmTablasDeMultiplicar.getContentPane().add(btnDel);
		
	}
}
