/*
 * An XML document type.
 * Localname: valueComponent
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ValueComponentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one valueComponent(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ValueComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ValueComponentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUECOMPONENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valueComponent");
    
    
    /**
     * Gets the "valueComponent" element
     */
    public net.opengis.gml.x32.ValuePropertyType getValueComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValuePropertyType target = null;
            target = (net.opengis.gml.x32.ValuePropertyType)get_store().find_element_user(VALUECOMPONENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valueComponent" element
     */
    public void setValueComponent(net.opengis.gml.x32.ValuePropertyType valueComponent)
    {
        generatedSetterHelperImpl(valueComponent, VALUECOMPONENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueComponent" element
     */
    public net.opengis.gml.x32.ValuePropertyType addNewValueComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValuePropertyType target = null;
            target = (net.opengis.gml.x32.ValuePropertyType)get_store().add_element_user(VALUECOMPONENT$0);
            return target;
        }
    }
}
