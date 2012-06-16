/*
 * An XML document type.
 * Localname: baseSurface
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BaseSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one baseSurface(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class BaseSurfaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.BaseSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASESURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "baseSurface");
    
    
    /**
     * Gets the "baseSurface" element
     */
    public net.opengis.gml.x32.SurfacePropertyType getBaseSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().find_element_user(BASESURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseSurface" element
     */
    public void setBaseSurface(net.opengis.gml.x32.SurfacePropertyType baseSurface)
    {
        generatedSetterHelperImpl(baseSurface, BASESURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseSurface" element
     */
    public net.opengis.gml.x32.SurfacePropertyType addNewBaseSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().add_element_user(BASESURFACE$0);
            return target;
        }
    }
}
