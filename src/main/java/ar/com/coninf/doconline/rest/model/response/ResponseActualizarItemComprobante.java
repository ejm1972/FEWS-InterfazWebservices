package ar.com.coninf.doconline.rest.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ResponseActualizarItemComprobante extends Response {
	private static final long serialVersionUID = 1L;
	
	private String excepcionWsaa;

	private String xmlRequest;
	private String xmlResponse;
	private String errMsg;
	private String obs;
	private String excepcionWsfev1;
	
	private String cae;
	private String fechaVencimiento;
	private String resultado;
	
}
