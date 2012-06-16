/*
 * An XML document type.
 * Localname: reversePropertyName
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ReversePropertyNameDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one reversePropertyName(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ReversePropertyNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ReversePropertyNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReversePropertyNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REVERSEPROPERTYNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "reversePropertyName");
    
    
    /**
     * Gets the "reversePropertyName" element
     */
    public java.lang.String getReversePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVERSEPROPERTYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reversePropertyName" element
     */
    public org.apache.xmlbeans.XmlString xgetReversePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVERSEPROPERTYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reversePropertyName" element
     */
    public void setReversePropertyName(java.lang.String reversePropertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVERSEPROPERTYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REVERSEPROPERTYNAME$0);
            }
            target.setStringValue(reversePropertyName);
        }
    }
    
    /**
     * Sets (as xml) the "reversePropertyName" element
     */
    public void xsetReversePropertyName(org.apache.xmlbeans.XmlString reversePropertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVERSEPROPERTYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REVERSEPROPERTYNAME$0);
            }
            target.set(reversePropertyName);
        }
    }
}
