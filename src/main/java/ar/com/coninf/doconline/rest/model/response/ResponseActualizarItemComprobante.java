package ar.com.coninf.doconline.rest.model.response;


public class ResponseActualizarItemComprobante extends Response {

	private static final long serialVersionUID = 1L;
	
	private String excepcionWsaa;

	private String xmlRequest;
	private String xmlResponse;
	private String errMsg;
	private String obs;
	private String excepcionWsfev1;
	
	private String cae;
	private String fechaVencimiento;
	private String resultado;

	public String getXmlRequest() {
		return xmlRequest;
	}
	public void setXmlRequest(String xmlRequest) {
		this.xmlRequest = xmlRequest;
	}
	
	public String getExcepcionWsaa() {
		return excepcionWsaa;
	}
	public void setExcepcionWsaa(String excepcionWsaa) {
		this.excepcionWsaa = excepcionWsaa;
	}
	public String getXmlResponse() {
		return xmlResponse;
	}
	public void setXmlResponse(String xmlResponse) {
		this.xmlResponse = xmlResponse;
	}
	
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	public String getCae() {
		return cae;
	}
	public void setCae(String cae) {
		this.cae = cae;
	}
	
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public String getExcepcionWsfev1() {
		return excepcionWsfev1;
	}
	public void setExcepcionWsfev1(String excepcionWsfev1) {
		this.excepcionWsfev1 = excepcionWsfev1;
	}
}
