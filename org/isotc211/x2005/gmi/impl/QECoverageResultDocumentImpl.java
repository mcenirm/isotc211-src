/*
 * An XML document type.
 * Localname: QE_CoverageResult
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.QECoverageResultDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one QE_CoverageResult(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class QECoverageResultDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQResultDocumentImpl implements org.isotc211.x2005.gmi.QECoverageResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public QECoverageResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QECOVERAGERESULT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "QE_CoverageResult");
    
    
    /**
     * Gets the "QE_CoverageResult" element
     */
    public org.isotc211.x2005.gmi.QECoverageResultType getQECoverageResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.QECoverageResultType target = null;
            target = (org.isotc211.x2005.gmi.QECoverageResultType)get_store().find_element_user(QECOVERAGERESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QE_CoverageResult" element
     */
    public void setQECoverageResult(org.isotc211.x2005.gmi.QECoverageResultType qeCoverageResult)
    {
        generatedSetterHelperImpl(qeCoverageResult, QECOVERAGERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QE_CoverageResult" element
     */
    public org.isotc211.x2005.gmi.QECoverageResultType addNewQECoverageResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.QECoverageResultType target = null;
            target = (org.isotc211.x2005.gmi.QECoverageResultType)get_store().add_element_user(QECOVERAGERESULT$0);
            return target;
        }
    }
}
