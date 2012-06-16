/*
 * An XML document type.
 * Localname: axisAbbrev
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AxisAbbrevDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one axisAbbrev(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AxisAbbrevDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AxisAbbrevDocument
{
    private static final long serialVersionUID = 1L;
    
    public AxisAbbrevDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AXISABBREV$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "axisAbbrev");
    
    
    /**
     * Gets the "axisAbbrev" element
     */
    public net.opengis.gml.x32.CodeType getAxisAbbrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(AXISABBREV$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "axisAbbrev" element
     */
    public void setAxisAbbrev(net.opengis.gml.x32.CodeType axisAbbrev)
    {
        generatedSetterHelperImpl(axisAbbrev, AXISABBREV$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "axisAbbrev" element
     */
    public net.opengis.gml.x32.CodeType addNewAxisAbbrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(AXISABBREV$0);
            return target;
        }
    }
}
