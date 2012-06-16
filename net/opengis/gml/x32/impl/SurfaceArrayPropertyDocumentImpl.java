/*
 * An XML document type.
 * Localname: surfaceArrayProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SurfaceArrayPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one surfaceArrayProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SurfaceArrayPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SurfaceArrayPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceArrayPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEARRAYPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "surfaceArrayProperty");
    
    
    /**
     * Gets the "surfaceArrayProperty" element
     */
    public net.opengis.gml.x32.SurfaceArrayPropertyType getSurfaceArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfaceArrayPropertyType)get_store().find_element_user(SURFACEARRAYPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "surfaceArrayProperty" element
     */
    public void setSurfaceArrayProperty(net.opengis.gml.x32.SurfaceArrayPropertyType surfaceArrayProperty)
    {
        generatedSetterHelperImpl(surfaceArrayProperty, SURFACEARRAYPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "surfaceArrayProperty" element
     */
    public net.opengis.gml.x32.SurfaceArrayPropertyType addNewSurfaceArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfaceArrayPropertyType)get_store().add_element_user(SURFACEARRAYPROPERTY$0);
            return target;
        }
    }
}
