/*
 * An XML document type.
 * Localname: MD_Keywords
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDKeywordsDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Keywords(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDKeywordsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDKeywordsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDKeywordsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDKEYWORDS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Keywords");
    
    
    /**
     * Gets the "MD_Keywords" element
     */
    public org.isotc211.x2005.gmd.MDKeywordsType getMDKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDKeywordsType target = null;
            target = (org.isotc211.x2005.gmd.MDKeywordsType)get_store().find_element_user(MDKEYWORDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Keywords" element
     */
    public void setMDKeywords(org.isotc211.x2005.gmd.MDKeywordsType mdKeywords)
    {
        generatedSetterHelperImpl(mdKeywords, MDKEYWORDS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_Keywords" element
     */
    public org.isotc211.x2005.gmd.MDKeywordsType addNewMDKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDKeywordsType target = null;
            target = (org.isotc211.x2005.gmd.MDKeywordsType)get_store().add_element_user(MDKEYWORDS$0);
            return target;
        }
    }
}
