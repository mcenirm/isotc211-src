/*
 * XML Type:  MD_TopologyLevelCode_PropertyType
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDTopologyLevelCodePropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_TopologyLevelCode_PropertyType(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDTopologyLevelCodePropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDTopologyLevelCodePropertyType
{
    private static final long serialVersionUID = 1L;
    
    public MDTopologyLevelCodePropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDTOPOLOGYLEVELCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_TopologyLevelCode");
    private static final javax.xml.namespace.QName NILREASON$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "nilReason");
    
    
    /**
     * Gets the "MD_TopologyLevelCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDTopologyLevelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDTOPOLOGYLEVELCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MD_TopologyLevelCode" element
     */
    public boolean isSetMDTopologyLevelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MDTOPOLOGYLEVELCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "MD_TopologyLevelCode" element
     */
    public void setMDTopologyLevelCode(org.isotc211.x2005.gco.CodeListValueType mdTopologyLevelCode)
    {
        generatedSetterHelperImpl(mdTopologyLevelCode, MDTOPOLOGYLEVELCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_TopologyLevelCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDTopologyLevelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDTOPOLOGYLEVELCODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "MD_TopologyLevelCode" element
     */
    public void unsetMDTopologyLevelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MDTOPOLOGYLEVELCODE$0, 0);
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