
package com.concretepage.article_ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ArticlesPortService", targetNamespace = "http://www.concretepage.com/article-ws", wsdlLocation = "http://localhost:8080/soapws/articles.wsdl")
public class ArticlesPortService
    extends Service
{

    private final static URL ARTICLESPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ARTICLESPORTSERVICE_EXCEPTION;
    private final static QName ARTICLESPORTSERVICE_QNAME = new QName("http://www.concretepage.com/article-ws", "ArticlesPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/soapws/articles.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ARTICLESPORTSERVICE_WSDL_LOCATION = url;
        ARTICLESPORTSERVICE_EXCEPTION = e;
    }

    public ArticlesPortService() {
        super(__getWsdlLocation(), ARTICLESPORTSERVICE_QNAME);
    }

    public ArticlesPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ARTICLESPORTSERVICE_QNAME, features);
    }

    public ArticlesPortService(URL wsdlLocation) {
        super(wsdlLocation, ARTICLESPORTSERVICE_QNAME);
    }

    public ArticlesPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ARTICLESPORTSERVICE_QNAME, features);
    }

    public ArticlesPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ArticlesPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ArticlesPort
     */
    @WebEndpoint(name = "ArticlesPortSoap11")
    public ArticlesPort getArticlesPortSoap11() {
        return super.getPort(new QName("http://www.concretepage.com/article-ws", "ArticlesPortSoap11"), ArticlesPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ArticlesPort
     */
    @WebEndpoint(name = "ArticlesPortSoap11")
    public ArticlesPort getArticlesPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.concretepage.com/article-ws", "ArticlesPortSoap11"), ArticlesPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ARTICLESPORTSERVICE_EXCEPTION!= null) {
            throw ARTICLESPORTSERVICE_EXCEPTION;
        }
        return ARTICLESPORTSERVICE_WSDL_LOCATION;
    }

}
