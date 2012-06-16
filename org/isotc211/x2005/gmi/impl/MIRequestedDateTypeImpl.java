/*
 * XML Type:  MI_RequestedDate_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIRequestedDateType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_RequestedDate_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIRequestedDateTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIRequestedDateType
{
    private static final long serialVersionUID = 1L;
    
    public MIRequestedDateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTEDDATEOFCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "requestedDateOfCollection");
    private static final javax.xml.namespace.QName LATESTACCEPTABLEDATE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "latestAcceptableDate");
    
    
    /**
     * Gets the "requestedDateOfCollection" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType getRequestedDateOfCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().find_element_user(REQUESTEDDATEOFCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestedDateOfCollection" element
     */
    public void setRequestedDateOfCollection(org.isotc211.x2005.gco.DateTimePropertyType requestedDateOfCollection)
    {
        generatedSetterHelperImpl(requestedDateOfCollection, REQUESTEDDATEOFCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestedDateOfCollection" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType addNewRequestedDateOfCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().add_element_user(REQUESTEDDATEOFCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Gets the "latestAcceptableDate" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType getLatestAcceptableDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().find_element_user(LATESTACCEPTABLEDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "latestAcceptableDate" element
     */
    public void setLatestAcceptableDate(org.isotc211.x2005.gco.DateTimePropertyType latestAcceptableDate)
    {
        generatedSetterHelperImpl(latestAcceptableDate, LATESTACCEPTABLEDATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "latestAcceptableDate" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType addNewLatestAcceptableDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().add_element_user(LATESTACCEPTABLEDATE$2);
            return target;
        }
    }
}
