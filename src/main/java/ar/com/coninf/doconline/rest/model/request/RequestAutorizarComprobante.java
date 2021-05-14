package ar.com.coninf.doconline.rest.model.request;

import java.math.BigDecimal;

import ar.com.coninf.doconline.rest.model.tx.ComprobanteAsociado;
import ar.com.coninf.doconline.rest.model.tx.DatoOpcional;
import ar.com.coninf.doconline.rest.model.tx.Iva;
import ar.com.coninf.doconline.rest.model.tx.PeriodoComprobanteAsociado;
import ar.com.coninf.doconline.rest.model.tx.Tributo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RequestAutorizarComprobante extends Request {
	private static final long serialVersionUID = 1L;
	public static final String SERVICIO = "/autorizar/comprobante";
	
	private String cuit;
	private Integer concepto;
	private Integer tipoDoc;
	private Long nroDoc;
	private Integer tipoCbte;
	private Integer ptoVta;
	private Long nroCbte;
	private BigDecimal impTotal;
	private BigDecimal impTotConcNoGrav;
	private BigDecimal impNeto;
	private BigDecimal impIva;
	private BigDecimal impTrib;
	private BigDecimal impOpEx; 
	private String fechaCbte;
	private String fechaVencPago;
	private String fechaServDesde;
	private String fechaServHasta;
	private String monedaId;
	private BigDecimal monedaCtz;
	private Tributo[] tributos;
	private Iva[] ivas;
	private ComprobanteAsociado[] comprobantesAsociados;
	private DatoOpcional[] datosOpcionales;
	private PeriodoComprobanteAsociado[] periodoComprobanteAsociados;
	
}