/*
 * An XML document type.
 * Localname: GenericMetaData
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GenericMetaDataDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one GenericMetaData(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GenericMetaDataDocumentImpl extends net.opengis.gml.x32.impl.AbstractMetaDataDocumentImpl implements net.opengis.gml.x32.GenericMetaDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenericMetaDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERICMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GenericMetaData");
    
    
    /**
     * Gets the "GenericMetaData" element
     */
    public net.opengis.gml.x32.GenericMetaDataType getGenericMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GenericMetaDataType target = null;
            target = (net.opengis.gml.x32.GenericMetaDataType)get_store().find_element_user(GENERICMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GenericMetaData" element
     */
    public void setGenericMetaData(net.opengis.gml.x32.GenericMetaDataType genericMetaData)
    {
        generatedSetterHelperImpl(genericMetaData, GENERICMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GenericMetaData" element
     */
    public net.opengis.gml.x32.GenericMetaDataType addNewGenericMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GenericMetaDataType target = null;
            target = (net.opengis.gml.x32.GenericMetaDataType)get_store().add_element_user(GENERICMETADATA$0);
            return target;
        }
    }
}
