/*
 * An XML document type.
 * Localname: AbstractDQ_Result
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDQResultDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractDQ_Result(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractDQResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.AbstractDQResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDQResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTDQRESULT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_Result");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTDQRESULT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_Result"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_ConformanceResult"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_QuantitativeResult"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "QE_CoverageResult"),
    });
    
    
    /**
     * Gets the "AbstractDQ_Result" element
     */
    public org.isotc211.x2005.gmd.AbstractDQResultType getAbstractDQResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQResultType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQResultType)get_store().find_element_user(ABSTRACTDQRESULT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractDQ_Result" element
     */
    public void setAbstractDQResult(org.isotc211.x2005.gmd.AbstractDQResultType abstractDQResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQResultType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQResultType)get_store().find_element_user(ABSTRACTDQRESULT$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractDQResultType)get_store().add_element_user(ABSTRACTDQRESULT$0);
            }
            target.set(abstractDQResult);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractDQ_Result" element
     */
    public org.isotc211.x2005.gmd.AbstractDQResultType addNewAbstractDQResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQResultType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQResultType)get_store().add_element_user(ABSTRACTDQRESULT$0);
            return target;
        }
    }
}
