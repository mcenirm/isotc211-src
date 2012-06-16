/*
 * An XML document type.
 * Localname: LI_Source
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.LISourceDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one LI_Source(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class LISourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.LISourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public LISourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISOURCE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "LI_Source");
    private static final org.apache.xmlbeans.QNameSet LISOURCE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "LE_Source"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "LI_Source"),
    });
    
    
    /**
     * Gets the "LI_Source" element
     */
    public org.isotc211.x2005.gmd.LISourceType getLISource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LISourceType target = null;
            target = (org.isotc211.x2005.gmd.LISourceType)get_store().find_element_user(LISOURCE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LI_Source" element
     */
    public void setLISource(org.isotc211.x2005.gmd.LISourceType liSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LISourceType target = null;
            target = (org.isotc211.x2005.gmd.LISourceType)get_store().find_element_user(LISOURCE$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.LISourceType)get_store().add_element_user(LISOURCE$0);
            }
            target.set(liSource);
        }
    }
    
    /**
     * Appends and returns a new empty "LI_Source" element
     */
    public org.isotc211.x2005.gmd.LISourceType addNewLISource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LISourceType target = null;
            target = (org.isotc211.x2005.gmd.LISourceType)get_store().add_element_user(LISOURCE$0);
            return target;
        }
    }
}
