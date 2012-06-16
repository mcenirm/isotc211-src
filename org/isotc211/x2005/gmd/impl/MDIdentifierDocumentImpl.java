/*
 * An XML document type.
 * Localname: MD_Identifier
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Identifier(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDIdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Identifier");
    private static final org.apache.xmlbeans.QNameSet MDIDENTIFIER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "RS_Identifier"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Identifier"),
    });
    
    
    /**
     * Gets the "MD_Identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierType getMDIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierType)get_store().find_element_user(MDIDENTIFIER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Identifier" element
     */
    public void setMDIdentifier(org.isotc211.x2005.gmd.MDIdentifierType mdIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierType)get_store().find_element_user(MDIDENTIFIER$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDIdentifierType)get_store().add_element_user(MDIDENTIFIER$0);
            }
            target.set(mdIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "MD_Identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierType addNewMDIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierType)get_store().add_element_user(MDIDENTIFIER$0);
            return target;
        }
    }
}
