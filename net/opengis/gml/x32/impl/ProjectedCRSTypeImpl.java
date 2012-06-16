/*
 * XML Type:  ProjectedCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ProjectedCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ProjectedCRSType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ProjectedCRSTypeImpl extends net.opengis.gml.x32.impl.AbstractGeneralDerivedCRSTypeImpl implements net.opengis.gml.x32.ProjectedCRSType
{
    private static final long serialVersionUID = 1L;
    
    public ProjectedCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEGEODETICCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "baseGeodeticCRS");
    private static final javax.xml.namespace.QName BASEGEOGRAPHICCRS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "baseGeographicCRS");
    private static final javax.xml.namespace.QName CARTESIANCS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cartesianCS");
    private static final org.apache.xmlbeans.QNameSet CARTESIANCS$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesCartesianCS"),
    });
    
    
    /**
     * Gets the "baseGeodeticCRS" element
     */
    public net.opengis.gml.x32.GeodeticCRSPropertyType getBaseGeodeticCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticCRSPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticCRSPropertyType)get_store().find_element_user(BASEGEODETICCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "baseGeodeticCRS" element
     */
    public boolean isSetBaseGeodeticCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASEGEODETICCRS$0) != 0;
        }
    }
    
    /**
     * Sets the "baseGeodeticCRS" element
     */
    public void setBaseGeodeticCRS(net.opengis.gml.x32.GeodeticCRSPropertyType baseGeodeticCRS)
    {
        generatedSetterHelperImpl(baseGeodeticCRS, BASEGEODETICCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseGeodeticCRS" element
     */
    public net.opengis.gml.x32.GeodeticCRSPropertyType addNewBaseGeodeticCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticCRSPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticCRSPropertyType)get_store().add_element_user(BASEGEODETICCRS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "baseGeodeticCRS" element
     */
    public void unsetBaseGeodeticCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASEGEODETICCRS$0, 0);
        }
    }
    
    /**
     * Gets the "baseGeographicCRS" element
     */
    public net.opengis.gml.x32.GeographicCRSPropertyType getBaseGeographicCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeographicCRSPropertyType target = null;
            target = (net.opengis.gml.x32.GeographicCRSPropertyType)get_store().find_element_user(BASEGEOGRAPHICCRS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "baseGeographicCRS" element
     */
    public boolean isSetBaseGeographicCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASEGEOGRAPHICCRS$2) != 0;
        }
    }
    
    /**
     * Sets the "baseGeographicCRS" element
     */
    public void setBaseGeographicCRS(net.opengis.gml.x32.GeographicCRSPropertyType baseGeographicCRS)
    {
        generatedSetterHelperImpl(baseGeographicCRS, BASEGEOGRAPHICCRS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseGeographicCRS" element
     */
    public net.opengis.gml.x32.GeographicCRSPropertyType addNewBaseGeographicCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeographicCRSPropertyType target = null;
            target = (net.opengis.gml.x32.GeographicCRSPropertyType)get_store().add_element_user(BASEGEOGRAPHICCRS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "baseGeographicCRS" element
     */
    public void unsetBaseGeographicCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASEGEOGRAPHICCRS$2, 0);
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
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().find_element_user(CARTESIANCS$5, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().find_element_user(CARTESIANCS$5, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().add_element_user(CARTESIANCS$4);
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
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().add_element_user(CARTESIANCS$4);
            return target;
        }
    }
}
