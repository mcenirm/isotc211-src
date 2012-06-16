/*
 * An XML document type.
 * Localname: valueComponents
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ValueComponentsDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one valueComponents(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ValueComponentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ValueComponentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueComponentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUECOMPONENTS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valueComponents");
    
    
    /**
     * Gets the "valueComponents" element
     */
    public net.opengis.gml.x32.ValueArrayPropertyType getValueComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValueArrayPropertyType target = null;
            target = (net.opengis.gml.x32.ValueArrayPropertyType)get_store().find_element_user(VALUECOMPONENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valueComponents" element
     */
    public void setValueComponents(net.opengis.gml.x32.ValueArrayPropertyType valueComponents)
    {
        generatedSetterHelperImpl(valueComponents, VALUECOMPONENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueComponents" element
     */
    public net.opengis.gml.x32.ValueArrayPropertyType addNewValueComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValueArrayPropertyType target = null;
            target = (net.opengis.gml.x32.ValueArrayPropertyType)get_store().add_element_user(VALUECOMPONENTS$0);
            return target;
        }
    }
}
