package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class TipoIva implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private Integer ivaId;
	private BigDecimal ivaBaseImp;
	private BigDecimal ivaImporte;

}