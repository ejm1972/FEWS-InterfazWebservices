package ar.com.coninf.doconline.rest.model.response;


public class ResponseAutenticacion extends Response {

	private static final long serialVersionUID = 6972882169015807372L;
	private String idSesion;

	public String getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}
	
}
