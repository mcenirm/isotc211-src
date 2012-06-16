/*
 * XML Type:  TemporalCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TemporalCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TemporalCRSType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TemporalCRSTypeImpl extends net.opengis.gml.x32.impl.AbstractCRSTypeImpl implements net.opengis.gml.x32.TemporalCRSType
{
    private static final long serialVersionUID = 1L;
    
    public TemporalCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "timeCS");
    private static final org.apache.xmlbeans.QNameSet TIMECS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesTimeCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "timeCS"),
    });
    private static final javax.xml.namespace.QName USESTEMPORALCS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesTemporalCS");
    private static final javax.xml.namespace.QName TEMPORALDATUM$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "temporalDatum");
    private static final org.apache.xmlbeans.QNameSet TEMPORALDATUM$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "temporalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesTemporalDatum"),
    });
    
    
    /**
     * Gets the "timeCS" element
     */
    public net.opengis.gml.x32.TimeCSPropertyType getTimeCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCSPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCSPropertyType)get_store().find_element_user(TIMECS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timeCS" element
     */
    public boolean isSetTimeCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMECS$1) != 0;
        }
    }
    
    /**
     * Sets the "timeCS" element
     */
    public void setTimeCS(net.opengis.gml.x32.TimeCSPropertyType timeCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCSPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCSPropertyType)get_store().find_element_user(TIMECS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.TimeCSPropertyType)get_store().add_element_user(TIMECS$0);
            }
            target.set(timeCS);
        }
    }
    
    /**
     * Appends and returns a new empty "timeCS" element
     */
    public net.opengis.gml.x32.TimeCSPropertyType addNewTimeCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCSPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCSPropertyType)get_store().add_element_user(TIMECS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "timeCS" element
     */
    public void unsetTimeCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMECS$1, 0);
        }
    }
    
    /**
     * Gets the "usesTemporalCS" element
     */
    public net.opengis.gml.x32.TemporalCSPropertyType getUsesTemporalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalCSPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalCSPropertyType)get_store().find_element_user(USESTEMPORALCS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usesTemporalCS" element
     */
    public boolean isSetUsesTemporalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESTEMPORALCS$2) != 0;
        }
    }
    
    /**
     * Sets the "usesTemporalCS" element
     */
    public void setUsesTemporalCS(net.opengis.gml.x32.TemporalCSPropertyType usesTemporalCS)
    {
        generatedSetterHelperImpl(usesTemporalCS, USESTEMPORALCS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesTemporalCS" element
     */
    public net.opengis.gml.x32.TemporalCSPropertyType addNewUsesTemporalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalCSPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalCSPropertyType)get_store().add_element_user(USESTEMPORALCS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "usesTemporalCS" element
     */
    public void unsetUsesTemporalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESTEMPORALCS$2, 0);
        }
    }
    
    /**
     * Gets the "temporalDatum" element
     */
    public net.opengis.gml.x32.TemporalDatumPropertyType getTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().find_element_user(TEMPORALDATUM$5, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "temporalDatum" element
     */
    public void setTemporalDatum(net.opengis.gml.x32.TemporalDatumPropertyType temporalDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().find_element_user(TEMPORALDATUM$5, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().add_element_user(TEMPORALDATUM$4);
            }
            target.set(temporalDatum);
        }
    }
    
    /**
     * Appends and returns a new empty "temporalDatum" element
     */
    public net.opengis.gml.x32.TemporalDatumPropertyType addNewTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().add_element_user(TEMPORALDATUM$4);
            return target;
        }
    }
}
