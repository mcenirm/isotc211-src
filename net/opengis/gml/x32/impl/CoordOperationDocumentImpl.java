/*
 * An XML document type.
 * Localname: coordOperation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoordOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one coordOperation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CoordOperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CoordOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordOperation");
    private static final org.apache.xmlbeans.QNameSet COORDOPERATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesSingleOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordOperation"),
    });
    
    
    /**
     * Gets the "coordOperation" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType getCoordOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().find_element_user(COORDOPERATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordOperation" element
     */
    public void setCoordOperation(net.opengis.gml.x32.CoordinateOperationPropertyType coordOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().find_element_user(COORDOPERATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().add_element_user(COORDOPERATION$0);
            }
            target.set(coordOperation);
        }
    }
    
    /**
     * Appends and returns a new empty "coordOperation" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType addNewCoordOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().add_element_user(COORDOPERATION$0);
            return target;
        }
    }
}
