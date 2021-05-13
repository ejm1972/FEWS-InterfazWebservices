package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class TipoTributo implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private Integer tributoId;
	private String tributoDesc;
	private BigDecimal tributoBaseImp;
	private BigDecimal tributoAlic;
	private BigDecimal tributoImporte;

}