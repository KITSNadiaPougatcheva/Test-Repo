/**
 * IsRunningSEIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.atg.www.webservices;

public class IsRunningSEIServiceLocator extends org.apache.axis.client.Service implements com.atg.www.webservices.IsRunningSEIService {

    public IsRunningSEIServiceLocator() {
    }


    public IsRunningSEIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IsRunningSEIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IsRunningSEIPort
    private java.lang.String IsRunningSEIPort_address = "http://localhost:8080/isRunning";

    public java.lang.String getIsRunningSEIPortAddress() {
        return IsRunningSEIPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IsRunningSEIPortWSDDServiceName = "IsRunningSEIPort";

    public java.lang.String getIsRunningSEIPortWSDDServiceName() {
        return IsRunningSEIPortWSDDServiceName;
    }

    public void setIsRunningSEIPortWSDDServiceName(java.lang.String name) {
        IsRunningSEIPortWSDDServiceName = name;
    }

    public com.atg.www.webservices.IsRunningSEI getIsRunningSEIPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IsRunningSEIPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIsRunningSEIPort(endpoint);
    }

    public com.atg.www.webservices.IsRunningSEI getIsRunningSEIPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.atg.www.webservices.IsRunningSEIBindingStub _stub = new com.atg.www.webservices.IsRunningSEIBindingStub(portAddress, this);
            _stub.setPortName(getIsRunningSEIPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIsRunningSEIPortEndpointAddress(java.lang.String address) {
        IsRunningSEIPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.atg.www.webservices.IsRunningSEI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.atg.www.webservices.IsRunningSEIBindingStub _stub = new com.atg.www.webservices.IsRunningSEIBindingStub(new java.net.URL(IsRunningSEIPort_address), this);
                _stub.setPortName(getIsRunningSEIPortWSDDServiceName());
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
        if ("IsRunningSEIPort".equals(inputPortName)) {
            return getIsRunningSEIPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.atg.com/webservices", "IsRunningSEIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.atg.com/webservices", "IsRunningSEIPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IsRunningSEIPort".equals(portName)) {
            setIsRunningSEIPortEndpointAddress(address);
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
