package endPoint;

import javax.xml.ws.Endpoint;

import servico.CalculadoraImpl;

public class IniciarCalculadora {

	public static void main(String[] args) {
		
		Endpoint.publish(
				"http://localhost:8085/DetonaDevSOAP/Calculadora", 
		new CalculadoraImpl());
		
		System.out.println("Serviço publicado com sucesso");

	}

}
