/*
 * An XML document type.
 * Localname: featureMembers
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.FeatureMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one featureMembers(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class FeatureMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.FeatureMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeatureMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATUREMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "featureMembers");
    
    
    /**
     * Gets the "featureMembers" element
     */
    public net.opengis.gml.x32.FeatureArrayPropertyType getFeatureMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeatureArrayPropertyType target = null;
            target = (net.opengis.gml.x32.FeatureArrayPropertyType)get_store().find_element_user(FEATUREMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "featureMembers" element
     */
    public void setFeatureMembers(net.opengis.gml.x32.FeatureArrayPropertyType featureMembers)
    {
        generatedSetterHelperImpl(featureMembers, FEATUREMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "featureMembers" element
     */
    public net.opengis.gml.x32.FeatureArrayPropertyType addNewFeatureMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeatureArrayPropertyType target = null;
            target = (net.opengis.gml.x32.FeatureArrayPropertyType)get_store().add_element_user(FEATUREMEMBERS$0);
            return target;
        }
    }
}
