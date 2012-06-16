/*
 * An XML document type.
 * Localname: AbstractGeneralOperationParameter
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGeneralOperationParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractGeneralOperationParameter(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGeneralOperationParameterDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.AbstractGeneralOperationParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeneralOperationParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGENERALOPERATIONPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralOperationParameter");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGENERALOPERATIONPARAMETER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationParameterGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationParameter"),
    });
    
    
    /**
     * Gets the "AbstractGeneralOperationParameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterType getAbstractGeneralOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterType)get_store().find_element_user(ABSTRACTGENERALOPERATIONPARAMETER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGeneralOperationParameter" element
     */
    public void setAbstractGeneralOperationParameter(net.opengis.gml.x32.AbstractGeneralOperationParameterType abstractGeneralOperationParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterType)get_store().find_element_user(ABSTRACTGENERALOPERATIONPARAMETER$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeneralOperationParameterType)get_store().add_element_user(ABSTRACTGENERALOPERATIONPARAMETER$0);
            }
            target.set(abstractGeneralOperationParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGeneralOperationParameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterType addNewAbstractGeneralOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterType)get_store().add_element_user(ABSTRACTGENERALOPERATIONPARAMETER$0);
            return target;
        }
    }
}
