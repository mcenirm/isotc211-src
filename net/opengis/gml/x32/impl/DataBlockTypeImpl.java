/*
 * XML Type:  DataBlockType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DataBlockType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DataBlockType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DataBlockTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DataBlockType
{
    private static final long serialVersionUID = 1L;
    
    public DataBlockTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGEPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "rangeParameters");
    private static final javax.xml.namespace.QName TUPLELIST$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "tupleList");
    private static final javax.xml.namespace.QName DOUBLEORNILREASONTUPLELIST$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "doubleOrNilReasonTupleList");
    
    
    /**
     * Gets the "rangeParameters" element
     */
    public net.opengis.gml.x32.AssociationRoleType getRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().find_element_user(RANGEPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeParameters" element
     */
    public void setRangeParameters(net.opengis.gml.x32.AssociationRoleType rangeParameters)
    {
        generatedSetterHelperImpl(rangeParameters, RANGEPARAMETERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeParameters" element
     */
    public net.opengis.gml.x32.AssociationRoleType addNewRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().add_element_user(RANGEPARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "tupleList" element
     */
    public net.opengis.gml.x32.CoordinatesType getTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinatesType target = null;
            target = (net.opengis.gml.x32.CoordinatesType)get_store().find_element_user(TUPLELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tupleList" element
     */
    public boolean isSetTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TUPLELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "tupleList" element
     */
    public void setTupleList(net.opengis.gml.x32.CoordinatesType tupleList)
    {
        generatedSetterHelperImpl(tupleList, TUPLELIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "tupleList" element
     */
    public net.opengis.gml.x32.CoordinatesType addNewTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinatesType target = null;
            target = (net.opengis.gml.x32.CoordinatesType)get_store().add_element_user(TUPLELIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "tupleList" element
     */
    public void unsetTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TUPLELIST$2, 0);
        }
    }
    
    /**
     * Gets the "doubleOrNilReasonTupleList" element
     */
    public java.util.List getDoubleOrNilReasonTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEORNILREASONTUPLELIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "doubleOrNilReasonTupleList" element
     */
    public net.opengis.gml.x32.DoubleOrNilReasonList xgetDoubleOrNilReasonTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DoubleOrNilReasonList target = null;
            target = (net.opengis.gml.x32.DoubleOrNilReasonList)get_store().find_element_user(DOUBLEORNILREASONTUPLELIST$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "doubleOrNilReasonTupleList" element
     */
    public boolean isSetDoubleOrNilReasonTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOUBLEORNILREASONTUPLELIST$4) != 0;
        }
    }
    
    /**
     * Sets the "doubleOrNilReasonTupleList" element
     */
    public void setDoubleOrNilReasonTupleList(java.util.List doubleOrNilReasonTupleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEORNILREASONTUPLELIST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOUBLEORNILREASONTUPLELIST$4);
            }
            target.setListValue(doubleOrNilReasonTupleList);
        }
    }
    
    /**
     * Sets (as xml) the "doubleOrNilReasonTupleList" element
     */
    public void xsetDoubleOrNilReasonTupleList(net.opengis.gml.x32.DoubleOrNilReasonList doubleOrNilReasonTupleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DoubleOrNilReasonList target = null;
            target = (net.opengis.gml.x32.DoubleOrNilReasonList)get_store().find_element_user(DOUBLEORNILREASONTUPLELIST$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DoubleOrNilReasonList)get_store().add_element_user(DOUBLEORNILREASONTUPLELIST$4);
            }
            target.set(doubleOrNilReasonTupleList);
        }
    }
    
    /**
     * Unsets the "doubleOrNilReasonTupleList" element
     */
    public void unsetDoubleOrNilReasonTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOUBLEORNILREASONTUPLELIST$4, 0);
        }
    }
}
