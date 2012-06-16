/*
 * An XML document type.
 * Localname: BSpline
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BSplineDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one BSpline(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class BSplineDocumentImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentDocumentImpl implements net.opengis.gml.x32.BSplineDocument
{
    private static final long serialVersionUID = 1L;
    
    public BSplineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BSPLINE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BSpline");
    private static final org.apache.xmlbeans.QNameSet BSPLINE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Bezier"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BSpline"),
    });
    
    
    /**
     * Gets the "BSpline" element
     */
    public net.opengis.gml.x32.BSplineType getBSpline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BSplineType target = null;
            target = (net.opengis.gml.x32.BSplineType)get_store().find_element_user(BSPLINE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BSpline" element
     */
    public void setBSpline(net.opengis.gml.x32.BSplineType bSpline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BSplineType target = null;
            target = (net.opengis.gml.x32.BSplineType)get_store().find_element_user(BSPLINE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.BSplineType)get_store().add_element_user(BSPLINE$0);
            }
            target.set(bSpline);
        }
    }
    
    /**
     * Appends and returns a new empty "BSpline" element
     */
    public net.opengis.gml.x32.BSplineType addNewBSpline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BSplineType target = null;
            target = (net.opengis.gml.x32.BSplineType)get_store().add_element_user(BSPLINE$0);
            return target;
        }
    }
}
