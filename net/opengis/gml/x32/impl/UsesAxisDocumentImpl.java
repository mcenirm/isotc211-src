/*
 * An XML document type.
 * Localname: usesAxis
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesAxisDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesAxis(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesAxisDocumentImpl extends net.opengis.gml.x32.impl.AxisDocumentImpl implements net.opengis.gml.x32.UsesAxisDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesAxisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESAXIS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesAxis");
    
    
    /**
     * Gets the "usesAxis" element
     */
    public net.opengis.gml.x32.CoordinateSystemAxisPropertyType getUsesAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().find_element_user(USESAXIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesAxis" element
     */
    public void setUsesAxis(net.opengis.gml.x32.CoordinateSystemAxisPropertyType usesAxis)
    {
        generatedSetterHelperImpl(usesAxis, USESAXIS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesAxis" element
     */
    public net.opengis.gml.x32.CoordinateSystemAxisPropertyType addNewUsesAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().add_element_user(USESAXIS$0);
            return target;
        }
    }
}
