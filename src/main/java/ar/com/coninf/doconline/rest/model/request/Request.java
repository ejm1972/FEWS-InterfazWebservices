package ar.com.coninf.doconline.rest.model.request;

import java.io.Serializable;

import ar.com.coninf.doconline.rest.model.tx.ControlTransaccion;

public class Request implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private ControlTransaccion controlTransaccion;
	
	public Request(){
		
	}

	public ControlTransaccion getControlTransaccion() {
		return controlTransaccion;
	}

	public void setControlTransaccion(ControlTransaccion controlTransaccion) {
		this.controlTransaccion = controlTransaccion;
	}
}
