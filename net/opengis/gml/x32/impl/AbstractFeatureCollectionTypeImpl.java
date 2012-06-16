/*
 * XML Type:  AbstractFeatureCollectionType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractFeatureCollectionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractFeatureCollectionType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractFeatureCollectionTypeImpl extends net.opengis.gml.x32.impl.AbstractFeatureTypeImpl implements net.opengis.gml.x32.AbstractFeatureCollectionType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractFeatureCollectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATUREMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "featureMember");
    private static final javax.xml.namespace.QName FEATUREMEMBERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "featureMembers");
    
    
    /**
     * Gets array of all "featureMember" elements
     */
    public net.opengis.gml.x32.FeaturePropertyType[] getFeatureMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FEATUREMEMBER$0, targetList);
            net.opengis.gml.x32.FeaturePropertyType[] result = new net.opengis.gml.x32.FeaturePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "featureMember" element
     */
    public net.opengis.gml.x32.FeaturePropertyType getFeatureMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeaturePropertyType target = null;
            target = (net.opengis.gml.x32.FeaturePropertyType)get_store().find_element_user(FEATUREMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "featureMember" element
     */
    public int sizeOfFeatureMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATUREMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "featureMember" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFeatureMemberArray(net.opengis.gml.x32.FeaturePropertyType[] featureMemberArray)
    {
        check_orphaned();
        arraySetterHelper(featureMemberArray, FEATUREMEMBER$0);
    }
    
    /**
     * Sets ith "featureMember" element
     */
    public void setFeatureMemberArray(int i, net.opengis.gml.x32.FeaturePropertyType featureMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeaturePropertyType target = null;
            target = (net.opengis.gml.x32.FeaturePropertyType)get_store().find_element_user(FEATUREMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(featureMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureMember" element
     */
    public net.opengis.gml.x32.FeaturePropertyType insertNewFeatureMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeaturePropertyType target = null;
            target = (net.opengis.gml.x32.FeaturePropertyType)get_store().insert_element_user(FEATUREMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureMember" element
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
    
    /**
     * Removes the ith "featureMember" element
     */
    public void removeFeatureMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATUREMEMBER$0, i);
        }
    }
    
    /**
     * Gets the "featureMembers" element
     */
    public net.opengis.gml.x32.FeatureArrayPropertyType getFeatureMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FeatureArrayPropertyType target = null;
            target = (net.opengis.gml.x32.FeatureArrayPropertyType)get_store().find_element_user(FEATUREMEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "featureMembers" element
     */
    public boolean isSetFeatureMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATUREMEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "featureMembers" element
     */
    public void setFeatureMembers(net.opengis.gml.x32.FeatureArrayPropertyType featureMembers)
    {
        generatedSetterHelperImpl(featureMembers, FEATUREMEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.x32.FeatureArrayPropertyType)get_store().add_element_user(FEATUREMEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "featureMembers" element
     */
    public void unsetFeatureMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATUREMEMBERS$2, 0);
        }
    }
}
