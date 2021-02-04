package ar.com.coninf.doconline.rest.model.request;

import ar.com.coninf.doconline.rest.model.tx.DatoQr;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RequestGenerarQr extends Request {

	private static final long serialVersionUID = 1L;
	public static final String SERVICIO = "/generar/qr";
	
	private DatoQr datoQr;
	
}