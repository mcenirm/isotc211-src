/*
 * An XML document type.
 * Localname: DynamicFeature
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DynamicFeatureDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one DynamicFeature(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DynamicFeatureDocumentImpl extends net.opengis.gml.x32.impl.AbstractFeatureDocumentImpl implements net.opengis.gml.x32.DynamicFeatureDocument
{
    private static final long serialVersionUID = 1L;
    
    public DynamicFeatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DYNAMICFEATURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeature");
    private static final org.apache.xmlbeans.QNameSet DYNAMICFEATURE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeature"),
    });
    
    
    /**
     * Gets the "DynamicFeature" element
     */
    public net.opengis.gml.x32.DynamicFeatureType getDynamicFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DynamicFeatureType target = null;
            target = (net.opengis.gml.x32.DynamicFeatureType)get_store().find_element_user(DYNAMICFEATURE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DynamicFeature" element
     */
    public void setDynamicFeature(net.opengis.gml.x32.DynamicFeatureType dynamicFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DynamicFeatureType target = null;
            target = (net.opengis.gml.x32.DynamicFeatureType)get_store().find_element_user(DYNAMICFEATURE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DynamicFeatureType)get_store().add_element_user(DYNAMICFEATURE$0);
            }
            target.set(dynamicFeature);
        }
    }
    
    /**
     * Appends and returns a new empty "DynamicFeature" element
     */
    public net.opengis.gml.x32.DynamicFeatureType addNewDynamicFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DynamicFeatureType target = null;
            target = (net.opengis.gml.x32.DynamicFeatureType)get_store().add_element_user(DYNAMICFEATURE$0);
            return target;
        }
    }
}
