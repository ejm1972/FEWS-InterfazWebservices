package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;
import java.math.BigDecimal;

public class Tributo implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private Integer tributoId;
	private String tributoDesc;
	private BigDecimal tributoBaseImp;
	private BigDecimal tributoAlic;
	private BigDecimal tributoImporte;

	public Integer getTributoId() {
		return tributoId;
	}
	public void setTributoId(Integer tributoId) {
		this.tributoId = tributoId;
	}
	public String getTributoDesc() {
		return tributoDesc;
	}
	public void setTributoDesc(String tributoDesc) {
		this.tributoDesc = tributoDesc;
	}
	public BigDecimal getTributoBaseImp() {
		return tributoBaseImp;
	}
	public void setTributoBaseImp(BigDecimal tributoBaseImp) {
		this.tributoBaseImp = tributoBaseImp;
	}
	public BigDecimal getTributoAlic() {
		return tributoAlic;
	}
	public void setTributoAlic(BigDecimal tributoAlic) {
		this.tributoAlic = tributoAlic;
	}
	public BigDecimal getTributoImporte() {
		return tributoImporte;
	}
	public void setTributoImporte(BigDecimal tributoImporte) {
		this.tributoImporte = tributoImporte;
	}
}