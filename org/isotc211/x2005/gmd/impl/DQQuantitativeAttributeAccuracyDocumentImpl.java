/*
 * An XML document type.
 * Localname: DQ_QuantitativeAttributeAccuracy
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQQuantitativeAttributeAccuracyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_QuantitativeAttributeAccuracy(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQQuantitativeAttributeAccuracyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQThematicAccuracyDocumentImpl implements org.isotc211.x2005.gmd.DQQuantitativeAttributeAccuracyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQQuantitativeAttributeAccuracyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQQUANTITATIVEATTRIBUTEACCURACY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_QuantitativeAttributeAccuracy");
    
    
    /**
     * Gets the "DQ_QuantitativeAttributeAccuracy" element
     */
    public org.isotc211.x2005.gmd.DQQuantitativeAttributeAccuracyType getDQQuantitativeAttributeAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQQuantitativeAttributeAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.DQQuantitativeAttributeAccuracyType)get_store().find_element_user(DQQUANTITATIVEATTRIBUTEACCURACY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_QuantitativeAttributeAccuracy" element
     */
    public void setDQQuantitativeAttributeAccuracy(org.isotc211.x2005.gmd.DQQuantitativeAttributeAccuracyType dqQuantitativeAttributeAccuracy)
    {
        generatedSetterHelperImpl(dqQuantitativeAttributeAccuracy, DQQUANTITATIVEATTRIBUTEACCURACY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_QuantitativeAttributeAccuracy" element
     */
    public org.isotc211.x2005.gmd.DQQuantitativeAttributeAccuracyType addNewDQQuantitativeAttributeAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQQuantitativeAttributeAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.DQQuantitativeAttributeAccuracyType)get_store().add_element_user(DQQUANTITATIVEATTRIBUTEACCURACY$0);
            return target;
        }
    }
}
