/*
 * XML Type:  UnlimitedInteger_Type
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.UnlimitedIntegerType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML UnlimitedInteger_Type(@http://www.isotc211.org/2005/gco).
 *
 * This is an atomic type that is a restriction of org.isotc211.x2005.gco.UnlimitedIntegerType.
 */
public class UnlimitedIntegerTypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements org.isotc211.x2005.gco.UnlimitedIntegerType
{
    private static final long serialVersionUID = 1L;
    
    public UnlimitedIntegerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected UnlimitedIntegerTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ISINFINITE$0 = 
        new javax.xml.namespace.QName("", "isInfinite");
    
    
    /**
     * Gets the "isInfinite" attribute
     */
    public boolean getIsInfinite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINFINITE$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isInfinite" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsInfinite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINFINITE$0);
            return target;
        }
    }
    
    /**
     * True if has "isInfinite" attribute
     */
    public boolean isSetIsInfinite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISINFINITE$0) != null;
        }
    }
    
    /**
     * Sets the "isInfinite" attribute
     */
    public void setIsInfinite(boolean isInfinite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINFINITE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISINFINITE$0);
            }
            target.setBooleanValue(isInfinite);
        }
    }
    
    /**
     * Sets (as xml) the "isInfinite" attribute
     */
    public void xsetIsInfinite(org.apache.xmlbeans.XmlBoolean isInfinite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINFINITE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISINFINITE$0);
            }
            target.set(isInfinite);
        }
    }
    
    /**
     * Unsets the "isInfinite" attribute
     */
    public void unsetIsInfinite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISINFINITE$0);
        }
    }
}
