package servico;

import javax.jws.WebService;

import entidade.RetornoCalculadora;

@WebService(endpointInterface = "servico.Calculadora")
public class CalculadoraImpl implements Calculadora{

	@Override
	public RetornoCalculadora somar(double valor1, double valor2) {
		RetornoCalculadora retorno = new RetornoCalculadora();
		
		retorno.setCodigoRetorno(0);
		retorno.setMsgRetorno("Sucesso");
		retorno.setResultado(valor1 + valor2);
		
		return retorno;
	}

	@Override
	public RetornoCalculadora subtrair(double valor1, double valor2) {
		RetornoCalculadora retorno = new RetornoCalculadora();
		
		retorno.setCodigoRetorno(0);
		retorno.setMsgRetorno("Sucesso");
		retorno.setResultado(valor1 - valor2);
		
		return retorno;
	}

	@Override
	public RetornoCalculadora multiplicar(double valor1, double valor2) {
		RetornoCalculadora retorno = new RetornoCalculadora();
		
		retorno.setCodigoRetorno(0);
		retorno.setMsgRetorno("Sucesso");
		retorno.setResultado(valor1 * valor2);
		
		return retorno;
	}

	@Override
	public RetornoCalculadora dividir(double valor1, double valor2) {
		
		RetornoCalculadora retorno = new RetornoCalculadora();
				
		if(valor2 == 0) {
			retorno.setCodigoRetorno(1);
			retorno.setMsgRetorno("Erro: Não pode dividir por ZERO!");			
		}else {
			retorno.setCodigoRetorno(0);
			retorno.setMsgRetorno("Sucesso");
			retorno.setResultado(valor1 / valor2); 
		}
		
		return retorno;
	}

}
