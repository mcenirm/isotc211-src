/*
 * An XML document type.
 * Localname: DQ_AccuracyOfATimeMeasurement
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQAccuracyOfATimeMeasurementDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_AccuracyOfATimeMeasurement(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQAccuracyOfATimeMeasurementDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQTemporalAccuracyDocumentImpl implements org.isotc211.x2005.gmd.DQAccuracyOfATimeMeasurementDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQAccuracyOfATimeMeasurementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQACCURACYOFATIMEMEASUREMENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_AccuracyOfATimeMeasurement");
    
    
    /**
     * Gets the "DQ_AccuracyOfATimeMeasurement" element
     */
    public org.isotc211.x2005.gmd.DQAccuracyOfATimeMeasurementType getDQAccuracyOfATimeMeasurement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQAccuracyOfATimeMeasurementType target = null;
            target = (org.isotc211.x2005.gmd.DQAccuracyOfATimeMeasurementType)get_store().find_element_user(DQACCURACYOFATIMEMEASUREMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_AccuracyOfATimeMeasurement" element
     */
    public void setDQAccuracyOfATimeMeasurement(org.isotc211.x2005.gmd.DQAccuracyOfATimeMeasurementType dqAccuracyOfATimeMeasurement)
    {
        generatedSetterHelperImpl(dqAccuracyOfATimeMeasurement, DQACCURACYOFATIMEMEASUREMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_AccuracyOfATimeMeasurement" element
     */
    public org.isotc211.x2005.gmd.DQAccuracyOfATimeMeasurementType addNewDQAccuracyOfATimeMeasurement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQAccuracyOfATimeMeasurementType target = null;
            target = (org.isotc211.x2005.gmd.DQAccuracyOfATimeMeasurementType)get_store().add_element_user(DQACCURACYOFATIMEMEASUREMENT$0);
            return target;
        }
    }
}
