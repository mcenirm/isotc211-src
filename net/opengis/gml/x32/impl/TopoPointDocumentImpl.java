/*
 * An XML document type.
 * Localname: TopoPoint
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TopoPoint(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TopoPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TopoPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoPoint");
    
    
    /**
     * Gets the "TopoPoint" element
     */
    public net.opengis.gml.x32.TopoPointType getTopoPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPointType target = null;
            target = (net.opengis.gml.x32.TopoPointType)get_store().find_element_user(TOPOPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoPoint" element
     */
    public void setTopoPoint(net.opengis.gml.x32.TopoPointType topoPoint)
    {
        generatedSetterHelperImpl(topoPoint, TOPOPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoPoint" element
     */
    public net.opengis.gml.x32.TopoPointType addNewTopoPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPointType target = null;
            target = (net.opengis.gml.x32.TopoPointType)get_store().add_element_user(TOPOPOINT$0);
            return target;
        }
    }
}
