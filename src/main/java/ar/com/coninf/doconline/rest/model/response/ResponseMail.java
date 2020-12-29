package ar.com.coninf.doconline.rest.model.response;


public class ResponseMail  {

	private Integer code = 0;
	private String message = "OK";
	private boolean result;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}

}
