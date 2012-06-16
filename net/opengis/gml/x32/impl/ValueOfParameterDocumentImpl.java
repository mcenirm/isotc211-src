/*
 * An XML document type.
 * Localname: valueOfParameter
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ValueOfParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one valueOfParameter(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ValueOfParameterDocumentImpl extends net.opengis.gml.x32.impl.OperationParameterDocumentImpl implements net.opengis.gml.x32.ValueOfParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueOfParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEOFPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valueOfParameter");
    
    
    /**
     * Gets the "valueOfParameter" element
     */
    public net.opengis.gml.x32.OperationParameterPropertyType getValueOfParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().find_element_user(VALUEOFPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valueOfParameter" element
     */
    public void setValueOfParameter(net.opengis.gml.x32.OperationParameterPropertyType valueOfParameter)
    {
        generatedSetterHelperImpl(valueOfParameter, VALUEOFPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueOfParameter" element
     */
    public net.opengis.gml.x32.OperationParameterPropertyType addNewValueOfParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().add_element_user(VALUEOFPARAMETER$0);
            return target;
        }
    }
}
