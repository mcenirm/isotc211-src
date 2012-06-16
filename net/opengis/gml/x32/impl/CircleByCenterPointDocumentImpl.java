/*
 * An XML document type.
 * Localname: CircleByCenterPoint
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CircleByCenterPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CircleByCenterPoint(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CircleByCenterPointDocumentImpl extends net.opengis.gml.x32.impl.ArcByCenterPointDocumentImpl implements net.opengis.gml.x32.CircleByCenterPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public CircleByCenterPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCLEBYCENTERPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint");
    
    
    /**
     * Gets the "CircleByCenterPoint" element
     */
    public net.opengis.gml.x32.CircleByCenterPointType getCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CircleByCenterPointType target = null;
            target = (net.opengis.gml.x32.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CircleByCenterPoint" element
     */
    public void setCircleByCenterPoint(net.opengis.gml.x32.CircleByCenterPointType circleByCenterPoint)
    {
        generatedSetterHelperImpl(circleByCenterPoint, CIRCLEBYCENTERPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CircleByCenterPoint" element
     */
    public net.opengis.gml.x32.CircleByCenterPointType addNewCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CircleByCenterPointType target = null;
            target = (net.opengis.gml.x32.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$0);
            return target;
        }
    }
}
