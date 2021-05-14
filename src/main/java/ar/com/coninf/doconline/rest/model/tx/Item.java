package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class Item implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private String codigo;
	private String ds;
	private BigDecimal qty;
	private Integer umed;
	private BigDecimal precio;
	private BigDecimal impTotal;
	private BigDecimal bonif;

}