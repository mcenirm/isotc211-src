/*
 * An XML document type.
 * Localname: DQ_TemporalValidity
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQTemporalValidityDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_TemporalValidity(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQTemporalValidityDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQTemporalAccuracyDocumentImpl implements org.isotc211.x2005.gmd.DQTemporalValidityDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQTemporalValidityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQTEMPORALVALIDITY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_TemporalValidity");
    
    
    /**
     * Gets the "DQ_TemporalValidity" element
     */
    public org.isotc211.x2005.gmd.DQTemporalValidityType getDQTemporalValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQTemporalValidityType target = null;
            target = (org.isotc211.x2005.gmd.DQTemporalValidityType)get_store().find_element_user(DQTEMPORALVALIDITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_TemporalValidity" element
     */
    public void setDQTemporalValidity(org.isotc211.x2005.gmd.DQTemporalValidityType dqTemporalValidity)
    {
        generatedSetterHelperImpl(dqTemporalValidity, DQTEMPORALVALIDITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_TemporalValidity" element
     */
    public org.isotc211.x2005.gmd.DQTemporalValidityType addNewDQTemporalValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQTemporalValidityType target = null;
            target = (org.isotc211.x2005.gmd.DQTemporalValidityType)get_store().add_element_user(DQTEMPORALVALIDITY$0);
            return target;
        }
    }
}
