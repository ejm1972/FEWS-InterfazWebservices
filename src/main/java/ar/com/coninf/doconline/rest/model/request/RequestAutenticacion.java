package ar.com.coninf.doconline.rest.model.request;


public class RequestAutenticacion extends Request {

	private static final long serialVersionUID = 1L;
	public static final String SERVICIO = "/sesion/login";
	private Integer interfaz;
	private String clave;

	public Integer getInterfaz() {
		return interfaz;
	}

	public void setInterfaz(Integer interfaz) {
		this.interfaz = interfaz;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}