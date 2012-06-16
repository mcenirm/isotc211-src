/*
 * An XML document type.
 * Localname: MI_GCPCollection
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIGCPCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_GCPCollection(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIGCPCollectionDocumentImpl extends org.isotc211.x2005.gmi.impl.AbstractMIGeolocationInformationDocumentImpl implements org.isotc211.x2005.gmi.MIGCPCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIGCPCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIGCPCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_GCPCollection");
    
    
    /**
     * Gets the "MI_GCPCollection" element
     */
    public org.isotc211.x2005.gmi.MIGCPCollectionType getMIGCPCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPCollectionType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPCollectionType)get_store().find_element_user(MIGCPCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_GCPCollection" element
     */
    public void setMIGCPCollection(org.isotc211.x2005.gmi.MIGCPCollectionType migcpCollection)
    {
        generatedSetterHelperImpl(migcpCollection, MIGCPCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_GCPCollection" element
     */
    public org.isotc211.x2005.gmi.MIGCPCollectionType addNewMIGCPCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPCollectionType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPCollectionType)get_store().add_element_user(MIGCPCOLLECTION$0);
            return target;
        }
    }
}
