/*
 * An XML document type.
 * Localname: DQ_ConceptualConsistency
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQConceptualConsistencyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_ConceptualConsistency(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQConceptualConsistencyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQLogicalConsistencyDocumentImpl implements org.isotc211.x2005.gmd.DQConceptualConsistencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQConceptualConsistencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQCONCEPTUALCONSISTENCY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_ConceptualConsistency");
    
    
    /**
     * Gets the "DQ_ConceptualConsistency" element
     */
    public org.isotc211.x2005.gmd.DQConceptualConsistencyType getDQConceptualConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQConceptualConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.DQConceptualConsistencyType)get_store().find_element_user(DQCONCEPTUALCONSISTENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_ConceptualConsistency" element
     */
    public void setDQConceptualConsistency(org.isotc211.x2005.gmd.DQConceptualConsistencyType dqConceptualConsistency)
    {
        generatedSetterHelperImpl(dqConceptualConsistency, DQCONCEPTUALCONSISTENCY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_ConceptualConsistency" element
     */
    public org.isotc211.x2005.gmd.DQConceptualConsistencyType addNewDQConceptualConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQConceptualConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.DQConceptualConsistencyType)get_store().add_element_user(DQCONCEPTUALCONSISTENCY$0);
            return target;
        }
    }
}
