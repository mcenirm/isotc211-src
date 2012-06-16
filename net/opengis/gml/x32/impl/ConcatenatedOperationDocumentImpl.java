/*
 * An XML document type.
 * Localname: ConcatenatedOperation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ConcatenatedOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ConcatenatedOperation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ConcatenatedOperationDocumentImpl extends net.opengis.gml.x32.impl.AbstractCoordinateOperationDocumentImpl implements net.opengis.gml.x32.ConcatenatedOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConcatenatedOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCATENATEDOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ConcatenatedOperation");
    
    
    /**
     * Gets the "ConcatenatedOperation" element
     */
    public net.opengis.gml.x32.ConcatenatedOperationType getConcatenatedOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConcatenatedOperationType target = null;
            target = (net.opengis.gml.x32.ConcatenatedOperationType)get_store().find_element_user(CONCATENATEDOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConcatenatedOperation" element
     */
    public void setConcatenatedOperation(net.opengis.gml.x32.ConcatenatedOperationType concatenatedOperation)
    {
        generatedSetterHelperImpl(concatenatedOperation, CONCATENATEDOPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConcatenatedOperation" element
     */
    public net.opengis.gml.x32.ConcatenatedOperationType addNewConcatenatedOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConcatenatedOperationType target = null;
            target = (net.opengis.gml.x32.ConcatenatedOperationType)get_store().add_element_user(CONCATENATEDOPERATION$0);
            return target;
        }
    }
}
