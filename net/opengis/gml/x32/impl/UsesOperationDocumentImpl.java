/*
 * An XML document type.
 * Localname: usesOperation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesOperation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesOperationDocumentImpl extends net.opengis.gml.x32.impl.CoordOperationDocumentImpl implements net.opengis.gml.x32.UsesOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesOperation");
    
    
    /**
     * Gets the "usesOperation" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType getUsesOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().find_element_user(USESOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesOperation" element
     */
    public void setUsesOperation(net.opengis.gml.x32.CoordinateOperationPropertyType usesOperation)
    {
        generatedSetterHelperImpl(usesOperation, USESOPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesOperation" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType addNewUsesOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().add_element_user(USESOPERATION$0);
            return target;
        }
    }
}
