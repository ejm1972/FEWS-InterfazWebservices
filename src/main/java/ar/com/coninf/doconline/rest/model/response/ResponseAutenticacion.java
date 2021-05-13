package ar.com.coninf.doconline.rest.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ResponseAutenticacion extends Response {
	private static final long serialVersionUID = 6972882169015807372L;

	private String idSesion;

}
