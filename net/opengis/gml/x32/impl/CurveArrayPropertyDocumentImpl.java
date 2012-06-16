/*
 * An XML document type.
 * Localname: curveArrayProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CurveArrayPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one curveArrayProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CurveArrayPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CurveArrayPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurveArrayPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEARRAYPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "curveArrayProperty");
    
    
    /**
     * Gets the "curveArrayProperty" element
     */
    public net.opengis.gml.x32.CurveArrayPropertyType getCurveArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.x32.CurveArrayPropertyType)get_store().find_element_user(CURVEARRAYPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "curveArrayProperty" element
     */
    public void setCurveArrayProperty(net.opengis.gml.x32.CurveArrayPropertyType curveArrayProperty)
    {
        generatedSetterHelperImpl(curveArrayProperty, CURVEARRAYPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "curveArrayProperty" element
     */
    public net.opengis.gml.x32.CurveArrayPropertyType addNewCurveArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.x32.CurveArrayPropertyType)get_store().add_element_user(CURVEARRAYPROPERTY$0);
            return target;
        }
    }
}
