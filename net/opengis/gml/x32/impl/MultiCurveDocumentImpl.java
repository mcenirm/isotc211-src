/*
 * An XML document type.
 * Localname: MultiCurve
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiCurveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one MultiCurve(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiCurveDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeometricAggregateDocumentImpl implements net.opengis.gml.x32.MultiCurveDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurve");
    
    
    /**
     * Gets the "MultiCurve" element
     */
    public net.opengis.gml.x32.MultiCurveType getMultiCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiCurveType target = null;
            target = (net.opengis.gml.x32.MultiCurveType)get_store().find_element_user(MULTICURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiCurve" element
     */
    public void setMultiCurve(net.opengis.gml.x32.MultiCurveType multiCurve)
    {
        generatedSetterHelperImpl(multiCurve, MULTICURVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiCurve" element
     */
    public net.opengis.gml.x32.MultiCurveType addNewMultiCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiCurveType target = null;
            target = (net.opengis.gml.x32.MultiCurveType)get_store().add_element_user(MULTICURVE$0);
            return target;
        }
    }
}
