/*
 * An XML document type.
 * Localname: OrientableCurve
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OrientableCurveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one OrientableCurve(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class OrientableCurveDocumentImpl extends net.opengis.gml.x32.impl.AbstractCurveDocumentImpl implements net.opengis.gml.x32.OrientableCurveDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrientableCurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIENTABLECURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OrientableCurve");
    
    
    /**
     * Gets the "OrientableCurve" element
     */
    public net.opengis.gml.x32.OrientableCurveType getOrientableCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OrientableCurveType target = null;
            target = (net.opengis.gml.x32.OrientableCurveType)get_store().find_element_user(ORIENTABLECURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrientableCurve" element
     */
    public void setOrientableCurve(net.opengis.gml.x32.OrientableCurveType orientableCurve)
    {
        generatedSetterHelperImpl(orientableCurve, ORIENTABLECURVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrientableCurve" element
     */
    public net.opengis.gml.x32.OrientableCurveType addNewOrientableCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OrientableCurveType target = null;
            target = (net.opengis.gml.x32.OrientableCurveType)get_store().add_element_user(ORIENTABLECURVE$0);
            return target;
        }
    }
}
