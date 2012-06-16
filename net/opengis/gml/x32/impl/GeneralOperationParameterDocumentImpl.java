/*
 * An XML document type.
 * Localname: generalOperationParameter
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeneralOperationParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one generalOperationParameter(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeneralOperationParameterDocumentImpl extends net.opengis.gml.x32.impl.ParameterDocumentImpl implements net.opengis.gml.x32.GeneralOperationParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralOperationParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALOPERATIONPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "generalOperationParameter");
    private static final org.apache.xmlbeans.QNameSet GENERALOPERATIONPARAMETER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "generalOperationParameter"),
    });
    
    
    /**
     * Gets the "generalOperationParameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType getGeneralOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().find_element_user(GENERALOPERATIONPARAMETER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "generalOperationParameter" element
     */
    public void setGeneralOperationParameter(net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType generalOperationParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().find_element_user(GENERALOPERATIONPARAMETER$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().add_element_user(GENERALOPERATIONPARAMETER$0);
            }
            target.set(generalOperationParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "generalOperationParameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType addNewGeneralOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().add_element_user(GENERALOPERATIONPARAMETER$0);
            return target;
        }
    }
}
