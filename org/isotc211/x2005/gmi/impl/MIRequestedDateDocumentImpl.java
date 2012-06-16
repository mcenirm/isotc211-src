/*
 * An XML document type.
 * Localname: MI_RequestedDate
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIRequestedDateDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_RequestedDate(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIRequestedDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIRequestedDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIRequestedDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIREQUESTEDDATE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_RequestedDate");
    
    
    /**
     * Gets the "MI_RequestedDate" element
     */
    public org.isotc211.x2005.gmi.MIRequestedDateType getMIRequestedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequestedDateType target = null;
            target = (org.isotc211.x2005.gmi.MIRequestedDateType)get_store().find_element_user(MIREQUESTEDDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_RequestedDate" element
     */
    public void setMIRequestedDate(org.isotc211.x2005.gmi.MIRequestedDateType miRequestedDate)
    {
        generatedSetterHelperImpl(miRequestedDate, MIREQUESTEDDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_RequestedDate" element
     */
    public org.isotc211.x2005.gmi.MIRequestedDateType addNewMIRequestedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequestedDateType target = null;
            target = (org.isotc211.x2005.gmi.MIRequestedDateType)get_store().add_element_user(MIREQUESTEDDATE$0);
            return target;
        }
    }
}
