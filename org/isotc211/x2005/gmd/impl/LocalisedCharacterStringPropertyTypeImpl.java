/*
 * XML Type:  LocalisedCharacterString_PropertyType
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML LocalisedCharacterString_PropertyType(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class LocalisedCharacterStringPropertyTypeImpl extends org.isotc211.x2005.gco.impl.ObjectReferencePropertyTypeImpl implements org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public LocalisedCharacterStringPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALISEDCHARACTERSTRING$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "LocalisedCharacterString");
    
    
    /**
     * Gets the "LocalisedCharacterString" element
     */
    public org.isotc211.x2005.gmd.LocalisedCharacterStringType getLocalisedCharacterString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LocalisedCharacterStringType target = null;
            target = (org.isotc211.x2005.gmd.LocalisedCharacterStringType)get_store().find_element_user(LOCALISEDCHARACTERSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LocalisedCharacterString" element
     */
    public boolean isSetLocalisedCharacterString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALISEDCHARACTERSTRING$0) != 0;
        }
    }
    
    /**
     * Sets the "LocalisedCharacterString" element
     */
    public void setLocalisedCharacterString(org.isotc211.x2005.gmd.LocalisedCharacterStringType localisedCharacterString)
    {
        generatedSetterHelperImpl(localisedCharacterString, LOCALISEDCHARACTERSTRING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocalisedCharacterString" element
     */
    public org.isotc211.x2005.gmd.LocalisedCharacterStringType addNewLocalisedCharacterString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LocalisedCharacterStringType target = null;
            target = (org.isotc211.x2005.gmd.LocalisedCharacterStringType)get_store().add_element_user(LOCALISEDCHARACTERSTRING$0);
            return target;
        }
    }
    
    /**
     * Unsets the "LocalisedCharacterString" element
     */
    public void unsetLocalisedCharacterString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALISEDCHARACTERSTRING$0, 0);
        }
    }
}
