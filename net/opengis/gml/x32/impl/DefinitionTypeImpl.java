/*
 * XML Type:  DefinitionType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DefinitionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DefinitionType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DefinitionTypeImpl extends net.opengis.gml.x32.impl.DefinitionBaseTypeImpl implements net.opengis.gml.x32.DefinitionType
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
     * True if has "remarks" element
     */
    public boolean isSetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMARKS$0) != 0;
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
    
    /**
     * Unsets the "remarks" element
     */
    public void unsetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMARKS$0, 0);
        }
    }
}
