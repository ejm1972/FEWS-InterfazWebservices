package ar.com.coninf.doconline.rest.model.request;


public class RequestConsultarComprobante extends Request {

	private static final long serialVersionUID = 1L;
	public static final String SERVICIO = "/consultar/comprobante";
	
	private String cuit;
	private Integer tipoCbte;
	private Integer ptoVta;
	private Integer cbte;
	
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	public Integer getTipoCbte() {
		return tipoCbte;
	}
	public void setTipoCbte(Integer tipoCbte) {
		this.tipoCbte = tipoCbte;
	}
	public Integer getPtoVta() {
		return ptoVta;
	}
	public void setPtoVta(Integer ptoVta) {
		this.ptoVta = ptoVta;
	}
	public Integer getCbte() {
		return cbte;
	}
	public void setCbte(Integer cbte) {
		this.cbte = cbte;
	}
}