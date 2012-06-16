/*
 * An XML document type.
 * Localname: usesValue
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesValue(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesValueDocumentImpl extends net.opengis.gml.x32.impl.ParameterValueDocumentImpl implements net.opengis.gml.x32.UsesValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesValue");
    
    
    /**
     * Gets the "usesValue" element
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType getUsesValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().find_element_user(USESVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesValue" element
     */
    public void setUsesValue(net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType usesValue)
    {
        generatedSetterHelperImpl(usesValue, USESVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesValue" element
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType addNewUsesValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().add_element_user(USESVALUE$0);
            return target;
        }
    }
}
