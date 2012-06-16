/*
 * An XML document type.
 * Localname: CI_OnlineResource
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIOnlineResourceDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one CI_OnlineResource(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class CIOnlineResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmd.CIOnlineResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public CIOnlineResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIONLINERESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "CI_OnlineResource");
    
    
    /**
     * Gets the "CI_OnlineResource" element
     */
    public org.isotc211.x2005.gmd.CIOnlineResourceType getCIOnlineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnlineResourceType target = null;
            target = (org.isotc211.x2005.gmd.CIOnlineResourceType)get_store().find_element_user(CIONLINERESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CI_OnlineResource" element
     */
    public void setCIOnlineResource(org.isotc211.x2005.gmd.CIOnlineResourceType ciOnlineResource)
    {
        generatedSetterHelperImpl(ciOnlineResource, CIONLINERESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CI_OnlineResource" element
     */
    public org.isotc211.x2005.gmd.CIOnlineResourceType addNewCIOnlineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnlineResourceType target = null;
            target = (org.isotc211.x2005.gmd.CIOnlineResourceType)get_store().add_element_user(CIONLINERESOURCE$0);
            return target;
        }
    }
}
