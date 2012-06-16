/*
 * An XML document type.
 * Localname: axisDirection
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AxisDirectionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one axisDirection(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AxisDirectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AxisDirectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AxisDirectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AXISDIRECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "axisDirection");
    
    
    /**
     * Gets the "axisDirection" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType getAxisDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().find_element_user(AXISDIRECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "axisDirection" element
     */
    public void setAxisDirection(net.opengis.gml.x32.CodeWithAuthorityType axisDirection)
    {
        generatedSetterHelperImpl(axisDirection, AXISDIRECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "axisDirection" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType addNewAxisDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().add_element_user(AXISDIRECTION$0);
            return target;
        }
    }
}
