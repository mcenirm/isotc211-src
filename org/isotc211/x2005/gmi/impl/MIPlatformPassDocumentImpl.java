/*
 * An XML document type.
 * Localname: MI_PlatformPass
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIPlatformPassDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_PlatformPass(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIPlatformPassDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIPlatformPassDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIPlatformPassDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIPLATFORMPASS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_PlatformPass");
    
    
    /**
     * Gets the "MI_PlatformPass" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPassType getMIPlatformPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPassType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPassType)get_store().find_element_user(MIPLATFORMPASS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_PlatformPass" element
     */
    public void setMIPlatformPass(org.isotc211.x2005.gmi.MIPlatformPassType miPlatformPass)
    {
        generatedSetterHelperImpl(miPlatformPass, MIPLATFORMPASS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_PlatformPass" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPassType addNewMIPlatformPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPassType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPassType)get_store().add_element_user(MIPLATFORMPASS$0);
            return target;
        }
    }
}
