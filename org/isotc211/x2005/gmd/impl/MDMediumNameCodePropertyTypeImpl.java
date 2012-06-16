/*
 * XML Type:  MD_MediumNameCode_PropertyType
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMediumNameCodePropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_MediumNameCode_PropertyType(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDMediumNameCodePropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDMediumNameCodePropertyType
{
    private static final long serialVersionUID = 1L;
    
    public MDMediumNameCodePropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDMEDIUMNAMECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_MediumNameCode");
    private static final javax.xml.namespace.QName NILREASON$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "nilReason");
    
    
    /**
     * Gets the "MD_MediumNameCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDMediumNameCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDMEDIUMNAMECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MD_MediumNameCode" element
     */
    public boolean isSetMDMediumNameCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MDMEDIUMNAMECODE$0) != 0;
        }
    }
    
    /**
     * Sets the "MD_MediumNameCode" element
     */
    public void setMDMediumNameCode(org.isotc211.x2005.gco.CodeListValueType mdMediumNameCode)
    {
        generatedSetterHelperImpl(mdMediumNameCode, MDMEDIUMNAMECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_MediumNameCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDMediumNameCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDMEDIUMNAMECODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "MD_MediumNameCode" element
     */
    public void unsetMDMediumNameCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MDMEDIUMNAMECODE$0, 0);
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
