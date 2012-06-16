/*
 * An XML document type.
 * Localname: polygonPatches
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PolygonPatchesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one polygonPatches(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PolygonPatchesDocumentImpl extends net.opengis.gml.x32.impl.PatchesDocumentImpl implements net.opengis.gml.x32.PolygonPatchesDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolygonPatchesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGONPATCHES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "polygonPatches");
    
    
    /**
     * Gets the "polygonPatches" element
     */
    public net.opengis.gml.x32.SurfacePatchArrayPropertyType getPolygonPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePatchArrayPropertyType)get_store().find_element_user(POLYGONPATCHES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "polygonPatches" element
     */
    public void setPolygonPatches(net.opengis.gml.x32.SurfacePatchArrayPropertyType polygonPatches)
    {
        generatedSetterHelperImpl(polygonPatches, POLYGONPATCHES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "polygonPatches" element
     */
    public net.opengis.gml.x32.SurfacePatchArrayPropertyType addNewPolygonPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePatchArrayPropertyType)get_store().add_element_user(POLYGONPATCHES$0);
            return target;
        }
    }
}
