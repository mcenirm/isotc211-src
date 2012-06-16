/*
 * An XML document type.
 * Localname: multiSurfaceProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiSurfacePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiSurfaceProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiSurfacePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MultiSurfacePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSurfacePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISURFACEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiSurfaceProperty");
    
    
    /**
     * Gets the "multiSurfaceProperty" element
     */
    public net.opengis.gml.x32.MultiSurfacePropertyType getMultiSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.x32.MultiSurfacePropertyType)get_store().find_element_user(MULTISURFACEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiSurfaceProperty" element
     */
    public void setMultiSurfaceProperty(net.opengis.gml.x32.MultiSurfacePropertyType multiSurfaceProperty)
    {
        generatedSetterHelperImpl(multiSurfaceProperty, MULTISURFACEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiSurfaceProperty" element
     */
    public net.opengis.gml.x32.MultiSurfacePropertyType addNewMultiSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.x32.MultiSurfacePropertyType)get_store().add_element_user(MULTISURFACEPROPERTY$0);
            return target;
        }
    }
}
