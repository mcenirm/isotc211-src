/*
 * An XML document type.
 * Localname: RectifiedGrid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RectifiedGridDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one RectifiedGrid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class RectifiedGridDocumentImpl extends net.opengis.gml.x32.impl.GridDocumentImpl implements net.opengis.gml.x32.RectifiedGridDocument
{
    private static final long serialVersionUID = 1L;
    
    public RectifiedGridDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECTIFIEDGRID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGrid");
    
    
    /**
     * Gets the "RectifiedGrid" element
     */
    public net.opengis.gml.x32.RectifiedGridType getRectifiedGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RectifiedGridType target = null;
            target = (net.opengis.gml.x32.RectifiedGridType)get_store().find_element_user(RECTIFIEDGRID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RectifiedGrid" element
     */
    public void setRectifiedGrid(net.opengis.gml.x32.RectifiedGridType rectifiedGrid)
    {
        generatedSetterHelperImpl(rectifiedGrid, RECTIFIEDGRID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RectifiedGrid" element
     */
    public net.opengis.gml.x32.RectifiedGridType addNewRectifiedGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RectifiedGridType target = null;
            target = (net.opengis.gml.x32.RectifiedGridType)get_store().add_element_user(RECTIFIEDGRID$0);
            return target;
        }
    }
}
