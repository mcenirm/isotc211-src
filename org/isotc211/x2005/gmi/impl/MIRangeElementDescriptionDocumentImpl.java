/*
 * An XML document type.
 * Localname: MI_RangeElementDescription
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIRangeElementDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_RangeElementDescription(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIRangeElementDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIRangeElementDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIRangeElementDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIRANGEELEMENTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_RangeElementDescription");
    
    
    /**
     * Gets the "MI_RangeElementDescription" element
     */
    public org.isotc211.x2005.gmi.MIRangeElementDescriptionType getMIRangeElementDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRangeElementDescriptionType target = null;
            target = (org.isotc211.x2005.gmi.MIRangeElementDescriptionType)get_store().find_element_user(MIRANGEELEMENTDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_RangeElementDescription" element
     */
    public void setMIRangeElementDescription(org.isotc211.x2005.gmi.MIRangeElementDescriptionType miRangeElementDescription)
    {
        generatedSetterHelperImpl(miRangeElementDescription, MIRANGEELEMENTDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_RangeElementDescription" element
     */
    public org.isotc211.x2005.gmi.MIRangeElementDescriptionType addNewMIRangeElementDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRangeElementDescriptionType target = null;
            target = (org.isotc211.x2005.gmi.MIRangeElementDescriptionType)get_store().add_element_user(MIRANGEELEMENTDESCRIPTION$0);
            return target;
        }
    }
}
