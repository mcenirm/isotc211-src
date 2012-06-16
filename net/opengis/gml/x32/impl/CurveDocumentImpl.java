/*
 * An XML document type.
 * Localname: Curve
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CurveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Curve(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CurveDocumentImpl extends net.opengis.gml.x32.impl.AbstractCurveDocumentImpl implements net.opengis.gml.x32.CurveDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Curve");
    
    
    /**
     * Gets the "Curve" element
     */
    public net.opengis.gml.x32.CurveType getCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveType target = null;
            target = (net.opengis.gml.x32.CurveType)get_store().find_element_user(CURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Curve" element
     */
    public void setCurve(net.opengis.gml.x32.CurveType curve)
    {
        generatedSetterHelperImpl(curve, CURVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Curve" element
     */
    public net.opengis.gml.x32.CurveType addNewCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveType target = null;
            target = (net.opengis.gml.x32.CurveType)get_store().add_element_user(CURVE$0);
            return target;
        }
    }
}
