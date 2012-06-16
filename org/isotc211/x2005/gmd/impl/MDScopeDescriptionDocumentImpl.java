/*
 * An XML document type.
 * Localname: MD_ScopeDescription
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDScopeDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_ScopeDescription(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDScopeDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.MDScopeDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDScopeDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDSCOPEDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_ScopeDescription");
    
    
    /**
     * Gets the "MD_ScopeDescription" element
     */
    public org.isotc211.x2005.gmd.MDScopeDescriptionType getMDScopeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeDescriptionType)get_store().find_element_user(MDSCOPEDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_ScopeDescription" element
     */
    public void setMDScopeDescription(org.isotc211.x2005.gmd.MDScopeDescriptionType mdScopeDescription)
    {
        generatedSetterHelperImpl(mdScopeDescription, MDSCOPEDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_ScopeDescription" element
     */
    public org.isotc211.x2005.gmd.MDScopeDescriptionType addNewMDScopeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDScopeDescriptionType target = null;
            target = (org.isotc211.x2005.gmd.MDScopeDescriptionType)get_store().add_element_user(MDSCOPEDESCRIPTION$0);
            return target;
        }
    }
}
