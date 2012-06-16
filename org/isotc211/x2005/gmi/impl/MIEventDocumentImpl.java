/*
 * An XML document type.
 * Localname: MI_Event
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * A document containing one MI_Event(@http://www.isotc211.org/2005/gmi) element.
 *
 * This is a complex type.
 */
public class MIEventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.isotc211.x2005.gmi.MIEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public MIEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIEVENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "MI_Event");
    
    
    /**
     * Gets the "MI_Event" element
     */
    public org.isotc211.x2005.gmi.MIEventType getMIEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventType target = null;
            target = (org.isotc211.x2005.gmi.MIEventType)get_store().find_element_user(MIEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MI_Event" element
     */
    public void setMIEvent(org.isotc211.x2005.gmi.MIEventType miEvent)
    {
        generatedSetterHelperImpl(miEvent, MIEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MI_Event" element
     */
    public org.isotc211.x2005.gmi.MIEventType addNewMIEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventType target = null;
            target = (org.isotc211.x2005.gmi.MIEventType)get_store().add_element_user(MIEVENT$0);
            return target;
        }
    }
}
