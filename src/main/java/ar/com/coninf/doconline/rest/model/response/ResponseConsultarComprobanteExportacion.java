package ar.com.coninf.doconline.rest.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ResponseConsultarComprobanteExportacion extends ResponseAfip {
	private static final long serialVersionUID = 1L;
	
	private String excepcionWsfexv1;

	private String cae;
	private String fechaVencimiento;
	private String fechaCbte;
	private String impTotal;
	
}
