package entidade;

import java.util.List;

public class RetornoPessoa {
	
	private int codigoRetorno; // 0 - sucesso / 1 - erro
	private String msgRetorno;
	
	private Pessoa pessoaRetorno;
	private List<Pessoa> listaRetorno;
	
	public int getCodigoRetorno() {
		return codigoRetorno;
	}
	
	public void setCodigoRetorno(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	
	public Pessoa getPessoaRetorno() {
		return pessoaRetorno;
	}
	
	public void setPessoaRetorno(Pessoa pessoaRetorno) {
		this.pessoaRetorno = pessoaRetorno;
	}

	public List<Pessoa> getListaRetorno() {
		return listaRetorno;
	}

	public void setListaRetorno(List<Pessoa> listaRetorno) {
		this.listaRetorno = listaRetorno;
	}

	public String getMsgRetorno() {
		return msgRetorno;
	}

	public void setMsgRetorno(String msgRetorno) {
		this.msgRetorno = msgRetorno;
	}
	
}
