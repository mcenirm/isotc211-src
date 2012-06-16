/*
 * An XML document type.
 * Localname: value
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one value(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "value");
    
    
    /**
     * Gets the "value" element
     */
    public net.opengis.gml.x32.MeasureType getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(net.opengis.gml.x32.MeasureType value)
    {
        generatedSetterHelperImpl(value, VALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public net.opengis.gml.x32.MeasureType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
}
