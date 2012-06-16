/*
 * An XML document type.
 * Localname: featureMember
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.FeatureMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one featureMember(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class FeatureMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.FeatureMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeatureMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATUREMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "featureMember");
    
    
    /**
     * Gets the "featureMember" element
     */
    public net.opengis.gml.x32.FeaturePropertyType getFeatureMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeaturePropertyType target = null;
            target = (net.opengis.gml.x32.FeaturePropertyType)get_store().find_element_user(FEATUREMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "featureMember" element
     */
    public void setFeatureMember(net.opengis.gml.x32.FeaturePropertyType featureMember)
    {
        generatedSetterHelperImpl(featureMember, FEATUREMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "featureMember" element
     */
    public net.opengis.gml.x32.FeaturePropertyType addNewFeatureMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeaturePropertyType target = null;
            target = (net.opengis.gml.x32.FeaturePropertyType)get_store().add_element_user(FEATUREMEMBER$0);
            return target;
        }
    }
}
