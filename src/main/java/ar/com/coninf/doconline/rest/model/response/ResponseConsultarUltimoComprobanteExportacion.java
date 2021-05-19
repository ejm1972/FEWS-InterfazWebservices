package ar.com.coninf.doconline.rest.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ResponseConsultarUltimoComprobanteExportacion extends ResponseAfip {
	private static final long serialVersionUID = 1L;
	
	private String excepcionWsfexv1;
	
	private String ultimoComprobante;
	
}
