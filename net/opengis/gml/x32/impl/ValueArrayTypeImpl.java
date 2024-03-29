/*
 * XML Type:  ValueArrayType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ValueArrayType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ValueArrayType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ValueArrayTypeImpl extends net.opengis.gml.x32.impl.CompositeValueTypeImpl implements net.opengis.gml.x32.ValueArrayType
{
    private static final long serialVersionUID = 1L;
    
    public ValueArrayTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODESPACE$0 = 
        new javax.xml.namespace.QName("", "codeSpace");
    private static final javax.xml.namespace.QName UOM$2 = 
        new javax.xml.namespace.QName("", "uom");
    
    
    /**
     * Gets the "codeSpace" attribute
     */
    public java.lang.String getCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeSpace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODESPACE$0);
            return target;
        }
    }
    
    /**
     * True if has "codeSpace" attribute
     */
    public boolean isSetCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODESPACE$0) != null;
        }
    }
    
    /**
     * Sets the "codeSpace" attribute
     */
    public void setCodeSpace(java.lang.String codeSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESPACE$0);
            }
            target.setStringValue(codeSpace);
        }
    }
    
    /**
     * Sets (as xml) the "codeSpace" attribute
     */
    public void xsetCodeSpace(org.apache.xmlbeans.XmlAnyURI codeSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODESPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(CODESPACE$0);
            }
            target.set(codeSpace);
        }
    }
    
    /**
     * Unsets the "codeSpace" attribute
     */
    public void unsetCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODESPACE$0);
        }
    }
    
    /**
     * Gets the "uom" attribute
     */
    public java.lang.String getUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uom" attribute
     */
    public net.opengis.gml.x32.UomIdentifier xgetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UomIdentifier target = null;
            target = (net.opengis.gml.x32.UomIdentifier)get_store().find_attribute_user(UOM$2);
            return target;
        }
    }
    
    /**
     * True if has "uom" attribute
     */
    public boolean isSetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UOM$2) != null;
        }
    }
    
    /**
     * Sets the "uom" attribute
     */
    public void setUom(java.lang.String uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOM$2);
            }
            target.setStringValue(uom);
        }
    }
    
    /**
     * Sets (as xml) the "uom" attribute
     */
    public void xsetUom(net.opengis.gml.x32.UomIdentifier uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UomIdentifier target = null;
            target = (net.opengis.gml.x32.UomIdentifier)get_store().find_attribute_user(UOM$2);
            if (target == null)
            {
                target = (net.opengis.gml.x32.UomIdentifier)get_store().add_attribute_user(UOM$2);
            }
            target.set(uom);
        }
    }
    
    /**
     * Unsets the "uom" attribute
     */
    public void unsetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UOM$2);
        }
    }
}
