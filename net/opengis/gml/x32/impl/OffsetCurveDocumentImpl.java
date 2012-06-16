/*
 * An XML document type.
 * Localname: OffsetCurve
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OffsetCurveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one OffsetCurve(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class OffsetCurveDocumentImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentDocumentImpl implements net.opengis.gml.x32.OffsetCurveDocument
{
    private static final long serialVersionUID = 1L;
    
    public OffsetCurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFSETCURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OffsetCurve");
    
    
    /**
     * Gets the "OffsetCurve" element
     */
    public net.opengis.gml.x32.OffsetCurveType getOffsetCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OffsetCurveType target = null;
            target = (net.opengis.gml.x32.OffsetCurveType)get_store().find_element_user(OFFSETCURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OffsetCurve" element
     */
    public void setOffsetCurve(net.opengis.gml.x32.OffsetCurveType offsetCurve)
    {
        generatedSetterHelperImpl(offsetCurve, OFFSETCURVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OffsetCurve" element
     */
    public net.opengis.gml.x32.OffsetCurveType addNewOffsetCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OffsetCurveType target = null;
            target = (net.opengis.gml.x32.OffsetCurveType)get_store().add_element_user(OFFSETCURVE$0);
            return target;
        }
    }
}
