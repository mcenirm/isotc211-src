/*
 * An XML document type.
 * Localname: pointArrayProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PointArrayPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one pointArrayProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PointArrayPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PointArrayPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointArrayPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTARRAYPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pointArrayProperty");
    
    
    /**
     * Gets the "pointArrayProperty" element
     */
    public net.opengis.gml.x32.PointArrayPropertyType getPointArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointArrayPropertyType target = null;
            target = (net.opengis.gml.x32.PointArrayPropertyType)get_store().find_element_user(POINTARRAYPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pointArrayProperty" element
     */
    public void setPointArrayProperty(net.opengis.gml.x32.PointArrayPropertyType pointArrayProperty)
    {
        generatedSetterHelperImpl(pointArrayProperty, POINTARRAYPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pointArrayProperty" element
     */
    public net.opengis.gml.x32.PointArrayPropertyType addNewPointArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointArrayPropertyType target = null;
            target = (net.opengis.gml.x32.PointArrayPropertyType)get_store().add_element_user(POINTARRAYPROPERTY$0);
            return target;
        }
    }
}
