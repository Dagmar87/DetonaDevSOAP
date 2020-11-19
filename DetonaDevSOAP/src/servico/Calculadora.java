package servico;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import entidade.RetornoCalculadora;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Calculadora {

	@WebMethod
	public RetornoCalculadora somar(double valor1, double valor2);
	@WebMethod
	public RetornoCalculadora subtrair(double valor1, double valor2);
	@WebMethod
	public RetornoCalculadora multiplicar(double valor1, double valor2);
	@WebMethod
	public RetornoCalculadora dividir(double valor1, double valor2);
}
