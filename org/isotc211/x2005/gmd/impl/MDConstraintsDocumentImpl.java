/*
 * An XML document type.
 * Localname: MD_Constraints
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDConstraintsDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Constraints(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDConstraintsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDConstraintsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDConstraintsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDCONSTRAINTS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Constraints");
    private static final org.apache.xmlbeans.QNameSet MDCONSTRAINTS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_SecurityConstraints"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_LegalConstraints"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Constraints"),
    });
    
    
    /**
     * Gets the "MD_Constraints" element
     */
    public org.isotc211.x2005.gmd.MDConstraintsType getMDConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDConstraintsType target = null;
            target = (org.isotc211.x2005.gmd.MDConstraintsType)get_store().find_element_user(MDCONSTRAINTS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Constraints" element
     */
    public void setMDConstraints(org.isotc211.x2005.gmd.MDConstraintsType mdConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDConstraintsType target = null;
            target = (org.isotc211.x2005.gmd.MDConstraintsType)get_store().find_element_user(MDCONSTRAINTS$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDConstraintsType)get_store().add_element_user(MDCONSTRAINTS$0);
            }
            target.set(mdConstraints);
        }
    }
    
    /**
     * Appends and returns a new empty "MD_Constraints" element
     */
    public org.isotc211.x2005.gmd.MDConstraintsType addNewMDConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDConstraintsType target = null;
            target = (org.isotc211.x2005.gmd.MDConstraintsType)get_store().add_element_user(MDCONSTRAINTS$0);
            return target;
        }
    }
}
