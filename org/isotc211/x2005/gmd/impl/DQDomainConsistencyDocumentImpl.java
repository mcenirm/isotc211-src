/*
 * An XML document type.
 * Localname: DQ_DomainConsistency
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQDomainConsistencyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_DomainConsistency(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQDomainConsistencyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQLogicalConsistencyDocumentImpl implements org.isotc211.x2005.gmd.DQDomainConsistencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQDomainConsistencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQDOMAINCONSISTENCY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_DomainConsistency");
    
    
    /**
     * Gets the "DQ_DomainConsistency" element
     */
    public org.isotc211.x2005.gmd.DQDomainConsistencyType getDQDomainConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDomainConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.DQDomainConsistencyType)get_store().find_element_user(DQDOMAINCONSISTENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_DomainConsistency" element
     */
    public void setDQDomainConsistency(org.isotc211.x2005.gmd.DQDomainConsistencyType dqDomainConsistency)
    {
        generatedSetterHelperImpl(dqDomainConsistency, DQDOMAINCONSISTENCY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_DomainConsistency" element
     */
    public org.isotc211.x2005.gmd.DQDomainConsistencyType addNewDQDomainConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQDomainConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.DQDomainConsistencyType)get_store().add_element_user(DQDOMAINCONSISTENCY$0);
            return target;
        }
    }
}
