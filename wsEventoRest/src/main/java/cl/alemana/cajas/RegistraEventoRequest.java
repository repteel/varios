/*
 * Source: RegistraEventoRequest.java - Generated by OBCOM SQL Wizard 1.150
 * Author: Alan Ociel Rodriguez Marianjel (ClÃ­nica Alemana de Santiago)
 *
 * Copyright (c) CLÃ�NICA ALEMANA DE SANTIAGO. All rights reserved.
 * 
 * All  rights  to this product are owned by CLÃ�NICA ALEMANA DE SANTIAGO and may
 * only be used under the terms of its associated license document. You may  NOT
 * copy,  modify,  sublicense,  or distribute this source file or portions of it
 * unless previously authorized in writing by CLÃ�NICA ALEMANA  DE  SANTIAGO.  In
 * any  event,  this notice and above copyright must always be included verbatim
 * with this file.
 */

package cl.alemana.cajas;

import java.math.BigDecimal;

/**
 * Request parameters of procedure {@code PKG_EVENTOS_PPW.REGISTRA_EVENTO}.
 *
 * <pre>
 * P_HODING       NUMBER    Input
 * P_ORIGEN       NUMBER    Input
 * P_TIPOIDENPAC  NUMBER    Input
 * P_IDENPAC      VARCHAR2  Input
 * P_ID_RESERVA   NUMBER    Input
 * P_ID_EVENTO    NUMBER    Input
 * P_LIN_EVENTO   CLOB      Input
 * P_COD_ERROR    NUMBER    Input/Output
 * P_GLOSA_ERROR  VARCHAR2  Input/Output
 * </pre>
 *
 * @author Alan Ociel Rodriguez Marianjel (ClÃ­nica Alemana de Santiago)
 */
public class RegistraEventoRequest {
    
    BigDecimal holding;
    BigDecimal origen;
    BigDecimal tipoIdentificador;
    String identificador;
    BigDecimal idTransaccion;
    BigDecimal idEvento;
    Object data;
    BigDecimal codError;
    String mensaje;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code RegistraEventoRequest} instance.
     */
    public RegistraEventoRequest()
    {
    }

	public BigDecimal getHolding() {
		return holding;
	}

	public void setHolding(BigDecimal holding) {
		this.holding = holding;
	}

	public BigDecimal getOrigen() {
		return origen;
	}

	public void setOrigen(BigDecimal origen) {
		this.origen = origen;
	}

	public BigDecimal getTipoIdentificador() {
		return tipoIdentificador;
	}

	public void setTipoIdentificador(BigDecimal tipoIdentificador) {
		this.tipoIdentificador = tipoIdentificador;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public BigDecimal getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(BigDecimal idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public BigDecimal getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(BigDecimal idEvento) {
		this.idEvento = idEvento;
	}

	public BigDecimal getCodError() {
		return codError;
	}

	public void setCodError(BigDecimal codError) {
		this.codError = codError;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
   
}
