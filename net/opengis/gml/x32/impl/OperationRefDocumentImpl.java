/*
 * An XML document type.
 * Localname: operationRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OperationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one operationRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class OperationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.OperationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "operationRef");
    
    
    /**
     * Gets the "operationRef" element
     */
    public net.opengis.gml.x32.OperationPropertyType getOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationPropertyType target = null;
            target = (net.opengis.gml.x32.OperationPropertyType)get_store().find_element_user(OPERATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operationRef" element
     */
    public void setOperationRef(net.opengis.gml.x32.OperationPropertyType operationRef)
    {
        generatedSetterHelperImpl(operationRef, OPERATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "operationRef" element
     */
    public net.opengis.gml.x32.OperationPropertyType addNewOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationPropertyType target = null;
            target = (net.opengis.gml.x32.OperationPropertyType)get_store().add_element_user(OPERATIONREF$0);
            return target;
        }
    }
}
