/*
 * An XML document type.
 * Localname: AbstractGeneralTransformation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGeneralTransformationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractGeneralTransformation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGeneralTransformationDocumentImpl extends net.opengis.gml.x32.impl.AbstractOperationDocumentImpl implements net.opengis.gml.x32.AbstractGeneralTransformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeneralTransformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGENERALTRANSFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralTransformation");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGENERALTRANSFORMATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Transformation"),
    });
    
    
    /**
     * Gets the "AbstractGeneralTransformation" element
     */
    public net.opengis.gml.x32.AbstractGeneralTransformationType getAbstractGeneralTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralTransformationType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralTransformationType)get_store().find_element_user(ABSTRACTGENERALTRANSFORMATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGeneralTransformation" element
     */
    public void setAbstractGeneralTransformation(net.opengis.gml.x32.AbstractGeneralTransformationType abstractGeneralTransformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralTransformationType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralTransformationType)get_store().find_element_user(ABSTRACTGENERALTRANSFORMATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeneralTransformationType)get_store().add_element_user(ABSTRACTGENERALTRANSFORMATION$0);
            }
            target.set(abstractGeneralTransformation);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGeneralTransformation" element
     */
    public net.opengis.gml.x32.AbstractGeneralTransformationType addNewAbstractGeneralTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralTransformationType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralTransformationType)get_store().add_element_user(ABSTRACTGENERALTRANSFORMATION$0);
            return target;
        }
    }
}
