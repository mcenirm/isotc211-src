/*
 * An XML document type.
 * Localname: MI_ImageDescription
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIImageDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_ImageDescription(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIImageDescriptionDocumentImpl extends org.isotc211.x2005.gmd.impl.MDImageDescriptionDocumentImpl implements org.isotc211.x2005.gmi.MIImageDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIImageDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIIMAGEDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_ImageDescription");
    
    
    /**
     * Gets the "MI_ImageDescription" element
     */
    public org.isotc211.x2005.gmi.MIImageDescriptionType getMIImageDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIImageDescriptionType target = null;
            target = (org.isotc211.x2005.gmi.MIImageDescriptionType)get_store().find_element_user(MIIMAGEDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_ImageDescription" element
     */
    public void setMIImageDescription(org.isotc211.x2005.gmi.MIImageDescriptionType miImageDescription)
    {
        generatedSetterHelperImpl(miImageDescription, MIIMAGEDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_ImageDescription" element
     */
    public org.isotc211.x2005.gmi.MIImageDescriptionType addNewMIImageDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIImageDescriptionType target = null;
            target = (org.isotc211.x2005.gmi.MIImageDescriptionType)get_store().add_element_user(MIIMAGEDESCRIPTION$0);
            return target;
        }
    }
}
