/*
 * An XML document type.
 * Localname: ParameterValue
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ParameterValueDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ParameterValue(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ParameterValueDocument2Impl extends net.opengis.gml.x32.impl.AbstractGeneralParameterValueDocumentImpl implements net.opengis.gml.x32.ParameterValueDocument2
{
    private static final long serialVersionUID = 1L;
    
    public ParameterValueDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ParameterValue");
    
    
    /**
     * Gets the "ParameterValue" element
     */
    public net.opengis.gml.x32.ParameterValueType getParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ParameterValueType target = null;
            target = (net.opengis.gml.x32.ParameterValueType)get_store().find_element_user(PARAMETERVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ParameterValue" element
     */
    public void setParameterValue(net.opengis.gml.x32.ParameterValueType parameterValue)
    {
        generatedSetterHelperImpl(parameterValue, PARAMETERVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParameterValue" element
     */
    public net.opengis.gml.x32.ParameterValueType addNewParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ParameterValueType target = null;
            target = (net.opengis.gml.x32.ParameterValueType)get_store().add_element_user(PARAMETERVALUE$0);
            return target;
        }
    }
}
