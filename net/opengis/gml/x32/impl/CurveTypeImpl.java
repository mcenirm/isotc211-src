/*
 * XML Type:  CurveType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CurveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML CurveType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class CurveTypeImpl extends net.opengis.gml.x32.impl.AbstractCurveTypeImpl implements net.opengis.gml.x32.CurveType
{
    private static final long serialVersionUID = 1L;
    
    public CurveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEGMENTS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "segments");
    
    
    /**
     * Gets the "segments" element
     */
    public net.opengis.gml.x32.CurveSegmentArrayPropertyType getSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.x32.CurveSegmentArrayPropertyType)get_store().find_element_user(SEGMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "segments" element
     */
    public void setSegments(net.opengis.gml.x32.CurveSegmentArrayPropertyType segments)
    {
        generatedSetterHelperImpl(segments, SEGMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "segments" element
     */
    public net.opengis.gml.x32.CurveSegmentArrayPropertyType addNewSegments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.x32.CurveSegmentArrayPropertyType)get_store().add_element_user(SEGMENTS$0);
            return target;
        }
    }
}
