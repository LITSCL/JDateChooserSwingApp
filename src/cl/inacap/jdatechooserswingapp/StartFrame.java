package cl.inacap.jdatechooserswingapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class StartFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDateChooser dateChooserFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartFrame() {
		setTitle("JDateChooserSwingApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dateChooserFecha = new JDateChooser();
		dateChooserFecha.setBounds(337, 11, 87, 20);
		contentPane.add(dateChooserFecha);
		
		JButton btnNewButtonFecha = new JButton("Mostrar Fecha en Consola");
		btnNewButtonFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
				int dia = dateChooserFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
				int mes = (dateChooserFecha.getCalendar().get(Calendar.MONTH) + 1);
				int year = dateChooserFecha.getCalendar().get(Calendar.YEAR);
				
				System.out.println("El dia seleccionado es: " + dia);
				System.out.println("El mes seleccionado es: " + mes);
				System.out.println("El año seleccionado es: " + year);
				
			}
		});
		btnNewButtonFecha.setBounds(240, 227, 184, 23);
		contentPane.add(btnNewButtonFecha);
	}
}
