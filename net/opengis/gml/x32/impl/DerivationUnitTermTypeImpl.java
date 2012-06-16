/*
 * XML Type:  DerivationUnitTermType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DerivationUnitTermType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DerivationUnitTermType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DerivationUnitTermTypeImpl extends net.opengis.gml.x32.impl.UnitOfMeasureTypeImpl implements net.opengis.gml.x32.DerivationUnitTermType
{
    private static final long serialVersionUID = 1L;
    
    public DerivationUnitTermTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPONENT$0 = 
        new javax.xml.namespace.QName("", "exponent");
    
    
    /**
     * Gets the "exponent" attribute
     */
    public java.math.BigInteger getExponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPONENT$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "exponent" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetExponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(EXPONENT$0);
            return target;
        }
    }
    
    /**
     * True if has "exponent" attribute
     */
    public boolean isSetExponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXPONENT$0) != null;
        }
    }
    
    /**
     * Sets the "exponent" attribute
     */
    public void setExponent(java.math.BigInteger exponent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPONENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPONENT$0);
            }
            target.setBigIntegerValue(exponent);
        }
    }
    
    /**
     * Sets (as xml) the "exponent" attribute
     */
    public void xsetExponent(org.apache.xmlbeans.XmlInteger exponent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(EXPONENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(EXPONENT$0);
            }
            target.set(exponent);
        }
    }
    
    /**
     * Unsets the "exponent" attribute
     */
    public void unsetExponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXPONENT$0);
        }
    }
}
