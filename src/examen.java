import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class examen {

	private JFrame frame;
	JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2_nomres;
	private JTextField textField_2_ap;
	private JTextField textField_3_am;
	private JTextField textField_2_c;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4_nombre;
	private JTextField textField_4_ap;
	private JTextField textField_4;
	private JTextField textField_5_c;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

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
		
		login(frame);
		
	
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
		 btnNewButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String username = textField.getText();
	                String password = textField_1.getText();

	                if (username.isEmpty() || password.isEmpty()) {
	                  
	                    JOptionPane.showMessageDialog(panel, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
	                   
	                    if (username.isEmpty()) {
	                        textField.setBorder(BorderFactory.createLineBorder(Color.RED));
	                    }
	                    if (password.isEmpty()) {
	                        textField_1.setBorder(BorderFactory.createLineBorder(Color.RED));
	                    }
	                } else {
	                	frame.getContentPane().remove(panel);
	                	frame.getContentPane().repaint();
	                	frame.getContentPane().revalidate();
	                	
	                	menu(frame);
	                }
	            }
	        });
		
		
	}
	
	
	public void menu(JFrame frame) {
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel_1.setBounds(0, 0, 1134, 554);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Alumnos");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(464, 70, 251, 109);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel_1);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        menuAlumno(frame);
			    }
		});
		
		JButton btnNewButton_2 = new JButton("Docentes");
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setBounds(464, 263, 251, 109);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel_1);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        menuDocente(frame);
			    }
		});
		
	}
	
	public void menuAlumno(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(0, 0, 1130, 554);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Descargar Informacion");
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.setBounds(205, 114, 170, 90);
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		     
		      
		            
		            JOptionPane.showMessageDialog(frame, "se ha descargado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		        }
		});
		
		
		JButton btnNewButton_4 = new JButton("Consultar");
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		btnNewButton_4.setBounds(469, 114, 162, 90);
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		     
		      
		            
		            JOptionPane.showMessageDialog(frame, "Los datos fueron consultados con Éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		        }
		});
		
		JButton btnNewButton_5 = new JButton("Crear");
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		btnNewButton_5.setBounds(793, 114, 162, 90);
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        registro(frame);
			    }
		});
		
		JButton btnNewButton_6 = new JButton("Editar");
		btnNewButton_6.setBackground(new Color(192, 192, 192));
		btnNewButton_6.setBounds(213, 313, 162, 90);
		panel.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        actu(frame);
			    }
		});
		
		JButton btnNewButton_7 = new JButton("Eliminar");
		btnNewButton_7.setBackground(new Color(192, 192, 192));
		btnNewButton_7.setBounds(469, 313, 162, 90);
		panel.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        baja(frame);
			    }
		});
		
		JButton btnNewButton_12 = new JButton("Cerrar sesion");
		btnNewButton_12.setBounds(793, 313, 162, 90);
		panel.add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        login(frame);
			    }
		});
		
	}
	
	public void registro(JFrame frame) {
		JPanel panel_RA = new JPanel();
		panel_RA.setBackground(new Color(192, 192, 192));
		panel_RA.setBounds(10, 5, 1120, 532);
		frame.getContentPane().add(panel_RA);
		panel_RA.setLayout(null);
		
		textField_2_nomres = new JTextField();
		textField_2_nomres.setBounds(110, 188, 203, 41);
		panel_RA.add(textField_2_nomres);
		textField_2_nomres.setColumns(10);
		textField_2_nomres.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_2 = new JLabel("Alta de Alumno");
		lblNewLabel_2.setBounds(459, 46, 316, 81);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 31));
		panel_RA.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		lblNewLabel_3.setBounds(34, 198, 86, 17);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RA.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Paterno:");
		lblNewLabel_4.setBounds(34, 280, 148, 53);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RA.add(lblNewLabel_4);
		
		textField_2_ap = new JTextField();
		textField_2_ap.setBounds(167, 291, 203, 35);
		panel_RA.add(textField_2_ap);
		textField_2_ap.setColumns(10);
		textField_2_ap.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_4_1 = new JLabel("Apellido Materno:");
		lblNewLabel_4_1.setBounds(34, 369, 148, 53);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RA.add(lblNewLabel_4_1);
		
		textField_3_am = new JTextField();
		textField_3_am.setBounds(167, 380, 203, 35);
		panel_RA.add(textField_3_am);
		textField_3_am.setColumns(10);
		textField_3_am.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_5 = new JLabel("Correo Electronico:");
		lblNewLabel_5.setBounds(410, 201, 203, 17);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RA.add(lblNewLabel_5);
		
		textField_2_c = new JTextField();
		textField_2_c.setBounds(561, 190, 203, 41);
		panel_RA.add(textField_2_c);
		textField_2_c.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha De Cumpleaños:");
		lblNewLabel_6.setBounds(410, 301, 203, 17);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RA.add(lblNewLabel_6);
		
		String dia[] = { "01" ,"02" , "03" , "04" , "05" ,"06" , "07" , "08" , "09" ,"10" , "11" , "12" , "13" ,"14" , "15" , "16" , "17" ,"18" , "19" , "20" , "21" ,"22" , "23" , "24" , "25" ,"26" , "27" , "28" , "29" ,"30" , "31"};
		JComboBox comboBox_dia = new JComboBox(dia);
		comboBox_dia.setBounds(583, 297, 50, 22);
		panel_RA.add(comboBox_dia);
		
		String mes[] = { "01" ,"02" , "03" , "04" , "05" ,"06" , "07" , "08" , "09" ,"10" , "11" , "12"};
		JComboBox comboBox_mes = new JComboBox(mes);
		comboBox_mes.setBounds(640, 297, 70, 22);
		panel_RA.add(comboBox_mes);
		
		String año[] = { "1989" ,"1990" ,"1991" , "1992" , "1993" , "1994" ,"1995" , "1996" , "1997" , "1998" ,"1999" , "2000" , "2001", "2002", "2003", "2004", "2005", "2006", "2007"};
		JComboBox<Object> comboBox_año = new JComboBox<Object>(año);
		comboBox_año.setBounds(715, 297, 60, 22);
		panel_RA.add(comboBox_año);
		
		JLabel lblNewLabel_7 = new JLabel("Telefono:");
		lblNewLabel_7.setBounds(408, 390, 70, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RA.add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		textField_2.setBounds(488, 387, 203, 35);
		panel_RA.add(textField_2);
		textField_2.setColumns(10);
	
		textField_2.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_8 = new JLabel("Sexo:");
		lblNewLabel_8.setBounds(34, 469, 60, 17);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RA.add(lblNewLabel_8);
		
		String sexo[] = {  "Hombre", "Mujer"};
		JComboBox comboBox_sx = new JComboBox(sexo);
		comboBox_sx.setBounds(78, 468, 100, 22);
		panel_RA.add(comboBox_sx);
		
		JLabel lblNewLabel_9 = new JLabel("Foto");
		lblNewLabel_9.setBounds(963, 350, 46, 14);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RA.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setBounds(875, 100, 200, 240);
		panel_RA.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("Registrar");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_8.setBounds(920, 446, 120, 50);
		panel_RA.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		     
		        if (textField_2_nomres.getText().isEmpty() ||
		            textField_2_ap.getText().isEmpty() ||
		            textField_3_am.getText().isEmpty() ||
		            textField_2_c.getText().isEmpty() ||
		            textField_2.getText().isEmpty()) {
		        
		            textField_2_nomres.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2_ap.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_3_am.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2_c.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2.setBorder(BorderFactory.createLineBorder(Color.RED));
		         
		            JOptionPane.showMessageDialog(frame, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		       
		            textField_2_nomres.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2_ap.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_3_am.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2_c.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            
		            JOptionPane.showMessageDialog(frame, "La persona se ha registrado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
		});
		
		JButton btnNewButton_9 = new JButton("Regresar");
		btnNewButton_9.setBounds(10, 11, 89, 23);
		panel_RA.add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel_RA);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        menuAlumno(frame);
			    }
		});
	}
	
	public void baja(JFrame frame) {
		JPanel panel_Baja = new JPanel();
		panel_Baja.setBackground(new Color(192, 192, 192));
		panel_Baja.setBounds(0, 0, 1130, 554);
		frame.getContentPane().add(panel_Baja);
		panel_Baja.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Dar Baja");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_10.setBounds(573, 51, 70, 20);
		panel_Baja.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Nombre:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(122, 177, 70, 33);
		panel_Baja.add(lblNewLabel_11);
		
		textField_4_nombre = new JTextField();
		textField_4_nombre.setBounds(188, 177, 153, 33);
		panel_Baja.add(textField_4_nombre);
		textField_4_nombre.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Apellido Paterno:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(122, 261, 128, 33);
		panel_Baja.add(lblNewLabel_12);
		
		textField_4_ap = new JTextField();
		textField_4_ap.setBounds(255, 261, 141, 33);
		panel_Baja.add(textField_4_ap);
		textField_4_ap.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Apellido Materno:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(122, 372, 128, 33);
		panel_Baja.add(lblNewLabel_13);
		
		textField_4 = new JTextField();
		textField_4.setBounds(255, 367, 141, 33);
		panel_Baja.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Correo Electronico:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(597, 188, 150, 33);
		panel_Baja.add(lblNewLabel_14);
		
		textField_5_c = new JTextField();
		textField_5_c.setBounds(738, 185, 141, 33);
		panel_Baja.add(textField_5_c);
		textField_5_c.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Numero de Control:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(597, 272, 150, 33);
		panel_Baja.add(lblNewLabel_15);
		
		textField_5 = new JTextField();
		textField_5.setBounds(743, 269, 141, 33);
		panel_Baja.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("REGRESAR");
		btnNewButton_10.setBounds(188, 480, 100, 33);
		panel_Baja.add(btnNewButton_10);
		btnNewButton_10.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel_Baja);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        menuAlumno(frame);
			    }
		});
		
		JButton btnNewButton_11 = new JButton("Dar Baja");
		btnNewButton_11.setBounds(951, 485, 89, 33);
		panel_Baja.add(btnNewButton_11);
		btnNewButton_11.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    
		        if (textField_4_nombre.getText().isEmpty() ||
		            textField_4_ap.getText().isEmpty() ||
		            textField_4.getText().isEmpty() ||
		            textField_5_c.getText().isEmpty() ||
		            textField_5.getText().isEmpty()) {
		
		            textField_4_nombre.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_4_ap.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_4.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_5_c.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_5.setBorder(BorderFactory.createLineBorder(Color.RED));
		    
		            JOptionPane.showMessageDialog(frame, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		      
		            textField_4_nombre.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_4_ap.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_5_c.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_5.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		       
		            JOptionPane.showMessageDialog(frame, "La persona ha sido dada de baja con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
		});
		
		
		
	
	}
	
	
	public void actu(JFrame frame) {
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 0, 1125, 554);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Actualizar Datos del Alumno");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_16.setBounds(400, 11, 450, 25);
		panel_1.add(lblNewLabel_16);
		
		textField_2_nomres = new JTextField();
		textField_2_nomres.setBounds(110, 188, 203, 41);
		panel_1.add(textField_2_nomres);
		textField_2_nomres.setColumns(10);
		textField_2_nomres.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		lblNewLabel_3.setBounds(34, 198, 86, 17);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Paterno:");
		lblNewLabel_4.setBounds(34, 280, 148, 53);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_4);
		
		textField_2_ap = new JTextField();
		textField_2_ap.setBounds(167, 291, 203, 35);
		panel_1.add(textField_2_ap);
		textField_2_ap.setColumns(10);
		textField_2_ap.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_4_1 = new JLabel("Apellido Materno:");
		lblNewLabel_4_1.setBounds(34, 369, 148, 53);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_4_1);
		
		textField_3_am = new JTextField();
		textField_3_am.setBounds(167, 380, 203, 35);
		panel_1.add(textField_3_am);
		textField_3_am.setColumns(10);
		textField_3_am.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_5 = new JLabel("Correo Electronico:");
		lblNewLabel_5.setBounds(410, 201, 203, 17);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_5);
		
		textField_2_c = new JTextField();
		textField_2_c.setBounds(561, 190, 203, 41);
		panel_1.add(textField_2_c);
		textField_2_c.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha De Cumpleaños:");
		lblNewLabel_6.setBounds(410, 301, 203, 17);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_6);
		
		String dia[] = { "01" ,"02" , "03" , "04" , "05" ,"06" , "07" , "08" , "09" ,"10" , "11" , "12" , "13" ,"14" , "15" , "16" , "17" ,"18" , "19" , "20" , "21" ,"22" , "23" , "24" , "25" ,"26" , "27" , "28" , "29" ,"30" , "31"};
		JComboBox comboBox_dia = new JComboBox(dia);
		comboBox_dia.setBounds(583, 297, 50, 22);
		panel_1.add(comboBox_dia);
		
		String mes[] = { "01" ,"02" , "03" , "04" , "05" ,"06" , "07" , "08" , "09" ,"10" , "11" , "12"};
		JComboBox comboBox_mes = new JComboBox(mes);
		comboBox_mes.setBounds(640, 297, 70, 22);
		panel_1.add(comboBox_mes);
		
		String año[] = { "1989" ,"1990" ,"1991" , "1992" , "1993" , "1994" ,"1995" , "1996" , "1997" , "1998" ,"1999" , "2000" , "2001", "2002", "2003", "2004", "2005", "2006", "2007"};
		JComboBox<Object> comboBox_año = new JComboBox<Object>(año);
		comboBox_año.setBounds(715, 297, 60, 22);
		panel_1.add(comboBox_año);
		
		JLabel lblNewLabel_7 = new JLabel("Telefono:");
		lblNewLabel_7.setBounds(408, 390, 70, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		textField_2.setBounds(488, 387, 203, 35);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
	
		textField_2.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_8 = new JLabel("Sexo:");
		lblNewLabel_8.setBounds(34, 469, 60, 17);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_8);
		
		String sexo[] = {  "Hombre", "Mujer"};
		JComboBox comboBox_sx = new JComboBox(sexo);
		comboBox_sx.setBounds(78, 468, 100, 22);
		panel_1.add(comboBox_sx);
		
		JLabel lblNewLabel_9 = new JLabel("Foto");
		lblNewLabel_9.setBounds(963, 350, 46, 14);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setBounds(875, 100, 200, 240);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("Registrar");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_8.setBounds(920, 446, 120, 50);
		panel_1.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		     
		        if (textField_2_nomres.getText().isEmpty() ||
		            textField_2_ap.getText().isEmpty() ||
		            textField_3_am.getText().isEmpty() ||
		            textField_2_c.getText().isEmpty() ||
		            textField_2.getText().isEmpty()) {
		        
		            textField_2_nomres.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2_ap.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_3_am.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2_c.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2.setBorder(BorderFactory.createLineBorder(Color.RED));
		         
		            JOptionPane.showMessageDialog(frame, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		       
		            textField_2_nomres.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2_ap.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_3_am.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2_c.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            
		            JOptionPane.showMessageDialog(frame, "La persona se ha registrado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
		});
		
		JButton btnNewButton_9 = new JButton("Regresar");
		btnNewButton_9.setBounds(10, 11, 89, 23);
		panel_1.add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel_1);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        menuAlumno(frame);
			    }
		});
		
		
	}
	
	public void menuDocente(JFrame frame) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(0, 0, 1130, 554);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Descargar Informacion");
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.setBounds(205, 114, 170, 90);
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		     
		      
		            
		            JOptionPane.showMessageDialog(frame, "se ha descargado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		        }
		});
		
		
		JButton btnNewButton_4 = new JButton("Consultar");
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		btnNewButton_4.setBounds(469, 114, 162, 90);
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		     
		      
		            
		            JOptionPane.showMessageDialog(frame, "Los datos fueron consultados con Éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		        }
		});
		
		JButton btnNewButton_5 = new JButton("Crear");
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		btnNewButton_5.setBounds(793, 114, 162, 90);
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        altad(frame);
			    }
		});
		
		JButton btnNewButton_6 = new JButton("Editar");
		btnNewButton_6.setBackground(new Color(192, 192, 192));
		btnNewButton_6.setBounds(213, 313, 162, 90);
		panel.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        actud(frame);
			    }
		});
		
		JButton btnNewButton_7 = new JButton("Eliminar");
		btnNewButton_7.setBackground(new Color(192, 192, 192));
		btnNewButton_7.setBounds(469, 313, 162, 90);
		panel.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        baja(frame);
			    }
		});
		
		JButton btnNewButton_12 = new JButton("Cerrar sesion");
		btnNewButton_12.setBounds(793, 313, 162, 90);
		panel.add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        login(frame);
			    }
		});
		
	}
	
	public void altad(JFrame frame) {
		JPanel panel_RD = new JPanel();
		panel_RD.setBackground(new Color(192, 192, 192));
		panel_RD.setBounds(10, 5, 1120, 532);
		frame.getContentPane().add(panel_RD);
		panel_RD.setLayout(null);
		
		textField_2_nomres = new JTextField();
		textField_2_nomres.setBounds(110, 188, 203, 41);
		panel_RD.add(textField_2_nomres);
		textField_2_nomres.setColumns(10);
		textField_2_nomres.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_2 = new JLabel("Alta de Docente");
		lblNewLabel_2.setBounds(459, 46, 316, 81);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 31));
		panel_RD.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		lblNewLabel_3.setBounds(34, 198, 86, 17);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RD.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Paterno:");
		lblNewLabel_4.setBounds(34, 280, 148, 53);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RD.add(lblNewLabel_4);
		
		textField_2_ap = new JTextField();
		textField_2_ap.setBounds(167, 291, 203, 35);
		panel_RD.add(textField_2_ap);
		textField_2_ap.setColumns(10);
		textField_2_ap.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_4_1 = new JLabel("Apellido Materno:");
		lblNewLabel_4_1.setBounds(34, 369, 148, 53);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RD.add(lblNewLabel_4_1);
		
		textField_3_am = new JTextField();
		textField_3_am.setBounds(167, 380, 203, 35);
		panel_RD.add(textField_3_am);
		textField_3_am.setColumns(10);
		textField_3_am.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_5 = new JLabel("Correo Electronico:");
		lblNewLabel_5.setBounds(410, 201, 203, 17);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RD.add(lblNewLabel_5);
		
		textField_2_c = new JTextField();
		textField_2_c.setBounds(561, 190, 203, 41);
		panel_RD.add(textField_2_c);
		textField_2_c.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha De Cumpleaños:");
		lblNewLabel_6.setBounds(410, 301, 203, 17);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RD.add(lblNewLabel_6);
		
		String dia[] = { "01" ,"02" , "03" , "04" , "05" ,"06" , "07" , "08" , "09" ,"10" , "11" , "12" , "13" ,"14" , "15" , "16" , "17" ,"18" , "19" , "20" , "21" ,"22" , "23" , "24" , "25" ,"26" , "27" , "28" , "29" ,"30" , "31"};
		JComboBox comboBox_dia = new JComboBox(dia);
		comboBox_dia.setBounds(583, 297, 50, 22);
		panel_RD.add(comboBox_dia);
		
		String mes[] = { "01" ,"02" , "03" , "04" , "05" ,"06" , "07" , "08" , "09" ,"10" , "11" , "12"};
		JComboBox comboBox_mes = new JComboBox(mes);
		comboBox_mes.setBounds(640, 297, 70, 22);
		panel_RD.add(comboBox_mes);
		
		String año[] = { "1989" ,"1990" ,"1991" , "1992" , "1993" , "1994" ,"1995" , "1996" , "1997" , "1998" ,"1999" , "2000" , "2001", "2002", "2003", "2004", "2005", "2006", "2007"};
		JComboBox<Object> comboBox_año = new JComboBox<Object>(año);
		comboBox_año.setBounds(715, 297, 60, 22);
		panel_RD.add(comboBox_año);
		
		JLabel lblNewLabel_7 = new JLabel("Telefono:");
		lblNewLabel_7.setBounds(408, 390, 70, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RD.add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		textField_2.setBounds(488, 387, 203, 35);
		panel_RD.add(textField_2);
		textField_2.setColumns(10);
	
		textField_2.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_8 = new JLabel("Sexo:");
		lblNewLabel_8.setBounds(34, 469, 60, 17);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RD.add(lblNewLabel_8);
		
		String sexo[] = {  "Hombre", "Mujer"};
		JComboBox comboBox_sx = new JComboBox(sexo);
		comboBox_sx.setBounds(78, 468, 100, 22);
		panel_RD.add(comboBox_sx);
		
		JLabel lblNewLabel_9 = new JLabel("Foto");
		lblNewLabel_9.setBounds(963, 350, 46, 14);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_RD.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setBounds(875, 100, 200, 240);
		panel_RD.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("Registrar");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_8.setBounds(920, 446, 120, 50);
		panel_RD.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		     
		        if (textField_2_nomres.getText().isEmpty() ||
		            textField_2_ap.getText().isEmpty() ||
		            textField_3_am.getText().isEmpty() ||
		            textField_2_c.getText().isEmpty() ||
		            textField_2.getText().isEmpty()) {
		        
		            textField_2_nomres.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2_ap.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_3_am.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2_c.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2.setBorder(BorderFactory.createLineBorder(Color.RED));
		         
		            JOptionPane.showMessageDialog(frame, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		       
		            textField_2_nomres.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2_ap.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_3_am.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2_c.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            
		            JOptionPane.showMessageDialog(frame, "La persona se ha registrado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
		});
		
		JButton btnNewButton_9 = new JButton("Regresar");
		btnNewButton_9.setBounds(10, 11, 89, 23);
		panel_RD.add(btnNewButton_9);
		
		JLabel lblNewLabel_17 = new JLabel("Grado de estudios:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_17.setBounds(410, 466, 150, 14);
		panel_RD.add(lblNewLabel_17);
		
		textField_6 = new JTextField();
		textField_6.setBounds(547, 463, 203, 35);
		panel_RD.add(textField_6);
		textField_6.setColumns(10);
		btnNewButton_9.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel_RD);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        menuDocente(frame);
			    }
		});
	}
	
	public void actud(JFrame frame) {
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 0, 1125, 554);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Actualizar Datos del Docente");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_16.setBounds(400, 11, 450, 25);
		panel_1.add(lblNewLabel_16);
		
		textField_2_nomres = new JTextField();
		textField_2_nomres.setBounds(110, 188, 203, 41);
		panel_1.add(textField_2_nomres);
		textField_2_nomres.setColumns(10);
		textField_2_nomres.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		lblNewLabel_3.setBounds(34, 198, 86, 17);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Paterno:");
		lblNewLabel_4.setBounds(34, 280, 148, 53);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_4);
		
		textField_2_ap = new JTextField();
		textField_2_ap.setBounds(167, 291, 203, 35);
		panel_1.add(textField_2_ap);
		textField_2_ap.setColumns(10);
		textField_2_ap.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_4_1 = new JLabel("Apellido Materno:");
		lblNewLabel_4_1.setBounds(34, 369, 148, 53);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_4_1);
		
		textField_3_am = new JTextField();
		textField_3_am.setBounds(167, 380, 203, 35);
		panel_1.add(textField_3_am);
		textField_3_am.setColumns(10);
		textField_3_am.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_5 = new JLabel("Correo Electronico:");
		lblNewLabel_5.setBounds(410, 201, 203, 17);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_5);
		
		textField_2_c = new JTextField();
		textField_2_c.setBounds(561, 190, 203, 41);
		panel_1.add(textField_2_c);
		textField_2_c.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha De Cumpleaños:");
		lblNewLabel_6.setBounds(410, 301, 203, 17);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_6);
		
		String dia[] = { "01" ,"02" , "03" , "04" , "05" ,"06" , "07" , "08" , "09" ,"10" , "11" , "12" , "13" ,"14" , "15" , "16" , "17" ,"18" , "19" , "20" , "21" ,"22" , "23" , "24" , "25" ,"26" , "27" , "28" , "29" ,"30" , "31"};
		JComboBox comboBox_dia = new JComboBox(dia);
		comboBox_dia.setBounds(583, 297, 50, 22);
		panel_1.add(comboBox_dia);
		
		String mes[] = { "01" ,"02" , "03" , "04" , "05" ,"06" , "07" , "08" , "09" ,"10" , "11" , "12"};
		JComboBox comboBox_mes = new JComboBox(mes);
		comboBox_mes.setBounds(640, 297, 70, 22);
		panel_1.add(comboBox_mes);
		
		String año[] = { "1989" ,"1990" ,"1991" , "1992" , "1993" , "1994" ,"1995" , "1996" , "1997" , "1998" ,"1999" , "2000" , "2001", "2002", "2003", "2004", "2005", "2006", "2007"};
		JComboBox<Object> comboBox_año = new JComboBox<Object>(año);
		comboBox_año.setBounds(715, 297, 60, 22);
		panel_1.add(comboBox_año);
		
		JLabel lblNewLabel_7 = new JLabel("Telefono:");
		lblNewLabel_7.setBounds(408, 390, 70, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		textField_2.setBounds(488, 387, 203, 35);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
	
		textField_2.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
		            evt.consume();
		        }
		    }
		});
		
		JLabel lblNewLabel_8 = new JLabel("Sexo:");
		lblNewLabel_8.setBounds(34, 469, 60, 17);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_8);
		
		String sexo[] = {  "Hombre", "Mujer"};
		JComboBox comboBox_sx = new JComboBox(sexo);
		comboBox_sx.setBounds(78, 468, 100, 22);
		panel_1.add(comboBox_sx);
		
		JLabel lblNewLabel_9 = new JLabel("Foto");
		lblNewLabel_9.setBounds(963, 350, 46, 14);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setBounds(875, 100, 200, 240);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("Registrar");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_8.setBounds(920, 446, 120, 50);
		panel_1.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		     
		        if (textField_2_nomres.getText().isEmpty() ||
		            textField_2_ap.getText().isEmpty() ||
		            textField_3_am.getText().isEmpty() ||
		            textField_2_c.getText().isEmpty() ||
		            textField_2.getText().isEmpty()) {
		        
		            textField_2_nomres.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2_ap.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_3_am.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2_c.setBorder(BorderFactory.createLineBorder(Color.RED));
		            textField_2.setBorder(BorderFactory.createLineBorder(Color.RED));
		         
		            JOptionPane.showMessageDialog(frame, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		       
		            textField_2_nomres.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2_ap.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_3_am.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2_c.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            textField_2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		            
		            JOptionPane.showMessageDialog(frame, "La persona se ha registrado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
		});
		
		JButton btnNewButton_9 = new JButton("Regresar");
		btnNewButton_9.setBounds(10, 11, 89, 23);
		panel_1.add(btnNewButton_9);
		
		JLabel lblNewLabel_18 = new JLabel("Grados de Estudio:");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_18.setBounds(410, 472, 150, 14);
		panel_1.add(lblNewLabel_18);
		
		textField_7 = new JTextField();
		textField_7.setBounds(547, 463, 203, 35);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		btnNewButton_9.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			      
			        frame.getContentPane().remove(panel_1);
			        frame.getContentPane().repaint();
			        frame.getContentPane().revalidate();
			   
			        menuDocente(frame);
			    }
		});
	}
}
