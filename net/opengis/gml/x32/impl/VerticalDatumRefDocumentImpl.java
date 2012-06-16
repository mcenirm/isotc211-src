/*
 * An XML document type.
 * Localname: verticalDatumRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.VerticalDatumRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one verticalDatumRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class VerticalDatumRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.VerticalDatumRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalDatumRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALDATUMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalDatumRef");
    
    
    /**
     * Gets the "verticalDatumRef" element
     */
    public net.opengis.gml.x32.VerticalDatumPropertyType getVerticalDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().find_element_user(VERTICALDATUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalDatumRef" element
     */
    public void setVerticalDatumRef(net.opengis.gml.x32.VerticalDatumPropertyType verticalDatumRef)
    {
        generatedSetterHelperImpl(verticalDatumRef, VERTICALDATUMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalDatumRef" element
     */
    public net.opengis.gml.x32.VerticalDatumPropertyType addNewVerticalDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().add_element_user(VERTICALDATUMREF$0);
            return target;
        }
    }
}
