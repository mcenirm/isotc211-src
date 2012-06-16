/*
 * An XML document type.
 * Localname: MD_TopicCategoryCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDTopicCategoryCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_TopicCategoryCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDTopicCategoryCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDTopicCategoryCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDTopicCategoryCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDTOPICCATEGORYCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_TopicCategoryCode");
    
    
    /**
     * Gets the "MD_TopicCategoryCode" element
     */
    public org.isotc211.x2005.gmd.MDTopicCategoryCodeType.Enum getMDTopicCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MDTOPICCATEGORYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MD_TopicCategoryCode" element
     */
    public org.isotc211.x2005.gmd.MDTopicCategoryCodeType xgetMDTopicCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDTopicCategoryCodeType target = null;
            target = (org.isotc211.x2005.gmd.MDTopicCategoryCodeType)get_store().find_element_user(MDTOPICCATEGORYCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MD_TopicCategoryCode" element
     */
    public void setMDTopicCategoryCode(org.isotc211.x2005.gmd.MDTopicCategoryCodeType.Enum mdTopicCategoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MDTOPICCATEGORYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MDTOPICCATEGORYCODE$0);
            }
            target.setEnumValue(mdTopicCategoryCode);
        }
    }
    
    /**
     * Sets (as xml) the "MD_TopicCategoryCode" element
     */
    public void xsetMDTopicCategoryCode(org.isotc211.x2005.gmd.MDTopicCategoryCodeType mdTopicCategoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDTopicCategoryCodeType target = null;
            target = (org.isotc211.x2005.gmd.MDTopicCategoryCodeType)get_store().find_element_user(MDTOPICCATEGORYCODE$0, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.MDTopicCategoryCodeType)get_store().add_element_user(MDTOPICCATEGORYCODE$0);
            }
            target.set(mdTopicCategoryCode);
        }
    }
}
