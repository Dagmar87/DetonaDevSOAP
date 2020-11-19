package endPoint;

import javax.xml.ws.Endpoint;

import servico.PessoaServicoImpl;

public class IniciarPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endpoint.publish("http://localhost:8086/DetonaDevSOAP/Pessoa", new PessoaServicoImpl());
		
		System.out.println("Serviço publicado com sucesso");

	}

}
