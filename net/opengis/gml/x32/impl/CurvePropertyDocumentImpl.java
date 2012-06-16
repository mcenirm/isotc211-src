/*
 * An XML document type.
 * Localname: curveProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CurvePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one curveProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CurvePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CurvePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurvePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "curveProperty");
    
    
    /**
     * Gets the "curveProperty" element
     */
    public net.opengis.gml.x32.CurvePropertyType getCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().find_element_user(CURVEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "curveProperty" element
     */
    public void setCurveProperty(net.opengis.gml.x32.CurvePropertyType curveProperty)
    {
        generatedSetterHelperImpl(curveProperty, CURVEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "curveProperty" element
     */
    public net.opengis.gml.x32.CurvePropertyType addNewCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().add_element_user(CURVEPROPERTY$0);
            return target;
        }
    }
}
