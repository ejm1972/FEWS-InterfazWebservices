package ar.com.coninf.doconline.rest.model.enums;

public enum ErrorEnum {

	SIN_ERROR(0, "Operacion realizada con exito"),
	
	ERROR_CAMPO_OBLIGATORIO(10001, "Faltan datos obligatorios."),
	ERROR_FORMATO_INVALIDO(10002, "Formato de campo incorrecto."),
	ERROR_LONGITUD_INVALIDA(10003, "La longitud del campo es invalida."),
	ERROR_RANGO_INVALIDA(10055, "El valor no corresponde a un rango valido."),
	
	ERROR_AUTENTICACION_CLAVE(11020, "La clave es incorrecta."),
	ERROR_INTERFAZ_INVALIDA(11008, "Interfaz invalida."),
	ERROR_INTERFAZ_BLOQUEADA(11024, "Interfaz bloqueada."),
	ERROR_AUTENTICACION_DIFERENCIAS(11023, "Diferencias de datos con la interfaz."),
	ERROR_OPERACION_NO_PERMITIDA(11022, "La interfaz no tiene la operacion permitida."),
	ERROR_PUNTO_DE_VENTA_INVALIDO(11059, "Punto de venta invalido."),	
	ERROR_OPERACION_NO_PERMITIDA_PUNTO_DE_VENTA(11060, "El punto de Venta no tiene la operacion permitida."),
	ERROR_TRANSACCION_REPETIDA(11061, "Se esta enviando el mismo nro de transaccion."),
	
	ERROR_TIPO_TRANSACCION_INEXISTENTE(11049, "Tipo Transaccion inexistente."),
	
	ERROR_CONEXION_WSAA(12057, "Error en la conexion WSAA."),
	ERROR_CONEXION_WSFE(12058, "Error en la conexion WSFE."),
	
	ERROR_SESION(13097, "Ocurrio un error con la sesion."),
	ERROR_CONTROLADO(13098, "La operacion no pudo realizarse con Exito."),
	ERROR_INESPERADO(13099, "Ocurrio un error inesperado."),
	
	ERROR_DIFERENCIA_TOTAL_FACTURA(14001, "Diferencia en la suma de Importes contra Total de Factura."),
	ERROR_PENDIENTE_AUTORIZADO(14002, "Movimiento pendiente ya Autorizado."),
	ERROR_DIFERENCIA_TOTAL_IVA(14003, "Diferencia en la suma de Ivas contra Total de Iva."),
	ERROR_DIFERENCIA_TOTAL_TRIBUTO(14004, "Diferencia en la suma de Tributos contra Total de Tributo."),
	ERROR_DIFERENCIA_TOTAL_ITEMS(14005, "Diferencia en la suma de Items contra Total de Facturas."),
	
	ERROR_ORIGEN_AFIP(15001, "Ocurrio Error en AFIP."),
	ERROR_COMUNICACION_AFIP(15002, "Ocurrio de Comunicacion de AFIP."),

	ERROR_PIN_INVALIDO(6, "Clave invalida."),
	ERROR_CLIENTE_EXISTENTE(4, "Cliente existente."),
	ERROR_CLIENTE_INEXISTENTE(5, "Cliente inexistente."),
	ERROR_SALDO_INSUFICIENTE(7, "Saldo insuficiente."),
	ERROR_TIPO_DOCUMENTO_INVALIDA(9, "Tipo de documento invalido."),
	
	ERROR_SIN_CODIGO_EXTERNO(10, "Falta codigo externo."),
	ERROR_SIN_SEXO(11, "Falta sexo."),
	ERROR_SIN_CELULAR(12, "Falta celular."),
	ERROR_SIN_CUENTA_CORRIENTE(13, "Sin cuenta corriente."),
	
	ERROR_CUENTA_CORRIENTE_EXPIRADA(14, "Cuenta corriente expirada."),
	ERROR_MONEDA_INVALIDA(15, "Moneda invalida."),
	ERROR_TIPO_MOVIMIENTO_INVALIDO(16, "Tipo de movimiento invalido."),
	ERROR_PROVINCIA_INVALIDA(17, "Provincia invalida."),
	
	ERROR_RESERVA_VENCIDA(18, "Reserva vencida."),
	ERROR_RESERVA_RETIRADA(19, "Reserva ya retirada."),
	ERROR_RESERVA_INEXISTENTE(21, "Reserva inexistente."),

