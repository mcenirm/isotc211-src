/*
 * An XML document type.
 * Localname: AbstractFeatureCollection
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractFeatureCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractFeatureCollection(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractFeatureCollectionDocumentImpl extends net.opengis.gml.x32.impl.AbstractFeatureDocumentImpl implements net.opengis.gml.x32.AbstractFeatureCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractFeatureCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTFEATURECOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractFeatureCollection");
    
    
    /**
     * Gets the "AbstractFeatureCollection" element
     */
    public net.opengis.gml.x32.AbstractFeatureCollectionType getAbstractFeatureCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractFeatureCollectionType target = null;
            target = (net.opengis.gml.x32.AbstractFeatureCollectionType)get_store().find_element_user(ABSTRACTFEATURECOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractFeatureCollection" element
     */
    public void setAbstractFeatureCollection(net.opengis.gml.x32.AbstractFeatureCollectionType abstractFeatureCollection)
    {
        generatedSetterHelperImpl(abstractFeatureCollection, ABSTRACTFEATURECOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AbstractFeatureCollection" element
     */
    public net.opengis.gml.x32.AbstractFeatureCollectionType addNewAbstractFeatureCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractFeatureCollectionType target = null;
            target = (net.opengis.gml.x32.AbstractFeatureCollectionType)get_store().add_element_user(ABSTRACTFEATURECOLLECTION$0);
            return target;
        }
    }
}
