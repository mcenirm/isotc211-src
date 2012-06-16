/*
 * An XML document type.
 * Localname: PolygonPatch
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PolygonPatchDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one PolygonPatch(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PolygonPatchDocumentImpl extends net.opengis.gml.x32.impl.AbstractSurfacePatchDocumentImpl implements net.opengis.gml.x32.PolygonPatchDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolygonPatchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGONPATCH$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolygonPatch");
    
    
    /**
     * Gets the "PolygonPatch" element
     */
    public net.opengis.gml.x32.PolygonPatchType getPolygonPatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolygonPatchType target = null;
            target = (net.opengis.gml.x32.PolygonPatchType)get_store().find_element_user(POLYGONPATCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PolygonPatch" element
     */
    public void setPolygonPatch(net.opengis.gml.x32.PolygonPatchType polygonPatch)
    {
        generatedSetterHelperImpl(polygonPatch, POLYGONPATCH$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PolygonPatch" element
     */
    public net.opengis.gml.x32.PolygonPatchType addNewPolygonPatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolygonPatchType target = null;
            target = (net.opengis.gml.x32.PolygonPatchType)get_store().add_element_user(POLYGONPATCH$0);
            return target;
        }
    }
}
