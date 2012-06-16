/*
 * An XML document type.
 * Localname: valueProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ValuePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one valueProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ValuePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ValuePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValuePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valueProperty");
    
    
    /**
     * Gets the "valueProperty" element
     */
    public net.opengis.gml.x32.ValuePropertyType getValueProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValuePropertyType target = null;
            target = (net.opengis.gml.x32.ValuePropertyType)get_store().find_element_user(VALUEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valueProperty" element
     */
    public void setValueProperty(net.opengis.gml.x32.ValuePropertyType valueProperty)
    {
        generatedSetterHelperImpl(valueProperty, VALUEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueProperty" element
     */
    public net.opengis.gml.x32.ValuePropertyType addNewValueProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValuePropertyType target = null;
            target = (net.opengis.gml.x32.ValuePropertyType)get_store().add_element_user(VALUEPROPERTY$0);
            return target;
        }
    }
}
