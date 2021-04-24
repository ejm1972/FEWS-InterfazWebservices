package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;

public class PeriodoComprobanteAsociado implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private String fechaDesde;
	private String fechaHasta;

	public String fechaHasta() {
		return fechaDesde;
	}
	public void setFechaDesde(String desde) {
		this.fechaDesde = desde;
	}
	public String getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(String hasta) {
		this.fechaHasta = hasta;
	}
}