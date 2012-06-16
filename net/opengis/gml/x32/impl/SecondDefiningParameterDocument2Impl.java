/*
 * An XML document type.
 * Localname: SecondDefiningParameter
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SecondDefiningParameterDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one SecondDefiningParameter(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SecondDefiningParameterDocument2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SecondDefiningParameterDocument2
{
    private static final long serialVersionUID = 1L;
    
    public SecondDefiningParameterDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECONDDEFININGPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "SecondDefiningParameter");
    
    
    /**
     * Gets the "SecondDefiningParameter" element
     */
    public net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter getSecondDefiningParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter target = null;
            target = (net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter)get_store().find_element_user(SECONDDEFININGPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SecondDefiningParameter" element
     */
    public void setSecondDefiningParameter(net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter secondDefiningParameter)
    {
        generatedSetterHelperImpl(secondDefiningParameter, SECONDDEFININGPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SecondDefiningParameter" element
     */
    public net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter addNewSecondDefiningParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter target = null;
            target = (net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter)get_store().add_element_user(SECONDDEFININGPARAMETER$0);
            return target;
        }
    }
    /**
     * An XML SecondDefiningParameter(@http://www.opengis.net/gml/3.2).
     *
     * This is a complex type.
     */
    public static class SecondDefiningParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter
    {
        private static final long serialVersionUID = 1L;
        
        public SecondDefiningParameterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INVERSEFLATTENING$0 = 
            new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "inverseFlattening");
        private static final javax.xml.namespace.QName SEMIMINORAXIS$2 = 
            new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "semiMinorAxis");
        private static final javax.xml.namespace.QName ISSPHERE$4 = 
            new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "isSphere");
        
        
        /**
         * Gets the "inverseFlattening" element
         */
        public net.opengis.gml.x32.MeasureType getInverseFlattening()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.MeasureType target = null;
                target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(INVERSEFLATTENING$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "inverseFlattening" element
         */
        public boolean isSetInverseFlattening()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INVERSEFLATTENING$0) != 0;
            }
        }
        
        /**
         * Sets the "inverseFlattening" element
         */
        public void setInverseFlattening(net.opengis.gml.x32.MeasureType inverseFlattening)
        {
            generatedSetterHelperImpl(inverseFlattening, INVERSEFLATTENING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "inverseFlattening" element
         */
        public net.opengis.gml.x32.MeasureType addNewInverseFlattening()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.MeasureType target = null;
                target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(INVERSEFLATTENING$0);
                return target;
            }
        }
        
        /**
         * Unsets the "inverseFlattening" element
         */
        public void unsetInverseFlattening()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INVERSEFLATTENING$0, 0);
            }
        }
        
        /**
         * Gets the "semiMinorAxis" element
         */
        public net.opengis.gml.x32.LengthType getSemiMinorAxis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.LengthType target = null;
                target = (net.opengis.gml.x32.LengthType)get_store().find_element_user(SEMIMINORAXIS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "semiMinorAxis" element
         */
        public boolean isSetSemiMinorAxis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEMIMINORAXIS$2) != 0;
            }
        }
        
        /**
         * Sets the "semiMinorAxis" element
         */
        public void setSemiMinorAxis(net.opengis.gml.x32.LengthType semiMinorAxis)
        {
            generatedSetterHelperImpl(semiMinorAxis, SEMIMINORAXIS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "semiMinorAxis" element
         */
        public net.opengis.gml.x32.LengthType addNewSemiMinorAxis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.LengthType target = null;
                target = (net.opengis.gml.x32.LengthType)get_store().add_element_user(SEMIMINORAXIS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "semiMinorAxis" element
         */
        public void unsetSemiMinorAxis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEMIMINORAXIS$2, 0);
            }
        }
        
        /**
         * Gets the "isSphere" element
         */
        public boolean getIsSphere()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSPHERE$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "isSphere" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetIsSphere()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSPHERE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "isSphere" element
         */
        public boolean isSetIsSphere()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISSPHERE$4) != 0;
            }
        }
        
        /**
         * Sets the "isSphere" element
         */
        public void setIsSphere(boolean isSphere)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSPHERE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSPHERE$4);
                }
                target.setBooleanValue(isSphere);
            }
        }
        
        /**
         * Sets (as xml) the "isSphere" element
         */
        public void xsetIsSphere(org.apache.xmlbeans.XmlBoolean isSphere)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSPHERE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSPHERE$4);
                }
                target.set(isSphere);
            }
        }
        
        /**
         * Unsets the "isSphere" element
         */
        public void unsetIsSphere()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISSPHERE$4, 0);
            }
        }
    }
}
