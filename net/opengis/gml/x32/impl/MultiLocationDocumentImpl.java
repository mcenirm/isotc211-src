/*
 * An XML document type.
 * Localname: multiLocation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiLocationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiLocation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MultiLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTILOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiLocation");
    
    
    /**
     * Gets the "multiLocation" element
     */
    public net.opengis.gml.x32.MultiPointPropertyType getMultiLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiPointPropertyType target = null;
            target = (net.opengis.gml.x32.MultiPointPropertyType)get_store().find_element_user(MULTILOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiLocation" element
     */
    public void setMultiLocation(net.opengis.gml.x32.MultiPointPropertyType multiLocation)
    {
        generatedSetterHelperImpl(multiLocation, MULTILOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiLocation" element
     */
    public net.opengis.gml.x32.MultiPointPropertyType addNewMultiLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiPointPropertyType target = null;
            target = (net.opengis.gml.x32.MultiPointPropertyType)get_store().add_element_user(MULTILOCATION$0);
            return target;
        }
    }
}
