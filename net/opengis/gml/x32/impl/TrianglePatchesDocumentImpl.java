/*
 * An XML document type.
 * Localname: trianglePatches
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TrianglePatchesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one trianglePatches(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TrianglePatchesDocumentImpl extends net.opengis.gml.x32.impl.PatchesDocumentImpl implements net.opengis.gml.x32.TrianglePatchesDocument
{
    private static final long serialVersionUID = 1L;
    
    public TrianglePatchesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIANGLEPATCHES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "trianglePatches");
    
    
    /**
     * Gets the "trianglePatches" element
     */
    public net.opengis.gml.x32.SurfacePatchArrayPropertyType getTrianglePatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePatchArrayPropertyType)get_store().find_element_user(TRIANGLEPATCHES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "trianglePatches" element
     */
    public void setTrianglePatches(net.opengis.gml.x32.SurfacePatchArrayPropertyType trianglePatches)
    {
        generatedSetterHelperImpl(trianglePatches, TRIANGLEPATCHES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "trianglePatches" element
     */
    public net.opengis.gml.x32.SurfacePatchArrayPropertyType addNewTrianglePatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePatchArrayPropertyType)get_store().add_element_user(TRIANGLEPATCHES$0);
            return target;
        }
    }
}
