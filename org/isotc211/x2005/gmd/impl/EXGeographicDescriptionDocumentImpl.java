/*
 * An XML document type.
 * Localname: EX_GeographicDescription
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXGeographicDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one EX_GeographicDescription(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class EXGeographicDescriptionDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractEXGeographicExtentDocumentImpl implements org.isotc211.x2005.gmd.EXGeographicDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EXGeographicDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXGEOGRAPHICDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "EX_GeographicDescription");
    
    
    /**
     * Gets the "EX_GeographicDescription" element
     */
    public org.isotc211.x2005.gmd.EXGeographicDescriptionType getEXGeographicDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicDescriptionType)get_store().find_element_user(EXGEOGRAPHICDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EX_GeographicDescription" element
     */
    public void setEXGeographicDescription(org.isotc211.x2005.gmd.EXGeographicDescriptionType exGeographicDescription)
    {
        generatedSetterHelperImpl(exGeographicDescription, EXGEOGRAPHICDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EX_GeographicDescription" element
     */
    public org.isotc211.x2005.gmd.EXGeographicDescriptionType addNewEXGeographicDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXGeographicDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.EXGeographicDescriptionType)get_store().add_element_user(EXGEOGRAPHICDESCRIPTION$0);
            return target;
        }
    }
}
