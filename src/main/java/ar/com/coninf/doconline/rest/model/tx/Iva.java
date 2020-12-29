package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;
import java.math.BigDecimal;

public class Iva implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private Integer ivaId;
	private BigDecimal ivaBaseImp;
	private BigDecimal ivaImporte;

	public Integer getIvaId() {
		return ivaId;
	}
	public void setIvaId(Integer ivaId) {
		this.ivaId = ivaId;
	}
	public BigDecimal getIvaBaseImp() {
		return ivaBaseImp;
	}
	public void setIvaBaseImp(BigDecimal ivaBaseImp) {
		this.ivaBaseImp = ivaBaseImp;
	}
	public BigDecimal getIvaImporte() {
		return ivaImporte;
	}
	public void setIvaImporte(BigDecimal ivaImporte) {
		this.ivaImporte = ivaImporte;
	}
}