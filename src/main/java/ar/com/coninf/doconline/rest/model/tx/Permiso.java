package ar.com.coninf.doconline.rest.model.tx;

import java.io.Serializable;

import lombok.Data;

@Data
public class Permiso implements Serializable {
	private static final long serialVersionUID = 6292207355864210589L;

	private String idPermiso;
	private Integer dstMerc;
	
}