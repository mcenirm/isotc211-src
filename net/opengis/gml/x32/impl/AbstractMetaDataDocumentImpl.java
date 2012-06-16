/*
 * An XML document type.
 * Localname: AbstractMetaData
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractMetaDataDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractMetaData(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractMetaDataDocumentImpl extends net.opengis.gml.x32.impl.AbstractObjectDocumentImpl implements net.opengis.gml.x32.AbstractMetaDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractMetaDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractMetaData");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTMETADATA$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GenericMetaData"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractMetaData"),
    });
    
    
    /**
     * Gets the "AbstractMetaData" element
     */
    public net.opengis.gml.x32.AbstractMetaDataType getAbstractMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractMetaDataType target = null;
            target = (net.opengis.gml.x32.AbstractMetaDataType)get_store().find_element_user(ABSTRACTMETADATA$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractMetaData" element
     */
    public void setAbstractMetaData(net.opengis.gml.x32.AbstractMetaDataType abstractMetaData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractMetaDataType target = null;
            target = (net.opengis.gml.x32.AbstractMetaDataType)get_store().find_element_user(ABSTRACTMETADATA$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractMetaDataType)get_store().add_element_user(ABSTRACTMETADATA$0);
            }
            target.set(abstractMetaData);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractMetaData" element
     */
    public net.opengis.gml.x32.AbstractMetaDataType addNewAbstractMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractMetaDataType target = null;
            target = (net.opengis.gml.x32.AbstractMetaDataType)get_store().add_element_user(ABSTRACTMETADATA$0);
            return target;
        }
    }
}
