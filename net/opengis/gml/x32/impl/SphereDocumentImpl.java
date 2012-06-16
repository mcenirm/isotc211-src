/*
 * An XML document type.
 * Localname: Sphere
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SphereDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Sphere(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SphereDocumentImpl extends net.opengis.gml.x32.impl.AbstractGriddedSurfaceDocumentImpl implements net.opengis.gml.x32.SphereDocument
{
    private static final long serialVersionUID = 1L;
    
    public SphereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPHERE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Sphere");
    
    
    /**
     * Gets the "Sphere" element
     */
    public net.opengis.gml.x32.SphereType getSphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphereType target = null;
            target = (net.opengis.gml.x32.SphereType)get_store().find_element_user(SPHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Sphere" element
     */
    public void setSphere(net.opengis.gml.x32.SphereType sphere)
    {
        generatedSetterHelperImpl(sphere, SPHERE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Sphere" element
     */
    public net.opengis.gml.x32.SphereType addNewSphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphereType target = null;
            target = (net.opengis.gml.x32.SphereType)get_store().add_element_user(SPHERE$0);
            return target;
        }
    }
}
