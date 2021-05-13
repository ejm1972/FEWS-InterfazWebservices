package ar.com.coninf.doconline.rest.model.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RequestConsultarComprobanteExportacion extends RequestConsultarComprobante {
	private static final long serialVersionUID = 1L;
	public static final String SERVICIO = "/consultar/comprobante/exportacion";
	
}