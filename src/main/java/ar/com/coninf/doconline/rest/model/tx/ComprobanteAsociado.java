package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;

public class ComprobanteAsociado implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private Integer tipoCbte;
	private Integer puntoVta;
	private Integer cbteNro;
	private String cuit;
	private String fechaCbte;

	public Integer getTipoCbte() {
		return tipoCbte;
	}
	public void setTipoCbte(Integer tipoCbte) {
		this.tipoCbte = tipoCbte;
	}
	public Integer getPuntoVta() {
		return puntoVta;
	}
	public void setPuntoVta(Integer puntoVta) {
		this.puntoVta = puntoVta;
	}
	public Integer getCbteNro() {
		return cbteNro;
	}
	public void setCbteNro(Integer cbteNro) {
		this.cbteNro = cbteNro;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getFechaCbte() {
		return fechaCbte;
	}
	public void setFechaCbte(String fechaCbte) {
		this.fechaCbte = fechaCbte;
	}
}