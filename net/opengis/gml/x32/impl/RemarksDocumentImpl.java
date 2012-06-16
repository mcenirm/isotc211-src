/*
 * An XML document type.
 * Localname: remarks
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RemarksDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one remarks(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class RemarksDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.RemarksDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemarksDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMARKS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "remarks");
    
    
    /**
     * Gets the "remarks" element
     */
    public java.lang.String getRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMARKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "remarks" element
     */
    public org.apache.xmlbeans.XmlString xgetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMARKS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "remarks" element
     */
    public void setRemarks(java.lang.String remarks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMARKS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REMARKS$0);
            }
            target.setStringValue(remarks);
        }
    }
    
    /**
     * Sets (as xml) the "remarks" element
     */
    public void xsetRemarks(org.apache.xmlbeans.XmlString remarks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMARKS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REMARKS$0);
            }
            target.set(remarks);
        }
    }
}
