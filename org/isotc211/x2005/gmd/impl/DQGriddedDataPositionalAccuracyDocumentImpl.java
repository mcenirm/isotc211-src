/*
 * An XML document type.
 * Localname: DQ_GriddedDataPositionalAccuracy
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQGriddedDataPositionalAccuracyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_GriddedDataPositionalAccuracy(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQGriddedDataPositionalAccuracyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQPositionalAccuracyDocumentImpl implements org.isotc211.x2005.gmd.DQGriddedDataPositionalAccuracyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQGriddedDataPositionalAccuracyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQGRIDDEDDATAPOSITIONALACCURACY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_GriddedDataPositionalAccuracy");
    
    
    /**
     * Gets the "DQ_GriddedDataPositionalAccuracy" element
     */
    public org.isotc211.x2005.gmd.DQGriddedDataPositionalAccuracyType getDQGriddedDataPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQGriddedDataPositionalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.DQGriddedDataPositionalAccuracyType)get_store().find_element_user(DQGRIDDEDDATAPOSITIONALACCURACY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_GriddedDataPositionalAccuracy" element
     */
    public void setDQGriddedDataPositionalAccuracy(org.isotc211.x2005.gmd.DQGriddedDataPositionalAccuracyType dqGriddedDataPositionalAccuracy)
    {
        generatedSetterHelperImpl(dqGriddedDataPositionalAccuracy, DQGRIDDEDDATAPOSITIONALACCURACY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_GriddedDataPositionalAccuracy" element
     */
    public org.isotc211.x2005.gmd.DQGriddedDataPositionalAccuracyType addNewDQGriddedDataPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQGriddedDataPositionalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.DQGriddedDataPositionalAccuracyType)get_store().add_element_user(DQGRIDDEDDATAPOSITIONALACCURACY$0);
            return target;
        }
    }
}
