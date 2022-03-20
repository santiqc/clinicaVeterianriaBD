package controlador;

import modelo.vo.MascotaVo;
import modelo.vo.NacimientoVo;
import modelo.vo.PersonaVo;
import vista.gui.ConsultarMascota;
import vista.gui.ConsultarPersonaGui;
import vista.gui.RegistrarMascotasGui;
import vista.gui.RegistrarPersonasGui;
import vista.gui.RegistrarProductosGui;
import vista.gui.TotalDePersonasRegistradas;
import vista.gui.VentanaPrincipal;

import java.awt.Dialog;
import java.util.ArrayList;

import modelo.dao.MascotaDao;
import modelo.dao.NacimientoDao;
import modelo.dao.PersonaDao;
import modelo.dao.PersonaProductoDao;
import modelo.dao.ProductoDao;
public class Coordinador {
	
	
	VentanaPrincipal miVentanaPrincipal;
	
	RegistrarPersonasGui miRegistrarPersonasGui;
	
	RegistrarMascotasGui miRegistrarMascotasGui;
	
	RegistrarProductosGui miRegistrarProductosGui;
	
	PersonaDao miPersonaDao;
	
	NacimientoDao miNacimientoDao;
	
	MascotaDao miMascotaDao;
	
	ProductoDao miProductoDao;
	
	PersonaProductoDao miPersonaProductoDao;

	ConsultarPersonaGui miConsultarPersonaGui;
	
	TotalDePersonasRegistradas miTotalDePersonasRegistradas;
	
	ConsultarMascota miConsultarMascota;
	
	
	public void setTotalDePersonasRegistradas(TotalDePersonasRegistradas miTotalDePersonasRegistradas) {
		this.miTotalDePersonasRegistradas=miTotalDePersonasRegistradas;
		
	}
	public void setConsultarPersona(ConsultarPersonaGui miConsultarPersonaGui) {
		this.miConsultarPersonaGui = miConsultarPersonaGui;		
	}

	public void setConsultarMascota(ConsultarMascota miConsultarMascota) {
		this.miConsultarMascota= miConsultarMascota;
		
	}
	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}

	public void setRegistrarPersonasGui(RegistrarPersonasGui miRegistrarPersonasGui) {
		this.miRegistrarPersonasGui = miRegistrarPersonasGui;
	}

	public void setRegistrarMascotasGui(RegistrarMascotasGui miRegistrarMascotasGui) {
		this.miRegistrarMascotasGui = miRegistrarMascotasGui;
	}

	public void setRegistrarProductosGui(RegistrarProductosGui miRegistrarProductosGui) {
		this.miRegistrarProductosGui = miRegistrarProductosGui;
	}

	public void setPersonaDao(PersonaDao miPersonaDao) {
		this.miPersonaDao = miPersonaDao;
	}

	public void setNacimientoDao(NacimientoDao miNacimientoDao) {
		this.miNacimientoDao = miNacimientoDao;
	}

	public void setMascotaDao(MascotaDao miMascotaDao) {
		this.miMascotaDao = miMascotaDao;
	}

	public void setProductoDao(ProductoDao miProductoDao) {
		this.miProductoDao = miProductoDao;
	}
	public void setPersonaProductoDao(PersonaProductoDao miPersonaProductoDao) {
		this.miPersonaProductoDao = miPersonaProductoDao;
	}

	public void mostrarVentanaRegistroPersonas() {
		miRegistrarPersonasGui.setVisible(true);
		
	}

	public void mostrarVentanaRegistroMascotas() {
		miRegistrarMascotasGui.setVisible(true);
		
	}

	public String registrarPersona(PersonaVo miPersona) {
		return miPersonaDao.registrarPersona(miPersona);
		
	}

	public Long registrarNacimiento(PersonaVo miPersona) {
		return miNacimientoDao.registrarNacimiento(miPersona.getNacimiento());
	}


	public void mostrarVentanaConsultaPersonas() {
		miConsultarPersonaGui.setVisible(true);
		
	}

	public PersonaVo setConsultarPersona(Long idDocumento) {
		return miPersonaDao.consultarPersona(idDocumento);
	}
	public MascotaVo setConsultarMascota(Long idMascota) {
		return miMascotaDao.consultarMascota(idMascota);
	}

	public NacimientoVo consultarNacimiento(Long idNacimiento) {
		return miNacimientoDao.consultarNacimiento(idNacimiento);
	}
	
	public NacimientoVo obtenerIdNacimiento(int id) {
		return miNacimientoDao.obtenerIdNacimiento(id);
		
	}
	public String actualizarNacimiento(PersonaVo miPersona) {
		return miNacimientoDao.actualizarNacimiento(miPersona.getNacimiento());
	}
	public String actualizarPersona(PersonaVo miPersona) {
		return miPersonaDao.actualizarPersona(miPersona);
	}

	
	public ArrayList<PersonaVo> consultarTodasLasPersonas() {
		return miPersonaDao.consultarTodasLasPersonas();
	}
	public void mostrarVentanaTotalDePersonasRegistradas() {
		miTotalDePersonasRegistradas.setVisible(true);
	}
	public String registrarMascota(MascotaVo miMascota) {
		return miMascotaDao.registrarMascota(miMascota);
	}
	public void mostrarVentanaConsultaMascota() {
		miConsultarMascota.setVisible(true);
		
	}
	public String actualizarMascota(MascotaVo miMascota) {
		return miMascotaDao.actualizarMascota(miMascota);
	}
	
	
	
	
	

	

	

	

		
	

	
	
}
