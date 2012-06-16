/*
 * An XML document type.
 * Localname: CubicSpline
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CubicSplineDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CubicSpline(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CubicSplineDocumentImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentDocumentImpl implements net.opengis.gml.x32.CubicSplineDocument
{
    private static final long serialVersionUID = 1L;
    
    public CubicSplineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUBICSPLINE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CubicSpline");
    
    
    /**
     * Gets the "CubicSpline" element
     */
    public net.opengis.gml.x32.CubicSplineType getCubicSpline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CubicSplineType target = null;
            target = (net.opengis.gml.x32.CubicSplineType)get_store().find_element_user(CUBICSPLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CubicSpline" element
     */
    public void setCubicSpline(net.opengis.gml.x32.CubicSplineType cubicSpline)
    {
        generatedSetterHelperImpl(cubicSpline, CUBICSPLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CubicSpline" element
     */
    public net.opengis.gml.x32.CubicSplineType addNewCubicSpline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CubicSplineType target = null;
            target = (net.opengis.gml.x32.CubicSplineType)get_store().add_element_user(CUBICSPLINE$0);
            return target;
        }
    }
}
