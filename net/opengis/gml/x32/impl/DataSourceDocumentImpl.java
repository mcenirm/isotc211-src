/*
 * An XML document type.
 * Localname: dataSource
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DataSourceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one dataSource(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DataSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DataSourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASOURCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dataSource");
    
    
    /**
     * Gets the "dataSource" element
     */
    public net.opengis.gml.x32.StringOrRefType getDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().find_element_user(DATASOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataSource" element
     */
    public void setDataSource(net.opengis.gml.x32.StringOrRefType dataSource)
    {
        generatedSetterHelperImpl(dataSource, DATASOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataSource" element
     */
    public net.opengis.gml.x32.StringOrRefType addNewDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().add_element_user(DATASOURCE$0);
            return target;
        }
    }
}
