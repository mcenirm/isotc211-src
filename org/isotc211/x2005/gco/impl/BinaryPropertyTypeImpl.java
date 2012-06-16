/*
 * XML Type:  Binary_PropertyType
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.BinaryPropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML Binary_PropertyType(@http://www.isotc211.org/2005/gco).
 *
 * This is a complex type.
 */
public class BinaryPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gco.BinaryPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public BinaryPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINARY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Binary");
    private static final javax.xml.namespace.QName NILREASON$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "nilReason");
    
    
    /**
     * Gets the "Binary" element
     */
    public org.isotc211.x2005.gco.BinaryType getBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BinaryType target = null;
            target = (org.isotc211.x2005.gco.BinaryType)get_store().find_element_user(BINARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Binary" element
     */
    public boolean isSetBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINARY$0) != 0;
        }
    }
    
    /**
     * Sets the "Binary" element
     */
    public void setBinary(org.isotc211.x2005.gco.BinaryType binary)
    {
        generatedSetterHelperImpl(binary, BINARY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Binary" element
     */
    public org.isotc211.x2005.gco.BinaryType addNewBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.BinaryType target = null;
            target = (org.isotc211.x2005.gco.BinaryType)get_store().add_element_user(BINARY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Binary" element
     */
    public void unsetBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINARY$0, 0);
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
