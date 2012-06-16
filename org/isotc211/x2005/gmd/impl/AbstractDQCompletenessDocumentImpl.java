/*
 * An XML document type.
 * Localname: AbstractDQ_Completeness
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDQCompletenessDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractDQ_Completeness(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractDQCompletenessDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQElementDocumentImpl implements org.isotc211.x2005.gmd.AbstractDQCompletenessDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDQCompletenessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTDQCOMPLETENESS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_Completeness");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTDQCOMPLETENESS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_CompletenessOmission"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_Completeness"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_CompletenessCommission"),
    });
    
    
    /**
     * Gets the "AbstractDQ_Completeness" element
     */
    public org.isotc211.x2005.gmd.AbstractDQCompletenessType getAbstractDQCompleteness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQCompletenessType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQCompletenessType)get_store().find_element_user(ABSTRACTDQCOMPLETENESS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractDQ_Completeness" element
     */
    public void setAbstractDQCompleteness(org.isotc211.x2005.gmd.AbstractDQCompletenessType abstractDQCompleteness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQCompletenessType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQCompletenessType)get_store().find_element_user(ABSTRACTDQCOMPLETENESS$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractDQCompletenessType)get_store().add_element_user(ABSTRACTDQCOMPLETENESS$0);
            }
            target.set(abstractDQCompleteness);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractDQ_Completeness" element
     */
    public org.isotc211.x2005.gmd.AbstractDQCompletenessType addNewAbstractDQCompleteness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQCompletenessType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQCompletenessType)get_store().add_element_user(ABSTRACTDQCOMPLETENESS$0);
            return target;
        }
    }
}
