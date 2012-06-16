/*
 * An XML document type.
 * Localname: operationParameterGroupRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OperationParameterGroupRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one operationParameterGroupRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class OperationParameterGroupRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.OperationParameterGroupRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterGroupRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONPARAMETERGROUPREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "operationParameterGroupRef");
    
    
    /**
     * Gets the "operationParameterGroupRef" element
     */
    public net.opengis.gml.x32.OperationParameterPropertyType getOperationParameterGroupRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().find_element_user(OPERATIONPARAMETERGROUPREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operationParameterGroupRef" element
     */
    public void setOperationParameterGroupRef(net.opengis.gml.x32.OperationParameterPropertyType operationParameterGroupRef)
    {
        generatedSetterHelperImpl(operationParameterGroupRef, OPERATIONPARAMETERGROUPREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "operationParameterGroupRef" element
     */
    public net.opengis.gml.x32.OperationParameterPropertyType addNewOperationParameterGroupRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().add_element_user(OPERATIONPARAMETERGROUPREF$0);
            return target;
        }
    }
}
