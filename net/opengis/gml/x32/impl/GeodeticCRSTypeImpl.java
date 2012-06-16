/*
 * XML Type:  GeodeticCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeodeticCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML GeodeticCRSType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class GeodeticCRSTypeImpl extends net.opengis.gml.x32.impl.AbstractCRSTypeImpl implements net.opengis.gml.x32.GeodeticCRSType
{
    private static final long serialVersionUID = 1L;
    
    public GeodeticCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOIDALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ellipsoidalCS");
    private static final org.apache.xmlbeans.QNameSet ELLIPSOIDALCS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesEllipsoidalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ellipsoidalCS"),
    });
    private static final javax.xml.namespace.QName CARTESIANCS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cartesianCS");
    private static final org.apache.xmlbeans.QNameSet CARTESIANCS$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesCartesianCS"),
    });
    private static final javax.xml.namespace.QName SPHERICALCS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sphericalCS");
    private static final org.apache.xmlbeans.QNameSet SPHERICALCS$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesSphericalCS"),
    });
    private static final javax.xml.namespace.QName GEODETICDATUM$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "geodeticDatum");
    private static final org.apache.xmlbeans.QNameSet GEODETICDATUM$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesGeodeticDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "geodeticDatum"),
    });
    
    
    /**
     * Gets the "ellipsoidalCS" element
     */
    public net.opengis.gml.x32.EllipsoidalCSPropertyType getEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().find_element_user(ELLIPSOIDALCS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ellipsoidalCS" element
     */
    public boolean isSetEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELLIPSOIDALCS$1) != 0;
        }
    }
    
    /**
     * Sets the "ellipsoidalCS" element
     */
    public void setEllipsoidalCS(net.opengis.gml.x32.EllipsoidalCSPropertyType ellipsoidalCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().find_element_user(ELLIPSOIDALCS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().add_element_user(ELLIPSOIDALCS$0);
            }
            target.set(ellipsoidalCS);
        }
    }
    
    /**
     * Appends and returns a new empty "ellipsoidalCS" element
     */
    public net.opengis.gml.x32.EllipsoidalCSPropertyType addNewEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().add_element_user(ELLIPSOIDALCS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ellipsoidalCS" element
     */
    public void unsetEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELLIPSOIDALCS$1, 0);
        }
    }
    
    /**
     * Gets the "cartesianCS" element
     */
    public net.opengis.gml.x32.CartesianCSPropertyType getCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().find_element_user(CARTESIANCS$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cartesianCS" element
     */
    public boolean isSetCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTESIANCS$3) != 0;
        }
    }
    
    /**
     * Sets the "cartesianCS" element
     */
    public void setCartesianCS(net.opengis.gml.x32.CartesianCSPropertyType cartesianCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().find_element_user(CARTESIANCS$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().add_element_user(CARTESIANCS$2);
            }
            target.set(cartesianCS);
        }
    }
    
    /**
     * Appends and returns a new empty "cartesianCS" element
     */
    public net.opengis.gml.x32.CartesianCSPropertyType addNewCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().add_element_user(CARTESIANCS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "cartesianCS" element
     */
    public void unsetCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTESIANCS$3, 0);
        }
    }
    
    /**
     * Gets the "sphericalCS" element
     */
    public net.opengis.gml.x32.SphericalCSPropertyType getSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().find_element_user(SPHERICALCS$5, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sphericalCS" element
     */
    public boolean isSetSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPHERICALCS$5) != 0;
        }
    }
    
    /**
     * Sets the "sphericalCS" element
     */
    public void setSphericalCS(net.opengis.gml.x32.SphericalCSPropertyType sphericalCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().find_element_user(SPHERICALCS$5, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().add_element_user(SPHERICALCS$4);
            }
            target.set(sphericalCS);
        }
    }
    
    /**
     * Appends and returns a new empty "sphericalCS" element
     */
    public net.opengis.gml.x32.SphericalCSPropertyType addNewSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().add_element_user(SPHERICALCS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "sphericalCS" element
     */
    public void unsetSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPHERICALCS$5, 0);
        }
    }
    
    /**
     * Gets the "geodeticDatum" element
     */
    public net.opengis.gml.x32.GeodeticDatumPropertyType getGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().find_element_user(GEODETICDATUM$7, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geodeticDatum" element
     */
    public void setGeodeticDatum(net.opengis.gml.x32.GeodeticDatumPropertyType geodeticDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().find_element_user(GEODETICDATUM$7, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().add_element_user(GEODETICDATUM$6);
            }
            target.set(geodeticDatum);
        }
    }
    
    /**
     * Appends and returns a new empty "geodeticDatum" element
     */
    public net.opengis.gml.x32.GeodeticDatumPropertyType addNewGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().add_element_user(GEODETICDATUM$6);
            return target;
        }
    }
}
