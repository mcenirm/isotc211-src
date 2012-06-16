/*
 * An XML document type.
 * Localname: Cylinder
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CylinderDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Cylinder(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CylinderDocumentImpl extends net.opengis.gml.x32.impl.AbstractGriddedSurfaceDocumentImpl implements net.opengis.gml.x32.CylinderDocument
{
    private static final long serialVersionUID = 1L;
    
    public CylinderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CYLINDER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Cylinder");
    
    
    /**
     * Gets the "Cylinder" element
     */
    public net.opengis.gml.x32.CylinderType getCylinder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CylinderType target = null;
            target = (net.opengis.gml.x32.CylinderType)get_store().find_element_user(CYLINDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cylinder" element
     */
    public void setCylinder(net.opengis.gml.x32.CylinderType cylinder)
    {
        generatedSetterHelperImpl(cylinder, CYLINDER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Cylinder" element
     */
    public net.opengis.gml.x32.CylinderType addNewCylinder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CylinderType target = null;
            target = (net.opengis.gml.x32.CylinderType)get_store().add_element_user(CYLINDER$0);
            return target;
        }
    }
}
