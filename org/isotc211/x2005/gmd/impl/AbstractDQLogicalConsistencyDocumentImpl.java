/*
 * An XML document type.
 * Localname: AbstractDQ_LogicalConsistency
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one AbstractDQ_LogicalConsistency(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class AbstractDQLogicalConsistencyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQElementDocumentImpl implements org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDQLogicalConsistencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTDQLOGICALCONSISTENCY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_LogicalConsistency");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTDQLOGICALCONSISTENCY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_TopologicalConsistency"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_ConceptualConsistency"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_LogicalConsistency"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_FormatConsistency"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_DomainConsistency"),
    });
    
    
    /**
     * Gets the "AbstractDQ_LogicalConsistency" element
     */
    public org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyType getAbstractDQLogicalConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyType)get_store().find_element_user(ABSTRACTDQLOGICALCONSISTENCY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractDQ_LogicalConsistency" element
     */
    public void setAbstractDQLogicalConsistency(org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyType abstractDQLogicalConsistency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyType)get_store().find_element_user(ABSTRACTDQLOGICALCONSISTENCY$1, 0);
            if (target == null)
            {
                target = (org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyType)get_store().add_element_user(ABSTRACTDQLOGICALCONSISTENCY$0);
            }
            target.set(abstractDQLogicalConsistency);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractDQ_LogicalConsistency" element
     */
    public org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyType addNewAbstractDQLogicalConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.AbstractDQLogicalConsistencyType)get_store().add_element_user(ABSTRACTDQLOGICALCONSISTENCY$0);
            return target;
        }
    }
}
