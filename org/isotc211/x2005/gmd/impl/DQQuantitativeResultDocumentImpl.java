/*
 * An XML document type.
 * Localname: DQ_QuantitativeResult
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQQuantitativeResultDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_QuantitativeResult(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQQuantitativeResultDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQResultDocumentImpl implements org.isotc211.x2005.gmd.DQQuantitativeResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQQuantitativeResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQQUANTITATIVERESULT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_QuantitativeResult");
    
    
    /**
     * Gets the "DQ_QuantitativeResult" element
     */
    public org.isotc211.x2005.gmd.DQQuantitativeResultType getDQQuantitativeResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQQuantitativeResultType target = null;
            target = (org.isotc211.x2005.gmd.DQQuantitativeResultType)get_store().find_element_user(DQQUANTITATIVERESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_QuantitativeResult" element
     */
    public void setDQQuantitativeResult(org.isotc211.x2005.gmd.DQQuantitativeResultType dqQuantitativeResult)
    {
        generatedSetterHelperImpl(dqQuantitativeResult, DQQUANTITATIVERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_QuantitativeResult" element
     */
    public org.isotc211.x2005.gmd.DQQuantitativeResultType addNewDQQuantitativeResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQQuantitativeResultType target = null;
            target = (org.isotc211.x2005.gmd.DQQuantitativeResultType)get_store().add_element_user(DQQUANTITATIVERESULT$0);
            return target;
        }
    }
}
