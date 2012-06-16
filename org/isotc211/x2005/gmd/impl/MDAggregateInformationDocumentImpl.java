/*
 * An XML document type.
 * Localname: MD_AggregateInformation
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDAggregateInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_AggregateInformation(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDAggregateInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDAggregateInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDAggregateInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDAGGREGATEINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_AggregateInformation");
    
    
    /**
     * Gets the "MD_AggregateInformation" element
     */
    public org.isotc211.x2005.gmd.MDAggregateInformationType getMDAggregateInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDAggregateInformationType target = null;
            target = (org.isotc211.x2005.gmd.MDAggregateInformationType)get_store().find_element_user(MDAGGREGATEINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_AggregateInformation" element
     */
    public void setMDAggregateInformation(org.isotc211.x2005.gmd.MDAggregateInformationType mdAggregateInformation)
    {
        generatedSetterHelperImpl(mdAggregateInformation, MDAGGREGATEINFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_AggregateInformation" element
     */
    public org.isotc211.x2005.gmd.MDAggregateInformationType addNewMDAggregateInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDAggregateInformationType target = null;
            target = (org.isotc211.x2005.gmd.MDAggregateInformationType)get_store().add_element_user(MDAGGREGATEINFORMATION$0);
            return target;
        }
    }
}
