/*
 * XML Type:  MD_Band_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDBandType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Band_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDBandTypeImpl extends org.isotc211.x2005.gmd.impl.MDRangeDimensionTypeImpl implements org.isotc211.x2005.gmd.MDBandType
{
    private static final long serialVersionUID = 1L;
    
    public MDBandTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXVALUE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "maxValue");
    private static final javax.xml.namespace.QName MINVALUE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "minValue");
    private static final javax.xml.namespace.QName UNITS$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "units");
    private static final javax.xml.namespace.QName PEAKRESPONSE$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "peakResponse");
    private static final javax.xml.namespace.QName BITSPERVALUE$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "bitsPerValue");
    private static final javax.xml.namespace.QName TONEGRADATION$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "toneGradation");
    private static final javax.xml.namespace.QName SCALEFACTOR$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "scaleFactor");
    private static final javax.xml.namespace.QName OFFSET$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "offset");
    
    
    /**
     * Gets the "maxValue" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(MAXVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maxValue" element
     */
    public boolean isSetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXVALUE$0) != 0;
        }
    }
    
    /**
     * Sets the "maxValue" element
     */
    public void setMaxValue(org.isotc211.x2005.gco.RealPropertyType maxValue)
    {
        generatedSetterHelperImpl(maxValue, MAXVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maxValue" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(MAXVALUE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "maxValue" element
     */
    public void unsetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXVALUE$0, 0);
        }
    }
    
    /**
     * Gets the "minValue" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(MINVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "minValue" element
     */
    public boolean isSetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "minValue" element
     */
    public void setMinValue(org.isotc211.x2005.gco.RealPropertyType minValue)
    {
        generatedSetterHelperImpl(minValue, MINVALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "minValue" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(MINVALUE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "minValue" element
     */
    public void unsetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINVALUE$2, 0);
        }
    }
    
    /**
     * Gets the "units" element
     */
    public org.isotc211.x2005.gco.UomLengthPropertyType getUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.UomLengthPropertyType target = null;
            target = (org.isotc211.x2005.gco.UomLengthPropertyType)get_store().find_element_user(UNITS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "units" element
     */
    public boolean isSetUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITS$4) != 0;
        }
    }
    
    /**
     * Sets the "units" element
     */
    public void setUnits(org.isotc211.x2005.gco.UomLengthPropertyType units)
    {
        generatedSetterHelperImpl(units, UNITS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "units" element
     */
    public org.isotc211.x2005.gco.UomLengthPropertyType addNewUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.UomLengthPropertyType target = null;
            target = (org.isotc211.x2005.gco.UomLengthPropertyType)get_store().add_element_user(UNITS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "units" element
     */
    public void unsetUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITS$4, 0);
        }
    }
    
    /**
     * Gets the "peakResponse" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getPeakResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(PEAKRESPONSE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "peakResponse" element
     */
    public boolean isSetPeakResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PEAKRESPONSE$6) != 0;
        }
    }
    
    /**
     * Sets the "peakResponse" element
     */
    public void setPeakResponse(org.isotc211.x2005.gco.RealPropertyType peakResponse)
    {
        generatedSetterHelperImpl(peakResponse, PEAKRESPONSE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "peakResponse" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewPeakResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(PEAKRESPONSE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "peakResponse" element
     */
    public void unsetPeakResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PEAKRESPONSE$6, 0);
        }
    }
    
    /**
     * Gets the "bitsPerValue" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType getBitsPerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().find_element_user(BITSPERVALUE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bitsPerValue" element
     */
    public boolean isSetBitsPerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BITSPERVALUE$8) != 0;
        }
    }
    
    /**
     * Sets the "bitsPerValue" element
     */
    public void setBitsPerValue(org.isotc211.x2005.gco.IntegerPropertyType bitsPerValue)
    {
        generatedSetterHelperImpl(bitsPerValue, BITSPERVALUE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bitsPerValue" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType addNewBitsPerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().add_element_user(BITSPERVALUE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "bitsPerValue" element
     */
    public void unsetBitsPerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BITSPERVALUE$8, 0);
        }
    }
    
    /**
     * Gets the "toneGradation" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType getToneGradation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().find_element_user(TONEGRADATION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "toneGradation" element
     */
    public boolean isSetToneGradation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TONEGRADATION$10) != 0;
        }
    }
    
    /**
     * Sets the "toneGradation" element
     */
    public void setToneGradation(org.isotc211.x2005.gco.IntegerPropertyType toneGradation)
    {
        generatedSetterHelperImpl(toneGradation, TONEGRADATION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "toneGradation" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType addNewToneGradation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().add_element_user(TONEGRADATION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "toneGradation" element
     */
    public void unsetToneGradation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TONEGRADATION$10, 0);
        }
    }
    
    /**
     * Gets the "scaleFactor" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getScaleFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(SCALEFACTOR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scaleFactor" element
     */
    public boolean isSetScaleFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCALEFACTOR$12) != 0;
        }
    }
    
    /**
     * Sets the "scaleFactor" element
     */
    public void setScaleFactor(org.isotc211.x2005.gco.RealPropertyType scaleFactor)
    {
        generatedSetterHelperImpl(scaleFactor, SCALEFACTOR$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "scaleFactor" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewScaleFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(SCALEFACTOR$12);
            return target;
        }
    }
    
    /**
     * Unsets the "scaleFactor" element
     */
    public void unsetScaleFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCALEFACTOR$12, 0);
        }
    }
    
    /**
     * Gets the "offset" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(OFFSET$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "offset" element
     */
    public boolean isSetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFSET$14) != 0;
        }
    }
    
    /**
     * Sets the "offset" element
     */
    public void setOffset(org.isotc211.x2005.gco.RealPropertyType offset)
    {
        generatedSetterHelperImpl(offset, OFFSET$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "offset" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(OFFSET$14);
            return target;
        }
    }
    
    /**
     * Unsets the "offset" element
     */
    public void unsetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFSET$14, 0);
        }
    }
}
