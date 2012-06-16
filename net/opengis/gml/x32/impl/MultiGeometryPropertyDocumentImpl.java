/*
 * An XML document type.
 * Localname: multiGeometryProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiGeometryPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiGeometryProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiGeometryPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MultiGeometryPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiGeometryPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIGEOMETRYPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiGeometryProperty");
    
    
    /**
     * Gets the "multiGeometryProperty" element
     */
    public net.opengis.gml.x32.MultiGeometryPropertyType getMultiGeometryProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiGeometryPropertyType target = null;
            target = (net.opengis.gml.x32.MultiGeometryPropertyType)get_store().find_element_user(MULTIGEOMETRYPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiGeometryProperty" element
     */
    public void setMultiGeometryProperty(net.opengis.gml.x32.MultiGeometryPropertyType multiGeometryProperty)
    {
        generatedSetterHelperImpl(multiGeometryProperty, MULTIGEOMETRYPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiGeometryProperty" element
     */
    public net.opengis.gml.x32.MultiGeometryPropertyType addNewMultiGeometryProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiGeometryPropertyType target = null;
            target = (net.opengis.gml.x32.MultiGeometryPropertyType)get_store().add_element_user(MULTIGEOMETRYPROPERTY$0);
            return target;
        }
    }
}
