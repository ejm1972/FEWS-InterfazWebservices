package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;

import lombok.Data;

@Data
public class PeriodoComprobanteAsociado implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private String fechaDesde;
	private String fechaHasta;

}