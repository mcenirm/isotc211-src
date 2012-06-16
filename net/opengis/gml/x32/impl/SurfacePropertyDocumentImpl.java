/*
 * An XML document type.
 * Localname: surfaceProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SurfacePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one surfaceProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SurfacePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SurfacePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfacePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "surfaceProperty");
    
    
    /**
     * Gets the "surfaceProperty" element
     */
    public net.opengis.gml.x32.SurfacePropertyType getSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().find_element_user(SURFACEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "surfaceProperty" element
     */
    public void setSurfaceProperty(net.opengis.gml.x32.SurfacePropertyType surfaceProperty)
    {
        generatedSetterHelperImpl(surfaceProperty, SURFACEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "surfaceProperty" element
     */
    public net.opengis.gml.x32.SurfacePropertyType addNewSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().add_element_user(SURFACEPROPERTY$0);
            return target;
        }
    }
}
