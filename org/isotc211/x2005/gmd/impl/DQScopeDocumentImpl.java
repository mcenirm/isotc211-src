/*
 * An XML document type.
 * Localname: DQ_Scope
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQScopeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_Scope(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQScopeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.DQScopeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQScopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQSCOPE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_Scope");
    
    
    /**
     * Gets the "DQ_Scope" element
     */
    public org.isotc211.x2005.gmd.DQScopeType getDQScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQScopeType target = null;
            target = (org.isotc211.x2005.gmd.DQScopeType)get_store().find_element_user(DQSCOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_Scope" element
     */
    public void setDQScope(org.isotc211.x2005.gmd.DQScopeType dqScope)
    {
        generatedSetterHelperImpl(dqScope, DQSCOPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_Scope" element
     */
    public org.isotc211.x2005.gmd.DQScopeType addNewDQScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQScopeType target = null;
            target = (org.isotc211.x2005.gmd.DQScopeType)get_store().add_element_user(DQSCOPE$0);
            return target;
        }
    }
}
