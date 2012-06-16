/*
 * An XML document type.
 * Localname: topoSurfaceProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoSurfacePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one topoSurfaceProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TopoSurfacePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TopoSurfacePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoSurfacePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOSURFACEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "topoSurfaceProperty");
    
    
    /**
     * Gets the "topoSurfaceProperty" element
     */
    public net.opengis.gml.x32.TopoSurfacePropertyType getTopoSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoSurfacePropertyType target = null;
            target = (net.opengis.gml.x32.TopoSurfacePropertyType)get_store().find_element_user(TOPOSURFACEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoSurfaceProperty" element
     */
    public void setTopoSurfaceProperty(net.opengis.gml.x32.TopoSurfacePropertyType topoSurfaceProperty)
    {
        generatedSetterHelperImpl(topoSurfaceProperty, TOPOSURFACEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoSurfaceProperty" element
     */
    public net.opengis.gml.x32.TopoSurfacePropertyType addNewTopoSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoSurfacePropertyType target = null;
            target = (net.opengis.gml.x32.TopoSurfacePropertyType)get_store().add_element_user(TOPOSURFACEPROPERTY$0);
            return target;
        }
    }
}
