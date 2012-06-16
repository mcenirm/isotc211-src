/*
 * An XML document type.
 * Localname: parameter
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one parameter(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameter");
    private static final org.apache.xmlbeans.QNameSet PARAMETER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "includesParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "generalOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameter"),
    });
    
    
    /**
     * Gets the "parameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType getParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().find_element_user(PARAMETER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameter" element
     */
    public void setParameter(net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().find_element_user(PARAMETER$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().add_element_user(PARAMETER$0);
            }
            target.set(parameter);
        }
    }
    
    /**
     * Appends and returns a new empty "parameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().add_element_user(PARAMETER$0);
            return target;
        }
    }
}
