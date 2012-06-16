/*
 * An XML document type.
 * Localname: MD_MediumNameCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMediumNameCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_MediumNameCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDMediumNameCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDMediumNameCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDMediumNameCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDMEDIUMNAMECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_MediumNameCode");
    
    
    /**
     * Gets the "MD_MediumNameCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDMediumNameCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDMEDIUMNAMECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_MediumNameCode" element
     */
    public void setMDMediumNameCode(org.isotc211.x2005.gco.CodeListValueType mdMediumNameCode)
    {
        generatedSetterHelperImpl(mdMediumNameCode, MDMEDIUMNAMECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_MediumNameCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDMediumNameCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDMEDIUMNAMECODE$0);
            return target;
        }
    }
}
