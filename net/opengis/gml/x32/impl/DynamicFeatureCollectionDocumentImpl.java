/*
 * An XML document type.
 * Localname: DynamicFeatureCollection
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DynamicFeatureCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one DynamicFeatureCollection(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DynamicFeatureCollectionDocumentImpl extends net.opengis.gml.x32.impl.DynamicFeatureDocumentImpl implements net.opengis.gml.x32.DynamicFeatureCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DynamicFeatureCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DYNAMICFEATURECOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeatureCollection");
    
    
    /**
     * Gets the "DynamicFeatureCollection" element
     */
    public net.opengis.gml.x32.DynamicFeatureCollectionType getDynamicFeatureCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DynamicFeatureCollectionType target = null;
            target = (net.opengis.gml.x32.DynamicFeatureCollectionType)get_store().find_element_user(DYNAMICFEATURECOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DynamicFeatureCollection" element
     */
    public void setDynamicFeatureCollection(net.opengis.gml.x32.DynamicFeatureCollectionType dynamicFeatureCollection)
    {
        generatedSetterHelperImpl(dynamicFeatureCollection, DYNAMICFEATURECOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DynamicFeatureCollection" element
     */
    public net.opengis.gml.x32.DynamicFeatureCollectionType addNewDynamicFeatureCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DynamicFeatureCollectionType target = null;
            target = (net.opengis.gml.x32.DynamicFeatureCollectionType)get_store().add_element_user(DYNAMICFEATURECOLLECTION$0);
            return target;
        }
    }
}
