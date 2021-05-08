package ar.com.coninf.doconline.rest.model.response;

public class ResponseConsultarComprobanteExportacion extends Response {

	private static final long serialVersionUID = 1L;
	
	private String excepcionWsaa;

	private String xmlRequest;
	private String xmlResponse;
	private String errMsg;
	private String obs;
	private String excepcionWsfexv1;

	private String cae;
	private String fechaVencimiento;
	private String fechaCbte;
	private String impTotal;
	
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
	
	public String getExcepcionWsfexv1() {
		return excepcionWsfexv1;
	}
	public void setExcepcionWsfexv1(String excepcionWsfexv1) {
		this.excepcionWsfexv1 = excepcionWsfexv1;
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
	public String getFechaCbte() {
		return fechaCbte;
	}
	public void setFechaCbte(String fechaCbte) {
		this.fechaCbte = fechaCbte;
	}
	public String getImpTotal() {
		return impTotal;
	}
	public void setImpTotal(String impTotal) {
		this.impTotal = impTotal;
	}
}
