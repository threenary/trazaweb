package com.inssjp.mywebservice.business;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.0
 * 2011-12-12T12:34:23.739-03:00
 * Generated source version: 2.5.0
 * 
 */
@WebService(targetNamespace = "http://business.mywebservice.inssjp.com/", name = "IWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface IWebService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sendCancelacTransacc", targetNamespace = "http://business.mywebservice.inssjp.com/", className = "com.inssjp.mywebservice.business.SendCancelacTransacc")
    @WebMethod
    @ResponseWrapper(localName = "sendCancelacTransaccResponse", targetNamespace = "http://business.mywebservice.inssjp.com/", className = "com.inssjp.mywebservice.business.SendCancelacTransaccResponse")
    public com.inssjp.mywebservice.business.WebServiceResult sendCancelacTransacc(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sendMedicamentos", targetNamespace = "http://business.mywebservice.inssjp.com/", className = "com.inssjp.mywebservice.business.SendMedicamentos")
    @WebMethod
    @ResponseWrapper(localName = "sendMedicamentosResponse", targetNamespace = "http://business.mywebservice.inssjp.com/", className = "com.inssjp.mywebservice.business.SendMedicamentosResponse")
    public com.inssjp.mywebservice.business.WebServiceResult sendMedicamentos(
        @WebParam(name = "arg0", targetNamespace = "")
        java.util.List<com.inssjp.mywebservice.business.MedicamentosDTO> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sendMedicamentosDHSerie", targetNamespace = "http://business.mywebservice.inssjp.com/", className = "com.inssjp.mywebservice.business.SendMedicamentosDHSerie")
    @WebMethod
    @ResponseWrapper(localName = "sendMedicamentosDHSerieResponse", targetNamespace = "http://business.mywebservice.inssjp.com/", className = "com.inssjp.mywebservice.business.SendMedicamentosDHSerieResponse")
    public com.inssjp.mywebservice.business.WebServiceResult sendMedicamentosDHSerie(
        @WebParam(name = "arg0", targetNamespace = "")
        java.util.List<com.inssjp.mywebservice.business.MedicamentosDTODHSerie> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );
}
