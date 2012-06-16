/*
 * XML Type:  AbstractGriddedSurfaceType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGriddedSurfaceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractGriddedSurfaceType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractGriddedSurfaceTypeImpl extends net.opengis.gml.x32.impl.AbstractParametricCurveSurfaceTypeImpl implements net.opengis.gml.x32.AbstractGriddedSurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGriddedSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROWS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "rows");
    private static final javax.xml.namespace.QName ROWS2$2 = 
        new javax.xml.namespace.QName("", "rows");
    private static final javax.xml.namespace.QName COLUMNS$4 = 
        new javax.xml.namespace.QName("", "columns");
    
    
    /**
     * Gets the "rows" element
     */
    public net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows getRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows target = null;
            target = (net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows)get_store().find_element_user(ROWS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rows" element
     */
    public void setRows(net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows rows)
    {
        generatedSetterHelperImpl(rows, ROWS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rows" element
     */
    public net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows addNewRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows target = null;
            target = (net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows)get_store().add_element_user(ROWS$0);
            return target;
        }
    }
    
    /**
     * Gets the "rows" attribute
     */
    public java.math.BigInteger getRows2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWS2$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "rows" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetRows2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROWS2$2);
            return target;
        }
    }
    
    /**
     * True if has "rows" attribute
     */
    public boolean isSetRows2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWS2$2) != null;
        }
    }
    
    /**
     * Sets the "rows" attribute
     */
    public void setRows2(java.math.BigInteger rows2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWS2$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWS2$2);
            }
            target.setBigIntegerValue(rows2);
        }
    }
    
    /**
     * Sets (as xml) the "rows" attribute
     */
    public void xsetRows2(org.apache.xmlbeans.XmlInteger rows2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROWS2$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ROWS2$2);
            }
            target.set(rows2);
        }
    }
    
    /**
     * Unsets the "rows" attribute
     */
    public void unsetRows2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWS2$2);
        }
    }
    
    /**
     * Gets the "columns" attribute
     */
    public java.math.BigInteger getColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLUMNS$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "columns" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COLUMNS$4);
            return target;
        }
    }
    
    /**
     * True if has "columns" attribute
     */
    public boolean isSetColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLUMNS$4) != null;
        }
    }
    
    /**
     * Sets the "columns" attribute
     */
    public void setColumns(java.math.BigInteger columns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLUMNS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLUMNS$4);
            }
            target.setBigIntegerValue(columns);
        }
    }
    
    /**
     * Sets (as xml) the "columns" attribute
     */
    public void xsetColumns(org.apache.xmlbeans.XmlInteger columns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COLUMNS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COLUMNS$4);
            }
            target.set(columns);
        }
    }
    
    /**
     * Unsets the "columns" attribute
     */
    public void unsetColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLUMNS$4);
        }
    }
    /**
     * An XML rows(@http://www.opengis.net/gml/3.2).
     *
     * This is a complex type.
     */
    public static class RowsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows
    {
        private static final long serialVersionUID = 1L;
        
        public RowsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROW$0 = 
            new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Row");
        
        
        /**
         * Gets array of all "Row" elements
         */
        public net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row[] getRowArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROW$0, targetList);
                net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row[] result = new net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Row" element
         */
        public net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row getRowArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row target = null;
                target = (net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row)get_store().find_element_user(ROW$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Row" element
         */
        public int sizeOfRowArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROW$0);
            }
        }
        
        /**
         * Sets array of all "Row" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRowArray(net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row[] rowArray)
        {
            check_orphaned();
            arraySetterHelper(rowArray, ROW$0);
        }
        
        /**
         * Sets ith "Row" element
         */
        public void setRowArray(int i, net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row row)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row target = null;
                target = (net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row)get_store().find_element_user(ROW$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(row);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Row" element
         */
        public net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row insertNewRow(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row target = null;
                target = (net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row)get_store().insert_element_user(ROW$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Row" element
         */
        public net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row addNewRow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row target = null;
                target = (net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row)get_store().add_element_user(ROW$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Row" element
         */
        public void removeRow(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROW$0, i);
            }
        }
        /**
         * An XML Row(@http://www.opengis.net/gml/3.2).
         *
         * This is a complex type.
         */
        public static class RowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractGriddedSurfaceType.Rows.Row
        {
            private static final long serialVersionUID = 1L;
            
            public RowImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName POSLIST$0 = 
                new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "posList");
            private static final javax.xml.namespace.QName POS$2 = 
                new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos");
            private static final javax.xml.namespace.QName POINTPROPERTY$4 = 
                new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pointProperty");
            
            
            /**
             * Gets the "posList" element
             */
            public net.opengis.gml.x32.DirectPositionListType getPosList()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.gml.x32.DirectPositionListType target = null;
                    target = (net.opengis.gml.x32.DirectPositionListType)get_store().find_element_user(POSLIST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "posList" element
             */
            public boolean isSetPosList()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(POSLIST$0) != 0;
                }
            }
            
            /**
             * Sets the "posList" element
             */
            public void setPosList(net.opengis.gml.x32.DirectPositionListType posList)
            {
                generatedSetterHelperImpl(posList, POSLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "posList" element
             */
            public net.opengis.gml.x32.DirectPositionListType addNewPosList()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.gml.x32.DirectPositionListType target = null;
                    target = (net.opengis.gml.x32.DirectPositionListType)get_store().add_element_user(POSLIST$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "posList" element
             */
            public void unsetPosList()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(POSLIST$0, 0);
                }
            }
            
            /**
             * Gets array of all "pos" elements
             */
            public net.opengis.gml.x32.DirectPositionType[] getPosArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(POS$2, targetList);
                    net.opengis.gml.x32.DirectPositionType[] result = new net.opengis.gml.x32.DirectPositionType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "pos" element
             */
            public net.opengis.gml.x32.DirectPositionType getPosArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.gml.x32.DirectPositionType target = null;
                    target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(POS$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "pos" element
             */
            public int sizeOfPosArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(POS$2);
                }
            }
            
            /**
             * Sets array of all "pos" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setPosArray(net.opengis.gml.x32.DirectPositionType[] posArray)
            {
                check_orphaned();
                arraySetterHelper(posArray, POS$2);
            }
            
            /**
             * Sets ith "pos" element
             */
            public void setPosArray(int i, net.opengis.gml.x32.DirectPositionType pos)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.gml.x32.DirectPositionType target = null;
                    target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(POS$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(pos);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "pos" element
             */
            public net.opengis.gml.x32.DirectPositionType insertNewPos(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.gml.x32.DirectPositionType target = null;
                    target = (net.opengis.gml.x32.DirectPositionType)get_store().insert_element_user(POS$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "pos" element
             */
            public net.opengis.gml.x32.DirectPositionType addNewPos()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.gml.x32.DirectPositionType target = null;
                    target = (net.opengis.gml.x32.DirectPositionType)get_store().add_element_user(POS$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "pos" element
             */
            public void removePos(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(POS$2, i);
                }
            }
            
            /**
             * Gets array of all "pointProperty" elements
             */
            public net.opengis.gml.x32.PointPropertyType[] getPointPropertyArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(POINTPROPERTY$4, targetList);
                    net.opengis.gml.x32.PointPropertyType[] result = new net.opengis.gml.x32.PointPropertyType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "pointProperty" element
             */
            public net.opengis.gml.x32.PointPropertyType getPointPropertyArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.gml.x32.PointPropertyType target = null;
                    target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(POINTPROPERTY$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "pointProperty" element
             */
            public int sizeOfPointPropertyArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(POINTPROPERTY$4);
                }
            }
            
            /**
             * Sets array of all "pointProperty" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setPointPropertyArray(net.opengis.gml.x32.PointPropertyType[] pointPropertyArray)
            {
                check_orphaned();
                arraySetterHelper(pointPropertyArray, POINTPROPERTY$4);
            }
            
            /**
             * Sets ith "pointProperty" element
             */
            public void setPointPropertyArray(int i, net.opengis.gml.x32.PointPropertyType pointProperty)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.gml.x32.PointPropertyType target = null;
                    target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(POINTPROPERTY$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(pointProperty);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "pointProperty" element
             */
            public net.opengis.gml.x32.PointPropertyType insertNewPointProperty(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.gml.x32.PointPropertyType target = null;
                    target = (net.opengis.gml.x32.PointPropertyType)get_store().insert_element_user(POINTPROPERTY$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "pointProperty" element
             */
            public net.opengis.gml.x32.PointPropertyType addNewPointProperty()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.gml.x32.PointPropertyType target = null;
                    target = (net.opengis.gml.x32.PointPropertyType)get_store().add_element_user(POINTPROPERTY$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "pointProperty" element
             */
            public void removePointProperty(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(POINTPROPERTY$4, i);
                }
            }
        }
    }
}
