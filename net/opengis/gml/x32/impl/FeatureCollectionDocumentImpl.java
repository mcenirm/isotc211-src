/*
 * An XML document type.
 * Localname: FeatureCollection
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.FeatureCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one FeatureCollection(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class FeatureCollectionDocumentImpl extends net.opengis.gml.x32.impl.AbstractFeatureDocumentImpl implements net.opengis.gml.x32.FeatureCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeatureCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURECOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "FeatureCollection");
    
    
    /**
     * Gets the "FeatureCollection" element
     */
    public net.opengis.gml.x32.FeatureCollectionType getFeatureCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeatureCollectionType target = null;
            target = (net.opengis.gml.x32.FeatureCollectionType)get_store().find_element_user(FEATURECOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FeatureCollection" element
     */
    public void setFeatureCollection(net.opengis.gml.x32.FeatureCollectionType featureCollection)
    {
        generatedSetterHelperImpl(featureCollection, FEATURECOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FeatureCollection" element
     */
    public net.opengis.gml.x32.FeatureCollectionType addNewFeatureCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeatureCollectionType target = null;
            target = (net.opengis.gml.x32.FeatureCollectionType)get_store().add_element_user(FEATURECOLLECTION$0);
            return target;
        }
    }
}
