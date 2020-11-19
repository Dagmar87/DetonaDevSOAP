/**
 * PessoaServicoImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servico;

public class PessoaServicoImplServiceLocator extends org.apache.axis.client.Service implements servico.PessoaServicoImplService {

    public PessoaServicoImplServiceLocator() {
    }


    public PessoaServicoImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PessoaServicoImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PessoaServicoImplPort
    private java.lang.String PessoaServicoImplPort_address = "http://localhost:8086/DetonaDevSOAP/Pessoa";

    public java.lang.String getPessoaServicoImplPortAddress() {
        return PessoaServicoImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PessoaServicoImplPortWSDDServiceName = "PessoaServicoImplPort";

    public java.lang.String getPessoaServicoImplPortWSDDServiceName() {
        return PessoaServicoImplPortWSDDServiceName;
    }

    public void setPessoaServicoImplPortWSDDServiceName(java.lang.String name) {
        PessoaServicoImplPortWSDDServiceName = name;
    }

    public servico.PessoaServico getPessoaServicoImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PessoaServicoImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPessoaServicoImplPort(endpoint);
    }

    public servico.PessoaServico getPessoaServicoImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            servico.PessoaServicoImplPortBindingStub _stub = new servico.PessoaServicoImplPortBindingStub(portAddress, this);
            _stub.setPortName(getPessoaServicoImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPessoaServicoImplPortEndpointAddress(java.lang.String address) {
        PessoaServicoImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (servico.PessoaServico.class.isAssignableFrom(serviceEndpointInterface)) {
                servico.PessoaServicoImplPortBindingStub _stub = new servico.PessoaServicoImplPortBindingStub(new java.net.URL(PessoaServicoImplPort_address), this);
                _stub.setPortName(getPessoaServicoImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PessoaServicoImplPort".equals(inputPortName)) {
            return getPessoaServicoImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servico/", "PessoaServicoImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servico/", "PessoaServicoImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PessoaServicoImplPort".equals(portName)) {
            setPessoaServicoImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
