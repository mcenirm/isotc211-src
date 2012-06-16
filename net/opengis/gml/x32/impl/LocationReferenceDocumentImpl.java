/*
 * An XML document type.
 * Localname: locationReference
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.LocationReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one locationReference(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class LocationReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.LocationReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "locationReference");
    
    
    /**
     * Gets the "locationReference" element
     */
    public net.opengis.gml.x32.ReferenceType getLocationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(LOCATIONREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "locationReference" element
     */
    public void setLocationReference(net.opengis.gml.x32.ReferenceType locationReference)
    {
        generatedSetterHelperImpl(locationReference, LOCATIONREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "locationReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewLocationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(LOCATIONREFERENCE$0);
            return target;
        }
    }
}
