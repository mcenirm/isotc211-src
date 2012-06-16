/*
 * An XML document type.
 * Localname: OperationParameterGroup
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OperationParameterGroupDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one OperationParameterGroup(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class OperationParameterGroupDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeneralOperationParameterDocumentImpl implements net.opengis.gml.x32.OperationParameterGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONPARAMETERGROUP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationParameterGroup");
    
    
    /**
     * Gets the "OperationParameterGroup" element
     */
    public net.opengis.gml.x32.OperationParameterGroupType getOperationParameterGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterGroupType target = null;
            target = (net.opengis.gml.x32.OperationParameterGroupType)get_store().find_element_user(OPERATIONPARAMETERGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OperationParameterGroup" element
     */
    public void setOperationParameterGroup(net.opengis.gml.x32.OperationParameterGroupType operationParameterGroup)
    {
        generatedSetterHelperImpl(operationParameterGroup, OPERATIONPARAMETERGROUP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationParameterGroup" element
     */
    public net.opengis.gml.x32.OperationParameterGroupType addNewOperationParameterGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterGroupType target = null;
            target = (net.opengis.gml.x32.OperationParameterGroupType)get_store().add_element_user(OPERATIONPARAMETERGROUP$0);
            return target;
        }
    }
}
