/*
 * An XML document type.
 * Localname: AbstractOperation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractOperation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractOperationDocumentImpl extends net.opengis.gml.x32.impl.AbstractSingleOperationDocumentImpl implements net.opengis.gml.x32.AbstractOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractOperation");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTOPERATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractOperation"),
    });
    
    
    /**
     * Gets the "AbstractOperation" element
     */
    public net.opengis.gml.x32.AbstractCoordinateOperationType getAbstractOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().find_element_user(ABSTRACTOPERATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractOperation" element
     */
    public void setAbstractOperation(net.opengis.gml.x32.AbstractCoordinateOperationType abstractOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().find_element_user(ABSTRACTOPERATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().add_element_user(ABSTRACTOPERATION$0);
            }
            target.set(abstractOperation);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractOperation" element
     */
    public net.opengis.gml.x32.AbstractCoordinateOperationType addNewAbstractOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().add_element_user(ABSTRACTOPERATION$0);
            return target;
        }
    }
}
