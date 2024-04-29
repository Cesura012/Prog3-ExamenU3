import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class examen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examen window = new examen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1150, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(0, 0, 1130, 554);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Descargar Informacion");
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.setBounds(205, 114, 170, 90);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Consultar");
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		btnNewButton_4.setBounds(469, 114, 162, 90);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Crear");
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(793, 114, 162, 90);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Editar");
		btnNewButton_6.setBackground(new Color(192, 192, 192));
		btnNewButton_6.setBounds(213, 313, 162, 90);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Eliminar");
		btnNewButton_7.setBackground(new Color(192, 192, 192));
		btnNewButton_7.setBounds(469, 313, 162, 90);
		panel.add(btnNewButton_7);
		
		
	
	}
	
	public void login(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 1134, 554);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INICIO DE SESION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(442, 26, 253, 67);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de Control");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(432, 131, 164, 52);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(405, 194, 209, 42);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("CONTRASEÑA");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(442, 264, 164, 52);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(405, 327, 209, 45);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("INGRESAR");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(698, 406, 190, 67);
		panel.add(btnNewButton);
		
		JButton btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRegistrarse.setBackground(Color.LIGHT_GRAY);
		btnRegistrarse.setBounds(147, 406, 190, 67);
		panel.add(btnRegistrarse);
	}
	
	public void menu() {
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel_1.setBounds(0, 0, 1134, 554);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Alumnos");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(464, 70, 251, 109);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Docentes");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setBounds(464, 263, 251, 109);
		panel_1.add(btnNewButton_2);
		
	}
}
