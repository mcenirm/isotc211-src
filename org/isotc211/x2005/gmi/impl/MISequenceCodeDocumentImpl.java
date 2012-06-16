/*
 * An XML document type.
 * Localname: MI_SequenceCode
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MISequenceCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_SequenceCode(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MISequenceCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmi.MISequenceCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MISequenceCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MISEQUENCECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_SequenceCode");
    
    
    /**
     * Gets the "MI_SequenceCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMISequenceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MISEQUENCECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_SequenceCode" element
     */
    public void setMISequenceCode(org.isotc211.x2005.gco.CodeListValueType miSequenceCode)
    {
        generatedSetterHelperImpl(miSequenceCode, MISEQUENCECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_SequenceCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMISequenceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MISEQUENCECODE$0);
            return target;
        }
    }
}
