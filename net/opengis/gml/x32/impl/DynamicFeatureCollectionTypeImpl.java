/*
 * XML Type:  DynamicFeatureCollectionType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DynamicFeatureCollectionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DynamicFeatureCollectionType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DynamicFeatureCollectionTypeImpl extends net.opengis.gml.x32.impl.DynamicFeatureTypeImpl implements net.opengis.gml.x32.DynamicFeatureCollectionType
{
    private static final long serialVersionUID = 1L;
    
    public DynamicFeatureCollectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DYNAMICMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dynamicMembers");
    
    
    /**
     * Gets the "dynamicMembers" element
     */
    public net.opengis.gml.x32.DynamicFeatureMemberType getDynamicMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DynamicFeatureMemberType target = null;
            target = (net.opengis.gml.x32.DynamicFeatureMemberType)get_store().find_element_user(DYNAMICMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dynamicMembers" element
     */
    public void setDynamicMembers(net.opengis.gml.x32.DynamicFeatureMemberType dynamicMembers)
    {
        generatedSetterHelperImpl(dynamicMembers, DYNAMICMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dynamicMembers" element
     */
    public net.opengis.gml.x32.DynamicFeatureMemberType addNewDynamicMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DynamicFeatureMemberType target = null;
            target = (net.opengis.gml.x32.DynamicFeatureMemberType)get_store().add_element_user(DYNAMICMEMBERS$0);
            return target;
        }
    }
}
