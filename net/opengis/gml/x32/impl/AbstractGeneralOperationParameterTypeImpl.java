/*
 * XML Type:  AbstractGeneralOperationParameterType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGeneralOperationParameterType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractGeneralOperationParameterType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractGeneralOperationParameterTypeImpl extends net.opengis.gml.x32.impl.IdentifiedObjectTypeImpl implements net.opengis.gml.x32.AbstractGeneralOperationParameterType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeneralOperationParameterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINIMUMOCCURS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "minimumOccurs");
    
    
    /**
     * Gets the "minimumOccurs" element
     */
    public java.math.BigInteger getMinimumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMOCCURS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimumOccurs" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetMinimumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MINIMUMOCCURS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "minimumOccurs" element
     */
    public boolean isSetMinimumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINIMUMOCCURS$0) != 0;
        }
    }
    
    /**
     * Sets the "minimumOccurs" element
     */
    public void setMinimumOccurs(java.math.BigInteger minimumOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMOCCURS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUMOCCURS$0);
            }
            target.setBigIntegerValue(minimumOccurs);
        }
    }
    
    /**
     * Sets (as xml) the "minimumOccurs" element
     */
    public void xsetMinimumOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minimumOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MINIMUMOCCURS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(MINIMUMOCCURS$0);
            }
            target.set(minimumOccurs);
        }
    }
    
    /**
     * Unsets the "minimumOccurs" element
     */
    public void unsetMinimumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINIMUMOCCURS$0, 0);
        }
    }
}
