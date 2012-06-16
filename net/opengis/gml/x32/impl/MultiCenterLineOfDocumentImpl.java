/*
 * An XML document type.
 * Localname: multiCenterLineOf
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiCenterLineOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiCenterLineOf(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiCenterLineOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MultiCenterLineOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCenterLineOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICENTERLINEOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiCenterLineOf");
    
    
    /**
     * Gets the "multiCenterLineOf" element
     */
    public net.opengis.gml.x32.MultiCurvePropertyType getMultiCenterLineOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiCurvePropertyType target = null;
            target = (net.opengis.gml.x32.MultiCurvePropertyType)get_store().find_element_user(MULTICENTERLINEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiCenterLineOf" element
     */
    public void setMultiCenterLineOf(net.opengis.gml.x32.MultiCurvePropertyType multiCenterLineOf)
    {
        generatedSetterHelperImpl(multiCenterLineOf, MULTICENTERLINEOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiCenterLineOf" element
     */
    public net.opengis.gml.x32.MultiCurvePropertyType addNewMultiCenterLineOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiCurvePropertyType target = null;
            target = (net.opengis.gml.x32.MultiCurvePropertyType)get_store().add_element_user(MULTICENTERLINEOF$0);
            return target;
        }
    }
}
