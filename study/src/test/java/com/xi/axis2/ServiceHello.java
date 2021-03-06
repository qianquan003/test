
package com.xi.axis2;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceHello", targetNamespace = "http://webServiceDemo.xi.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceHello {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getValue", targetNamespace = "http://webServiceDemo.xi.com/", className = "com.xi.axis2.GetValue")
    @ResponseWrapper(localName = "getValueResponse", targetNamespace = "http://webServiceDemo.xi.com/", className = "com.xi.axis2.GetValueResponse")
    @Action(input = "http://webServiceDemo.xi.com/ServiceHello/getValueRequest", output = "http://webServiceDemo.xi.com/ServiceHello/getValueResponse")
    public String getValue(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
