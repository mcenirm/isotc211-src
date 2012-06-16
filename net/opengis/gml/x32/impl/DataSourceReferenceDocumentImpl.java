/*
 * An XML document type.
 * Localname: dataSourceReference
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DataSourceReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one dataSourceReference(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DataSourceReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DataSourceReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSourceReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASOURCEREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dataSourceReference");
    
    
    /**
     * Gets the "dataSourceReference" element
     */
    public net.opengis.gml.x32.ReferenceType getDataSourceReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(DATASOURCEREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataSourceReference" element
     */
    public void setDataSourceReference(net.opengis.gml.x32.ReferenceType dataSourceReference)
    {
        generatedSetterHelperImpl(dataSourceReference, DATASOURCEREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataSourceReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewDataSourceReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(DATASOURCEREFERENCE$0);
            return target;
        }
    }
}
