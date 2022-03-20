package controlador;

import modelo.dao.MascotaDao;
import modelo.dao.NacimientoDao;
import modelo.dao.PersonaDao;
import modelo.dao.PersonaProductoDao;
import modelo.dao.ProductoDao;
import vista.gui.ConsultarMascota;
import vista.gui.ConsultarPersonaGui;
import vista.gui.RegistrarMascotasGui;
import vista.gui.RegistrarPersonasGui;
import vista.gui.RegistrarProductosGui;
import vista.gui.TotalDePersonasRegistradas;
import vista.gui.VentanaPrincipal;

public class Relaciones {
	
	
	


	public Relaciones() {
		
		VentanaPrincipal miVentanaPrincipal;
		
		RegistrarPersonasGui miRegistrarPersonasGui;
		
		RegistrarMascotasGui miRegistrarMascotasGui;
		
		RegistrarProductosGui miRegistrarProductosGui;
		
		Coordinador miCoordinador;
		
		PersonaDao miPersonaDao;
		
		NacimientoDao miNacimientoDao;
		
		MascotaDao miMascotaDao;
		
		ProductoDao miProductoDao;
		
		PersonaProductoDao miPersonaProductoDao;
		
		ConsultarPersonaGui miConsultarPersonaGui;
		
		TotalDePersonasRegistradas miTotalDePersonasRegistradas;
		
		ConsultarMascota miConsultarMascota;
		
		
		
		miVentanaPrincipal=new VentanaPrincipal();
		
		miRegistrarPersonasGui=new RegistrarPersonasGui(miVentanaPrincipal, true);
		
		miRegistrarMascotasGui=new RegistrarMascotasGui(miVentanaPrincipal, true, "");
		
		miRegistrarProductosGui=new RegistrarProductosGui(miVentanaPrincipal, true);
		
		miConsultarPersonaGui=new ConsultarPersonaGui(miVentanaPrincipal,true);
		
		miTotalDePersonasRegistradas=new TotalDePersonasRegistradas();
		
		miConsultarMascota=new ConsultarMascota(miVentanaPrincipal, true, null);
		
		
		
		
		miCoordinador=new Coordinador();
		
		miPersonaDao=new PersonaDao();
		
		miMascotaDao=new MascotaDao();
		
		miNacimientoDao=new NacimientoDao();
		
		miProductoDao=new ProductoDao();
		
		miPersonaProductoDao=new PersonaProductoDao();
		
		miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
		
		miCoordinador.setRegistrarPersonasGui(miRegistrarPersonasGui);
		
		miCoordinador.setRegistrarMascotasGui(miRegistrarMascotasGui);
		
		miCoordinador.setRegistrarProductosGui(miRegistrarProductosGui);
		
		miCoordinador.setPersonaDao(miPersonaDao);
		
		miCoordinador.setMascotaDao(miMascotaDao);
		
		miCoordinador.setNacimientoDao(miNacimientoDao);
		
		miCoordinador.setProductoDao(miProductoDao);
		
		miCoordinador.setPersonaProductoDao(miPersonaProductoDao);

		miCoordinador.setConsultarPersona(miConsultarPersonaGui);
		
		miCoordinador.setTotalDePersonasRegistradas(miTotalDePersonasRegistradas);
		
		miCoordinador.setTotalDePersonasRegistradas(miTotalDePersonasRegistradas);
		
		miCoordinador.setConsultarMascota(miConsultarMascota);
		
		
				
	
		
		
		
		
		miVentanaPrincipal.setCoordinador(miCoordinador);
		
		miRegistrarPersonasGui.setCoordinador(miCoordinador);
		
		miRegistrarMascotasGui.setCoordinador(miCoordinador);
		
		miRegistrarProductosGui.setCoordinador(miCoordinador);
		
		miPersonaDao.setCoordinador(miCoordinador);
		
		miNacimientoDao.setCoordinador(miCoordinador);
		
		miMascotaDao.setCoordinador(miCoordinador);
		
		miProductoDao.setCoordinador(miCoordinador);
		
		miPersonaProductoDao.setCoordinador(miCoordinador);
		
		miConsultarPersonaGui.setCoordinador(miCoordinador);
		
		miTotalDePersonasRegistradas.setCoordinador(miCoordinador);
		
		miConsultarMascota.setCoordinador(miCoordinador);
		
		

		

		
		
		
		miVentanaPrincipal.setVisible(true);
	
	}

}
