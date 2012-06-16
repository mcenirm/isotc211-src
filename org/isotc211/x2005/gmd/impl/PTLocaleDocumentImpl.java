/*
 * An XML document type.
 * Localname: PT_Locale
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.PTLocaleDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one PT_Locale(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class PTLocaleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.PTLocaleDocument
{
    private static final long serialVersionUID = 1L;
    
    public PTLocaleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PTLOCALE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "PT_Locale");
    
    
    /**
     * Gets the "PT_Locale" element
     */
    public org.isotc211.x2005.gmd.PTLocaleType getPTLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTLocaleType target = null;
            target = (org.isotc211.x2005.gmd.PTLocaleType)get_store().find_element_user(PTLOCALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PT_Locale" element
     */
    public void setPTLocale(org.isotc211.x2005.gmd.PTLocaleType ptLocale)
    {
        generatedSetterHelperImpl(ptLocale, PTLOCALE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PT_Locale" element
     */
    public org.isotc211.x2005.gmd.PTLocaleType addNewPTLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTLocaleType target = null;
            target = (org.isotc211.x2005.gmd.PTLocaleType)get_store().add_element_user(PTLOCALE$0);
            return target;
        }
    }
}
