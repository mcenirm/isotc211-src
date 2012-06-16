/*
 * An XML document type.
 * Localname: targetElement
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TargetElementDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one targetElement(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TargetElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TargetElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public TargetElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "targetElement");
    
    
    /**
     * Gets the "targetElement" element
     */
    public java.lang.String getTargetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetElement" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETELEMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetElement" element
     */
    public void setTargetElement(java.lang.String targetElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETELEMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETELEMENT$0);
            }
            target.setStringValue(targetElement);
        }
    }
    
    /**
     * Sets (as xml) the "targetElement" element
     */
    public void xsetTargetElement(org.apache.xmlbeans.XmlString targetElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETELEMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETELEMENT$0);
            }
            target.set(targetElement);
        }
    }
}
