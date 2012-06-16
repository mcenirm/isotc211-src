/*
 * An XML document type.
 * Localname: MI_SensorTypeCode
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MISensorTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_SensorTypeCode(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MISensorTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmi.MISensorTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MISensorTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MISENSORTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_SensorTypeCode");
    
    
    /**
     * Gets the "MI_SensorTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMISensorTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MISENSORTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_SensorTypeCode" element
     */
    public void setMISensorTypeCode(org.isotc211.x2005.gco.CodeListValueType miSensorTypeCode)
    {
        generatedSetterHelperImpl(miSensorTypeCode, MISENSORTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_SensorTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMISensorTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MISENSORTYPECODE$0);
            return target;
        }
    }
}
