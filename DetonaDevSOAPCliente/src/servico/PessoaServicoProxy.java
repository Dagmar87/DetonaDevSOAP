package servico;

public class PessoaServicoProxy implements servico.PessoaServico {
  private String _endpoint = null;
  private servico.PessoaServico pessoaServico = null;
  
  public PessoaServicoProxy() {
    _initPessoaServicoProxy();
  }
  
  public PessoaServicoProxy(String endpoint) {
    _endpoint = endpoint;
    _initPessoaServicoProxy();
  }
  
  private void _initPessoaServicoProxy() {
    try {
      pessoaServico = (new servico.PessoaServicoImplServiceLocator()).getPessoaServicoImplPort();
      if (pessoaServico != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pessoaServico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pessoaServico)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pessoaServico != null)
      ((javax.xml.rpc.Stub)pessoaServico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servico.PessoaServico getPessoaServico() {
    if (pessoaServico == null)
      _initPessoaServicoProxy();
    return pessoaServico;
  }
  
  public servico.RetornoPessoa inserirPessoa(servico.Pessoa arg0) throws java.rmi.RemoteException{
    if (pessoaServico == null)
      _initPessoaServicoProxy();
    return pessoaServico.inserirPessoa(arg0);
  }
  
  public servico.RetornoPessoa buscarPessoa(java.lang.String arg0) throws java.rmi.RemoteException{
    if (pessoaServico == null)
      _initPessoaServicoProxy();
    return pessoaServico.buscarPessoa(arg0);
  }
  
  public servico.RetornoPessoa recuperarTodos() throws java.rmi.RemoteException{
    if (pessoaServico == null)
      _initPessoaServicoProxy();
    return pessoaServico.recuperarTodos();
  }
  
  
}