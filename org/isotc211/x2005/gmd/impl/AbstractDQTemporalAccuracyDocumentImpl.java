/*
 * An XML document type.
 * Localname: AbstractDQ_TemporalAccuracy
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractDQ_TemporalAccuracy(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractDQTemporalAccuracyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQElementDocumentImpl implements org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDQTemporalAccuracyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTDQTEMPORALACCURACY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_TemporalAccuracy");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTDQTEMPORALACCURACY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_TemporalValidity"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_AccuracyOfATimeMeasurement"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_TemporalAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_TemporalConsistency"),
    });
    
    
    /**
     * Gets the "AbstractDQ_TemporalAccuracy" element
     */
    public org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyType getAbstractDQTemporalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyType)get_store().find_element_user(ABSTRACTDQTEMPORALACCURACY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractDQ_TemporalAccuracy" element
     */
    public void setAbstractDQTemporalAccuracy(org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyType abstractDQTemporalAccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyType)get_store().find_element_user(ABSTRACTDQTEMPORALACCURACY$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyType)get_store().add_element_user(ABSTRACTDQTEMPORALACCURACY$0);
            }
            target.set(abstractDQTemporalAccuracy);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractDQ_TemporalAccuracy" element
     */
    public org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyType addNewAbstractDQTemporalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQTemporalAccuracyType)get_store().add_element_user(ABSTRACTDQTEMPORALACCURACY$0);
            return target;
        }
    }
}
