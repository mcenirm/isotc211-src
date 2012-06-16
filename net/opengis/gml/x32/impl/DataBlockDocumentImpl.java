/*
 * An XML document type.
 * Localname: DataBlock
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DataBlockDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one DataBlock(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DataBlockDocumentImpl extends net.opengis.gml.x32.impl.AbstractObjectDocumentImpl implements net.opengis.gml.x32.DataBlockDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataBlockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATABLOCK$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DataBlock");
    
    
    /**
     * Gets the "DataBlock" element
     */
    public net.opengis.gml.x32.DataBlockType getDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DataBlockType target = null;
            target = (net.opengis.gml.x32.DataBlockType)get_store().find_element_user(DATABLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataBlock" element
     */
    public void setDataBlock(net.opengis.gml.x32.DataBlockType dataBlock)
    {
        generatedSetterHelperImpl(dataBlock, DATABLOCK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DataBlock" element
     */
    public net.opengis.gml.x32.DataBlockType addNewDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DataBlockType target = null;
            target = (net.opengis.gml.x32.DataBlockType)get_store().add_element_user(DATABLOCK$0);
            return target;
        }
    }
}
