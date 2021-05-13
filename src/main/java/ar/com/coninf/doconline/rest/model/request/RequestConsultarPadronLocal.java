package ar.com.coninf.doconline.rest.model.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RequestConsultarPadronLocal extends Request {

	private static final long serialVersionUID = 1L;
	public static final String SERVICIO = "/consultar/comprobante";
	
	private String cuit;
	private Integer tipoCbte;
	private Integer ptoVta;
	private Integer cbte;
	
}