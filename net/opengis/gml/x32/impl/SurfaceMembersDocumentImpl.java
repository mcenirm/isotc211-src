/*
 * An XML document type.
 * Localname: surfaceMembers
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SurfaceMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one surfaceMembers(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SurfaceMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SurfaceMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "surfaceMembers");
    
    
    /**
     * Gets the "surfaceMembers" element
     */
    public net.opengis.gml.x32.SurfaceArrayPropertyType getSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfaceArrayPropertyType)get_store().find_element_user(SURFACEMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "surfaceMembers" element
     */
    public void setSurfaceMembers(net.opengis.gml.x32.SurfaceArrayPropertyType surfaceMembers)
    {
        generatedSetterHelperImpl(surfaceMembers, SURFACEMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "surfaceMembers" element
     */
    public net.opengis.gml.x32.SurfaceArrayPropertyType addNewSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfaceArrayPropertyType)get_store().add_element_user(SURFACEMEMBERS$0);
            return target;
        }
    }
}
