/*
 * An XML document type.
 * Localname: curveMembers
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CurveMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one curveMembers(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CurveMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CurveMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurveMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "curveMembers");
    
    
    /**
     * Gets the "curveMembers" element
     */
    public net.opengis.gml.x32.CurveArrayPropertyType getCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.x32.CurveArrayPropertyType)get_store().find_element_user(CURVEMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "curveMembers" element
     */
    public void setCurveMembers(net.opengis.gml.x32.CurveArrayPropertyType curveMembers)
    {
        generatedSetterHelperImpl(curveMembers, CURVEMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "curveMembers" element
     */
    public net.opengis.gml.x32.CurveArrayPropertyType addNewCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.x32.CurveArrayPropertyType)get_store().add_element_user(CURVEMEMBERS$0);
            return target;
        }
    }
}
