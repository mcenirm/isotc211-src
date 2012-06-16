/*
 * An XML document type.
 * Localname: AbstractDS_Aggregate
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDSAggregateDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractDS_Aggregate(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractDSAggregateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.AbstractDSAggregateDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDSAggregateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTDSAGGREGATE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDS_Aggregate");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTDSAGGREGATE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_StereoMate"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Initiative"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDS_Aggregate"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Series"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Sensor"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_OtherAggregate"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Platform"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_ProductionSeries"),
    });
    
    
    /**
     * Gets the "AbstractDS_Aggregate" element
     */
    public org.isotc211.x2005.gmd.AbstractDSAggregateType getAbstractDSAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDSAggregateType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDSAggregateType)get_store().find_element_user(ABSTRACTDSAGGREGATE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractDS_Aggregate" element
     */
    public void setAbstractDSAggregate(org.isotc211.x2005.gmd.AbstractDSAggregateType abstractDSAggregate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDSAggregateType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDSAggregateType)get_store().find_element_user(ABSTRACTDSAGGREGATE$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractDSAggregateType)get_store().add_element_user(ABSTRACTDSAGGREGATE$0);
            }
            target.set(abstractDSAggregate);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractDS_Aggregate" element
     */
    public org.isotc211.x2005.gmd.AbstractDSAggregateType addNewAbstractDSAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDSAggregateType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDSAggregateType)get_store().add_element_user(ABSTRACTDSAGGREGATE$0);
            return target;
        }
    }
}
