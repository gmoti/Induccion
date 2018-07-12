package cl.gmo.controllers;



import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;

public class ControllerCliente extends SelectorComposer<Component>{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7335694609149825226L;
	@Wire
	Textbox rut= new Textbox();
	@Wire
	Button buscar= new Button();
	@Wire
	Textbox respuesta= new Textbox();
	
	
	@Init
	public void inicial() {
		System.out.println("inicializando");
		rut = new Textbox();
		buscar = new Button();
		respuesta = new Textbox();
	}
	
	@Listen("onClick = #buscar")
	public void buscar() {
		/*rut = new Textbox();
		buscar = new Button();
		respuesta = new Textbox();*/
		
		System.out.println("buscando");
		respuesta.setValue("ok recibido");
		
	}
	
	

}
