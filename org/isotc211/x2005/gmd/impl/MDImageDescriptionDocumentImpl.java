/*
 * An XML document type.
 * Localname: MD_ImageDescription
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDImageDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_ImageDescription(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDImageDescriptionDocumentImpl extends org.isotc211.x2005.gmd.impl.MDCoverageDescriptionDocumentImpl implements org.isotc211.x2005.gmd.MDImageDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDImageDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDIMAGEDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ImageDescription");
    private static final org.apache.xmlbeans.QNameSet MDIMAGEDESCRIPTION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ImageDescription"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_ImageDescription"),
    });
    
    
    /**
     * Gets the "MD_ImageDescription" element
     */
    public org.isotc211.x2005.gmd.MDImageDescriptionType getMDImageDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDImageDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.MDImageDescriptionType)get_store().find_element_user(MDIMAGEDESCRIPTION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_ImageDescription" element
     */
    public void setMDImageDescription(org.isotc211.x2005.gmd.MDImageDescriptionType mdImageDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDImageDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.MDImageDescriptionType)get_store().find_element_user(MDIMAGEDESCRIPTION$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDImageDescriptionType)get_store().add_element_user(MDIMAGEDESCRIPTION$0);
            }
            target.set(mdImageDescription);
        }
    }
    
    /**
     * Appends and returns a new empty "MD_ImageDescription" element
     */
    public org.isotc211.x2005.gmd.MDImageDescriptionType addNewMDImageDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDImageDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.MDImageDescriptionType)get_store().add_element_user(MDIMAGEDESCRIPTION$0);
            return target;
        }
    }
}
