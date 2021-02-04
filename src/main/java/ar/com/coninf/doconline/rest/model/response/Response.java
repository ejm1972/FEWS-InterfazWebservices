package ar.com.coninf.doconline.rest.model.response;

import ar.com.coninf.doconline.rest.model.enums.ErrorEnum;
import ar.com.coninf.doconline.rest.model.tx.ITransaccionable;

public class Response implements ITransaccionable {
	private static final long serialVersionUID = 7055289016766675431L;
	
	private Integer codigo;
	private String descripcion;
	private String observacion;
	private Boolean esReintento = Boolean.FALSE;
	
	public Response(){
	}
	
	public Response(Response resp){
		codigo = resp.getCodigo();
		descripcion = resp.getDescripcion();
		observacion = resp.getObservacion();
	}
	
	public Response(ErrorEnum error){
		codigo = error.getCod();
		descripcion = error.getDesc();
	}
	
	public Response(ErrorEnum error, String observacion){
		this.codigo = error.getCod();
		this.descripcion = error.getDesc();
		this.observacion = observacion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Boolean getEsReintento() {
		return esReintento;
	}

	public void setEsReintento(Boolean esReintento) {
		this.esReintento = esReintento;
	}

	public void cargarError(Response resp){
		this.codigo = resp.getCodigo();
		this.descripcion = resp.getDescripcion();
		this.observacion = resp.getObservacion();
	}
}
