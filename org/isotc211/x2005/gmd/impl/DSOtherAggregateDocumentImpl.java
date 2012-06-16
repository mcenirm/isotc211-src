/*
 * An XML document type.
 * Localname: DS_OtherAggregate
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSOtherAggregateDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DS_OtherAggregate(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DSOtherAggregateDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDSAggregateDocumentImpl implements org.isotc211.x2005.gmd.DSOtherAggregateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSOtherAggregateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSOTHERAGGREGATE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_OtherAggregate");
    private static final org.apache.xmlbeans.QNameSet DSOTHERAGGREGATE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_StereoMate"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_OtherAggregate"),
    });
    
    
    /**
     * Gets the "DS_OtherAggregate" element
     */
    public org.isotc211.x2005.gmd.DSOtherAggregateType getDSOtherAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSOtherAggregateType target = null;
            target = (org.isotc211.x2005.gmd.DSOtherAggregateType)get_store().find_element_user(DSOTHERAGGREGATE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DS_OtherAggregate" element
     */
    public void setDSOtherAggregate(org.isotc211.x2005.gmd.DSOtherAggregateType dsOtherAggregate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSOtherAggregateType target = null;
            target = (org.isotc211.x2005.gmd.DSOtherAggregateType)get_store().find_element_user(DSOTHERAGGREGATE$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.DSOtherAggregateType)get_store().add_element_user(DSOTHERAGGREGATE$0);
            }
            target.set(dsOtherAggregate);
        }
    }
    
    /**
     * Appends and returns a new empty "DS_OtherAggregate" element
     */
    public org.isotc211.x2005.gmd.DSOtherAggregateType addNewDSOtherAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSOtherAggregateType target = null;
            target = (org.isotc211.x2005.gmd.DSOtherAggregateType)get_store().add_element_user(DSOTHERAGGREGATE$0);
            return target;
        }
    }
}
