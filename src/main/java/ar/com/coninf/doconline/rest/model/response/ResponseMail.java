package ar.com.coninf.doconline.rest.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ResponseMail  {

	private Integer code = 0;
	private String message = "OK";
	private boolean result;

}
