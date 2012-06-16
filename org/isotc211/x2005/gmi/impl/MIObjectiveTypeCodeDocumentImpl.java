/*
 * An XML document type.
 * Localname: MI_ObjectiveTypeCode
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIObjectiveTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_ObjectiveTypeCode(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIObjectiveTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmi.MIObjectiveTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIObjectiveTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIOBJECTIVETYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_ObjectiveTypeCode");
    
    
    /**
     * Gets the "MI_ObjectiveTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMIObjectiveTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MIOBJECTIVETYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_ObjectiveTypeCode" element
     */
    public void setMIObjectiveTypeCode(org.isotc211.x2005.gco.CodeListValueType miObjectiveTypeCode)
    {
        generatedSetterHelperImpl(miObjectiveTypeCode, MIOBJECTIVETYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_ObjectiveTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMIObjectiveTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MIOBJECTIVETYPECODE$0);
            return target;
        }
    }
}
