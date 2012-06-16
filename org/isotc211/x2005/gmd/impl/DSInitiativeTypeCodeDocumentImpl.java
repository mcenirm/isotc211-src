/*
 * An XML document type.
 * Localname: DS_InitiativeTypeCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSInitiativeTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DS_InitiativeTypeCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DSInitiativeTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.DSInitiativeTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSInitiativeTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSINITIATIVETYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_InitiativeTypeCode");
    
    
    /**
     * Gets the "DS_InitiativeTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getDSInitiativeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(DSINITIATIVETYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DS_InitiativeTypeCode" element
     */
    public void setDSInitiativeTypeCode(org.isotc211.x2005.gco.CodeListValueType dsInitiativeTypeCode)
    {
        generatedSetterHelperImpl(dsInitiativeTypeCode, DSINITIATIVETYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DS_InitiativeTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewDSInitiativeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(DSINITIATIVETYPECODE$0);
            return target;
        }
    }
}
