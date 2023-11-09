package gui;


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import logica.logica;
import logica.persona;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ventanaUser implements FocusListener,ActionListener{

	public JFrame frmCalculoImc;
	private JTextField txtDocumento;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JTextField txtTalla;
	private JButton btnCalcularImc;
	private JButton btnCalcularpromedio;
	private JButton btnRegistrar;
	private JButton btnListapersona;
	private JScrollPane scrollPane;
	private JLabel lblResultado;
	
	logica miLogica;
	private JTextArea txtArea;

	private void initialize() {
		frmCalculoImc = new JFrame();
		frmCalculoImc.setTitle("CALCULO IMC");
		frmCalculoImc.setBounds(100, 100, 1100, 850);
		frmCalculoImc.setLocationRelativeTo(null);
		miLogica = new logica();
		frmCalculoImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public ventanaUser() {
		initialize();
        frmCalculoImc.getContentPane().setBackground(new Color(255, 182, 193));
        frmCalculoImc.getContentPane().setLayout(null);
        
        JLabel etiTitulo = new JLabel("CALCULO IMC");
        etiTitulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        etiTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiTitulo.setBounds(279, 22, 461, 39);
        frmCalculoImc.getContentPane().add(etiTitulo);
        
        JLabel lblDatosBasicos = new JLabel("Datos basicos");
        lblDatosBasicos.setHorizontalAlignment(SwingConstants.CENTER);
        lblDatosBasicos.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lblDatosBasicos.setBounds(31, 71, 270, 39);
        frmCalculoImc.getContentPane().add(lblDatosBasicos);
        
        txtDocumento = new JTextField();
        txtDocumento.setFont(new Font("Times New Roman", Font.BOLD, 20));
        txtDocumento.setForeground(new Color(192, 192, 192));
        txtDocumento.setText("No.DOCUMENTO");
        txtDocumento.setHorizontalAlignment(SwingConstants.CENTER);
        txtDocumento.setBounds(66, 130, 223, 39);
        frmCalculoImc.getContentPane().add(txtDocumento);
        txtDocumento.setColumns(10);
        txtDocumento.addFocusListener(this);
        
        txtNombre = new JTextField();
        txtNombre.setText("NOMBRE");
        txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
        txtNombre.setForeground(Color.LIGHT_GRAY);
        txtNombre.setFont(new Font("Times New Roman", Font.BOLD, 20));
        txtNombre.setColumns(10);
        txtNombre.setBounds(357, 130, 356, 39);
        frmCalculoImc.getContentPane().add(txtNombre);
        txtNombre.addFocusListener(this);
        
        txtEdad = new JTextField();
        txtEdad.setText("EDAD");
        txtEdad.setHorizontalAlignment(SwingConstants.CENTER);
        txtEdad.setForeground(Color.LIGHT_GRAY);
        txtEdad.setFont(new Font("Times New Roman", Font.BOLD, 20));
        txtEdad.setColumns(10);
        txtEdad.setBounds(792, 130, 223, 39);
        frmCalculoImc.getContentPane().add(txtEdad);
        txtEdad.addFocusListener(this);
        
        JLabel lblDatosImc = new JLabel("Datos IMC");
        lblDatosImc.setHorizontalAlignment(SwingConstants.CENTER);
        lblDatosImc.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lblDatosImc.setBounds(31, 206, 270, 39);
        frmCalculoImc.getContentPane().add(lblDatosImc);
        
        txtPeso = new JTextField();
        txtPeso.setText("PESO");
        txtPeso.setHorizontalAlignment(SwingConstants.CENTER);
        txtPeso.setForeground(Color.LIGHT_GRAY);
        txtPeso.setFont(new Font("Times New Roman", Font.BOLD, 20));
        txtPeso.setColumns(10);
        txtPeso.setBounds(66, 270, 223, 39);
        frmCalculoImc.getContentPane().add(txtPeso);
        txtPeso.addFocusListener(this);
        
        txtTalla = new JTextField();
        txtTalla.setText("TALLA");
        txtTalla.setHorizontalAlignment(SwingConstants.CENTER);
        txtTalla.setForeground(Color.LIGHT_GRAY);
        txtTalla.setFont(new Font("Times New Roman", Font.BOLD, 20));
        txtTalla.setColumns(10);
        txtTalla.setBounds(378, 270, 223, 39);
        frmCalculoImc.getContentPane().add(txtTalla);
        txtTalla.addFocusListener(this);
        
        lblResultado = new JLabel("Resultado:");
        lblResultado.setHorizontalAlignment(SwingConstants.LEFT);
        lblResultado.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lblResultado.setBounds(57, 331, 971, 39);
        frmCalculoImc.getContentPane().add(lblResultado);
        
        btnCalcularImc = new JButton("CALCULARIMC");
        btnCalcularImc.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnCalcularImc.setBounds(113, 712, 158, 34);
        frmCalculoImc.getContentPane().add(btnCalcularImc);
        btnCalcularImc.addActionListener(this);
        
        btnCalcularpromedio = new JButton("CALCULARPROM");
        btnCalcularpromedio.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnCalcularpromedio.setBounds(342, 712, 168, 34);
        frmCalculoImc.getContentPane().add(btnCalcularpromedio);
        btnCalcularpromedio.addActionListener(this);
        
        btnRegistrar = new JButton("REGISTRAR");
        btnRegistrar.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnRegistrar.setBounds(559, 712, 158, 34);
        frmCalculoImc.getContentPane().add(btnRegistrar);
        btnRegistrar.addActionListener(this);
        
        btnListapersona = new JButton("LISTAPERSONAS");
        btnListapersona.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnListapersona.setBounds(779, 712, 168, 34);
        frmCalculoImc.getContentPane().add(btnListapersona);
        btnListapersona.addActionListener(this);
        
        txtArea = new JTextArea();
        txtArea.setLineWrap(true);
        
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(txtArea);
        scrollPane.setBounds(66, 423, 948, 212);
        frmCalculoImc.getContentPane().add(scrollPane);
	}


	public void focusGained(FocusEvent e) {
        if (e.getSource()==txtNombre && txtNombre.getText().equals("NOMBRE")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.BLACK);
        }else if (e.getSource()==txtDocumento && txtDocumento.getText().equals("No.DOCUMENTO")) {
            txtDocumento.setText("");
            txtDocumento.setForeground(Color.black);
		}else if (e.getSource()==txtEdad && txtEdad.getText().equals("EDAD")) {
            txtEdad.setText("");
            txtEdad.setForeground(Color.black);
		}else if (e.getSource()==txtPeso && txtPeso.getText().equals("PESO")) {
            txtPeso.setText("");
            txtPeso.setForeground(Color.black);
		}else if (e.getSource()==txtTalla && txtTalla.getText().equals("TALLA")) {
            txtTalla.setText("");
            txtTalla.setForeground(Color.black);
		}
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource()==txtNombre && txtNombre.getText().isEmpty()) {
            txtNombre.setText("NOMBRE");
            txtNombre.setForeground(new Color(192, 192, 192));
        }else if (e.getSource()==txtDocumento && txtDocumento.getText().isEmpty()) {
            txtDocumento.setText("No.DOCUMENTO");
            txtDocumento.setForeground(new Color(192, 192, 192));
		}else if (e.getSource()==txtEdad && txtEdad.getText().isEmpty()) {
            txtEdad.setText("EDAD");
            txtEdad.setForeground(new Color(192, 192, 192));
		}else if (e.getSource()==txtPeso && txtPeso.getText().isEmpty()) {
            txtPeso.setText("PESO");
            txtPeso.setForeground(new Color(192, 192, 192));
		}else if (e.getSource()==txtTalla && txtTalla.getText().isEmpty()) {
            txtTalla.setText("TALLA");
            txtTalla.setForeground(new Color(192, 192, 192));
		}
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		persona miPersona =new persona();	
		
		miPersona.setDocumento(Integer.parseInt(txtDocumento.getText()));
		
		miPersona.setNombre(txtNombre.getText());
		miPersona.setEdad(Integer.parseInt(txtEdad.getText()));
		miPersona.setPeso(Double.parseDouble(txtPeso.getText()));
		miPersona.setTalla(Double.parseDouble(txtTalla.getText()));
		
		if (e.getSource()==btnRegistrar) {
			String resp= miLogica.registraPersona(miPersona);
			txtArea.setText(resp);
			
		}else if (e.getSource()==btnListapersona) {
			
			String listP= miLogica.consultListaPersonas();
			txtArea.setText(listP);
			
		}else if (e.getSource()==btnCalcularpromedio) {
			
			String listaProm = miLogica.calcularPromedio();
			txtArea.setText(listaProm);
			
		}else if (e.getSource()==btnCalcularImc) {
			
			String listaProm = miLogica.calcularImc(miPersona);
			txtArea.setText(listaProm);
		}
	}


}
