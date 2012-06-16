/*
 * An XML document type.
 * Localname: vector
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.VectorDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one vector(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class VectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.VectorDocument
{
    private static final long serialVersionUID = 1L;
    
    public VectorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VECTOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "vector");
    
    
    /**
     * Gets the "vector" element
     */
    public net.opengis.gml.x32.VectorType getVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().find_element_user(VECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vector" element
     */
    public void setVector(net.opengis.gml.x32.VectorType vector)
    {
        generatedSetterHelperImpl(vector, VECTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vector" element
     */
    public net.opengis.gml.x32.VectorType addNewVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().add_element_user(VECTOR$0);
            return target;
        }
    }
}
