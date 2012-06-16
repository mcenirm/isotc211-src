/*
 * An XML document type.
 * Localname: parameterValue
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ParameterValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one parameterValue(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ParameterValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ParameterValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParameterValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameterValue");
    private static final org.apache.xmlbeans.QNameSet PARAMETERVALUE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameterValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "includesValue"),
    });
    
    
    /**
     * Gets the "parameterValue" element
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType getParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().find_element_user(PARAMETERVALUE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameterValue" element
     */
    public void setParameterValue(net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType parameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().find_element_user(PARAMETERVALUE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().add_element_user(PARAMETERVALUE$0);
            }
            target.set(parameterValue);
        }
    }
    
    /**
     * Appends and returns a new empty "parameterValue" element
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType addNewParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().add_element_user(PARAMETERVALUE$0);
            return target;
        }
    }
}
