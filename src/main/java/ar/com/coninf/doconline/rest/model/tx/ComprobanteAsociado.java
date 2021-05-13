package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;

import lombok.Data;

@Data
public class ComprobanteAsociado implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private Integer tipoCbte;
	private Integer puntoVta;
	private Integer cbteNro;
	private String cuit;
	private String fechaCbte;

}