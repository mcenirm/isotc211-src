/*
 * An XML document type.
 * Localname: multiCurveProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiCurvePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiCurveProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiCurvePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MultiCurvePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCurvePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICURVEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiCurveProperty");
    
    
    /**
     * Gets the "multiCurveProperty" element
     */
    public net.opengis.gml.x32.MultiCurvePropertyType getMultiCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiCurvePropertyType target = null;
            target = (net.opengis.gml.x32.MultiCurvePropertyType)get_store().find_element_user(MULTICURVEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiCurveProperty" element
     */
    public void setMultiCurveProperty(net.opengis.gml.x32.MultiCurvePropertyType multiCurveProperty)
    {
        generatedSetterHelperImpl(multiCurveProperty, MULTICURVEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiCurveProperty" element
     */
    public net.opengis.gml.x32.MultiCurvePropertyType addNewMultiCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiCurvePropertyType target = null;
            target = (net.opengis.gml.x32.MultiCurvePropertyType)get_store().add_element_user(MULTICURVEPROPERTY$0);
            return target;
        }
    }
}
