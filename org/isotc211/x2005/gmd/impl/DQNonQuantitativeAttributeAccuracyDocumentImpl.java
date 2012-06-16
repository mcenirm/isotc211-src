/*
 * An XML document type.
 * Localname: DQ_NonQuantitativeAttributeAccuracy
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQNonQuantitativeAttributeAccuracyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_NonQuantitativeAttributeAccuracy(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQNonQuantitativeAttributeAccuracyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQThematicAccuracyDocumentImpl implements org.isotc211.x2005.gmd.DQNonQuantitativeAttributeAccuracyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQNonQuantitativeAttributeAccuracyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQNONQUANTITATIVEATTRIBUTEACCURACY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_NonQuantitativeAttributeAccuracy");
    
    
    /**
     * Gets the "DQ_NonQuantitativeAttributeAccuracy" element
     */
    public org.isotc211.x2005.gmd.DQNonQuantitativeAttributeAccuracyType getDQNonQuantitativeAttributeAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQNonQuantitativeAttributeAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.DQNonQuantitativeAttributeAccuracyType)get_store().find_element_user(DQNONQUANTITATIVEATTRIBUTEACCURACY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_NonQuantitativeAttributeAccuracy" element
     */
    public void setDQNonQuantitativeAttributeAccuracy(org.isotc211.x2005.gmd.DQNonQuantitativeAttributeAccuracyType dqNonQuantitativeAttributeAccuracy)
    {
        generatedSetterHelperImpl(dqNonQuantitativeAttributeAccuracy, DQNONQUANTITATIVEATTRIBUTEACCURACY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_NonQuantitativeAttributeAccuracy" element
     */
    public org.isotc211.x2005.gmd.DQNonQuantitativeAttributeAccuracyType addNewDQNonQuantitativeAttributeAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQNonQuantitativeAttributeAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.DQNonQuantitativeAttributeAccuracyType)get_store().add_element_user(DQNONQUANTITATIVEATTRIBUTEACCURACY$0);
            return target;
        }
    }
}
