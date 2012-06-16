/*
 * XML Type:  RangeSetType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RangeSetType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML RangeSetType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class RangeSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.RangeSetType
{
    private static final long serialVersionUID = 1L;
    
    public RangeSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEARRAY1$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ValueArray");
    private static final javax.xml.namespace.QName ABSTRACTSCALARVALUELIST$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValueList");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSCALARVALUELIST$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValueList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CategoryList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "QuantityList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BooleanList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CountList"),
    });
    private static final javax.xml.namespace.QName DATABLOCK$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DataBlock");
    private static final javax.xml.namespace.QName FILE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "File");
    
    
    /**
     * Gets array of all "ValueArray" elements
     */
    public net.opengis.gml.x32.ValueArrayType[] getValueArray1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUEARRAY1$0, targetList);
            net.opengis.gml.x32.ValueArrayType[] result = new net.opengis.gml.x32.ValueArrayType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ValueArray" element
     */
    public net.opengis.gml.x32.ValueArrayType getValueArray1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValueArrayType target = null;
            target = (net.opengis.gml.x32.ValueArrayType)get_store().find_element_user(VALUEARRAY1$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ValueArray" element
     */
    public int sizeOfValueArray1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEARRAY1$0);
        }
    }
    
    /**
     * Sets array of all "ValueArray" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setValueArray1Array(net.opengis.gml.x32.ValueArrayType[] valueArray1Array)
    {
        check_orphaned();
        arraySetterHelper(valueArray1Array, VALUEARRAY1$0);
    }
    
    /**
     * Sets ith "ValueArray" element
     */
    public void setValueArray1Array(int i, net.opengis.gml.x32.ValueArrayType valueArray1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValueArrayType target = null;
            target = (net.opengis.gml.x32.ValueArrayType)get_store().find_element_user(VALUEARRAY1$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(valueArray1);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueArray" element
     */
    public net.opengis.gml.x32.ValueArrayType insertNewValueArray1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValueArrayType target = null;
            target = (net.opengis.gml.x32.ValueArrayType)get_store().insert_element_user(VALUEARRAY1$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValueArray" element
     */
    public net.opengis.gml.x32.ValueArrayType addNewValueArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValueArrayType target = null;
            target = (net.opengis.gml.x32.ValueArrayType)get_store().add_element_user(VALUEARRAY1$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ValueArray" element
     */
    public void removeValueArray1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEARRAY1$0, i);
        }
    }
    
    /**
     * Gets array of all "AbstractScalarValueList" elements
     */
    public org.apache.xmlbeans.XmlObject[] getAbstractScalarValueListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTSCALARVALUELIST$3, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractScalarValueList" element
     */
    public org.apache.xmlbeans.XmlObject getAbstractScalarValueListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTSCALARVALUELIST$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractScalarValueList" element
     */
    public int sizeOfAbstractScalarValueListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTSCALARVALUELIST$3);
        }
    }
    
    /**
     * Sets array of all "AbstractScalarValueList" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractScalarValueListArray(org.apache.xmlbeans.XmlObject[] abstractScalarValueListArray)
    {
        check_orphaned();
        arraySetterHelper(abstractScalarValueListArray, ABSTRACTSCALARVALUELIST$2, ABSTRACTSCALARVALUELIST$3);
    }
    
    /**
     * Sets ith "AbstractScalarValueList" element
     */
    public void setAbstractScalarValueListArray(int i, org.apache.xmlbeans.XmlObject abstractScalarValueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTSCALARVALUELIST$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractScalarValueList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractScalarValueList" element
     */
    public org.apache.xmlbeans.XmlObject insertNewAbstractScalarValueList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ABSTRACTSCALARVALUELIST$3, ABSTRACTSCALARVALUELIST$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractScalarValueList" element
     */
    public org.apache.xmlbeans.XmlObject addNewAbstractScalarValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTSCALARVALUELIST$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractScalarValueList" element
     */
    public void removeAbstractScalarValueList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTSCALARVALUELIST$3, i);
        }
    }
    
    /**
     * Gets the "DataBlock" element
     */
    public net.opengis.gml.x32.DataBlockType getDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DataBlockType target = null;
            target = (net.opengis.gml.x32.DataBlockType)get_store().find_element_user(DATABLOCK$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataBlock" element
     */
    public boolean isSetDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATABLOCK$4) != 0;
        }
    }
    
    /**
     * Sets the "DataBlock" element
     */
    public void setDataBlock(net.opengis.gml.x32.DataBlockType dataBlock)
    {
        generatedSetterHelperImpl(dataBlock, DATABLOCK$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DataBlock" element
     */
    public net.opengis.gml.x32.DataBlockType addNewDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DataBlockType target = null;
            target = (net.opengis.gml.x32.DataBlockType)get_store().add_element_user(DATABLOCK$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DataBlock" element
     */
    public void unsetDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATABLOCK$4, 0);
        }
    }
    
    /**
     * Gets the "File" element
     */
    public net.opengis.gml.x32.FileType getFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FileType target = null;
            target = (net.opengis.gml.x32.FileType)get_store().find_element_user(FILE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "File" element
     */
    public boolean isSetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILE$6) != 0;
        }
    }
    
    /**
     * Sets the "File" element
     */
    public void setFile(net.opengis.gml.x32.FileType file)
    {
        generatedSetterHelperImpl(file, FILE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "File" element
     */
    public net.opengis.gml.x32.FileType addNewFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FileType target = null;
            target = (net.opengis.gml.x32.FileType)get_store().add_element_user(FILE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "File" element
     */
    public void unsetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILE$6, 0);
        }
    }
}
