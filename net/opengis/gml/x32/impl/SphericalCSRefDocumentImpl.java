/*
 * An XML document type.
 * Localname: sphericalCSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SphericalCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one sphericalCSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SphericalCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SphericalCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public SphericalCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPHERICALCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sphericalCSRef");
    
    
    /**
     * Gets the "sphericalCSRef" element
     */
    public net.opengis.gml.x32.SphericalCSPropertyType getSphericalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().find_element_user(SPHERICALCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sphericalCSRef" element
     */
    public void setSphericalCSRef(net.opengis.gml.x32.SphericalCSPropertyType sphericalCSRef)
    {
        generatedSetterHelperImpl(sphericalCSRef, SPHERICALCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sphericalCSRef" element
     */
    public net.opengis.gml.x32.SphericalCSPropertyType addNewSphericalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().add_element_user(SPHERICALCSREF$0);
            return target;
        }
    }
}
