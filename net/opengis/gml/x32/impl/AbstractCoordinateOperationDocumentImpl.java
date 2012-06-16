/*
 * An XML document type.
 * Localname: AbstractCoordinateOperation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractCoordinateOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractCoordinateOperation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractCoordinateOperationDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.AbstractCoordinateOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCoordinateOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTCOORDINATEOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateOperation");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTCOORDINATEOPERATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PassThroughOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ConcatenatedOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleOperation"),
    });
    
    
    /**
     * Gets the "AbstractCoordinateOperation" element
     */
    public net.opengis.gml.x32.AbstractCoordinateOperationType getAbstractCoordinateOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().find_element_user(ABSTRACTCOORDINATEOPERATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractCoordinateOperation" element
     */
    public void setAbstractCoordinateOperation(net.opengis.gml.x32.AbstractCoordinateOperationType abstractCoordinateOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().find_element_user(ABSTRACTCOORDINATEOPERATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().add_element_user(ABSTRACTCOORDINATEOPERATION$0);
            }
            target.set(abstractCoordinateOperation);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractCoordinateOperation" element
     */
    public net.opengis.gml.x32.AbstractCoordinateOperationType addNewAbstractCoordinateOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.x32.AbstractCoordinateOperationType)get_store().add_element_user(ABSTRACTCOORDINATEOPERATION$0);
            return target;
        }
    }
}
