/*
 * An XML document type.
 * Localname: valuesOfGroup
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ValuesOfGroupDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one valuesOfGroup(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ValuesOfGroupDocumentImpl extends net.opengis.gml.x32.impl.GroupDocumentImpl implements net.opengis.gml.x32.ValuesOfGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValuesOfGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUESOFGROUP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valuesOfGroup");
    
    
    /**
     * Gets the "valuesOfGroup" element
     */
    public net.opengis.gml.x32.OperationParameterGroupPropertyType getValuesOfGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterGroupPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterGroupPropertyType)get_store().find_element_user(VALUESOFGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valuesOfGroup" element
     */
    public void setValuesOfGroup(net.opengis.gml.x32.OperationParameterGroupPropertyType valuesOfGroup)
    {
        generatedSetterHelperImpl(valuesOfGroup, VALUESOFGROUP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valuesOfGroup" element
     */
    public net.opengis.gml.x32.OperationParameterGroupPropertyType addNewValuesOfGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterGroupPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterGroupPropertyType)get_store().add_element_user(VALUESOFGROUP$0);
            return target;
        }
    }
}
