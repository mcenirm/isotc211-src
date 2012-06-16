/*
 * XML Type:  PT_FreeText_PropertyType
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.PTFreeTextPropertyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML PT_FreeText_PropertyType(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class PTFreeTextPropertyTypeImpl extends org.isotc211.x2005.gco.impl.CharacterStringPropertyTypeImpl implements org.isotc211.x2005.gmd.PTFreeTextPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public PTFreeTextPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PTFREETEXT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "PT_FreeText");
    
    
    /**
     * Gets the "PT_FreeText" element
     */
    public org.isotc211.x2005.gmd.PTFreeTextType getPTFreeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTFreeTextType target = null;
            target = (org.isotc211.x2005.gmd.PTFreeTextType)get_store().find_element_user(PTFREETEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PT_FreeText" element
     */
    public boolean isSetPTFreeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PTFREETEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "PT_FreeText" element
     */
    public void setPTFreeText(org.isotc211.x2005.gmd.PTFreeTextType ptFreeText)
    {
        generatedSetterHelperImpl(ptFreeText, PTFREETEXT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PT_FreeText" element
     */
    public org.isotc211.x2005.gmd.PTFreeTextType addNewPTFreeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.PTFreeTextType target = null;
            target = (org.isotc211.x2005.gmd.PTFreeTextType)get_store().add_element_user(PTFREETEXT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "PT_FreeText" element
     */
    public void unsetPTFreeText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PTFREETEXT$0, 0);
        }
    }
}
