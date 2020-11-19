package servico;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import entidade.Pessoa;
import entidade.RetornoPessoa;

@WebService(endpointInterface = "servico.PessoaServico")
public class PessoaServicoImpl implements PessoaServico{
	
	private List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	@Override
	public RetornoPessoa inserirPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
		RetornoPessoa retorno = new RetornoPessoa();
		
		retorno.setCodigoRetorno(0);
		retorno.setMsgRetorno("Pessoa inserida com sucesso!");
		
		Pessoa existe = null;
		
		for(Pessoa p: listaPessoas){
			
			if(p.getCpf().equals(pessoa.getCpf())){
				
				existe = p;
				
			}
			
		}
		
		if(existe == null) {
			
			listaPessoas.add(pessoa);
			
		} else {
			
			retorno.setCodigoRetorno(1);
			retorno.setMsgRetorno("FALHA: Já existe pessoa com CPF!!!");
			
		}
		
		return retorno;
	}
	
	@Override
	public RetornoPessoa buscarPessoa(String cpf) {
		// TODO Auto-generated method stub
		
		RetornoPessoa retorno = new RetornoPessoa();
		
		retorno.setCodigoRetorno(0);
		retorno.setMsgRetorno("Sucesso!");
		
		for(Pessoa pessoa: listaPessoas){
			
			if(pessoa.getCpf().equals(cpf)){
				
				retorno.setPessoaRetorno(pessoa);
				
			}
			
		}
				
		return retorno;
	}

	@Override
	public RetornoPessoa recuperarTodos() {
		// TODO Auto-generated method stub
		
		RetornoPessoa retorno = new RetornoPessoa();
		
		retorno.setCodigoRetorno(0);
		retorno.setMsgRetorno("Sucesso!");
		retorno.setListaRetorno(this.listaPessoas);
		
		return retorno;
	}

}
