
package book;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BkStore", targetNamespace = "http://book/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BkStore {


    /**
     * 
     * @param author
     * @param bkname
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "byname", targetNamespace = "http://book/", className = "book.Byname")
    @ResponseWrapper(localName = "bynameResponse", targetNamespace = "http://book/", className = "book.BynameResponse")
    @Action(input = "http://book/BkStore/bynameRequest", output = "http://book/BkStore/bynameResponse")
    public String byname(
        @WebParam(name = "bkname", targetNamespace = "")
        String bkname,
        @WebParam(name = "author", targetNamespace = "")
        String author);

    /**
     * 
     * @param id
     * @param address
     * @param contact
     * @param custname
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "placeorder", targetNamespace = "http://book/", className = "book.Placeorder")
    @ResponseWrapper(localName = "placeorderResponse", targetNamespace = "http://book/", className = "book.PlaceorderResponse")
    @Action(input = "http://book/BkStore/placeorderRequest", output = "http://book/BkStore/placeorderResponse")
    public String placeorder(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "custname", targetNamespace = "")
        String custname,
        @WebParam(name = "address", targetNamespace = "")
        String address,
        @WebParam(name = "contact", targetNamespace = "")
        long contact);

}
