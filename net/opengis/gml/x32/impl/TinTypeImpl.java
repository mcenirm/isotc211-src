/*
 * XML Type:  TinType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TinType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TinType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TinTypeImpl extends net.opengis.gml.x32.impl.SurfaceTypeImpl implements net.opengis.gml.x32.TinType
{
    private static final long serialVersionUID = 1L;
    
    public TinTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOPLINES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "stopLines");
    private static final javax.xml.namespace.QName BREAKLINES$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "breakLines");
    private static final javax.xml.namespace.QName MAXLENGTH$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "maxLength");
    private static final javax.xml.namespace.QName CONTROLPOINT$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "controlPoint");
    
    
    /**
     * Gets array of all "stopLines" elements
     */
    public net.opengis.gml.x32.LineStringSegmentArrayPropertyType[] getStopLinesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STOPLINES$0, targetList);
            net.opengis.gml.x32.LineStringSegmentArrayPropertyType[] result = new net.opengis.gml.x32.LineStringSegmentArrayPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "stopLines" element
     */
    public net.opengis.gml.x32.LineStringSegmentArrayPropertyType getStopLinesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentArrayPropertyType)get_store().find_element_user(STOPLINES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "stopLines" element
     */
    public int sizeOfStopLinesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOPLINES$0);
        }
    }
    
    /**
     * Sets array of all "stopLines" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStopLinesArray(net.opengis.gml.x32.LineStringSegmentArrayPropertyType[] stopLinesArray)
    {
        check_orphaned();
        arraySetterHelper(stopLinesArray, STOPLINES$0);
    }
    
    /**
     * Sets ith "stopLines" element
     */
    public void setStopLinesArray(int i, net.opengis.gml.x32.LineStringSegmentArrayPropertyType stopLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentArrayPropertyType)get_store().find_element_user(STOPLINES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stopLines);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stopLines" element
     */
    public net.opengis.gml.x32.LineStringSegmentArrayPropertyType insertNewStopLines(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentArrayPropertyType)get_store().insert_element_user(STOPLINES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stopLines" element
     */
    public net.opengis.gml.x32.LineStringSegmentArrayPropertyType addNewStopLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentArrayPropertyType)get_store().add_element_user(STOPLINES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "stopLines" element
     */
    public void removeStopLines(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOPLINES$0, i);
        }
    }
    
    /**
     * Gets array of all "breakLines" elements
     */
    public net.opengis.gml.x32.LineStringSegmentArrayPropertyType[] getBreakLinesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BREAKLINES$2, targetList);
            net.opengis.gml.x32.LineStringSegmentArrayPropertyType[] result = new net.opengis.gml.x32.LineStringSegmentArrayPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "breakLines" element
     */
    public net.opengis.gml.x32.LineStringSegmentArrayPropertyType getBreakLinesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentArrayPropertyType)get_store().find_element_user(BREAKLINES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "breakLines" element
     */
    public int sizeOfBreakLinesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BREAKLINES$2);
        }
    }
    
    /**
     * Sets array of all "breakLines" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBreakLinesArray(net.opengis.gml.x32.LineStringSegmentArrayPropertyType[] breakLinesArray)
    {
        check_orphaned();
        arraySetterHelper(breakLinesArray, BREAKLINES$2);
    }
    
    /**
     * Sets ith "breakLines" element
     */
    public void setBreakLinesArray(int i, net.opengis.gml.x32.LineStringSegmentArrayPropertyType breakLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentArrayPropertyType)get_store().find_element_user(BREAKLINES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(breakLines);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "breakLines" element
     */
    public net.opengis.gml.x32.LineStringSegmentArrayPropertyType insertNewBreakLines(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentArrayPropertyType)get_store().insert_element_user(BREAKLINES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "breakLines" element
     */
    public net.opengis.gml.x32.LineStringSegmentArrayPropertyType addNewBreakLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.x32.LineStringSegmentArrayPropertyType)get_store().add_element_user(BREAKLINES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "breakLines" element
     */
    public void removeBreakLines(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BREAKLINES$2, i);
        }
    }
    
    /**
     * Gets the "maxLength" element
     */
    public net.opengis.gml.x32.LengthType getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maxLength" element
     */
    public void setMaxLength(net.opengis.gml.x32.LengthType maxLength)
    {
        generatedSetterHelperImpl(maxLength, MAXLENGTH$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maxLength" element
     */
    public net.opengis.gml.x32.LengthType addNewMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().add_element_user(MAXLENGTH$4);
            return target;
        }
    }
    
    /**
     * Gets the "controlPoint" element
     */
    public net.opengis.gml.x32.TinType.ControlPoint getControlPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TinType.ControlPoint target = null;
            target = (net.opengis.gml.x32.TinType.ControlPoint)get_store().find_element_user(CONTROLPOINT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "controlPoint" element
     */
    public void setControlPoint(net.opengis.gml.x32.TinType.ControlPoint controlPoint)
    {
        generatedSetterHelperImpl(controlPoint, CONTROLPOINT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "controlPoint" element
     */
    public net.opengis.gml.x32.TinType.ControlPoint addNewControlPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TinType.ControlPoint target = null;
            target = (net.opengis.gml.x32.TinType.ControlPoint)get_store().add_element_user(CONTROLPOINT$6);
            return target;
        }
    }
    /**
     * An XML controlPoint(@http://www.opengis.net/gml/3.2).
     *
     * This is a complex type.
     */
    public static class ControlPointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TinType.ControlPoint
    {
        private static final long serialVersionUID = 1L;
        
        public ControlPointImpl(org.apache.xmlbeans.SchemaType sType)
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
