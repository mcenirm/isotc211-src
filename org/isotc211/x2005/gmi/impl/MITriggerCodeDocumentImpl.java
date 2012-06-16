/*
 * An XML document type.
 * Localname: MI_TriggerCode
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MITriggerCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_TriggerCode(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MITriggerCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmi.MITriggerCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MITriggerCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MITRIGGERCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_TriggerCode");
    
    
    /**
     * Gets the "MI_TriggerCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMITriggerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MITRIGGERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_TriggerCode" element
     */
    public void setMITriggerCode(org.isotc211.x2005.gco.CodeListValueType miTriggerCode)
    {
        generatedSetterHelperImpl(miTriggerCode, MITRIGGERCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_TriggerCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMITriggerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MITRIGGERCODE$0);
            return target;
        }
    }
}
