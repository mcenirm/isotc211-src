/*
 * An XML document type.
 * Localname: TopoCurve
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoCurveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TopoCurve(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TopoCurveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TopoCurveDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoCurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOCURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoCurve");
    
    
    /**
     * Gets the "TopoCurve" element
     */
    public net.opengis.gml.x32.TopoCurveType getTopoCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoCurveType target = null;
            target = (net.opengis.gml.x32.TopoCurveType)get_store().find_element_user(TOPOCURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoCurve" element
     */
    public void setTopoCurve(net.opengis.gml.x32.TopoCurveType topoCurve)
    {
        generatedSetterHelperImpl(topoCurve, TOPOCURVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoCurve" element
     */
    public net.opengis.gml.x32.TopoCurveType addNewTopoCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoCurveType target = null;
            target = (net.opengis.gml.x32.TopoCurveType)get_store().add_element_user(TOPOCURVE$0);
            return target;
        }
    }
}
