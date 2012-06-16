/*
 * XML Type:  DynamicFeatureType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DynamicFeatureType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DynamicFeatureType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DynamicFeatureTypeImpl extends net.opengis.gml.x32.impl.AbstractFeatureTypeImpl implements net.opengis.gml.x32.DynamicFeatureType
{
    private static final long serialVersionUID = 1L;
    
    public DynamicFeatureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDTIME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "validTime");
    private static final javax.xml.namespace.QName HISTORY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "history");
    private static final org.apache.xmlbeans.QNameSet HISTORY$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "track"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "history"),
    });
    private static final javax.xml.namespace.QName DATASOURCE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dataSource");
    private static final javax.xml.namespace.QName DATASOURCEREFERENCE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dataSourceReference");
    
    
    /**
     * Gets the "validTime" element
     */
    public net.opengis.gml.x32.TimePrimitivePropertyType getValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.TimePrimitivePropertyType)get_store().find_element_user(VALIDTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "validTime" element
     */
    public boolean isSetValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDTIME$0) != 0;
        }
    }
    
    /**
     * Sets the "validTime" element
     */
    public void setValidTime(net.opengis.gml.x32.TimePrimitivePropertyType validTime)
    {
        generatedSetterHelperImpl(validTime, VALIDTIME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "validTime" element
     */
    public net.opengis.gml.x32.TimePrimitivePropertyType addNewValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.TimePrimitivePropertyType)get_store().add_element_user(VALIDTIME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "validTime" element
     */
    public void unsetValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDTIME$0, 0);
        }
    }
    
    /**
     * Gets the "history" element
     */
    public net.opengis.gml.x32.HistoryPropertyType getHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.HistoryPropertyType target = null;
            target = (net.opengis.gml.x32.HistoryPropertyType)get_store().find_element_user(HISTORY$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "history" element
     */
    public boolean isSetHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HISTORY$3) != 0;
        }
    }
    
    /**
     * Sets the "history" element
     */
    public void setHistory(net.opengis.gml.x32.HistoryPropertyType history)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.HistoryPropertyType target = null;
            target = (net.opengis.gml.x32.HistoryPropertyType)get_store().find_element_user(HISTORY$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.HistoryPropertyType)get_store().add_element_user(HISTORY$2);
            }
            target.set(history);
        }
    }
    
    /**
     * Appends and returns a new empty "history" element
     */
    public net.opengis.gml.x32.HistoryPropertyType addNewHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.HistoryPropertyType target = null;
            target = (net.opengis.gml.x32.HistoryPropertyType)get_store().add_element_user(HISTORY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "history" element
     */
    public void unsetHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HISTORY$3, 0);
        }
    }
    
    /**
     * Gets the "dataSource" element
     */
    public net.opengis.gml.x32.StringOrRefType getDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().find_element_user(DATASOURCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataSource" element
     */
    public boolean isSetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASOURCE$4) != 0;
        }
    }
    
    /**
     * Sets the "dataSource" element
     */
    public void setDataSource(net.opengis.gml.x32.StringOrRefType dataSource)
    {
        generatedSetterHelperImpl(dataSource, DATASOURCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataSource" element
     */
    public net.opengis.gml.x32.StringOrRefType addNewDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().add_element_user(DATASOURCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "dataSource" element
     */
    public void unsetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASOURCE$4, 0);
        }
    }
    
    /**
     * Gets the "dataSourceReference" element
     */
    public net.opengis.gml.x32.ReferenceType getDataSourceReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(DATASOURCEREFERENCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataSourceReference" element
     */
    public boolean isSetDataSourceReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASOURCEREFERENCE$6) != 0;
        }
    }
    
    /**
     * Sets the "dataSourceReference" element
     */
    public void setDataSourceReference(net.opengis.gml.x32.ReferenceType dataSourceReference)
    {
        generatedSetterHelperImpl(dataSourceReference, DATASOURCEREFERENCE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataSourceReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewDataSourceReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(DATASOURCEREFERENCE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "dataSourceReference" element
     */
    public void unsetDataSourceReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASOURCEREFERENCE$6, 0);
        }
    }
}
