/*
 * An XML document type.
 * Localname: statusReference
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.StatusReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one statusReference(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class StatusReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.StatusReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "statusReference");
    
    
    /**
     * Gets the "statusReference" element
     */
    public net.opengis.gml.x32.ReferenceType getStatusReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(STATUSREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "statusReference" element
     */
    public void setStatusReference(net.opengis.gml.x32.ReferenceType statusReference)
    {
        generatedSetterHelperImpl(statusReference, STATUSREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "statusReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewStatusReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(STATUSREFERENCE$0);
            return target;
        }
    }
}
