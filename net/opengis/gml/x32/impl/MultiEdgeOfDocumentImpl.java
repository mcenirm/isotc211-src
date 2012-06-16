/*
 * An XML document type.
 * Localname: multiEdgeOf
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiEdgeOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiEdgeOf(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiEdgeOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MultiEdgeOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiEdgeOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIEDGEOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiEdgeOf");
    
    
    /**
     * Gets the "multiEdgeOf" element
     */
    public net.opengis.gml.x32.MultiCurvePropertyType getMultiEdgeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiCurvePropertyType target = null;
            target = (net.opengis.gml.x32.MultiCurvePropertyType)get_store().find_element_user(MULTIEDGEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiEdgeOf" element
     */
    public void setMultiEdgeOf(net.opengis.gml.x32.MultiCurvePropertyType multiEdgeOf)
    {
        generatedSetterHelperImpl(multiEdgeOf, MULTIEDGEOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiEdgeOf" element
     */
    public net.opengis.gml.x32.MultiCurvePropertyType addNewMultiEdgeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiCurvePropertyType target = null;
            target = (net.opengis.gml.x32.MultiCurvePropertyType)get_store().add_element_user(MULTIEDGEOF$0);
            return target;
        }
    }
}
