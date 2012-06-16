/*
 * An XML document type.
 * Localname: topoCurveProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoCurvePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one topoCurveProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TopoCurvePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TopoCurvePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoCurvePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOCURVEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "topoCurveProperty");
    
    
    /**
     * Gets the "topoCurveProperty" element
     */
    public net.opengis.gml.x32.TopoCurvePropertyType getTopoCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoCurvePropertyType target = null;
            target = (net.opengis.gml.x32.TopoCurvePropertyType)get_store().find_element_user(TOPOCURVEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoCurveProperty" element
     */
    public void setTopoCurveProperty(net.opengis.gml.x32.TopoCurvePropertyType topoCurveProperty)
    {
        generatedSetterHelperImpl(topoCurveProperty, TOPOCURVEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoCurveProperty" element
     */
    public net.opengis.gml.x32.TopoCurvePropertyType addNewTopoCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoCurvePropertyType target = null;
            target = (net.opengis.gml.x32.TopoCurvePropertyType)get_store().add_element_user(TOPOCURVEPROPERTY$0);
            return target;
        }
    }
}
