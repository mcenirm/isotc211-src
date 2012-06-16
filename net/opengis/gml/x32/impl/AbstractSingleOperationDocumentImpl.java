/*
 * An XML document type.
 * Localname: AbstractSingleOperation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractSingleOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractSingleOperation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractSingleOperationDocumentImpl extends net.opengis.gml.x32.impl.AbstractCoordinateOperationDocumentImpl implements net.opengis.gml.x32.AbstractSingleOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractSingleOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSINGLEOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleOperation");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSINGLEOPERATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PassThroughOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleOperation"),
    });
    
    
    /**
     * Gets the "AbstractSingleOperation" element
     */
    public net.opengis.gml.x32.AbstractCoordinateOperationType getAbstractSingleOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().find_element_user(ABSTRACTSINGLEOPERATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractSingleOperation" element
     */
    public void setAbstractSingleOperation(net.opengis.gml.x32.AbstractCoordinateOperationType abstractSingleOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().find_element_user(ABSTRACTSINGLEOPERATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().add_element_user(ABSTRACTSINGLEOPERATION$0);
            }
            target.set(abstractSingleOperation);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractSingleOperation" element
     */
    public net.opengis.gml.x32.AbstractCoordinateOperationType addNewAbstractSingleOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().add_element_user(ABSTRACTSINGLEOPERATION$0);
            return target;
        }
    }
}
