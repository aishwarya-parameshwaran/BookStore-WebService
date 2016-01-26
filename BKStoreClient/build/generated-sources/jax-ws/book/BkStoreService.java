
package book;

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
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BkStoreService", targetNamespace = "http://book/", wsdlLocation = "http://localhost:35231/BkStore/BkStoreService?wsdl")
public class BkStoreService
    extends Service
{

    private final static URL BKSTORESERVICE_WSDL_LOCATION;
    private final static WebServiceException BKSTORESERVICE_EXCEPTION;
    private final static QName BKSTORESERVICE_QNAME = new QName("http://book/", "BkStoreService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:35231/BkStore/BkStoreService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BKSTORESERVICE_WSDL_LOCATION = url;
        BKSTORESERVICE_EXCEPTION = e;
    }

    public BkStoreService() {
        super(__getWsdlLocation(), BKSTORESERVICE_QNAME);
    }

    public BkStoreService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BKSTORESERVICE_QNAME, features);
    }

    public BkStoreService(URL wsdlLocation) {
        super(wsdlLocation, BKSTORESERVICE_QNAME);
    }

    public BkStoreService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BKSTORESERVICE_QNAME, features);
    }

    public BkStoreService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BkStoreService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BkStore
     */
    @WebEndpoint(name = "BkStorePort")
    public BkStore getBkStorePort() {
        return super.getPort(new QName("http://book/", "BkStorePort"), BkStore.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BkStore
     */
    @WebEndpoint(name = "BkStorePort")
    public BkStore getBkStorePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://book/", "BkStorePort"), BkStore.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BKSTORESERVICE_EXCEPTION!= null) {
            throw BKSTORESERVICE_EXCEPTION;
        }
        return BKSTORESERVICE_WSDL_LOCATION;
    }

}
