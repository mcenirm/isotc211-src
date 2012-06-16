/*
 * An XML document type.
 * Localname: ValueArray
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ValueArrayDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ValueArray(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ValueArrayDocumentImpl extends net.opengis.gml.x32.impl.CompositeValueDocumentImpl implements net.opengis.gml.x32.ValueArrayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueArrayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEARRAY1$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ValueArray");
    
    
    /**
     * Gets the "ValueArray" element
     */
    public net.opengis.gml.x32.ValueArrayType getValueArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValueArrayType target = null;
            target = (net.opengis.gml.x32.ValueArrayType)get_store().find_element_user(VALUEARRAY1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValueArray" element
     */
    public void setValueArray1(net.opengis.gml.x32.ValueArrayType valueArray1)
    {
        generatedSetterHelperImpl(valueArray1, VALUEARRAY1$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValueArray" element
     */
    public net.opengis.gml.x32.ValueArrayType addNewValueArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValueArrayType target = null;
            target = (net.opengis.gml.x32.ValueArrayType)get_store().add_element_user(VALUEARRAY1$0);
            return target;
        }
    }
}
