/*
 * An XML document type.
 * Localname: OperationMethod
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OperationMethodDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one OperationMethod(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class OperationMethodDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.OperationMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationMethod");
    
    
    /**
     * Gets the "OperationMethod" element
     */
    public net.opengis.gml.x32.OperationMethodType getOperationMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodType target = null;
            target = (net.opengis.gml.x32.OperationMethodType)get_store().find_element_user(OPERATIONMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OperationMethod" element
     */
    public void setOperationMethod(net.opengis.gml.x32.OperationMethodType operationMethod)
    {
        generatedSetterHelperImpl(operationMethod, OPERATIONMETHOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationMethod" element
     */
    public net.opengis.gml.x32.OperationMethodType addNewOperationMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodType target = null;
            target = (net.opengis.gml.x32.OperationMethodType)get_store().add_element_user(OPERATIONMETHOD$0);
            return target;
        }
    }
}
