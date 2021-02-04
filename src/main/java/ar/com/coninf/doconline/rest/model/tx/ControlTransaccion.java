package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;

public class ControlTransaccion implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private Long nroTransaccion;
	private Integer interfaz;
	private String idSesion;

	public Long getNroTransaccion() {
		return nroTransaccion;
	}
	public void setNroTransaccion(Long nroTransaccion) {
		this.nroTransaccion = nroTransaccion;
	}
	public Integer getInterfaz() {
		return interfaz;
	}
	public void setInterfaz(Integer interfaz) {
		this.interfaz = interfaz;
	}
	public String getIdSesion() {
		return idSesion;
	}
	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

}
