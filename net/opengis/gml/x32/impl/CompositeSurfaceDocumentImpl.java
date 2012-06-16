/*
 * An XML document type.
 * Localname: CompositeSurface
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CompositeSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CompositeSurface(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CompositeSurfaceDocumentImpl extends net.opengis.gml.x32.impl.AbstractSurfaceDocumentImpl implements net.opengis.gml.x32.CompositeSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompositeSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOSITESURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeSurface");
    
    
    /**
     * Gets the "CompositeSurface" element
     */
    public net.opengis.gml.x32.CompositeSurfaceType getCompositeSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompositeSurfaceType target = null;
            target = (net.opengis.gml.x32.CompositeSurfaceType)get_store().find_element_user(COMPOSITESURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompositeSurface" element
     */
    public void setCompositeSurface(net.opengis.gml.x32.CompositeSurfaceType compositeSurface)
    {
        generatedSetterHelperImpl(compositeSurface, COMPOSITESURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CompositeSurface" element
     */
    public net.opengis.gml.x32.CompositeSurfaceType addNewCompositeSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompositeSurfaceType target = null;
            target = (net.opengis.gml.x32.CompositeSurfaceType)get_store().add_element_user(COMPOSITESURFACE$0);
            return target;
        }
    }
}
