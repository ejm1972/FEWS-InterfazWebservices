package ar.com.coninf.doconline.rest.model.request;

import java.io.Serializable;

import ar.com.coninf.doconline.rest.model.tx.ControlTransaccion;
import lombok.Data;

@Data
public class Request implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ControlTransaccion controlTransaccion;
	
}
