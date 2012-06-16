/*
 * An XML document type.
 * Localname: DQ_TemporalConsistency
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQTemporalConsistencyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_TemporalConsistency(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQTemporalConsistencyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQTemporalAccuracyDocumentImpl implements org.isotc211.x2005.gmd.DQTemporalConsistencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQTemporalConsistencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQTEMPORALCONSISTENCY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_TemporalConsistency");
    
    
    /**
     * Gets the "DQ_TemporalConsistency" element
     */
    public org.isotc211.x2005.gmd.DQTemporalConsistencyType getDQTemporalConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQTemporalConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.DQTemporalConsistencyType)get_store().find_element_user(DQTEMPORALCONSISTENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_TemporalConsistency" element
     */
    public void setDQTemporalConsistency(org.isotc211.x2005.gmd.DQTemporalConsistencyType dqTemporalConsistency)
    {
        generatedSetterHelperImpl(dqTemporalConsistency, DQTEMPORALCONSISTENCY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_TemporalConsistency" element
     */
    public org.isotc211.x2005.gmd.DQTemporalConsistencyType addNewDQTemporalConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQTemporalConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.DQTemporalConsistencyType)get_store().add_element_user(DQTEMPORALCONSISTENCY$0);
            return target;
        }
    }
}
