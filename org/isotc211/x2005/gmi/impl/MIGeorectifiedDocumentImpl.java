/*
 * An XML document type.
 * Localname: MI_Georectified
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIGeorectifiedDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_Georectified(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIGeorectifiedDocumentImpl extends org.isotc211.x2005.gmd.impl.MDGeorectifiedDocumentImpl implements org.isotc211.x2005.gmi.MIGeorectifiedDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIGeorectifiedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIGEORECTIFIED$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Georectified");
    
    
    /**
     * Gets the "MI_Georectified" element
     */
    public org.isotc211.x2005.gmi.MIGeorectifiedType getMIGeorectified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGeorectifiedType target = null;
            target = (org.isotc211.x2005.gmi.MIGeorectifiedType)get_store().find_element_user(MIGEORECTIFIED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_Georectified" element
     */
    public void setMIGeorectified(org.isotc211.x2005.gmi.MIGeorectifiedType miGeorectified)
    {
        generatedSetterHelperImpl(miGeorectified, MIGEORECTIFIED$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_Georectified" element
     */
    public org.isotc211.x2005.gmi.MIGeorectifiedType addNewMIGeorectified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGeorectifiedType target = null;
            target = (org.isotc211.x2005.gmi.MIGeorectifiedType)get_store().add_element_user(MIGEORECTIFIED$0);
            return target;
        }
    }
}
