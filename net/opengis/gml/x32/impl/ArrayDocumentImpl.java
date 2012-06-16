/*
 * An XML document type.
 * Localname: Array
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ArrayDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Array(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ArrayDocumentImpl extends net.opengis.gml.x32.impl.AbstractGMLDocumentImpl implements net.opengis.gml.x32.ArrayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Array");
    
    
    /**
     * Gets the "Array" element
     */
    public net.opengis.gml.x32.ArrayType getArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArrayType target = null;
            target = (net.opengis.gml.x32.ArrayType)get_store().find_element_user(ARRAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Array" element
     */
    public void setArray(net.opengis.gml.x32.ArrayType array)
    {
        generatedSetterHelperImpl(array, ARRAY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Array" element
     */
    public net.opengis.gml.x32.ArrayType addNewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArrayType target = null;
            target = (net.opengis.gml.x32.ArrayType)get_store().add_element_user(ARRAY$0);
            return target;
        }
    }
}
