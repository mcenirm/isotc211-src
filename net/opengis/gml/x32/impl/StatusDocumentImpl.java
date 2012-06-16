/*
 * An XML document type.
 * Localname: status
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.StatusDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one status(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class StatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.StatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "status");
    
    
    /**
     * Gets the "status" element
     */
    public net.opengis.gml.x32.StringOrRefType getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(net.opengis.gml.x32.StringOrRefType status)
    {
        generatedSetterHelperImpl(status, STATUS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public net.opengis.gml.x32.StringOrRefType addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().add_element_user(STATUS$0);
            return target;
        }
    }
}
