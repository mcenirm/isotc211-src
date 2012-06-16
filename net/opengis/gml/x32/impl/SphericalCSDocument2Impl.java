/*
 * An XML document type.
 * Localname: SphericalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SphericalCSDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one SphericalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SphericalCSDocument2Impl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.SphericalCSDocument2
{
    private static final long serialVersionUID = 1L;
    
    public SphericalCSDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPHERICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "SphericalCS");
    
    
    /**
     * Gets the "SphericalCS" element
     */
    public net.opengis.gml.x32.SphericalCSType getSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSType target = null;
            target = (net.opengis.gml.x32.SphericalCSType)get_store().find_element_user(SPHERICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SphericalCS" element
     */
    public void setSphericalCS(net.opengis.gml.x32.SphericalCSType sphericalCS)
    {
        generatedSetterHelperImpl(sphericalCS, SPHERICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SphericalCS" element
     */
    public net.opengis.gml.x32.SphericalCSType addNewSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSType target = null;
            target = (net.opengis.gml.x32.SphericalCSType)get_store().add_element_user(SPHERICALCS$0);
            return target;
        }
    }
}
