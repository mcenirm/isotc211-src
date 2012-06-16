/*
 * An XML document type.
 * Localname: MD_RepresentativeFraction
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDRepresentativeFractionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_RepresentativeFraction(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDRepresentativeFractionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDRepresentativeFractionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDRepresentativeFractionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDREPRESENTATIVEFRACTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_RepresentativeFraction");
    
    
    /**
     * Gets the "MD_RepresentativeFraction" element
     */
    public org.isotc211.x2005.gmd.MDRepresentativeFractionType getMDRepresentativeFraction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRepresentativeFractionType target = null;
            target = (org.isotc211.x2005.gmd.MDRepresentativeFractionType)get_store().find_element_user(MDREPRESENTATIVEFRACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_RepresentativeFraction" element
     */
    public void setMDRepresentativeFraction(org.isotc211.x2005.gmd.MDRepresentativeFractionType mdRepresentativeFraction)
    {
        generatedSetterHelperImpl(mdRepresentativeFraction, MDREPRESENTATIVEFRACTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_RepresentativeFraction" element
     */
    public org.isotc211.x2005.gmd.MDRepresentativeFractionType addNewMDRepresentativeFraction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDRepresentativeFractionType target = null;
            target = (org.isotc211.x2005.gmd.MDRepresentativeFractionType)get_store().add_element_user(MDREPRESENTATIVEFRACTION$0);
            return target;
        }
    }
}
