package teste;

import java.rmi.RemoteException;

import servico.Pessoa;
import servico.PessoaServico;
import servico.PessoaServicoProxy;
import servico.RetornoPessoa;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			
			PessoaServico pessoaServico = new PessoaServicoProxy();
			/*
			RetornoPessoa retorno = pessoaServico.buscarPessoa("92692834291");
			
			System.out.println(retorno.getCodigoRetorno() + " - " + retorno.getMsgRetorno());
			System.out.println(retorno.getPessoaRetorno().getNome());
			*/
			
			Pessoa pp = new Pessoa();
			
			pp.setCpf("66134787644");
			pp.setNome("Julio");
			pp.setIdade(18);
			pp.setSexo("M");
			
			RetornoPessoa retorno = pessoaServico.inserirPessoa(pp);
			
			System.out.println(retorno.getCodigoRetorno() + " - " + retorno.getMsgRetorno());
						
		} catch (RemoteException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
