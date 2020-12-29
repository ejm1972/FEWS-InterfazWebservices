package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;

public class DatoOpcional implements Serializable {
	private static final long serialVersionUID = 5244484866071825026L;
	
	private Integer opcionalId;
	private String valor;

	public Integer getOpcionalId() {
		return opcionalId;
	}
	public void setOpcionalId(Integer opcionalId) {
		this.opcionalId = opcionalId;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
}