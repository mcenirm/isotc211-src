/*
 * An XML document type.
 * Localname: verticalCSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.VerticalCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one verticalCSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class VerticalCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.VerticalCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalCSRef");
    
    
    /**
     * Gets the "verticalCSRef" element
     */
    public net.opengis.gml.x32.VerticalCSPropertyType getVerticalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().find_element_user(VERTICALCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalCSRef" element
     */
    public void setVerticalCSRef(net.opengis.gml.x32.VerticalCSPropertyType verticalCSRef)
    {
        generatedSetterHelperImpl(verticalCSRef, VERTICALCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalCSRef" element
     */
    public net.opengis.gml.x32.VerticalCSPropertyType addNewVerticalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().add_element_user(VERTICALCSREF$0);
            return target;
        }
    }
}
