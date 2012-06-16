/*
 * An XML document type.
 * Localname: method
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MethodDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one method(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public MethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHOD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "method");
    private static final org.apache.xmlbeans.QNameSet METHOD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "method"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesMethod"),
    });
    
    
    /**
     * Gets the "method" element
     */
    public net.opengis.gml.x32.OperationMethodPropertyType getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodPropertyType target = null;
            target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().find_element_user(METHOD$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "method" element
     */
    public void setMethod(net.opengis.gml.x32.OperationMethodPropertyType method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodPropertyType target = null;
            target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().find_element_user(METHOD$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().add_element_user(METHOD$0);
            }
            target.set(method);
        }
    }
    
    /**
     * Appends and returns a new empty "method" element
     */
    public net.opengis.gml.x32.OperationMethodPropertyType addNewMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodPropertyType target = null;
            target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().add_element_user(METHOD$0);
            return target;
        }
    }
}
