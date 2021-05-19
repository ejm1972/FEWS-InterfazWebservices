package ar.com.coninf.doconline.rest.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ResponseConsultarUltimoComprobante extends ResponseAfip {
	private static final long serialVersionUID = 1L;
	
	private String excepcionWsfev1;
	
	private String ultimoComprobante;
	
}
