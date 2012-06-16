/*
 * XML Type:  FeatureArrayPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.FeatureArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML FeatureArrayPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class FeatureArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.FeatureArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public FeatureArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTFEATURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractFeature");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTFEATURE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractContinuousCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservationAtDistance"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractFeature"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractFeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurveCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeature"),
    });
    
    
    /**
     * Gets array of all "AbstractFeature" elements
     */
    public net.opengis.gml.x32.AbstractFeatureType[] getAbstractFeatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTFEATURE$1, targetList);
            net.opengis.gml.x32.AbstractFeatureType[] result = new net.opengis.gml.x32.AbstractFeatureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractFeature" element
     */
    public net.opengis.gml.x32.AbstractFeatureType getAbstractFeatureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractFeatureType target = null;
            target = (net.opengis.gml.x32.AbstractFeatureType)get_store().find_element_user(ABSTRACTFEATURE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractFeature" element
     */
    public int sizeOfAbstractFeatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTFEATURE$1);
        }
    }
    
    /**
     * Sets array of all "AbstractFeature" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractFeatureArray(net.opengis.gml.x32.AbstractFeatureType[] abstractFeatureArray)
    {
        check_orphaned();
        arraySetterHelper(abstractFeatureArray, ABSTRACTFEATURE$0, ABSTRACTFEATURE$1);
    }
    
    /**
     * Sets ith "AbstractFeature" element
     */
    public void setAbstractFeatureArray(int i, net.opengis.gml.x32.AbstractFeatureType abstractFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractFeatureType target = null;
            target = (net.opengis.gml.x32.AbstractFeatureType)get_store().find_element_user(ABSTRACTFEATURE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractFeature);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractFeature" element
     */
    public net.opengis.gml.x32.AbstractFeatureType insertNewAbstractFeature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractFeatureType target = null;
            target = (net.opengis.gml.x32.AbstractFeatureType)get_store().insert_element_user(ABSTRACTFEATURE$1, ABSTRACTFEATURE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractFeature" element
     */
    public net.opengis.gml.x32.AbstractFeatureType addNewAbstractFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractFeatureType target = null;
            target = (net.opengis.gml.x32.AbstractFeatureType)get_store().add_element_user(ABSTRACTFEATURE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractFeature" element
     */
    public void removeAbstractFeature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTFEATURE$1, i);
        }
    }
}
