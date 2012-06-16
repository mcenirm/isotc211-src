/*
 * An XML document type.
 * Localname: DQ_TopologicalConsistency
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQTopologicalConsistencyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_TopologicalConsistency(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQTopologicalConsistencyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQLogicalConsistencyDocumentImpl implements org.isotc211.x2005.gmd.DQTopologicalConsistencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQTopologicalConsistencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQTOPOLOGICALCONSISTENCY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_TopologicalConsistency");
    
    
    /**
     * Gets the "DQ_TopologicalConsistency" element
     */
    public org.isotc211.x2005.gmd.DQTopologicalConsistencyType getDQTopologicalConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQTopologicalConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.DQTopologicalConsistencyType)get_store().find_element_user(DQTOPOLOGICALCONSISTENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_TopologicalConsistency" element
     */
    public void setDQTopologicalConsistency(org.isotc211.x2005.gmd.DQTopologicalConsistencyType dqTopologicalConsistency)
    {
        generatedSetterHelperImpl(dqTopologicalConsistency, DQTOPOLOGICALCONSISTENCY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_TopologicalConsistency" element
     */
    public org.isotc211.x2005.gmd.DQTopologicalConsistencyType addNewDQTopologicalConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQTopologicalConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.DQTopologicalConsistencyType)get_store().add_element_user(DQTOPOLOGICALCONSISTENCY$0);
            return target;
        }
    }
}
