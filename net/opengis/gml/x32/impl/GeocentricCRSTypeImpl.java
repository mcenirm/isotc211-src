/*
 * XML Type:  GeocentricCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeocentricCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML GeocentricCRSType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class GeocentricCRSTypeImpl extends net.opengis.gml.x32.impl.AbstractCRSTypeImpl implements net.opengis.gml.x32.GeocentricCRSType
{
    private static final long serialVersionUID = 1L;
    
    public GeocentricCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESCARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesCartesianCS");
    private static final javax.xml.namespace.QName USESSPHERICALCS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesSphericalCS");
    private static final javax.xml.namespace.QName USESGEODETICDATUM$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesGeodeticDatum");
    
    
    /**
     * Gets the "usesCartesianCS" element
     */
    public net.opengis.gml.x32.CartesianCSPropertyType getUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().find_element_user(USESCARTESIANCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usesCartesianCS" element
     */
    public boolean isSetUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESCARTESIANCS$0) != 0;
        }
    }
    
    /**
     * Sets the "usesCartesianCS" element
     */
    public void setUsesCartesianCS(net.opengis.gml.x32.CartesianCSPropertyType usesCartesianCS)
    {
        generatedSetterHelperImpl(usesCartesianCS, USESCARTESIANCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesCartesianCS" element
     */
    public net.opengis.gml.x32.CartesianCSPropertyType addNewUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().add_element_user(USESCARTESIANCS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "usesCartesianCS" element
     */
    public void unsetUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESCARTESIANCS$0, 0);
        }
    }
    
    /**
     * Gets the "usesSphericalCS" element
     */
    public net.opengis.gml.x32.SphericalCSPropertyType getUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().find_element_user(USESSPHERICALCS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usesSphericalCS" element
     */
    public boolean isSetUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESSPHERICALCS$2) != 0;
        }
    }
    
    /**
     * Sets the "usesSphericalCS" element
     */
    public void setUsesSphericalCS(net.opengis.gml.x32.SphericalCSPropertyType usesSphericalCS)
    {
        generatedSetterHelperImpl(usesSphericalCS, USESSPHERICALCS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesSphericalCS" element
     */
    public net.opengis.gml.x32.SphericalCSPropertyType addNewUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().add_element_user(USESSPHERICALCS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "usesSphericalCS" element
     */
    public void unsetUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESSPHERICALCS$2, 0);
        }
    }
    
    /**
     * Gets the "usesGeodeticDatum" element
     */
    public net.opengis.gml.x32.GeodeticDatumPropertyType getUsesGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().find_element_user(USESGEODETICDATUM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesGeodeticDatum" element
     */
    public void setUsesGeodeticDatum(net.opengis.gml.x32.GeodeticDatumPropertyType usesGeodeticDatum)
    {
        generatedSetterHelperImpl(usesGeodeticDatum, USESGEODETICDATUM$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesGeodeticDatum" element
     */
    public net.opengis.gml.x32.GeodeticDatumPropertyType addNewUsesGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().add_element_user(USESGEODETICDATUM$4);
            return target;
        }
    }
}
