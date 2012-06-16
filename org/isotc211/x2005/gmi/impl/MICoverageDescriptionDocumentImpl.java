/*
 * An XML document type.
 * Localname: MI_CoverageDescription
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MICoverageDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_CoverageDescription(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MICoverageDescriptionDocumentImpl extends org.isotc211.x2005.gmd.impl.MDCoverageDescriptionDocumentImpl implements org.isotc211.x2005.gmi.MICoverageDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MICoverageDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MICOVERAGEDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_CoverageDescription");
    
    
    /**
     * Gets the "MI_CoverageDescription" element
     */
    public org.isotc211.x2005.gmi.MICoverageDescriptionType getMICoverageDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MICoverageDescriptionType target = null;
            target = (org.isotc211.x2005.gmi.MICoverageDescriptionType)get_store().find_element_user(MICOVERAGEDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_CoverageDescription" element
     */
    public void setMICoverageDescription(org.isotc211.x2005.gmi.MICoverageDescriptionType miCoverageDescription)
    {
        generatedSetterHelperImpl(miCoverageDescription, MICOVERAGEDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_CoverageDescription" element
     */
    public org.isotc211.x2005.gmi.MICoverageDescriptionType addNewMICoverageDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MICoverageDescriptionType target = null;
            target = (org.isotc211.x2005.gmi.MICoverageDescriptionType)get_store().add_element_user(MICOVERAGEDESCRIPTION$0);
            return target;
        }
    }
}
