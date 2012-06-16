/*
 * An XML document type.
 * Localname: locationName
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.LocationNameDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one locationName(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class LocationNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.LocationNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "locationName");
    
    
    /**
     * Gets the "locationName" element
     */
    public net.opengis.gml.x32.CodeType getLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(LOCATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "locationName" element
     */
    public void setLocationName(net.opengis.gml.x32.CodeType locationName)
    {
        generatedSetterHelperImpl(locationName, LOCATIONNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "locationName" element
     */
    public net.opengis.gml.x32.CodeType addNewLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(LOCATIONNAME$0);
            return target;
        }
    }
}
