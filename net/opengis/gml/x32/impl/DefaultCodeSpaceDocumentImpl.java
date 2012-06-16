/*
 * An XML document type.
 * Localname: defaultCodeSpace
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DefaultCodeSpaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one defaultCodeSpace(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DefaultCodeSpaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DefaultCodeSpaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefaultCodeSpaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTCODESPACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "defaultCodeSpace");
    
    
    /**
     * Gets the "defaultCodeSpace" element
     */
    public java.lang.String getDefaultCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTCODESPACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultCodeSpace" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetDefaultCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DEFAULTCODESPACE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "defaultCodeSpace" element
     */
    public void setDefaultCodeSpace(java.lang.String defaultCodeSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTCODESPACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTCODESPACE$0);
            }
            target.setStringValue(defaultCodeSpace);
        }
    }
    
    /**
     * Sets (as xml) the "defaultCodeSpace" element
     */
    public void xsetDefaultCodeSpace(org.apache.xmlbeans.XmlAnyURI defaultCodeSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DEFAULTCODESPACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(DEFAULTCODESPACE$0);
            }
            target.set(defaultCodeSpace);
        }
    }
}
