/*
 * An XML document type.
 * Localname: operationMethodRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OperationMethodRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one operationMethodRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class OperationMethodRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.OperationMethodRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationMethodRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONMETHODREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "operationMethodRef");
    
    
    /**
     * Gets the "operationMethodRef" element
     */
    public net.opengis.gml.x32.OperationMethodPropertyType getOperationMethodRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodPropertyType target = null;
            target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().find_element_user(OPERATIONMETHODREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operationMethodRef" element
     */
    public void setOperationMethodRef(net.opengis.gml.x32.OperationMethodPropertyType operationMethodRef)
    {
        generatedSetterHelperImpl(operationMethodRef, OPERATIONMETHODREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "operationMethodRef" element
     */
    public net.opengis.gml.x32.OperationMethodPropertyType addNewOperationMethodRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodPropertyType target = null;
            target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().add_element_user(OPERATIONMETHODREF$0);
            return target;
        }
    }
}
