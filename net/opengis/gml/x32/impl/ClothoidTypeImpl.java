/*
 * XML Type:  ClothoidType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ClothoidType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ClothoidType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ClothoidTypeImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentTypeImpl implements net.opengis.gml.x32.ClothoidType
{
    private static final long serialVersionUID = 1L;
    
    public ClothoidTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFLOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "refLocation");
    private static final javax.xml.namespace.QName SCALEFACTOR$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "scaleFactor");
    private static final javax.xml.namespace.QName STARTPARAMETER$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "startParameter");
    private static final javax.xml.namespace.QName ENDPARAMETER$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "endParameter");
    private static final javax.xml.namespace.QName INTERPOLATION$8 = 
        new javax.xml.namespace.QName("", "interpolation");
    
    
    /**
     * Gets the "refLocation" element
     */
    public net.opengis.gml.x32.ClothoidType.RefLocation getRefLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ClothoidType.RefLocation target = null;
            target = (net.opengis.gml.x32.ClothoidType.RefLocation)get_store().find_element_user(REFLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "refLocation" element
     */
    public void setRefLocation(net.opengis.gml.x32.ClothoidType.RefLocation refLocation)
    {
        generatedSetterHelperImpl(refLocation, REFLOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "refLocation" element
     */
    public net.opengis.gml.x32.ClothoidType.RefLocation addNewRefLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ClothoidType.RefLocation target = null;
            target = (net.opengis.gml.x32.ClothoidType.RefLocation)get_store().add_element_user(REFLOCATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "scaleFactor" element
     */
    public java.math.BigDecimal getScaleFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALEFACTOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "scaleFactor" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetScaleFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SCALEFACTOR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scaleFactor" element
     */
    public void setScaleFactor(java.math.BigDecimal scaleFactor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALEFACTOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCALEFACTOR$2);
            }
            target.setBigDecimalValue(scaleFactor);
        }
    }
    
    /**
     * Sets (as xml) the "scaleFactor" element
     */
    public void xsetScaleFactor(org.apache.xmlbeans.XmlDecimal scaleFactor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SCALEFACTOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(SCALEFACTOR$2);
            }
            target.set(scaleFactor);
        }
    }
    
    /**
     * Gets the "startParameter" element
     */
    public double getStartParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTPARAMETER$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "startParameter" element
     */
    public org.apache.xmlbeans.XmlDouble xgetStartParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(STARTPARAMETER$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "startParameter" element
     */
    public void setStartParameter(double startParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTPARAMETER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTPARAMETER$4);
            }
            target.setDoubleValue(startParameter);
        }
    }
    
    /**
     * Sets (as xml) the "startParameter" element
     */
    public void xsetStartParameter(org.apache.xmlbeans.XmlDouble startParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(STARTPARAMETER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(STARTPARAMETER$4);
            }
            target.set(startParameter);
        }
    }
    
    /**
     * Gets the "endParameter" element
     */
    public double getEndParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPARAMETER$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "endParameter" element
     */
    public org.apache.xmlbeans.XmlDouble xgetEndParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ENDPARAMETER$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "endParameter" element
     */
    public void setEndParameter(double endParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPARAMETER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPARAMETER$6);
            }
            target.setDoubleValue(endParameter);
        }
    }
    
    /**
     * Sets (as xml) the "endParameter" element
     */
    public void xsetEndParameter(org.apache.xmlbeans.XmlDouble endParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ENDPARAMETER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ENDPARAMETER$6);
            }
            target.set(endParameter);
        }
    }
    
    /**
     * Gets the "interpolation" attribute
     */
    public net.opengis.gml.x32.CurveInterpolationType.Enum getInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERPOLATION$8);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.CurveInterpolationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "interpolation" attribute
     */
    public net.opengis.gml.x32.CurveInterpolationType xgetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveInterpolationType target = null;
            target = (net.opengis.gml.x32.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$8);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CurveInterpolationType)get_default_attribute_value(INTERPOLATION$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "interpolation" attribute
     */
    public boolean isSetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERPOLATION$8) != null;
        }
    }
    
    /**
     * Sets the "interpolation" attribute
     */
    public void setInterpolation(net.opengis.gml.x32.CurveInterpolationType.Enum interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERPOLATION$8);
            }
            target.setEnumValue(interpolation);
        }
    }
    
    /**
     * Sets (as xml) the "interpolation" attribute
     */
    public void xsetInterpolation(net.opengis.gml.x32.CurveInterpolationType interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveInterpolationType target = null;
            target = (net.opengis.gml.x32.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$8);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CurveInterpolationType)get_store().add_attribute_user(INTERPOLATION$8);
            }
            target.set(interpolation);
        }
    }
    
    /**
     * Unsets the "interpolation" attribute
     */
    public void unsetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERPOLATION$8);
        }
    }
    /**
     * An XML refLocation(@http://www.opengis.net/gml/3.2).
     *
     * This is a complex type.
     */
    public static class RefLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ClothoidType.RefLocation
    {
        private static final long serialVersionUID = 1L;
        
        public RefLocationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AFFINEPLACEMENT$0 = 
            new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AffinePlacement");
        
        
        /**
         * Gets the "AffinePlacement" element
         */
        public net.opengis.gml.x32.AffinePlacementType getAffinePlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.AffinePlacementType target = null;
                target = (net.opengis.gml.x32.AffinePlacementType)get_store().find_element_user(AFFINEPLACEMENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AffinePlacement" element
         */
        public void setAffinePlacement(net.opengis.gml.x32.AffinePlacementType affinePlacement)
        {
            generatedSetterHelperImpl(affinePlacement, AFFINEPLACEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "AffinePlacement" element
         */
        public net.opengis.gml.x32.AffinePlacementType addNewAffinePlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.AffinePlacementType target = null;
                target = (net.opengis.gml.x32.AffinePlacementType)get_store().add_element_user(AFFINEPLACEMENT$0);
                return target;
            }
        }
    }
}
