/*
 * An XML document type.
 * Localname: patches
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PatchesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one patches(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PatchesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PatchesDocument
{
    private static final long serialVersionUID = 1L;
    
    public PatchesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATCHES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "patches");
    private static final org.apache.xmlbeans.QNameSet PATCHES$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "trianglePatches"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "polygonPatches"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "patches"),
    });
    
    
    /**
     * Gets the "patches" element
     */
    public net.opengis.gml.x32.SurfacePatchArrayPropertyType getPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePatchArrayPropertyType)get_store().find_element_user(PATCHES$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "patches" element
     */
    public void setPatches(net.opengis.gml.x32.SurfacePatchArrayPropertyType patches)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePatchArrayPropertyType)get_store().find_element_user(PATCHES$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.SurfacePatchArrayPropertyType)get_store().add_element_user(PATCHES$0);
            }
            target.set(patches);
        }
    }
    
    /**
     * Appends and returns a new empty "patches" element
     */
    public net.opengis.gml.x32.SurfacePatchArrayPropertyType addNewPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePatchArrayPropertyType)get_store().add_element_user(PATCHES$0);
            return target;
        }
    }
}
