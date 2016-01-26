
package book;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the book package. 
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

    private final static QName _Byname_QNAME = new QName("http://book/", "byname");
    private final static QName _Placeorder_QNAME = new QName("http://book/", "placeorder");
    private final static QName _PlaceorderResponse_QNAME = new QName("http://book/", "placeorderResponse");
    private final static QName _BynameResponse_QNAME = new QName("http://book/", "bynameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: book
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Placeorder }
     * 
     */
    public Placeorder createPlaceorder() {
        return new Placeorder();
    }

    /**
     * Create an instance of {@link Byname }
     * 
     */
    public Byname createByname() {
        return new Byname();
    }

    /**
     * Create an instance of {@link PlaceorderResponse }
     * 
     */
    public PlaceorderResponse createPlaceorderResponse() {
        return new PlaceorderResponse();
    }

    /**
     * Create an instance of {@link BynameResponse }
     * 
     */
    public BynameResponse createBynameResponse() {
        return new BynameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byname }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book/", name = "byname")
    public JAXBElement<Byname> createByname(Byname value) {
        return new JAXBElement<Byname>(_Byname_QNAME, Byname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Placeorder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book/", name = "placeorder")
    public JAXBElement<Placeorder> createPlaceorder(Placeorder value) {
        return new JAXBElement<Placeorder>(_Placeorder_QNAME, Placeorder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaceorderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book/", name = "placeorderResponse")
    public JAXBElement<PlaceorderResponse> createPlaceorderResponse(PlaceorderResponse value) {
        return new JAXBElement<PlaceorderResponse>(_PlaceorderResponse_QNAME, PlaceorderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BynameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book/", name = "bynameResponse")
    public JAXBElement<BynameResponse> createBynameResponse(BynameResponse value) {
        return new JAXBElement<BynameResponse>(_BynameResponse_QNAME, BynameResponse.class, null, value);
    }

}
