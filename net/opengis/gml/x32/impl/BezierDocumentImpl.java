/*
 * An XML document type.
 * Localname: Bezier
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BezierDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Bezier(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class BezierDocumentImpl extends net.opengis.gml.x32.impl.BSplineDocumentImpl implements net.opengis.gml.x32.BezierDocument
{
    private static final long serialVersionUID = 1L;
    
    public BezierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEZIER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Bezier");
    
    
    /**
     * Gets the "Bezier" element
     */
    public net.opengis.gml.x32.BezierType getBezier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BezierType target = null;
            target = (net.opengis.gml.x32.BezierType)get_store().find_element_user(BEZIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Bezier" element
     */
    public void setBezier(net.opengis.gml.x32.BezierType bezier)
    {
        generatedSetterHelperImpl(bezier, BEZIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Bezier" element
     */
    public net.opengis.gml.x32.BezierType addNewBezier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BezierType target = null;
            target = (net.opengis.gml.x32.BezierType)get_store().add_element_user(BEZIER$0);
            return target;
        }
    }
}
