/*
 * An XML document type.
 * Localname: MD_Distributor
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDistributorDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_Distributor(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDDistributorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDDistributorDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDDistributorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDDISTRIBUTOR$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_Distributor");
    
    
    /**
     * Gets the "MD_Distributor" element
     */
    public org.isotc211.x2005.gmd.MDDistributorType getMDDistributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributorType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributorType)get_store().find_element_user(MDDISTRIBUTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_Distributor" element
     */
    public void setMDDistributor(org.isotc211.x2005.gmd.MDDistributorType mdDistributor)
    {
        generatedSetterHelperImpl(mdDistributor, MDDISTRIBUTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_Distributor" element
     */
    public org.isotc211.x2005.gmd.MDDistributorType addNewMDDistributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDistributorType target = null;
            target = (org.isotc211.x2005.gmd.MDDistributorType)get_store().add_element_user(MDDISTRIBUTOR$0);
            return target;
        }
    }
}
