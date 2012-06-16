/*
 * XML Type:  GeodeticDatumType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeodeticDatumType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML GeodeticDatumType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class GeodeticDatumTypeImpl extends net.opengis.gml.x32.impl.AbstractDatumTypeImpl implements net.opengis.gml.x32.GeodeticDatumType
{
    private static final long serialVersionUID = 1L;
    
    public GeodeticDatumTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMEMERIDIAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "primeMeridian");
    private static final org.apache.xmlbeans.QNameSet PRIMEMERIDIAN$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesPrimeMeridian"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "primeMeridian"),
    });
    private static final javax.xml.namespace.QName ELLIPSOID$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ellipsoid");
    private static final org.apache.xmlbeans.QNameSet ELLIPSOID$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesEllipsoid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ellipsoid"),
    });
    
    
    /**
     * Gets the "primeMeridian" element
     */
    public net.opengis.gml.x32.PrimeMeridianPropertyType getPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PrimeMeridianPropertyType target = null;
            target = (net.opengis.gml.x32.PrimeMeridianPropertyType)get_store().find_element_user(PRIMEMERIDIAN$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "primeMeridian" element
     */
    public void setPrimeMeridian(net.opengis.gml.x32.PrimeMeridianPropertyType primeMeridian)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PrimeMeridianPropertyType target = null;
            target = (net.opengis.gml.x32.PrimeMeridianPropertyType)get_store().find_element_user(PRIMEMERIDIAN$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.PrimeMeridianPropertyType)get_store().add_element_user(PRIMEMERIDIAN$0);
            }
            target.set(primeMeridian);
        }
    }
    
    /**
     * Appends and returns a new empty "primeMeridian" element
     */
    public net.opengis.gml.x32.PrimeMeridianPropertyType addNewPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PrimeMeridianPropertyType target = null;
            target = (net.opengis.gml.x32.PrimeMeridianPropertyType)get_store().add_element_user(PRIMEMERIDIAN$0);
            return target;
        }
    }
    
    /**
     * Gets the "ellipsoid" element
     */
    public net.opengis.gml.x32.EllipsoidPropertyType getEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().find_element_user(ELLIPSOID$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ellipsoid" element
     */
    public void setEllipsoid(net.opengis.gml.x32.EllipsoidPropertyType ellipsoid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().find_element_user(ELLIPSOID$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().add_element_user(ELLIPSOID$2);
            }
            target.set(ellipsoid);
        }
    }
    
    /**
     * Appends and returns a new empty "ellipsoid" element
     */
    public net.opengis.gml.x32.EllipsoidPropertyType addNewEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().add_element_user(ELLIPSOID$2);
            return target;
        }
    }
}
