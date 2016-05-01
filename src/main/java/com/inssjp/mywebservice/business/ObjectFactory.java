
package com.inssjp.mywebservice.business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inssjp.mywebservice.business package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendCancelacTransaccResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendCancelacTransaccResponse");
    private final static QName _SendMedicamentos_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendMedicamentos");
    private final static QName _SendMedicamentosResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendMedicamentosResponse");
    private final static QName _SendCancelacTransacc_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendCancelacTransacc");
    private final static QName _SendMedicamentosDHSerieResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendMedicamentosDHSerieResponse");
    private final static QName _SendMedicamentosDHSerie_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendMedicamentosDHSerie");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inssjp.mywebservice.business
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MedicamentosDTO }
     * 
     */
    public MedicamentosDTO createMedicamentosDTO() {
        return new MedicamentosDTO();
    }

    /**
     * Create an instance of {@link SendMedicamentosResponse }
     * 
     */
    public SendMedicamentosResponse createSendMedicamentosResponse() {
        return new SendMedicamentosResponse();
    }

    /**
     * Create an instance of {@link SendCancelacTransacc }
     * 
     */
    public SendCancelacTransacc createSendCancelacTransacc() {
        return new SendCancelacTransacc();
    }

    /**
     * Create an instance of {@link SendMedicamentosDHSerie }
     * 
     */
    public SendMedicamentosDHSerie createSendMedicamentosDHSerie() {
        return new SendMedicamentosDHSerie();
    }

    /**
     * Create an instance of {@link SendMedicamentosDHSerieResponse }
     * 
     */
    public SendMedicamentosDHSerieResponse createSendMedicamentosDHSerieResponse() {
        return new SendMedicamentosDHSerieResponse();
    }

    /**
     * Create an instance of {@link SendCancelacTransaccResponse }
     * 
     */
    public SendCancelacTransaccResponse createSendCancelacTransaccResponse() {
        return new SendCancelacTransaccResponse();
    }

    /**
     * Create an instance of {@link WebServiceResult }
     * 
     */
    public WebServiceResult createWebServiceResult() {
        return new WebServiceResult();
    }

    /**
     * Create an instance of {@link WebServiceError }
     * 
     */
    public WebServiceError createWebServiceError() {
        return new WebServiceError();
    }

    /**
     * Create an instance of {@link MedicamentosDTODHSerie }
     * 
     */
    public MedicamentosDTODHSerie createMedicamentosDTODHSerie() {
        return new MedicamentosDTODHSerie();
    }

    /**
     * Create an instance of {@link SendMedicamentos }
     * 
     */
    public SendMedicamentos createSendMedicamentos() {
        return new SendMedicamentos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCancelacTransaccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendCancelacTransaccResponse")
    public JAXBElement<SendCancelacTransaccResponse> createSendCancelacTransaccResponse(SendCancelacTransaccResponse value) {
        return new JAXBElement<SendCancelacTransaccResponse>(_SendCancelacTransaccResponse_QNAME, SendCancelacTransaccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMedicamentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendMedicamentos")
    public JAXBElement<SendMedicamentos> createSendMedicamentos(SendMedicamentos value) {
        return new JAXBElement<SendMedicamentos>(_SendMedicamentos_QNAME, SendMedicamentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMedicamentosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendMedicamentosResponse")
    public JAXBElement<SendMedicamentosResponse> createSendMedicamentosResponse(SendMedicamentosResponse value) {
        return new JAXBElement<SendMedicamentosResponse>(_SendMedicamentosResponse_QNAME, SendMedicamentosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCancelacTransacc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendCancelacTransacc")
    public JAXBElement<SendCancelacTransacc> createSendCancelacTransacc(SendCancelacTransacc value) {
        return new JAXBElement<SendCancelacTransacc>(_SendCancelacTransacc_QNAME, SendCancelacTransacc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMedicamentosDHSerieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendMedicamentosDHSerieResponse")
    public JAXBElement<SendMedicamentosDHSerieResponse> createSendMedicamentosDHSerieResponse(SendMedicamentosDHSerieResponse value) {
        return new JAXBElement<SendMedicamentosDHSerieResponse>(_SendMedicamentosDHSerieResponse_QNAME, SendMedicamentosDHSerieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMedicamentosDHSerie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendMedicamentosDHSerie")
    public JAXBElement<SendMedicamentosDHSerie> createSendMedicamentosDHSerie(SendMedicamentosDHSerie value) {
        return new JAXBElement<SendMedicamentosDHSerie>(_SendMedicamentosDHSerie_QNAME, SendMedicamentosDHSerie.class, null, value);
    }

}
