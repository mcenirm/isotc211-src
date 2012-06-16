/*
 * XML Type:  MD_ReferenceSystem_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDReferenceSystemType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_ReferenceSystem_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDReferenceSystemTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDReferenceSystemType
{
    private static final long serialVersionUID = 1L;
    
    public MDReferenceSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCESYSTEMIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "referenceSystemIdentifier");
    
    
    /**
     * Gets the "referenceSystemIdentifier" element
     */
    public org.isotc211.x2005.gmd.RSIdentifierPropertyType getReferenceSystemIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.RSIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.RSIdentifierPropertyType)get_store().find_element_user(REFERENCESYSTEMIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "referenceSystemIdentifier" element
     */
    public boolean isSetReferenceSystemIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCESYSTEMIDENTIFIER$0) != 0;
        }
    }
    
    /**
     * Sets the "referenceSystemIdentifier" element
     */
    public void setReferenceSystemIdentifier(org.isotc211.x2005.gmd.RSIdentifierPropertyType referenceSystemIdentifier)
    {
        generatedSetterHelperImpl(referenceSystemIdentifier, REFERENCESYSTEMIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "referenceSystemIdentifier" element
     */
    public org.isotc211.x2005.gmd.RSIdentifierPropertyType addNewReferenceSystemIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.RSIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.RSIdentifierPropertyType)get_store().add_element_user(REFERENCESYSTEMIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "referenceSystemIdentifier" element
     */
    public void unsetReferenceSystemIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCESYSTEMIDENTIFIER$0, 0);
        }
    }
}
