/*
 * XML Type:  Real_PropertyType
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.RealPropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML Real_PropertyType(@http://www.isotc211.org/2005/gco).
 *
 * This is a complex type.
 */
public class RealPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.RealPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public RealPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REAL$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Real");
    private static final javax.xml.namespace.QName NILREASON$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "nilReason");
    
    
    /**
     * Gets the "Real" element
     */
    public double getReal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Real" element
     */
    public org.apache.xmlbeans.XmlDouble xgetReal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Real" element
     */
    public boolean isSetReal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REAL$0) != 0;
        }
    }
    
    /**
     * Sets the "Real" element
     */
    public void setReal(double real)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REAL$0);
            }
            target.setDoubleValue(real);
        }
    }
    
    /**
     * Sets (as xml) the "Real" element
     */
    public void xsetReal(org.apache.xmlbeans.XmlDouble real)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REAL$0);
            }
            target.set(real);
        }
    }
    
    /**
     * Unsets the "Real" element
     */
    public void unsetReal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REAL$0, 0);
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
