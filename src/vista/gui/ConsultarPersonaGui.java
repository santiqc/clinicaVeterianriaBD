package vista.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controlador.Coordinador;
import modelo.conexion.Conexion;
import modelo.dao.PersonaDao;
import modelo.vo.NacimientoVo;
import modelo.vo.PersonaVo;

import javax.swing.JSeparator;
import java.awt.Color;

public class ConsultarPersonaGui extends JDialog implements ActionListener{
	private Coordinador miCoordinador;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtDocumento;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtProfesion;
	private JTextField txtTipo;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAnio;
	private JTextField txtCiudad;
	private JTextField txtDepartamento;
	private JTextField txtPais;
	private JButton btnCancelar;
	private JButton btnConsultar;
	private JButton btnActualizar;
	private JButton btnEliminar;

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}


	public ConsultarPersonaGui(VentanaPrincipal ventanaPrincipal, boolean modal) {
		super(ventanaPrincipal,modal);
		setSize( 630, 452);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		iniciarComponentes();
	}
		



	private void iniciarComponentes() {
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("CONSULTAR PERSONAS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblTitulo.setBounds(10, 10, 599, 28);
		contentPanel.add(lblTitulo);
				
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 49, 588, 324);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Documento:");
		lblNewLabel.setBounds(290, 0, 71, 21);
		panel.add(lblNewLabel);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(371, 0, 86, 20);
		panel.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(24, 22, 71, 21);
		panel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(86, 22, 476, 20);
		panel.add(txtNombre);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(24, 54, 71, 21);
		panel.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(86, 54, 86, 20);
		panel.add(txtTelefono);
		
		JLabel lblProfesion = new JLabel("Profesion:");
		lblProfesion.setBounds(195, 54, 71, 21);
		panel.add(lblProfesion);
		
		txtProfesion = new JTextField();
		txtProfesion.setColumns(10);
		txtProfesion.setBounds(259, 54, 167, 20);
		panel.add(txtProfesion);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(439, 54, 71, 21);
		panel.add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBounds(476, 54, 86, 20);
		panel.add(txtTipo);
		
		JPanel panelNacimiento = new JPanel();
		panelNacimiento.setBorder(new TitledBorder(null, "Datos de Nacimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelNacimiento.setBounds(24, 139, 538, 109);
		panel.add(panelNacimiento);
		panelNacimiento.setLayout(null);
		
		JLabel lblFecha = new JLabel("Fecha (dd/mm/aaaa):");
		lblFecha.setBounds(10, 29, 122, 14);
		panelNacimiento.add(lblFecha);
		
		txtDia = new JTextField();
		txtDia.setBounds(142, 28, 25, 20);
		panelNacimiento.add(txtDia);
		txtDia.setColumns(10);
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		txtMes.setBounds(190, 28, 25, 20);
		panelNacimiento.add(txtMes);
		
		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		txtAnio.setBounds(238, 28, 54, 20);
		panelNacimiento.add(txtAnio);
		
		JLabel lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setBounds(177, 31, 38, 14);
		panelNacimiento.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("/");
		lblNewLabel_1_1.setBounds(224, 31, 38, 14);
		panelNacimiento.add(lblNewLabel_1_1);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setBounds(10, 59, 71, 21);
		panelNacimiento.add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(74, 59, 86, 20);
		panelNacimiento.add(txtCiudad);
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setBounds(185, 59, 92, 21);
		panelNacimiento.add(lblDepartamento);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(281, 59, 86, 20);
		panelNacimiento.add(txtDepartamento);
		
		JLabel lblPais = new JLabel("Pais:");
		lblPais.setBounds(385, 59, 54, 21);
		panelNacimiento.add(lblPais);
		
		txtPais = new JTextField();
		txtPais.setColumns(10);
		txtPais.setBounds(424, 59, 86, 20);
		panelNacimiento.add(txtPais);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 259, 538, 12);
		panel.add(separator);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(463, 276, 89, 23);
		btnCancelar.addActionListener(this);
		panel.add(btnCancelar);
		
		
		btnConsultar = new JButton("...");
		btnConsultar.setBackground(new Color(0, 191, 255));
		btnConsultar.setBounds(467, -1, 89, 23);
		panel.add(btnConsultar);
		btnConsultar.addActionListener(this);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(359, 276, 89, 23);
		panel.add(btnActualizar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(246, 276, 89, 23);
		panel.add(btnEliminar);
		btnActualizar.addActionListener(this);
		btnEliminar.addActionListener(this);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnConsultar) {
			Long idDocumento=Long.parseLong(txtDocumento.getText());
			PersonaVo p=miCoordinador.setConsultarPersona(idDocumento);
			

			if(p!=null){
				p.setNacimiento(miCoordinador.consultarNacimiento(p.getNacimiento().getIdNacimiento()));
				System.out.println(p);
				txtNombre.setText(p.getNombre());
				txtProfesion.setText(p.getProfesion());
				txtTelefono.setText(p.getTelefono());
				txtTipo.setText(p.getTipo()+"");
				
				txtCiudad.setText(p.getNacimiento().getCiudadNacimiento());
				
				txtDepartamento.setText(p.getNacimiento().getDepartamentoNacimiento());
				txtPais.setText(p.getNacimiento().getPaisNacimiento());
				txtDia.setText(p.getNacimiento().getFechaNacimiento().getDayOfMonth()+"");
				txtMes.setText(p.getNacimiento().getFechaNacimiento().getMonthValue()+"");
				txtAnio.setText(p.getNacimiento().getFechaNacimiento().getYear()+"");
				
			}else {
				JOptionPane.showMessageDialog(null, "No se encuentra la persona, verifique el documento","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
			}}

			if (e.getSource() == btnActualizar) {
			System.out.println("entro");
			int id = Integer.parseInt(txtDocumento.getText());
			long idLong = Long.parseLong(txtDocumento.getText());
			NacimientoVo numeroID = miCoordinador.obtenerIdNacimiento(id);
				
			Long idUsuario = numeroID.getIdNacimiento();
				
			PersonaVo miPersona=new PersonaVo();
			miPersona.setNombre(txtNombre.getText());
			miPersona.setProfesion(txtProfesion.getText());
			miPersona.setTelefono(txtTelefono.getText());
			miPersona.setTipo(Integer.parseInt(txtTipo.getText()));
			miPersona.setIdPersona(idLong);
				
			NacimientoVo miNacimiento=new NacimientoVo();
			miNacimiento.setCiudadNacimiento(txtCiudad.getText());
			miNacimiento.setDepartamentoNacimiento(txtDepartamento.getText());
			miNacimiento.setPaisNacimiento(txtPais.getText());
			miNacimiento.setIdNacimiento(idUsuario);
			miNacimiento.setFechaNacimiento(LocalDate.of(Integer.parseInt(txtAnio.getText()),
			Integer.parseInt(txtMes.getText()), Integer.parseInt(txtDia.getText())));
			miPersona.setNacimiento(miNacimiento);
				
			String idNacimiento = miCoordinador.actualizarNacimiento(miPersona);
				
				
			String resp = miCoordinador.actualizarPersona(miPersona);
				

				
				
				

			
			JOptionPane.showMessageDialog(null, "Actualizaci�n Exitosa!");
			
			
		}
			
		if(e.getSource()==btnEliminar) {
		}
			
			
	}
}


