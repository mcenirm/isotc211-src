/*
 * XML Type:  DerivedCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DerivedCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DerivedCRSType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DerivedCRSTypeImpl extends net.opengis.gml.x32.impl.AbstractGeneralDerivedCRSTypeImpl implements net.opengis.gml.x32.DerivedCRSType
{
    private static final long serialVersionUID = 1L;
    
    public DerivedCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASECRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "baseCRS");
    private static final javax.xml.namespace.QName DERIVEDCRSTYPE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "derivedCRSType");
    private static final javax.xml.namespace.QName COORDINATESYSTEM$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinateSystem");
    private static final org.apache.xmlbeans.QNameSet COORDINATESYSTEM$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesCS"),
    });
    
    
    /**
     * Gets the "baseCRS" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType getBaseCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().find_element_user(BASECRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseCRS" element
     */
    public void setBaseCRS(net.opengis.gml.x32.SingleCRSPropertyType baseCRS)
    {
        generatedSetterHelperImpl(baseCRS, BASECRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseCRS" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType addNewBaseCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().add_element_user(BASECRS$0);
            return target;
        }
    }
    
    /**
     * Gets the "derivedCRSType" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType getDerivedCRSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().find_element_user(DERIVEDCRSTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivedCRSType" element
     */
    public void setDerivedCRSType(net.opengis.gml.x32.CodeWithAuthorityType derivedCRSType)
    {
        generatedSetterHelperImpl(derivedCRSType, DERIVEDCRSTYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "derivedCRSType" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType addNewDerivedCRSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().add_element_user(DERIVEDCRSTYPE$2);
            return target;
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
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().find_element_user(COORDINATESYSTEM$5, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().find_element_user(COORDINATESYSTEM$5, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().add_element_user(COORDINATESYSTEM$4);
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
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().add_element_user(COORDINATESYSTEM$4);
            return target;
        }
    }
}
