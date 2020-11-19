package teste;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import servico.Pessoa;
import servico.PessoaServico;
import servico.PessoaServicoProxy;
import servico.RetornoPessoa;

public class TesteClienteMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			PessoaServico pessoaServico = new PessoaServicoProxy();
			
			boolean condicao = true;
			
			int opcao = 0;
			
			do {
				
				System.out.println("****** Menu ******");
				System.out.println("(1) Cadastrar Pessoa ");
				System.out.println("(2) Buscar Pessoa ");
				System.out.println("(3) Listar todas as pessoas ");
				System.out.println("(4) Sair");
				
				opcao = sc.nextInt();
				
				switch (opcao) {
				
				case (1):
						System.out.println("****** Cadastrar Pessoa ******");
				
						Pessoa pp = new Pessoa();
						
						System.out.println("Insira o CPF da pessoa: ");
						pp.setCpf(sc.next());
						System.out.println("Insira o nome da pessoa: ");
						pp.setNome(sc.next());
						System.out.println("Insira a idade da pessoa: ");
						pp.setIdade(sc.nextInt());
						System.out.println("Insira o sexo da pessoa: ");
						pp.setSexo(sc.next());
						
						RetornoPessoa retorno = pessoaServico.inserirPessoa(pp);
						
						System.out.println(retorno.getCodigoRetorno() + " - " + retorno.getMsgRetorno());
						
						break;
				
				case (2):
						System.out.println("****** Buscar Pessoa ******");
				
						System.out.println("Insira o CPF da pessoa que deseja buscar: ");
						RetornoPessoa retorno2 = pessoaServico.buscarPessoa(sc.next());
						
						System.out.println(retorno2.getCodigoRetorno() + " - " + retorno2.getMsgRetorno());
						System.out.println(retorno2.getPessoaRetorno().getNome());
						
						break;
				
				case (3):
						System.out.println("****** Listar todas as pessoas ******");
				
						RetornoPessoa retorno3 = pessoaServico.recuperarTodos();
						
						if(retorno3.getCodigoRetorno() == 0){
							
							for(Pessoa p : retorno3.getListaRetorno()){
								
								System.out.println("CPF: " + p.getCpf());
								System.out.println("Nome: " + p.getNome());
								System.out.println("Idade: " + p.getIdade());
								System.out.println("Sexo: " + p.getSexo());
								
							}
							
						}
						
						break;
				
				default:
						System.out.println("Obrigado por usar nosso serviço. Volte Sempre!");
						condicao = false;
						break;
				
				}
				
			} while (condicao == true);
			
		} catch (RemoteException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
