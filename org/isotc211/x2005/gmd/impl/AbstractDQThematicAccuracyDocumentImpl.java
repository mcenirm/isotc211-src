/*
 * An XML document type.
 * Localname: AbstractDQ_ThematicAccuracy
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDQThematicAccuracyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractDQ_ThematicAccuracy(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractDQThematicAccuracyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQElementDocumentImpl implements org.isotc211.x2005.gmd.AbstractDQThematicAccuracyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDQThematicAccuracyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTDQTHEMATICACCURACY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_ThematicAccuracy");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTDQTHEMATICACCURACY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_NonQuantitativeAttributeAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_QuantitativeAttributeAccuracy"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_ThematicClassificationCorrectness"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_ThematicAccuracy"),
    });
    
    
    /**
     * Gets the "AbstractDQ_ThematicAccuracy" element
     */
    public org.isotc211.x2005.gmd.AbstractDQThematicAccuracyType getAbstractDQThematicAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQThematicAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQThematicAccuracyType)get_store().find_element_user(ABSTRACTDQTHEMATICACCURACY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractDQ_ThematicAccuracy" element
     */
    public void setAbstractDQThematicAccuracy(org.isotc211.x2005.gmd.AbstractDQThematicAccuracyType abstractDQThematicAccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQThematicAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQThematicAccuracyType)get_store().find_element_user(ABSTRACTDQTHEMATICACCURACY$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractDQThematicAccuracyType)get_store().add_element_user(ABSTRACTDQTHEMATICACCURACY$0);
            }
            target.set(abstractDQThematicAccuracy);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractDQ_ThematicAccuracy" element
     */
    public org.isotc211.x2005.gmd.AbstractDQThematicAccuracyType addNewAbstractDQThematicAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQThematicAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQThematicAccuracyType)get_store().add_element_user(ABSTRACTDQTHEMATICACCURACY$0);
            return target;
        }
    }
}
