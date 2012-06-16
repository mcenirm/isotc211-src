/*
 * XML Type:  Length_PropertyType
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.LengthPropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML Length_PropertyType(@http://www.isotc211.org/2005/gco).
 *
 * This is a complex type.
 */
public class LengthPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.LengthPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public LengthPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LENGTH$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Length");
    private static final org.apache.xmlbeans.QNameSet LENGTH$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Length"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Distance"),
    });
    private static final javax.xml.namespace.QName NILREASON$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "nilReason");
    
    
    /**
     * Gets the "Length" element
     */
    public net.opengis.gml.x32.LengthType getLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().find_element_user(LENGTH$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Length" element
     */
    public boolean isSetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENGTH$1) != 0;
        }
    }
    
    /**
     * Sets the "Length" element
     */
    public void setLength(net.opengis.gml.x32.LengthType length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().find_element_user(LENGTH$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.LengthType)get_store().add_element_user(LENGTH$0);
            }
            target.set(length);
        }
    }
    
    /**
     * Appends and returns a new empty "Length" element
     */
    public net.opengis.gml.x32.LengthType addNewLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().add_element_user(LENGTH$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Length" element
     */
    public void unsetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENGTH$1, 0);
        }
    }
    
    /**
     * Gets the "nilReason" attribute
     */
    public java.lang.Object getNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "nilReason" attribute
     */
    public net.opengis.gml.x32.NilReasonType xgetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
            return target;
        }
    }
    
    /**
     * True if has "nilReason" attribute
     */
    public boolean isSetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NILREASON$2) != null;
        }
    }
    
    /**
     * Sets the "nilReason" attribute
     */
    public void setNilReason(java.lang.Object nilReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NILREASON$2);
            }
            target.setObjectValue(nilReason);
        }
    }
    
    /**
     * Sets (as xml) the "nilReason" attribute
     */
    public void xsetNilReason(net.opengis.gml.x32.NilReasonType nilReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NilReasonType target = null;
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
            if (target == null)
            {
                target = (net.opengis.gml.x32.NilReasonType)get_store().add_attribute_user(NILREASON$2);
            }
            target.set(nilReason);
        }
    }
    
    /**
     * Unsets the "nilReason" attribute
     */
    public void unsetNilReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NILREASON$2);
        }
    }
}
