package com.fincatto.documentofiscal.cte300.classes.nota;

import java.util.List;

import org.joda.time.LocalDate;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.StringValidador;

/**
 * @author Caio
 * @Info Informações das NF-e
 * */

@Root(name = "infNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalInfoDocumentosInfoNFe extends DFBase {

	@Element(name = "chave", required = true)
    private String chave;
	
	@Element(name = "PIN", required = false)
    private String pinSUFRAMA;
	
	@Element(name = "dPrev", required = false)
    private LocalDate dataPrevistaEntrega;
	
	@Element(name = "infUnidCarga", required = false)
    private List<CTeNotaInfoCTeNormalInfoDocumentosInfoUnidadeCarga> infoUnidCarga;
	
	@Element(name = "infUnidTransp", required = false)
    private List<CTeNotaInfoCTeNormalInfoDocumentosInfoUnidadeTransporte> infoUnidTransporte;

	public CTeNotaInfoCTeNormalInfoDocumentosInfoNFe() {
		this.chave = null;
		this.pinSUFRAMA = null;
		this.dataPrevistaEntrega = null;
		this.infoUnidCarga = null;
		this.infoUnidTransporte = null;
	}

	public String getChave() {
		return chave;
	}

	/**
	 * Chave de acesso da NF-e
	 * */
	public void setChave(String chave) {
		StringValidador.exatamente44N(chave, "Chave de acesso da NF-e");
		this.chave = chave;
	}

	public String getPinSUFRAMA() {
		return pinSUFRAMA;
	}

	/**
	 * PIN SUFRAMA<br>
	 * PIN atribuído pela SUFRAMA para a operação.
	 * */
	public void setPinSUFRAMA(String pinSUFRAMA) {
		StringValidador.tamanho2a9N(pinSUFRAMA, "PIN SUFRAMA");
		this.pinSUFRAMA = pinSUFRAMA;
	}

	public LocalDate getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}

	/**
	 * Data prevista de entrega<br>
	 * Formato AAAA-MM-DD
	 * */
	public void setDataPrevistaEntrega(LocalDate dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}

	public List<CTeNotaInfoCTeNormalInfoDocumentosInfoUnidadeCarga> getInfoUnidCarga() {
		return infoUnidCarga;
	}

	/**
	 * Informações das Unidades de Carga (Containeres/ULD/Outros)<br>
	 * Dispositivo de carga utilizada (Unit Load Device - ULD) significa todo tipo de contêiner de carga, vagão, contêiner de avião, 
	 * palete de aeronave com rede ou palete de aeronave com rede sobre um iglu.
	 * */
	public void setInfoUnidCarga(List<CTeNotaInfoCTeNormalInfoDocumentosInfoUnidadeCarga> infoUnidCarga) {
		this.infoUnidCarga = infoUnidCarga;
	}

	public List<CTeNotaInfoCTeNormalInfoDocumentosInfoUnidadeTransporte> getInfoUnidTransp() {
		return infoUnidTransporte;
	}

	/**
	 * Informações das Unidades de Transporte (Carreta/Reboque/Vagão)<br>
	 * Deve ser preenchido com as informações das unidades de transporte utilizadas.
	 * */
	public void setInfoUnidTransp(List<CTeNotaInfoCTeNormalInfoDocumentosInfoUnidadeTransporte> infoUnidTransp) {
		this.infoUnidTransporte = infoUnidTransp;
	}
}
