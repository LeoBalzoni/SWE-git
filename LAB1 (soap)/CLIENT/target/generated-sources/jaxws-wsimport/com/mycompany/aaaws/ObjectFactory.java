
package com.mycompany.aaaws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.aaaws package. 
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

    private final static QName _GetBankClientsResponse_QNAME = new QName("http://aaaws.mycompany.com/", "getBankClientsResponse");
    private final static QName _GetBankClients_QNAME = new QName("http://aaaws.mycompany.com/", "getBankClients");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.aaaws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBankClientsResponse }
     * 
     */
    public GetBankClientsResponse createGetBankClientsResponse() {
        return new GetBankClientsResponse();
    }

    /**
     * Create an instance of {@link GetBankClients }
     * 
     */
    public GetBankClients createGetBankClients() {
        return new GetBankClients();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankClientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aaaws.mycompany.com/", name = "getBankClientsResponse")
    public JAXBElement<GetBankClientsResponse> createGetBankClientsResponse(GetBankClientsResponse value) {
        return new JAXBElement<GetBankClientsResponse>(_GetBankClientsResponse_QNAME, GetBankClientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankClients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aaaws.mycompany.com/", name = "getBankClients")
    public JAXBElement<GetBankClients> createGetBankClients(GetBankClients value) {
        return new JAXBElement<GetBankClients>(_GetBankClients_QNAME, GetBankClients.class, null, value);
    }

}
