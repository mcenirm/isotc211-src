/*
 * An XML attribute type.
 * Localname: isoType
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.IsoTypeAttribute
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one isoType(@http://www.isotc211.org/2005/gco) attribute.
 *
 * This is a complex type.
 */
public class IsoTypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.IsoTypeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public IsoTypeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISOTYPE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "isoType");
    
    
    /**
     * Gets the "isoType" attribute
     */
    public java.lang.String getIsoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOTYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isoType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIsoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ISOTYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "isoType" attribute
     */
    public boolean isSetIsoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISOTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "isoType" attribute
     */
    public void setIsoType(java.lang.String isoType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISOTYPE$0);
            }
            target.setStringValue(isoType);
        }
    }
    
    /**
     * Sets (as xml) the "isoType" attribute
     */
    public void xsetIsoType(org.apache.xmlbeans.XmlString isoType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ISOTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ISOTYPE$0);
            }
            target.set(isoType);
        }
    }
    
    /**
     * Unsets the "isoType" attribute
     */
    public void unsetIsoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISOTYPE$0);
        }
    }
}
