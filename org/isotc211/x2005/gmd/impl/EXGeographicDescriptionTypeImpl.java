/*
 * XML Type:  EX_GeographicDescription_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXGeographicDescriptionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML EX_GeographicDescription_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class EXGeographicDescriptionTypeImpl extends org.isotc211.x2005.gmd.impl.AbstractEXGeographicExtentTypeImpl implements org.isotc211.x2005.gmd.EXGeographicDescriptionType
{
    private static final long serialVersionUID = 1L;
    
    public EXGeographicDescriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "geographicIdentifier");
    
    
    /**
     * Gets the "geographicIdentifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getGeographicIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(GEOGRAPHICIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geographicIdentifier" element
     */
    public void setGeographicIdentifier(org.isotc211.x2005.gmd.MDIdentifierPropertyType geographicIdentifier)
    {
        generatedSetterHelperImpl(geographicIdentifier, GEOGRAPHICIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geographicIdentifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewGeographicIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(GEOGRAPHICIDENTIFIER$0);
            return target;
        }
    }
}
