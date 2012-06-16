/*
 * An XML document type.
 * Localname: MD_LegalConstraints
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDLegalConstraintsDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_LegalConstraints(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDLegalConstraintsDocumentImpl extends org.isotc211.x2005.gmd.impl.MDConstraintsDocumentImpl implements org.isotc211.x2005.gmd.MDLegalConstraintsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDLegalConstraintsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDLEGALCONSTRAINTS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_LegalConstraints");
    
    
    /**
     * Gets the "MD_LegalConstraints" element
     */
    public org.isotc211.x2005.gmd.MDLegalConstraintsType getMDLegalConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDLegalConstraintsType target = null;
            target = (org.isotc211.x2005.gmd.MDLegalConstraintsType)get_store().find_element_user(MDLEGALCONSTRAINTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_LegalConstraints" element
     */
    public void setMDLegalConstraints(org.isotc211.x2005.gmd.MDLegalConstraintsType mdLegalConstraints)
    {
        generatedSetterHelperImpl(mdLegalConstraints, MDLEGALCONSTRAINTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_LegalConstraints" element
     */
    public org.isotc211.x2005.gmd.MDLegalConstraintsType addNewMDLegalConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDLegalConstraintsType target = null;
            target = (org.isotc211.x2005.gmd.MDLegalConstraintsType)get_store().add_element_user(MDLEGALCONSTRAINTS$0);
            return target;
        }
    }
}
