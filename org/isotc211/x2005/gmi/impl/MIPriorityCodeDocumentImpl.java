/*
 * An XML document type.
 * Localname: MI_PriorityCode
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIPriorityCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_PriorityCode(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIPriorityCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmi.MIPriorityCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIPriorityCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIPRIORITYCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_PriorityCode");
    
    
    /**
     * Gets the "MI_PriorityCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMIPriorityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MIPRIORITYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_PriorityCode" element
     */
    public void setMIPriorityCode(org.isotc211.x2005.gco.CodeListValueType miPriorityCode)
    {
        generatedSetterHelperImpl(miPriorityCode, MIPRIORITYCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_PriorityCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMIPriorityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MIPRIORITYCODE$0);
            return target;
        }
    }
}
