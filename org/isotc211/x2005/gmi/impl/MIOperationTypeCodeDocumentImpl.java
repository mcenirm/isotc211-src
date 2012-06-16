/*
 * An XML document type.
 * Localname: MI_OperationTypeCode
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIOperationTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_OperationTypeCode(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIOperationTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmi.MIOperationTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIOperationTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIOPERATIONTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_OperationTypeCode");
    
    
    /**
     * Gets the "MI_OperationTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMIOperationTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MIOPERATIONTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_OperationTypeCode" element
     */
    public void setMIOperationTypeCode(org.isotc211.x2005.gco.CodeListValueType miOperationTypeCode)
    {
        generatedSetterHelperImpl(miOperationTypeCode, MIOPERATIONTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_OperationTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMIOperationTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MIOPERATIONTYPECODE$0);
            return target;
        }
    }
}
