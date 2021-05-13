package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;

import lombok.Data;

@Data
public class DatoOpcional implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private Integer opcionalId;
	private String valor;

}