/*
 * An XML document type.
 * Localname: OperationParameter
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OperationParameterDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one OperationParameter(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class OperationParameterDocument2Impl extends net.opengis.gml.x32.impl.AbstractGeneralOperationParameterDocumentImpl implements net.opengis.gml.x32.OperationParameterDocument2
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationParameter");
    
    
    /**
     * Gets the "OperationParameter" element
     */
    public net.opengis.gml.x32.OperationParameterType getOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterType target = null;
            target = (net.opengis.gml.x32.OperationParameterType)get_store().find_element_user(OPERATIONPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OperationParameter" element
     */
    public void setOperationParameter(net.opengis.gml.x32.OperationParameterType operationParameter)
    {
        generatedSetterHelperImpl(operationParameter, OPERATIONPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationParameter" element
     */
    public net.opengis.gml.x32.OperationParameterType addNewOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterType target = null;
            target = (net.opengis.gml.x32.OperationParameterType)get_store().add_element_user(OPERATIONPARAMETER$0);
            return target;
        }
    }
}
