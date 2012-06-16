/*
 * XML Type:  LE_Source_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LESourceType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML LE_Source_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class LESourceTypeImpl extends org.isotc211.x2005.gmd.impl.LISourceTypeImpl implements org.isotc211.x2005.gmi.LESourceType
{
    private static final long serialVersionUID = 1L;
    
    public LESourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSEDLEVEL$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "processedLevel");
    private static final javax.xml.namespace.QName RESOLUTION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "resolution");
    
    
    /**
     * Gets the "processedLevel" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getProcessedLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(PROCESSEDLEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "processedLevel" element
     */
    public boolean isSetProcessedLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSEDLEVEL$0) != 0;
        }
    }
    
    /**
     * Sets the "processedLevel" element
     */
    public void setProcessedLevel(org.isotc211.x2005.gmd.MDIdentifierPropertyType processedLevel)
    {
        generatedSetterHelperImpl(processedLevel, PROCESSEDLEVEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "processedLevel" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewProcessedLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(PROCESSEDLEVEL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "processedLevel" element
     */
    public void unsetProcessedLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSEDLEVEL$0, 0);
        }
    }
    
    /**
     * Gets the "resolution" element
     */
    public org.isotc211.x2005.gmi.LENominalResolutionPropertyType getResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LENominalResolutionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LENominalResolutionPropertyType)get_store().find_element_user(RESOLUTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resolution" element
     */
    public boolean isSetResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOLUTION$2) != 0;
        }
    }
    
    /**
     * Sets the "resolution" element
     */
    public void setResolution(org.isotc211.x2005.gmi.LENominalResolutionPropertyType resolution)
    {
        generatedSetterHelperImpl(resolution, RESOLUTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resolution" element
     */
    public org.isotc211.x2005.gmi.LENominalResolutionPropertyType addNewResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LENominalResolutionPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LENominalResolutionPropertyType)get_store().add_element_user(RESOLUTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "resolution" element
     */
    public void unsetResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOLUTION$2, 0);
        }
    }
}
