/*
 * An XML document type.
 * Localname: edgeOf
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EdgeOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one edgeOf(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EdgeOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.EdgeOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public EdgeOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDGEOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "edgeOf");
    
    
    /**
     * Gets the "edgeOf" element
     */
    public net.opengis.gml.x32.CurvePropertyType getEdgeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().find_element_user(EDGEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "edgeOf" element
     */
    public void setEdgeOf(net.opengis.gml.x32.CurvePropertyType edgeOf)
    {
        generatedSetterHelperImpl(edgeOf, EDGEOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "edgeOf" element
     */
    public net.opengis.gml.x32.CurvePropertyType addNewEdgeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().add_element_user(EDGEOF$0);
            return target;
        }
    }
}
