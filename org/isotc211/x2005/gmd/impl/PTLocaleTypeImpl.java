/*
 * XML Type:  PT_Locale_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.PTLocaleType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML PT_Locale_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class PTLocaleTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.PTLocaleType
{
    private static final long serialVersionUID = 1L;
    
    public PTLocaleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "languageCode");
    private static final javax.xml.namespace.QName COUNTRY$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "country");
    private static final javax.xml.namespace.QName CHARACTERENCODING$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "characterEncoding");
    
    
    /**
     * Gets the "languageCode" element
     */
    public org.isotc211.x2005.gmd.LanguageCodePropertyType getLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LanguageCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LanguageCodePropertyType)get_store().find_element_user(LANGUAGECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "languageCode" element
     */
    public void setLanguageCode(org.isotc211.x2005.gmd.LanguageCodePropertyType languageCode)
    {
        generatedSetterHelperImpl(languageCode, LANGUAGECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "languageCode" element
     */
    public org.isotc211.x2005.gmd.LanguageCodePropertyType addNewLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LanguageCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LanguageCodePropertyType)get_store().add_element_user(LANGUAGECODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "country" element
     */
    public org.isotc211.x2005.gmd.CountryPropertyType getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CountryPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CountryPropertyType)get_store().find_element_user(COUNTRY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$2) != 0;
        }
    }
    
    /**
     * Sets the "country" element
     */
    public void setCountry(org.isotc211.x2005.gmd.CountryPropertyType country)
    {
        generatedSetterHelperImpl(country, COUNTRY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "country" element
     */
    public org.isotc211.x2005.gmd.CountryPropertyType addNewCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CountryPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CountryPropertyType)get_store().add_element_user(COUNTRY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$2, 0);
        }
    }
    
    /**
     * Gets the "characterEncoding" element
     */
    public org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType getCharacterEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType)get_store().find_element_user(CHARACTERENCODING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "characterEncoding" element
     */
    public void setCharacterEncoding(org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType characterEncoding)
    {
        generatedSetterHelperImpl(characterEncoding, CHARACTERENCODING$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "characterEncoding" element
     */
    public org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType addNewCharacterEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType)get_store().add_element_user(CHARACTERENCODING$4);
            return target;
        }
    }
}
