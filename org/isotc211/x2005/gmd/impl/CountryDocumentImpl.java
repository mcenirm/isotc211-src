/*
 * An XML document type.
 * Localname: Country
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CountryDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one Country(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CountryDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.CountryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "Country");
    
    
    /**
     * Gets the "Country" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Country" element
     */
    public void setCountry(org.isotc211.x2005.gco.CodeListValueType country)
    {
        generatedSetterHelperImpl(country, COUNTRY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Country" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(COUNTRY$0);
            return target;
        }
    }
}
