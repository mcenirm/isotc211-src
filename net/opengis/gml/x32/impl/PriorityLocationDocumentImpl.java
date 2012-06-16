/*
 * An XML document type.
 * Localname: priorityLocation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PriorityLocationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one priorityLocation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PriorityLocationDocumentImpl extends net.opengis.gml.x32.impl.LocationDocumentImpl implements net.opengis.gml.x32.PriorityLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public PriorityLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIORITYLOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "priorityLocation");
    
    
    /**
     * Gets the "priorityLocation" element
     */
    public net.opengis.gml.x32.PriorityLocationPropertyType getPriorityLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PriorityLocationPropertyType target = null;
            target = (net.opengis.gml.x32.PriorityLocationPropertyType)get_store().find_element_user(PRIORITYLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "priorityLocation" element
     */
    public void setPriorityLocation(net.opengis.gml.x32.PriorityLocationPropertyType priorityLocation)
    {
        generatedSetterHelperImpl(priorityLocation, PRIORITYLOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "priorityLocation" element
     */
    public net.opengis.gml.x32.PriorityLocationPropertyType addNewPriorityLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PriorityLocationPropertyType target = null;
            target = (net.opengis.gml.x32.PriorityLocationPropertyType)get_store().add_element_user(PRIORITYLOCATION$0);
            return target;
        }
    }
}
