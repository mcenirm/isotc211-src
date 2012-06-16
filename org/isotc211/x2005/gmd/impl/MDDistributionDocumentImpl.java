/*
 * An XML document type.
 * Localname: MD_Distribution
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Distribution(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDDistributionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Distribution");
    
    
    /**
     * Gets the "MD_Distribution" element
     */
    public org.isotc211.x2005.gmd.MDDistributionType getMDDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributionType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributionType)get_store().find_element_user(MDDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Distribution" element
     */
    public void setMDDistribution(org.isotc211.x2005.gmd.MDDistributionType mdDistribution)
    {
        generatedSetterHelperImpl(mdDistribution, MDDISTRIBUTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_Distribution" element
     */
    public org.isotc211.x2005.gmd.MDDistributionType addNewMDDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributionType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributionType)get_store().add_element_user(MDDISTRIBUTION$0);
            return target;
        }
    }
}
