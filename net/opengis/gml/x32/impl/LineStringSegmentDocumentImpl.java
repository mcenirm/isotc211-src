/*
 * An XML document type.
 * Localname: LineStringSegment
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.LineStringSegmentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one LineStringSegment(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class LineStringSegmentDocumentImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentDocumentImpl implements net.opengis.gml.x32.LineStringSegmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public LineStringSegmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINESTRINGSEGMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineStringSegment");
    
    
    /**
     * Gets the "LineStringSegment" element
     */
    public net.opengis.gml.x32.LineStringSegmentType getLineStringSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentType)get_store().find_element_user(LINESTRINGSEGMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LineStringSegment" element
     */
    public void setLineStringSegment(net.opengis.gml.x32.LineStringSegmentType lineStringSegment)
    {
        generatedSetterHelperImpl(lineStringSegment, LINESTRINGSEGMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LineStringSegment" element
     */
    public net.opengis.gml.x32.LineStringSegmentType addNewLineStringSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentType)get_store().add_element_user(LINESTRINGSEGMENT$0);
            return target;
        }
    }
}
