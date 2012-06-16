/*
 * An XML document type.
 * Localname: DQ_FormatConsistency
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQFormatConsistencyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_FormatConsistency(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQFormatConsistencyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQLogicalConsistencyDocumentImpl implements org.isotc211.x2005.gmd.DQFormatConsistencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQFormatConsistencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQFORMATCONSISTENCY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_FormatConsistency");
    
    
    /**
     * Gets the "DQ_FormatConsistency" element
     */
    public org.isotc211.x2005.gmd.DQFormatConsistencyType getDQFormatConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQFormatConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.DQFormatConsistencyType)get_store().find_element_user(DQFORMATCONSISTENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_FormatConsistency" element
     */
    public void setDQFormatConsistency(org.isotc211.x2005.gmd.DQFormatConsistencyType dqFormatConsistency)
    {
        generatedSetterHelperImpl(dqFormatConsistency, DQFORMATCONSISTENCY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_FormatConsistency" element
     */
    public org.isotc211.x2005.gmd.DQFormatConsistencyType addNewDQFormatConsistency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQFormatConsistencyType target = null;
            target = (org.isotc211.x2005.gmd.DQFormatConsistencyType)get_store().add_element_user(DQFORMATCONSISTENCY$0);
            return target;
        }
    }
}
