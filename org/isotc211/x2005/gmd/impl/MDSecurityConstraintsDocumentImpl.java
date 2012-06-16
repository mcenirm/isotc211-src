/*
 * An XML document type.
 * Localname: MD_SecurityConstraints
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDSecurityConstraintsDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_SecurityConstraints(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDSecurityConstraintsDocumentImpl extends org.isotc211.x2005.gmd.impl.MDConstraintsDocumentImpl implements org.isotc211.x2005.gmd.MDSecurityConstraintsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDSecurityConstraintsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDSECURITYCONSTRAINTS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_SecurityConstraints");
    
    
    /**
     * Gets the "MD_SecurityConstraints" element
     */
    public org.isotc211.x2005.gmd.MDSecurityConstraintsType getMDSecurityConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSecurityConstraintsType target = null;
            target = (org.isotc211.x2005.gmd.MDSecurityConstraintsType)get_store().find_element_user(MDSECURITYCONSTRAINTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_SecurityConstraints" element
     */
    public void setMDSecurityConstraints(org.isotc211.x2005.gmd.MDSecurityConstraintsType mdSecurityConstraints)
    {
        generatedSetterHelperImpl(mdSecurityConstraints, MDSECURITYCONSTRAINTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_SecurityConstraints" element
     */
    public org.isotc211.x2005.gmd.MDSecurityConstraintsType addNewMDSecurityConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDSecurityConstraintsType target = null;
            target = (org.isotc211.x2005.gmd.MDSecurityConstraintsType)get_store().add_element_user(MDSECURITYCONSTRAINTS$0);
            return target;
        }
    }
}
