/*
 * XML Type:  CoordinatesType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoordinatesType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML CoordinatesType(@http://www.opengis.net/gml/3.2).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.x32.CoordinatesType.
 */
public class CoordinatesTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements net.opengis.gml.x32.CoordinatesType
{
    private static final long serialVersionUID = 1L;
    
    public CoordinatesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CoordinatesTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName DECIMAL$0 = 
        new javax.xml.namespace.QName("", "decimal");
    private static final javax.xml.namespace.QName CS$2 = 
        new javax.xml.namespace.QName("", "cs");
    private static final javax.xml.namespace.QName TS$4 = 
        new javax.xml.namespace.QName("", "ts");
    
    
    /**
     * Gets the "decimal" attribute
     */
    public java.lang.String getDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DECIMAL$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "decimal" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DECIMAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(DECIMAL$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "decimal" attribute
     */
    public boolean isSetDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECIMAL$0) != null;
        }
    }
    
    /**
     * Sets the "decimal" attribute
     */
    public void setDecimal(java.lang.String decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECIMAL$0);
            }
            target.setStringValue(decimal);
        }
    }
    
    /**
     * Sets (as xml) the "decimal" attribute
     */
    public void xsetDecimal(org.apache.xmlbeans.XmlString decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DECIMAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DECIMAL$0);
            }
            target.set(decimal);
        }
    }
    
    /**
     * Unsets the "decimal" attribute
     */
    public void unsetDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECIMAL$0);
        }
    }
    
    /**
     * Gets the "cs" attribute
     */
    public java.lang.String getCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CS$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cs" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(CS$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "cs" attribute
     */
    public boolean isSetCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CS$2) != null;
        }
    }
    
    /**
     * Sets the "cs" attribute
     */
    public void setCs(java.lang.String cs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CS$2);
            }
            target.setStringValue(cs);
        }
    }
    
    /**
     * Sets (as xml) the "cs" attribute
     */
    public void xsetCs(org.apache.xmlbeans.XmlString cs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CS$2);
            }
            target.set(cs);
        }
    }
    
    /**
     * Unsets the "cs" attribute
     */
    public void unsetCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CS$2);
        }
    }
    
    /**
     * Gets the "ts" attribute
     */
    public java.lang.String getTs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TS$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ts" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TS$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "ts" attribute
     */
    public boolean isSetTs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TS$4) != null;
        }
    }
    
    /**
     * Sets the "ts" attribute
     */
    public void setTs(java.lang.String ts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TS$4);
            }
            target.setStringValue(ts);
        }
    }
    
    /**
     * Sets (as xml) the "ts" attribute
     */
    public void xsetTs(org.apache.xmlbeans.XmlString ts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TS$4);
            }
            target.set(ts);
        }
    }
    
    /**
     * Unsets the "ts" attribute
     */
    public void unsetTs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TS$4);
        }
    }
}