	ERROR_PIN_VENCIDO(25, "Clave vencida."),
	ERROR_TIPO_ESTADO_CLIENTE_INVALIDO(26, "Tipo de estado de cliente invalido."),
	ERROR_PIN_NUEVO_INVALIDO(27, "Clave Nueva invalida."),
	ERROR_CLIENTE_BLOQUEADO(28, "Cliente bloqueado."),
	
	ERROR_SIN_PAIS(29, "Falta Pais."),
	ERROR_SIN_ESTADO_CIVIL(30, "Falta Estado Civil."),
	ERROR_SIN_LOCALIDAD(31, "Falta Localidad."),
	
	ERROR_CLIENTE_INHABILITADO(32, "Cliente inhabilitado."),
	ERROR_CANAL_DE_VENTA_INVALIDO(33, "Canal de venta invalido."),	
	
	ERROR_CREDITO_POR_DEVOLUCION_DE_APUESTA_YA_REALIZADO(34, "Credito por devolucion de apuesta ya realizado."),
	ERROR_CREDITO_POR_DEVOLUCION_DE_APUESTA_SIN_PREVIA_APUESTA(35, "Credito por devolucion de apuesta sin previa apuesta."),
	ERROR_DATOS_DE_DEVOLUCION_DE_APUESTA_NO_COINCIDEN_CON_APUESTA(36, "Datos de devolucion de apuesta no coinciden con apuesta."),
	ERROR_NO_SE_ENCONTRO_CTA_CTE_ASOCIADA_CON_APUESTA(37, "No se encontro la cuenta corriente asociada con la apuesta."),
	ERROR_NO_SE_ENCONTRO_USUARIO_ASOCIADO_CON_APUESTA(38, "No se encontro el usuario asociado con la apuesta."),
	
	ERROR_SIN_EMAIL(39, "El cliente no ha registrado email."),
	ERROR_CODIGO_BLANQUEO_INVALIDO(40, "Codigo de blanqueo invalido."),
	ERROR_CANTIDAD_DIARIA_MAXIMA_DE_RESERVAS_SUPERADA(41, "Cantidad diaria maxima de reservas superada"),
	ERROR_MONTO_DIARIO_MAXIMO_EN_RESERVAS_SUPERADO(42, "Monto diario maximo en reservas superado"),
	ERROR_CANTIDAD_MENSUAL_MAXIMA_DE_RESERVAS_SUPERADA(43, "Cantidad mensual maxima de reservas superada"),
	ERROR_MONTO_MENSUAL_MAXIMO_EN_RESERVAS_SUPERADO(44, "Monto mensual maximo en reservas superado"),
	ERROR_CANTIDAD_DIARIA_MAXIMA_DE_RETIROS_DE_DINERO_SUPERADA(45, "Cantidad diaria maxima de retiros de dinero superada"),
	ERROR_MONTO_DIARIO_MAXIMO_EN_RETIROS_DE_DINERO_SUPERADO(46, "Monto diario maximo en retiros de dinero superado"),
	ERROR_CANTIDAD_MENSUAL_MAXIMA_DE_RETIROS_DE_DINERO_SUPERADA(47, "Cantidad mensual maxima de retiros de dinero superada"),
	ERROR_MONTO_MENSUAL_MAXIMO_EN_RETIROS_DE_DINERO_SUPERADO(48, "Monto mensual maximo en retiros de dinero superado"),
	ERROR_DOCUMENTO_EXISTENTE(50, "Documento existente para otro cliente."),
	ERROR_CLIENTE_SIN_MAIL(51, "Cliente sin E-Mail."),
	ERROR_LONGITUD_CLAVE_INCORRECTA(52, "La longitud de la clave es incorrecta."),
	ERROR_FORMATO_CLAVE_INCORRECTO(53, "El formato de la clave es incorrecto."),
	ERROR_CLAVE_REPETIDA(54, "La clave esta repetida."),
	ERROR_OPERACION_NO_PERMITIDA_CANAL_VENTA(56, "El Canal de Venta no tiene la operacion permitida.")
	;
	
	private int cod;
	private String desc;
	
	ErrorEnum(int codigo, String descripcion){
		cod = codigo;
		desc = descripcion;
	}

	public int getCod() {
		return cod;
	}

	public String getDesc() {
		return desc;
	}
	
}
