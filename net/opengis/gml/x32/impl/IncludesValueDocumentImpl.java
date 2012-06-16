/*
 * An XML document type.
 * Localname: includesValue
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.IncludesValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one includesValue(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class IncludesValueDocumentImpl extends net.opengis.gml.x32.impl.ParameterValueDocumentImpl implements net.opengis.gml.x32.IncludesValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludesValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDESVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "includesValue");
    
    
    /**
     * Gets the "includesValue" element
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType getIncludesValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().find_element_user(INCLUDESVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "includesValue" element
     */
    public void setIncludesValue(net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType includesValue)
    {
        generatedSetterHelperImpl(includesValue, INCLUDESVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "includesValue" element
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType addNewIncludesValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().add_element_user(INCLUDESVALUE$0);
            return target;
        }
    }
}
