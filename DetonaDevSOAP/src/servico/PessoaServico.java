package servico;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import entidade.Pessoa;
import entidade.RetornoPessoa;

@WebService
@SOAPBinding(style = Style.RPC)
public interface PessoaServico {
	
	@WebMethod
	public RetornoPessoa inserirPessoa(Pessoa pessoa);
	@WebMethod
	public RetornoPessoa buscarPessoa(String cpf);
	@WebMethod
	public RetornoPessoa recuperarTodos();
	
}
