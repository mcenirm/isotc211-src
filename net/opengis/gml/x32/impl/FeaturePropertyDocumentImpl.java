/*
 * An XML document type.
 * Localname: featureProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.FeaturePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one featureProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class FeaturePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.FeaturePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeaturePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATUREPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "featureProperty");
    
    
    /**
     * Gets the "featureProperty" element
     */
    public net.opengis.gml.x32.FeaturePropertyType getFeatureProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeaturePropertyType target = null;
            target = (net.opengis.gml.x32.FeaturePropertyType)get_store().find_element_user(FEATUREPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "featureProperty" element
     */
    public void setFeatureProperty(net.opengis.gml.x32.FeaturePropertyType featureProperty)
    {
        generatedSetterHelperImpl(featureProperty, FEATUREPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "featureProperty" element
     */
    public net.opengis.gml.x32.FeaturePropertyType addNewFeatureProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeaturePropertyType target = null;
            target = (net.opengis.gml.x32.FeaturePropertyType)get_store().add_element_user(FEATUREPROPERTY$0);
            return target;
        }
    }
}
