/*
 * An XML document type.
 * Localname: AbstractDQ_PositionalAccuracy
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractDQ_PositionalAccuracy(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractDQPositionalAccuracyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQElementDocumentImpl implements org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDQPositionalAccuracyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTDQPOSITIONALACCURACY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_PositionalAccuracy");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTDQPOSITIONALACCURACY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_PositionalAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_RelativeInternalPositionalAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_AbsoluteExternalPositionalAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_GriddedDataPositionalAccuracy"),
    });
    
    
    /**
     * Gets the "AbstractDQ_PositionalAccuracy" element
     */
    public org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyType getAbstractDQPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyType)get_store().find_element_user(ABSTRACTDQPOSITIONALACCURACY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractDQ_PositionalAccuracy" element
     */
    public void setAbstractDQPositionalAccuracy(org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyType abstractDQPositionalAccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyType)get_store().find_element_user(ABSTRACTDQPOSITIONALACCURACY$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyType)get_store().add_element_user(ABSTRACTDQPOSITIONALACCURACY$0);
            }
            target.set(abstractDQPositionalAccuracy);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractDQ_PositionalAccuracy" element
     */
    public org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyType addNewAbstractDQPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQPositionalAccuracyType)get_store().add_element_user(ABSTRACTDQPOSITIONALACCURACY$0);
            return target;
        }
    }
}
