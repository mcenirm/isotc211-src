/*
 * XML Type:  EngineeringCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EngineeringCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML EngineeringCRSType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class EngineeringCRSTypeImpl extends net.opengis.gml.x32.impl.AbstractCRSTypeImpl implements net.opengis.gml.x32.EngineeringCRSType
{
    private static final long serialVersionUID = 1L;
    
    public EngineeringCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFINECS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "affineCS");
    private static final org.apache.xmlbeans.QNameSet AFFINECS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "affineCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesAffineCS"),
    });
    private static final javax.xml.namespace.QName CARTESIANCS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cartesianCS");
    private static final org.apache.xmlbeans.QNameSet CARTESIANCS$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesCartesianCS"),
    });
    private static final javax.xml.namespace.QName CYLINDRICALCS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cylindricalCS");
    private static final javax.xml.namespace.QName LINEARCS$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "linearCS");
    private static final javax.xml.namespace.QName POLARCS$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "polarCS");
    private static final javax.xml.namespace.QName SPHERICALCS$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sphericalCS");
    private static final org.apache.xmlbeans.QNameSet SPHERICALCS$11 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesSphericalCS"),
    });
    private static final javax.xml.namespace.QName USERDEFINEDCS$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "userDefinedCS");
    private static final javax.xml.namespace.QName COORDINATESYSTEM$14 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinateSystem");
    private static final org.apache.xmlbeans.QNameSet COORDINATESYSTEM$15 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesCS"),
    });
    private static final javax.xml.namespace.QName ENGINEERINGDATUM$16 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "engineeringDatum");
    private static final org.apache.xmlbeans.QNameSet ENGINEERINGDATUM$17 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "engineeringDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesEngineeringDatum"),
    });
    
    
    /**
     * Gets the "affineCS" element
     */
    public net.opengis.gml.x32.AffineCSPropertyType getAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSPropertyType target = null;
            target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().find_element_user(AFFINECS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "affineCS" element
     */
    public boolean isSetAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AFFINECS$1) != 0;
        }
    }
    
    /**
     * Sets the "affineCS" element
     */
    public void setAffineCS(net.opengis.gml.x32.AffineCSPropertyType affineCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSPropertyType target = null;
            target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().find_element_user(AFFINECS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().add_element_user(AFFINECS$0);
            }
            target.set(affineCS);
        }
    }
    
    /**
     * Appends and returns a new empty "affineCS" element
     */
    public net.opengis.gml.x32.AffineCSPropertyType addNewAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSPropertyType target = null;
            target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().add_element_user(AFFINECS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "affineCS" element
     */
    public void unsetAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AFFINECS$1, 0);
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
     * Gets the "cylindricalCS" element
     */
    public net.opengis.gml.x32.CylindricalCSPropertyType getCylindricalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CylindricalCSPropertyType target = null;
            target = (net.opengis.gml.x32.CylindricalCSPropertyType)get_store().find_element_user(CYLINDRICALCS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cylindricalCS" element
     */
    public boolean isSetCylindricalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CYLINDRICALCS$4) != 0;
        }
    }
    
    /**
     * Sets the "cylindricalCS" element
     */
    public void setCylindricalCS(net.opengis.gml.x32.CylindricalCSPropertyType cylindricalCS)
    {
        generatedSetterHelperImpl(cylindricalCS, CYLINDRICALCS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cylindricalCS" element
     */
    public net.opengis.gml.x32.CylindricalCSPropertyType addNewCylindricalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CylindricalCSPropertyType target = null;
            target = (net.opengis.gml.x32.CylindricalCSPropertyType)get_store().add_element_user(CYLINDRICALCS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "cylindricalCS" element
     */
    public void unsetCylindricalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CYLINDRICALCS$4, 0);
        }
    }
    
    /**
     * Gets the "linearCS" element
     */
    public net.opengis.gml.x32.LinearCSPropertyType getLinearCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LinearCSPropertyType target = null;
            target = (net.opengis.gml.x32.LinearCSPropertyType)get_store().find_element_user(LINEARCS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "linearCS" element
     */
    public boolean isSetLinearCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINEARCS$6) != 0;
        }
    }
    
    /**
     * Sets the "linearCS" element
     */
    public void setLinearCS(net.opengis.gml.x32.LinearCSPropertyType linearCS)
    {
        generatedSetterHelperImpl(linearCS, LINEARCS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "linearCS" element
     */
    public net.opengis.gml.x32.LinearCSPropertyType addNewLinearCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LinearCSPropertyType target = null;
            target = (net.opengis.gml.x32.LinearCSPropertyType)get_store().add_element_user(LINEARCS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "linearCS" element
     */
    public void unsetLinearCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINEARCS$6, 0);
        }
    }
    
    /**
     * Gets the "polarCS" element
     */
    public net.opengis.gml.x32.PolarCSPropertyType getPolarCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolarCSPropertyType target = null;
            target = (net.opengis.gml.x32.PolarCSPropertyType)get_store().find_element_user(POLARCS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "polarCS" element
     */
    public boolean isSetPolarCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLARCS$8) != 0;
        }
    }
    
    /**
     * Sets the "polarCS" element
     */
    public void setPolarCS(net.opengis.gml.x32.PolarCSPropertyType polarCS)
    {
        generatedSetterHelperImpl(polarCS, POLARCS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "polarCS" element
     */
    public net.opengis.gml.x32.PolarCSPropertyType addNewPolarCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolarCSPropertyType target = null;
            target = (net.opengis.gml.x32.PolarCSPropertyType)get_store().add_element_user(POLARCS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "polarCS" element
     */
    public void unsetPolarCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLARCS$8, 0);
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
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().find_element_user(SPHERICALCS$11, 0);
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
            return get_store().count_elements(SPHERICALCS$11) != 0;
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
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().find_element_user(SPHERICALCS$11, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().add_element_user(SPHERICALCS$10);
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
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().add_element_user(SPHERICALCS$10);
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
            get_store().remove_element(SPHERICALCS$11, 0);
        }
    }
    
    /**
     * Gets the "userDefinedCS" element
     */
    public net.opengis.gml.x32.UserDefinedCSPropertyType getUserDefinedCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UserDefinedCSPropertyType target = null;
            target = (net.opengis.gml.x32.UserDefinedCSPropertyType)get_store().find_element_user(USERDEFINEDCS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "userDefinedCS" element
     */
    public boolean isSetUserDefinedCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERDEFINEDCS$12) != 0;
        }
    }
    
    /**
     * Sets the "userDefinedCS" element
     */
    public void setUserDefinedCS(net.opengis.gml.x32.UserDefinedCSPropertyType userDefinedCS)
    {
        generatedSetterHelperImpl(userDefinedCS, USERDEFINEDCS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "userDefinedCS" element
     */
    public net.opengis.gml.x32.UserDefinedCSPropertyType addNewUserDefinedCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UserDefinedCSPropertyType target = null;
            target = (net.opengis.gml.x32.UserDefinedCSPropertyType)get_store().add_element_user(USERDEFINEDCS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "userDefinedCS" element
     */
    public void unsetUserDefinedCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERDEFINEDCS$12, 0);
        }
    }
    
    /**
     * Gets the "coordinateSystem" element
     */
    public net.opengis.gml.x32.CoordinateSystemPropertyType getCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().find_element_user(COORDINATESYSTEM$15, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "coordinateSystem" element
     */
    public boolean isSetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORDINATESYSTEM$15) != 0;
        }
    }
    
    /**
     * Sets the "coordinateSystem" element
     */
    public void setCoordinateSystem(net.opengis.gml.x32.CoordinateSystemPropertyType coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().find_element_user(COORDINATESYSTEM$15, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().add_element_user(COORDINATESYSTEM$14);
            }
            target.set(coordinateSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "coordinateSystem" element
     */
    public net.opengis.gml.x32.CoordinateSystemPropertyType addNewCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().add_element_user(COORDINATESYSTEM$14);
            return target;
        }
    }
    
    /**
     * Unsets the "coordinateSystem" element
     */
    public void unsetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORDINATESYSTEM$15, 0);
        }
    }
    
    /**
     * Gets the "engineeringDatum" element
     */
    public net.opengis.gml.x32.EngineeringDatumPropertyType getEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().find_element_user(ENGINEERINGDATUM$17, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "engineeringDatum" element
     */
    public void setEngineeringDatum(net.opengis.gml.x32.EngineeringDatumPropertyType engineeringDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().find_element_user(ENGINEERINGDATUM$17, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().add_element_user(ENGINEERINGDATUM$16);
            }
            target.set(engineeringDatum);
        }
    }
    
    /**
     * Appends and returns a new empty "engineeringDatum" element
     */
    public net.opengis.gml.x32.EngineeringDatumPropertyType addNewEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().add_element_user(ENGINEERINGDATUM$16);
            return target;
        }
    }
}
