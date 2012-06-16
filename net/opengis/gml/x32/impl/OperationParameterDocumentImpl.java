/*
 * An XML document type.
 * Localname: operationParameter
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OperationParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one operationParameter(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class OperationParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.OperationParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "operationParameter");
    private static final org.apache.xmlbeans.QNameSet OPERATIONPARAMETER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valueOfParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "operationParameter"),
    });
    
    
    /**
     * Gets the "operationParameter" element
     */
    public net.opengis.gml.x32.OperationParameterPropertyType getOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().find_element_user(OPERATIONPARAMETER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operationParameter" element
     */
    public void setOperationParameter(net.opengis.gml.x32.OperationParameterPropertyType operationParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().find_element_user(OPERATIONPARAMETER$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().add_element_user(OPERATIONPARAMETER$0);
            }
            target.set(operationParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "operationParameter" element
     */
    public net.opengis.gml.x32.OperationParameterPropertyType addNewOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().add_element_user(OPERATIONPARAMETER$0);
            return target;
        }
    }
}
