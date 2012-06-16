/*
 * An XML document type.
 * Localname: CI_Citation
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CICitationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_Citation(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CICitationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.CICitationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CICitationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CICITATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_Citation");
    
    
    /**
     * Gets the "CI_Citation" element
     */
    public org.isotc211.x2005.gmd.CICitationType getCICitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationType target = null;
            target = (org.isotc211.x2005.gmd.CICitationType)get_store().find_element_user(CICITATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_Citation" element
     */
    public void setCICitation(org.isotc211.x2005.gmd.CICitationType ciCitation)
    {
        generatedSetterHelperImpl(ciCitation, CICITATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_Citation" element
     */
    public org.isotc211.x2005.gmd.CICitationType addNewCICitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationType target = null;
            target = (org.isotc211.x2005.gmd.CICitationType)get_store().add_element_user(CICITATION$0);
            return target;
        }
    }
}
