package ar.com.coninf.doconline.rest.model.request;

import java.math.BigDecimal;

import ar.com.coninf.doconline.rest.model.tx.ComprobanteAsociado;
import ar.com.coninf.doconline.rest.model.tx.DatoOpcional;
import ar.com.coninf.doconline.rest.model.tx.Iva;
import ar.com.coninf.doconline.rest.model.tx.PeriodoComprobanteAsociado;
import ar.com.coninf.doconline.rest.model.tx.Tributo;

public class RequestAutorizarComprobanteExportacion extends Request {

	private static final long serialVersionUID = 1L;
	public static final String SERVICIO = "/autorizar/comprobante/exportacion";
	
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
	
	//tributo_id=4 						--> Id de la tablas de AFIP
	//tributo_desc="Impuestos internos"	--> Desc de la Tabla de AFIP 
	//tributo_base_imp=100.00
	//tributo_alic=1.00
	//tributo_importe=1.00
	//{"tributo_id":"4", "tributo_desc":"Impuestos internos", "tributo_base_imp":"100.00", "tributo_alic":"1.00", "tributo_importe":"1.00"}" --> JSON

	//iva_id=5 				--> Id de la tabla de AFIP
	//iva_base_imp=100.00
	//iva_importe=21.00 	--> Alicuota de la tabla de AFIP
	//{"iva_id":"5", "iva_base_imp":"100.00", "iva_importe":"21.00"} --> JSON

	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	public Integer getConcepto() {
		return concepto;
	}
	public void setConcepto(Integer concepto) {
		this.concepto = concepto;
	}
	public Integer getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(Integer tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public Long getNroDoc() {
		return nroDoc;
	}
	public void setNroDoc(Long nroDoc) {
		this.nroDoc = nroDoc;
	}
	public Integer getTipoCbte() {
		return tipoCbte;
	}
	public void setTipoCbte(Integer tipoCbte) {
		this.tipoCbte = tipoCbte;
	}
	public Integer getPtoVta() {
		return ptoVta;
	}
	public void setPtoVta(Integer ptoVta) {
		this.ptoVta = ptoVta;
	}
	public Long getNroCbte() {
		return nroCbte;
	}
	public void setNroCbte(Long nroCbte) {
		this.nroCbte = nroCbte;
	}
	public BigDecimal getImpTotal() {
		return impTotal;
	}
	public void setImpTotal(BigDecimal impTotal) {
		this.impTotal = impTotal;
	}
	public BigDecimal getImpTotConcNoGrav() {
		return impTotConcNoGrav;
	}
	public void setImpTotConcNoGrav(BigDecimal impTotConcNoGrav) {
		this.impTotConcNoGrav = impTotConcNoGrav;
	}
	public BigDecimal getImpNeto() {
		return impNeto;
	}
	public void setImpNeto(BigDecimal impNeto) {
		this.impNeto = impNeto;
	}
	public BigDecimal getImpIva() {
		return impIva;
	}
	public void setImpIva(BigDecimal impIva) {
		this.impIva = impIva;
	}
	public BigDecimal getImpTrib() {
		return impTrib;
	}
	public void setImpTrib(BigDecimal impTrib) {
		this.impTrib = impTrib;
	}
	public BigDecimal getImpOpEx() {
		return impOpEx;
	}
	public void setImpOpEx(BigDecimal impOpEx) {
		this.impOpEx = impOpEx;
	}
	public String getFechaCbte() {
		return fechaCbte;
	}
	public void setFechaCbte(String fechaCbte) {
		this.fechaCbte = fechaCbte;
	}
	public String getFechaVencPago() {
		return fechaVencPago;
	}
	public void setFechaVencPago(String fechaVencPago) {
		this.fechaVencPago = fechaVencPago;
	}
	public String getFechaServDesde() {
		return fechaServDesde;
	}
	public void setFechaServDesde(String fechaServDesde) {
		this.fechaServDesde = fechaServDesde;
	}
	public String getFechaServHasta() {
		return fechaServHasta;
	}
	public void setFechaServHasta(String fechaServHasta) {
		this.fechaServHasta = fechaServHasta;
	}
	public String getMonedaId() {
		return monedaId;
	}
	public void setMonedaId(String monedaId) {
		this.monedaId = monedaId;
	}
	public BigDecimal getMonedaCtz() {
		return monedaCtz;
	}
	public void setMonedaCtz(BigDecimal monedaCtz) {
		this.monedaCtz = monedaCtz;
	}
	
	public Tributo[] getTributos() {
		return tributos;
	}
	public void setTributos(Tributo[] tributos) {
		this.tributos = tributos;
	}
	
	public Iva[] getIvas() {
		return ivas;
	}
	public void setIvas(Iva[] ivas) {
		this.ivas = ivas;
	}
	
	public ComprobanteAsociado[] getComprobantesAsociados() {
		return comprobantesAsociados;
	}
	public void setComprobantesAsociados(ComprobanteAsociado[] comprobantesAsociados) {
		this.comprobantesAsociados = comprobantesAsociados;
	}
	
	public DatoOpcional[] getDatosOpcionales() {
		return datosOpcionales;
	}
	public void setDatosOpcionales(DatoOpcional[] datosOpcionales) {
		this.datosOpcionales = datosOpcionales;
	}
	
	public PeriodoComprobanteAsociado[] getPeriodoComprobanteAsociados() {
		return periodoComprobanteAsociados;
	}
	public void setPeriodoComprobanteAsociados(PeriodoComprobanteAsociado[] periodoComprobanteAsociados) {
		this.periodoComprobanteAsociados = periodoComprobanteAsociados;
	}
}