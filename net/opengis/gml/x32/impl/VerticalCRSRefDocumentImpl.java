/*
 * An XML document type.
 * Localname: verticalCRSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.VerticalCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one verticalCRSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class VerticalCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.VerticalCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalCRSRef");
    
    
    /**
     * Gets the "verticalCRSRef" element
     */
    public net.opengis.gml.x32.VerticalCRSPropertyType getVerticalCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCRSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCRSPropertyType)get_store().find_element_user(VERTICALCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalCRSRef" element
     */
    public void setVerticalCRSRef(net.opengis.gml.x32.VerticalCRSPropertyType verticalCRSRef)
    {
        generatedSetterHelperImpl(verticalCRSRef, VERTICALCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalCRSRef" element
     */
    public net.opengis.gml.x32.VerticalCRSPropertyType addNewVerticalCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCRSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCRSPropertyType)get_store().add_element_user(VERTICALCRSREF$0);
            return target;
        }
    }
}
