/*
 * XML Type:  MI_EnvironmentalRecord_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIEnvironmentalRecordType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_EnvironmentalRecord_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIEnvironmentalRecordTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIEnvironmentalRecordType
{
    private static final long serialVersionUID = 1L;
    
    public MIEnvironmentalRecordTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AVERAGEAIRTEMPERATURE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "averageAirTemperature");
    private static final javax.xml.namespace.QName MAXRELATIVEHUMIDITY$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "maxRelativeHumidity");
    private static final javax.xml.namespace.QName MAXALTITUDE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "maxAltitude");
    private static final javax.xml.namespace.QName METEROLOGICALCONDITIONS$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "meterologicalConditions");
    
    
    /**
     * Gets the "averageAirTemperature" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getAverageAirTemperature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(AVERAGEAIRTEMPERATURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "averageAirTemperature" element
     */
    public void setAverageAirTemperature(org.isotc211.x2005.gco.RealPropertyType averageAirTemperature)
    {
        generatedSetterHelperImpl(averageAirTemperature, AVERAGEAIRTEMPERATURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "averageAirTemperature" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewAverageAirTemperature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(AVERAGEAIRTEMPERATURE$0);
            return target;
        }
    }
    
    /**
     * Gets the "maxRelativeHumidity" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getMaxRelativeHumidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(MAXRELATIVEHUMIDITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maxRelativeHumidity" element
     */
    public void setMaxRelativeHumidity(org.isotc211.x2005.gco.RealPropertyType maxRelativeHumidity)
    {
        generatedSetterHelperImpl(maxRelativeHumidity, MAXRELATIVEHUMIDITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maxRelativeHumidity" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewMaxRelativeHumidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(MAXRELATIVEHUMIDITY$2);
            return target;
        }
    }
    
    /**
     * Gets the "maxAltitude" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getMaxAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(MAXALTITUDE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maxAltitude" element
     */
    public void setMaxAltitude(org.isotc211.x2005.gco.RealPropertyType maxAltitude)
    {
        generatedSetterHelperImpl(maxAltitude, MAXALTITUDE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maxAltitude" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewMaxAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(MAXALTITUDE$4);
            return target;
        }
    }
    
    /**
     * Gets the "meterologicalConditions" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getMeterologicalConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(METEROLOGICALCONDITIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "meterologicalConditions" element
     */
    public void setMeterologicalConditions(org.isotc211.x2005.gco.CharacterStringPropertyType meterologicalConditions)
    {
        generatedSetterHelperImpl(meterologicalConditions, METEROLOGICALCONDITIONS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "meterologicalConditions" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewMeterologicalConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(METEROLOGICALCONDITIONS$6);
            return target;
        }
    }
}
