/*
 * An XML document type.
 * Localname: surfaceMember
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SurfaceMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one surfaceMember(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SurfaceMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SurfaceMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "surfaceMember");
    
    
    /**
     * Gets the "surfaceMember" element
     */
    public net.opengis.gml.x32.SurfacePropertyType getSurfaceMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().find_element_user(SURFACEMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "surfaceMember" element
     */
    public void setSurfaceMember(net.opengis.gml.x32.SurfacePropertyType surfaceMember)
    {
        generatedSetterHelperImpl(surfaceMember, SURFACEMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "surfaceMember" element
     */
    public net.opengis.gml.x32.SurfacePropertyType addNewSurfaceMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().add_element_user(SURFACEMEMBER$0);
            return target;
        }
    }
}
