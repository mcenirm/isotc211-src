/*
 * An XML document type.
 * Localname: pointProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PointPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one pointProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PointPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PointPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pointProperty");
    
    
    /**
     * Gets the "pointProperty" element
     */
    public net.opengis.gml.x32.PointPropertyType getPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(POINTPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pointProperty" element
     */
    public void setPointProperty(net.opengis.gml.x32.PointPropertyType pointProperty)
    {
        generatedSetterHelperImpl(pointProperty, POINTPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pointProperty" element
     */
    public net.opengis.gml.x32.PointPropertyType addNewPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().add_element_user(POINTPROPERTY$0);
            return target;
        }
    }
}
