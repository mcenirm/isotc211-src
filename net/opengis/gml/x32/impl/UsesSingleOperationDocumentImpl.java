/*
 * An XML document type.
 * Localname: usesSingleOperation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesSingleOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesSingleOperation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesSingleOperationDocumentImpl extends net.opengis.gml.x32.impl.CoordOperationDocumentImpl implements net.opengis.gml.x32.UsesSingleOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesSingleOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESSINGLEOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesSingleOperation");
    
    
    /**
     * Gets the "usesSingleOperation" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType getUsesSingleOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().find_element_user(USESSINGLEOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesSingleOperation" element
     */
    public void setUsesSingleOperation(net.opengis.gml.x32.CoordinateOperationPropertyType usesSingleOperation)
    {
        generatedSetterHelperImpl(usesSingleOperation, USESSINGLEOPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesSingleOperation" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType addNewUsesSingleOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().add_element_user(USESSINGLEOPERATION$0);
            return target;
        }
    }
}
