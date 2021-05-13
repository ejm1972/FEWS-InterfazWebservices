package ar.com.coninf.doconline.rest.model.request;

import lombok.Data;

@Data
public class RequestMail {

	private String usuario;
	private String subject;
	private String text;

}
