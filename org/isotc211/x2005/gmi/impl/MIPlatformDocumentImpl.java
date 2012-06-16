/*
 * An XML document type.
 * Localname: MI_Platform
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIPlatformDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_Platform(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIPlatformDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIPlatformDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIPlatformDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIPLATFORM$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Platform");
    
    
    /**
     * Gets the "MI_Platform" element
     */
    public org.isotc211.x2005.gmi.MIPlatformType getMIPlatform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformType)get_store().find_element_user(MIPLATFORM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_Platform" element
     */
    public void setMIPlatform(org.isotc211.x2005.gmi.MIPlatformType miPlatform)
    {
        generatedSetterHelperImpl(miPlatform, MIPLATFORM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_Platform" element
     */
    public org.isotc211.x2005.gmi.MIPlatformType addNewMIPlatform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformType)get_store().add_element_user(MIPLATFORM$0);
            return target;
        }
    }
}
