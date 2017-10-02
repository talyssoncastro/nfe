package com.fincatto.documentofiscal.cte300.classes.nota;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.StringValidador;

/**
 * @author Caio
 * @info Informações do Expedidor da Carga
 * */

@Root(name = "exped")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoExpedidorCarga extends DFBase {

	@Element(name = "CNPJ", required = false)
    private String cnpj;
	
	@Element(name = "CPF", required = false)
    private String cpf;
	
	@Element(name = "IE", required = false)
    private String inscricaoEstadual;
	
	@Element(name = "xNome", required = true)
    private String razaoSocial;
	
	@Element(name = "fone", required = false)
    private String telefone;
	
	@Element(name = "enderExped", required = true)
    private CTNotaEndereco endereco;
	
	@Element(name = "email", required = false)
    private String email;

	public CTeNotaInfoExpedidorCarga() {
		this.cnpj = null;
		this.cpf = null;
		this.inscricaoEstadual = null;
		this.razaoSocial = null;
		this.telefone = null;
		this.endereco = null;
		this.email = null;
	}

	public String getCnpj() {
		return cnpj;
	}

	/**
	 * Número do CNPJ<br>
	 * Em caso de empresa não estabelecida no Brasil, será informado o CNPJ com zeros. Informar os zeros não significativos.
	 * */
	public void setCnpj(String cnpj) {
		StringValidador.cnpj(cnpj);
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	/**
	 * Número do CPF<br>
	 * Informar os zeros não significativos.
	 * */
	public void setCpf(String cpf) {
		StringValidador.cpf(cpf);
		this.cpf = cpf;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	/**
	 * Inscrição Estadual<br>
	 * Informar a IE do expedidor ou ISENTO se expedidor é contribuinte do ICMS isento de inscrição no cadastro de contribuintes do ICMS. 
	 * Caso o expedidor não seja contribuinte do ICMS não informar a tag.
	 * */
	public void setInscricaoEstadual(String inscricaoEstadual) {
		StringValidador.inscricaoEstadual(inscricaoEstadual);
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * Razão Social ou Nome
	 * */
	public void setRazaoSocial(String razaoSocial) {
		StringValidador.tamanho2ate60(razaoSocial, "Razão Social ou Nome");
		this.razaoSocial = razaoSocial;
	}

	public String getTelefone() {
		return telefone;
	}

	/**
	 * Telefone
	 * */
	public void setTelefone(String telefone) {
		StringValidador.telefone(telefone);
		this.telefone = telefone;
	}

	public CTNotaEndereco getEndereco() {
		return endereco;
	}

	/**
	 * Dados do endereço
	 * */
	public void setEndereco(CTNotaEndereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	/**
	 * Endereço de email
	 * */
	public void setEmail(String email) {
		StringValidador.tamanho60(email, "Endereço de email");
		this.email = email;
	}
}
