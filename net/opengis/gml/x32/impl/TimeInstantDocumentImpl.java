/*
 * An XML document type.
 * Localname: TimeInstant
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeInstantDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeInstant(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeInstantDocumentImpl extends net.opengis.gml.x32.impl.AbstractTimeGeometricPrimitiveDocumentImpl implements net.opengis.gml.x32.TimeInstantDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeInstantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEINSTANT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeInstant");
    
    
    /**
     * Gets the "TimeInstant" element
     */
    public net.opengis.gml.x32.TimeInstantType getTimeInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeInstantType target = null;
            target = (net.opengis.gml.x32.TimeInstantType)get_store().find_element_user(TIMEINSTANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeInstant" element
     */
    public void setTimeInstant(net.opengis.gml.x32.TimeInstantType timeInstant)
    {
        generatedSetterHelperImpl(timeInstant, TIMEINSTANT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeInstant" element
     */
    public net.opengis.gml.x32.TimeInstantType addNewTimeInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeInstantType target = null;
            target = (net.opengis.gml.x32.TimeInstantType)get_store().add_element_user(TIMEINSTANT$0);
            return target;
        }
    }
}
