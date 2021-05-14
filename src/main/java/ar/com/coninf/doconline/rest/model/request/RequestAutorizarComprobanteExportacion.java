package ar.com.coninf.doconline.rest.model.request;

import ar.com.coninf.doconline.rest.model.tx.Item;
import ar.com.coninf.doconline.rest.model.tx.Permiso;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RequestAutorizarComprobanteExportacion extends RequestAutorizarComprobante {
	private static final long serialVersionUID = 1L;
	public static final String SERVICIO = "/autorizar/comprobante/exportacion";
	
	private Integer tipoExpo;
	private String permisoExistente;
	private Integer dstCmp;
	private String cliente;
	private String cuitPaisCliente;
	private String domicilioCliente;
	private String idImpositivo;
	private String obsComerciales;
	private String obsGenerales;
	private String formaPago;
	private String incoterms;
	private String incotermsDs;
	private String idiomaCbte;
	private Permiso[] permisos;
	private Item[] items;

}