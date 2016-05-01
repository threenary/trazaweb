package com.inssjp.mywebservice.business;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.0
 * 2011-12-12T12:34:23.905-03:00
 * Generated source version: 2.5.0
 * 
 */
@WebServiceClient(name = "IWebServiceService", 
                  wsdlLocation = "file:/C:/Workspace/scheduler/maven.1323704043316/src/main/resources/ar/com/mbsoftsa/resources/wsdl/trazamed.wsdl",
                  targetNamespace = "http://business.mywebservice.inssjp.com/") 
public class IWebServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://business.mywebservice.inssjp.com/", "IWebServiceService");
    public final static QName IWebServicePort = new QName("http://business.mywebservice.inssjp.com/", "IWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Workspace/scheduler/maven.1323704043316/src/main/resources/ar/com/mbsoftsa/resources/wsdl/trazamed.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IWebServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Workspace/scheduler/maven.1323704043316/src/main/resources/ar/com/mbsoftsa/resources/wsdl/trazamed.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IWebServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IWebService
     */
    @WebEndpoint(name = "IWebServicePort")
    public IWebService getIWebServicePort() {
        return super.getPort(IWebServicePort, IWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWebService
     */
    @WebEndpoint(name = "IWebServicePort")
    public IWebService getIWebServicePort(WebServiceFeature... features) {
        return super.getPort(IWebServicePort, IWebService.class, features);
    }

}