package cl.gmo.controllers;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;


public class ControllerCliente2 {
	
	String nif;
	String muestra;
	
	@Init
	public void inicial() {
		System.out.println("inicializando");
		
	}
	
	@NotifyChange("muestra")
	@Command
	public void buscar() {	
		
		System.out.println("buscando");	
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getMuestra() {
		return muestra;
	}

	public void setMuestra(String muestra) {
		this.muestra = muestra;
	}
	
	
	

}
