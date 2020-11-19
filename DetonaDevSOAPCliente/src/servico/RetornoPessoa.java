/**
 * RetornoPessoa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servico;

public class RetornoPessoa  implements java.io.Serializable {
    private int codigoRetorno;

    private servico.Pessoa[] listaRetorno;

    private java.lang.String msgRetorno;

    private servico.Pessoa pessoaRetorno;

    public RetornoPessoa() {
    }

    public RetornoPessoa(
           int codigoRetorno,
           servico.Pessoa[] listaRetorno,
           java.lang.String msgRetorno,
           servico.Pessoa pessoaRetorno) {
           this.codigoRetorno = codigoRetorno;
           this.listaRetorno = listaRetorno;
           this.msgRetorno = msgRetorno;
           this.pessoaRetorno = pessoaRetorno;
    }


    /**
     * Gets the codigoRetorno value for this RetornoPessoa.
     * 
     * @return codigoRetorno
     */
    public int getCodigoRetorno() {
        return codigoRetorno;
    }


    /**
     * Sets the codigoRetorno value for this RetornoPessoa.
     * 
     * @param codigoRetorno
     */
    public void setCodigoRetorno(int codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }


    /**
     * Gets the listaRetorno value for this RetornoPessoa.
     * 
     * @return listaRetorno
     */
    public servico.Pessoa[] getListaRetorno() {
        return listaRetorno;
    }


    /**
     * Sets the listaRetorno value for this RetornoPessoa.
     * 
     * @param listaRetorno
     */
    public void setListaRetorno(servico.Pessoa[] listaRetorno) {
        this.listaRetorno = listaRetorno;
    }

    public servico.Pessoa getListaRetorno(int i) {
        return this.listaRetorno[i];
    }

    public void setListaRetorno(int i, servico.Pessoa _value) {
        this.listaRetorno[i] = _value;
    }


    /**
     * Gets the msgRetorno value for this RetornoPessoa.
     * 
     * @return msgRetorno
     */
    public java.lang.String getMsgRetorno() {
        return msgRetorno;
    }


    /**
     * Sets the msgRetorno value for this RetornoPessoa.
     * 
     * @param msgRetorno
     */
    public void setMsgRetorno(java.lang.String msgRetorno) {
        this.msgRetorno = msgRetorno;
    }


    /**
     * Gets the pessoaRetorno value for this RetornoPessoa.
     * 
     * @return pessoaRetorno
     */
    public servico.Pessoa getPessoaRetorno() {
        return pessoaRetorno;
    }


    /**
     * Sets the pessoaRetorno value for this RetornoPessoa.
     * 
     * @param pessoaRetorno
     */
    public void setPessoaRetorno(servico.Pessoa pessoaRetorno) {
        this.pessoaRetorno = pessoaRetorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoPessoa)) return false;
        RetornoPessoa other = (RetornoPessoa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigoRetorno == other.getCodigoRetorno() &&
            ((this.listaRetorno==null && other.getListaRetorno()==null) || 
             (this.listaRetorno!=null &&
              java.util.Arrays.equals(this.listaRetorno, other.getListaRetorno()))) &&
            ((this.msgRetorno==null && other.getMsgRetorno()==null) || 
             (this.msgRetorno!=null &&
              this.msgRetorno.equals(other.getMsgRetorno()))) &&
            ((this.pessoaRetorno==null && other.getPessoaRetorno()==null) || 
             (this.pessoaRetorno!=null &&
              this.pessoaRetorno.equals(other.getPessoaRetorno())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCodigoRetorno();
        if (getListaRetorno() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaRetorno());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaRetorno(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMsgRetorno() != null) {
            _hashCode += getMsgRetorno().hashCode();
        }
        if (getPessoaRetorno() != null) {
            _hashCode += getPessoaRetorno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoPessoa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servico/", "retornoPessoa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servico/", "pessoa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msgRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pessoaRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pessoaRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servico/", "pessoa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
