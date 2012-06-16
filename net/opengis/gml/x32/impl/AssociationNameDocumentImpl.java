/*
 * An XML document type.
 * Localname: associationName
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AssociationNameDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one associationName(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AssociationNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AssociationNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssociationNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSOCIATIONNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "associationName");
    
    
    /**
     * Gets the "associationName" element
     */
    public java.lang.String getAssociationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSOCIATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "associationName" element
     */
    public org.apache.xmlbeans.XmlString xgetAssociationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSOCIATIONNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "associationName" element
     */
    public void setAssociationName(java.lang.String associationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSOCIATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSOCIATIONNAME$0);
            }
            target.setStringValue(associationName);
        }
    }
    
    /**
     * Sets (as xml) the "associationName" element
     */
    public void xsetAssociationName(org.apache.xmlbeans.XmlString associationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSOCIATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSOCIATIONNAME$0);
            }
            target.set(associationName);
        }
    }
}
