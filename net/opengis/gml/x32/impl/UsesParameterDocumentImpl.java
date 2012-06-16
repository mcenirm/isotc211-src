/*
 * An XML document type.
 * Localname: usesParameter
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesParameter(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesParameterDocumentImpl extends net.opengis.gml.x32.impl.GeneralOperationParameterDocumentImpl implements net.opengis.gml.x32.UsesParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesParameter");
    
    
    /**
     * Gets the "usesParameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType getUsesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().find_element_user(USESPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesParameter" element
     */
    public void setUsesParameter(net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType usesParameter)
    {
        generatedSetterHelperImpl(usesParameter, USESPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesParameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType addNewUsesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().add_element_user(USESPARAMETER$0);
            return target;
        }
    }
}
