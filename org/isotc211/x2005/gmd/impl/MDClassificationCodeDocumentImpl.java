/*
 * An XML document type.
 * Localname: MD_ClassificationCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDClassificationCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_ClassificationCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDClassificationCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDClassificationCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDClassificationCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDCLASSIFICATIONCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ClassificationCode");
    
    
    /**
     * Gets the "MD_ClassificationCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDClassificationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDCLASSIFICATIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_ClassificationCode" element
     */
    public void setMDClassificationCode(org.isotc211.x2005.gco.CodeListValueType mdClassificationCode)
    {
        generatedSetterHelperImpl(mdClassificationCode, MDCLASSIFICATIONCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_ClassificationCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDClassificationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDCLASSIFICATIONCODE$0);
            return target;
        }
    }
}
