/*
 * An XML document type.
 * Localname: DQ_EvaluationMethodTypeCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_EvaluationMethodTypeCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQEvaluationMethodTypeCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQEvaluationMethodTypeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQEVALUATIONMETHODTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_EvaluationMethodTypeCode");
    
    
    /**
     * Gets the "DQ_EvaluationMethodTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getDQEvaluationMethodTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(DQEVALUATIONMETHODTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_EvaluationMethodTypeCode" element
     */
    public void setDQEvaluationMethodTypeCode(org.isotc211.x2005.gco.CodeListValueType dqEvaluationMethodTypeCode)
    {
        generatedSetterHelperImpl(dqEvaluationMethodTypeCode, DQEVALUATIONMETHODTYPECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_EvaluationMethodTypeCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewDQEvaluationMethodTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(DQEVALUATIONMETHODTYPECODE$0);
            return target;
        }
    }
}
