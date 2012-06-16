/*
 * An XML document type.
 * Localname: curveMember
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CurveMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one curveMember(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CurveMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CurveMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurveMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "curveMember");
    
    
    /**
     * Gets the "curveMember" element
     */
    public net.opengis.gml.x32.CurvePropertyType getCurveMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().find_element_user(CURVEMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "curveMember" element
     */
    public void setCurveMember(net.opengis.gml.x32.CurvePropertyType curveMember)
    {
        generatedSetterHelperImpl(curveMember, CURVEMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "curveMember" element
     */
    public net.opengis.gml.x32.CurvePropertyType addNewCurveMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().add_element_user(CURVEMEMBER$0);
            return target;
        }
    }
}
