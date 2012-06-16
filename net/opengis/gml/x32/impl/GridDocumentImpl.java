/*
 * An XML document type.
 * Localname: Grid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GridDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Grid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GridDocumentImpl extends net.opengis.gml.x32.impl.AbstractImplicitGeometryDocumentImpl implements net.opengis.gml.x32.GridDocument
{
    private static final long serialVersionUID = 1L;
    
    public GridDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Grid");
    private static final org.apache.xmlbeans.QNameSet GRID$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGrid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Grid"),
    });
    
    
    /**
     * Gets the "Grid" element
     */
    public net.opengis.gml.x32.GridType getGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GridType target = null;
            target = (net.opengis.gml.x32.GridType)get_store().find_element_user(GRID$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Grid" element
     */
    public void setGrid(net.opengis.gml.x32.GridType grid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GridType target = null;
            target = (net.opengis.gml.x32.GridType)get_store().find_element_user(GRID$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.GridType)get_store().add_element_user(GRID$0);
            }
            target.set(grid);
        }
    }
    
    /**
     * Appends and returns a new empty "Grid" element
     */
    public net.opengis.gml.x32.GridType addNewGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GridType target = null;
            target = (net.opengis.gml.x32.GridType)get_store().add_element_user(GRID$0);
            return target;
        }
    }
}
