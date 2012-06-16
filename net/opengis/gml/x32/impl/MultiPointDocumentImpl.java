/*
 * An XML document type.
 * Localname: MultiPoint
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one MultiPoint(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiPointDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeometricAggregateDocumentImpl implements net.opengis.gml.x32.MultiPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPoint");
    
    
    /**
     * Gets the "MultiPoint" element
     */
    public net.opengis.gml.x32.MultiPointType getMultiPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiPointType target = null;
            target = (net.opengis.gml.x32.MultiPointType)get_store().find_element_user(MULTIPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiPoint" element
     */
    public void setMultiPoint(net.opengis.gml.x32.MultiPointType multiPoint)
    {
        generatedSetterHelperImpl(multiPoint, MULTIPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiPoint" element
     */
    public net.opengis.gml.x32.MultiPointType addNewMultiPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiPointType target = null;
            target = (net.opengis.gml.x32.MultiPointType)get_store().add_element_user(MULTIPOINT$0);
            return target;
        }
    }
}
