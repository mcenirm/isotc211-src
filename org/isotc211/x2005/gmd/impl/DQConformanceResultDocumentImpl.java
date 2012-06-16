/*
 * An XML document type.
 * Localname: DQ_ConformanceResult
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQConformanceResultDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_ConformanceResult(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQConformanceResultDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQResultDocumentImpl implements org.isotc211.x2005.gmd.DQConformanceResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQConformanceResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQCONFORMANCERESULT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_ConformanceResult");
    
    
    /**
     * Gets the "DQ_ConformanceResult" element
     */
    public org.isotc211.x2005.gmd.DQConformanceResultType getDQConformanceResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQConformanceResultType target = null;
            target = (org.isotc211.x2005.gmd.DQConformanceResultType)get_store().find_element_user(DQCONFORMANCERESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_ConformanceResult" element
     */
    public void setDQConformanceResult(org.isotc211.x2005.gmd.DQConformanceResultType dqConformanceResult)
    {
        generatedSetterHelperImpl(dqConformanceResult, DQCONFORMANCERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_ConformanceResult" element
     */
    public org.isotc211.x2005.gmd.DQConformanceResultType addNewDQConformanceResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQConformanceResultType target = null;
            target = (org.isotc211.x2005.gmd.DQConformanceResultType)get_store().add_element_user(DQCONFORMANCERESULT$0);
            return target;
        }
    }
}
