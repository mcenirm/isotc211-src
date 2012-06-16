/*
 * XML Type:  LE_NominalResolution_PropertyType
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LENominalResolutionPropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML LE_NominalResolution_PropertyType(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class LENominalResolutionPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.LENominalResolutionPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public LENominalResolutionPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LENOMINALRESOLUTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "LE_NominalResolution");
    private static final javax.xml.namespace.QName NILREASON$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "nilReason");
    
    
    /**
     * Gets the "LE_NominalResolution" element
     */
    public org.isotc211.x2005.gmi.LENominalResolutionType getLENominalResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LENominalResolutionType target = null;
            target = (org.isotc211.x2005.gmi.LENominalResolutionType)get_store().find_element_user(LENOMINALRESOLUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LE_NominalResolution" element
     */
    public boolean isSetLENominalResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENOMINALRESOLUTION$0) != 0;
        }
    }
    
    /**
     * Sets the "LE_NominalResolution" element
     */
    public void setLENominalResolution(org.isotc211.x2005.gmi.LENominalResolutionType leNominalResolution)
    {
        generatedSetterHelperImpl(leNominalResolution, LENOMINALRESOLUTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LE_NominalResolution" element
     */
    public org.isotc211.x2005.gmi.LENominalResolutionType addNewLENominalResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LENominalResolutionType target = null;
            target = (org.isotc211.x2005.gmi.LENominalResolutionType)get_store().add_element_user(LENOMINALRESOLUTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "LE_NominalResolution" element
     */
    public void unsetLENominalResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENOMINALRESOLUTION$0, 0);
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
