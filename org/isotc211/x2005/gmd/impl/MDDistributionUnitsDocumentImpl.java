/*
 * An XML document type.
 * Localname: MD_DistributionUnits
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDistributionUnitsDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_DistributionUnits(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDDistributionUnitsDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDDistributionUnitsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDDistributionUnitsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDDISTRIBUTIONUNITS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_DistributionUnits");
    
    
    /**
     * Gets the "MD_DistributionUnits" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDDistributionUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDDISTRIBUTIONUNITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_DistributionUnits" element
     */
    public void setMDDistributionUnits(org.isotc211.x2005.gco.CodeListValueType mdDistributionUnits)
    {
        generatedSetterHelperImpl(mdDistributionUnits, MDDISTRIBUTIONUNITS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_DistributionUnits" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDDistributionUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDDISTRIBUTIONUNITS$0);
            return target;
        }
    }
}
