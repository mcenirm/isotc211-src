/*
 * An XML document type.
 * Localname: MI_ContextCode
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIContextCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_ContextCode(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIContextCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmi.MIContextCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIContextCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MICONTEXTCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_ContextCode");
    
    
    /**
     * Gets the "MI_ContextCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMIContextCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MICONTEXTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_ContextCode" element
     */
    public void setMIContextCode(org.isotc211.x2005.gco.CodeListValueType miContextCode)
    {
        generatedSetterHelperImpl(miContextCode, MICONTEXTCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_ContextCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMIContextCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MICONTEXTCODE$0);
            return target;
        }
    }
}
