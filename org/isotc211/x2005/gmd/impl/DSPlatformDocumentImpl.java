/*
 * An XML document type.
 * Localname: DS_Platform
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSPlatformDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DS_Platform(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DSPlatformDocumentImpl extends org.isotc211.x2005.gmd.impl.DSSeriesDocumentImpl implements org.isotc211.x2005.gmd.DSPlatformDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSPlatformDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSPLATFORM$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Platform");
    
    
    /**
     * Gets the "DS_Platform" element
     */
    public org.isotc211.x2005.gmd.DSPlatformType getDSPlatform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSPlatformType target = null;
            target = (org.isotc211.x2005.gmd.DSPlatformType)get_store().find_element_user(DSPLATFORM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DS_Platform" element
     */
    public void setDSPlatform(org.isotc211.x2005.gmd.DSPlatformType dsPlatform)
    {
        generatedSetterHelperImpl(dsPlatform, DSPLATFORM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DS_Platform" element
     */
    public org.isotc211.x2005.gmd.DSPlatformType addNewDSPlatform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSPlatformType target = null;
            target = (org.isotc211.x2005.gmd.DSPlatformType)get_store().add_element_user(DSPLATFORM$0);
            return target;
        }
    }
}
