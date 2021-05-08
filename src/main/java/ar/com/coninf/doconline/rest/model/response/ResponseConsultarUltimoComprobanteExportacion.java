package ar.com.coninf.doconline.rest.model.response;


public class ResponseConsultarUltimoComprobanteExportacion extends Response {

	private static final long serialVersionUID = 1L;
	
	private String excepcionWsaa;

	private String xmlRequest;
	private String xmlResponse;
	private String excepcionWsfexv1;
	private String errMsg;
	private String obs;

	private String ultimoComprobante;
	
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
	
	public String getUltimoComprobante() {
		return ultimoComprobante;
	}
	public void setUltimoComprobante(String ultimoComprobante) {
		this.ultimoComprobante = ultimoComprobante;
	}

	public String getExcepcionWsfexv1() {
		return excepcionWsfexv1;
	}
	public void setExcepcionWsfexv1(String excepcionWsfexv1) {
		this.excepcionWsfexv1 = excepcionWsfexv1;
	}
}
