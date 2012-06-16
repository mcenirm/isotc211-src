/*
 * An XML document type.
 * Localname: GridFunction
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GridFunctionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one GridFunction(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GridFunctionDocumentImpl extends net.opengis.gml.x32.impl.AbstractObjectDocumentImpl implements net.opengis.gml.x32.GridFunctionDocument
{
    private static final long serialVersionUID = 1L;
    
    public GridFunctionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDFUNCTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GridFunction");
    
    
    /**
     * Gets the "GridFunction" element
     */
    public net.opengis.gml.x32.GridFunctionType getGridFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GridFunctionType target = null;
            target = (net.opengis.gml.x32.GridFunctionType)get_store().find_element_user(GRIDFUNCTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GridFunction" element
     */
    public void setGridFunction(net.opengis.gml.x32.GridFunctionType gridFunction)
    {
        generatedSetterHelperImpl(gridFunction, GRIDFUNCTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GridFunction" element
     */
    public net.opengis.gml.x32.GridFunctionType addNewGridFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GridFunctionType target = null;
            target = (net.opengis.gml.x32.GridFunctionType)get_store().add_element_user(GRIDFUNCTION$0);
            return target;
        }
    }
}
