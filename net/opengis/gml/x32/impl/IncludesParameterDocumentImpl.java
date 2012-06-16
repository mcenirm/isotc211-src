/*
 * An XML document type.
 * Localname: includesParameter
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.IncludesParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one includesParameter(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class IncludesParameterDocumentImpl extends net.opengis.gml.x32.impl.ParameterDocumentImpl implements net.opengis.gml.x32.IncludesParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludesParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDESPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "includesParameter");
    
    
    /**
     * Gets the "includesParameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType getIncludesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().find_element_user(INCLUDESPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "includesParameter" element
     */
    public void setIncludesParameter(net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType includesParameter)
    {
        generatedSetterHelperImpl(includesParameter, INCLUDESPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "includesParameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType addNewIncludesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().add_element_user(INCLUDESPARAMETER$0);
            return target;
        }
    }
}
