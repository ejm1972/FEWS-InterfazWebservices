package ar.com.coninf.doconline.rest.model.request;

import ar.com.coninf.doconline.rest.model.tx.Permiso;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RequestAutorizarComprobanteExportacion extends RequestAutorizarComprobante {
	private static final long serialVersionUID = 1L;
	public static final String SERVICIO = "/autorizar/comprobante/exportacion";
	
//	private Integer tipoExpo;
//	permisoExistente
//	dstCmp
//	idImpositivo
//	obsComerciales
//	obs
//	formaPago
//	incoterms
//	incoterms_ds
//	idioma_cbte
//	private Permiso[] permisos;
//	private Item[] items;

}