/*
 * XML Type:  GeographicCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeographicCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML GeographicCRSType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class GeographicCRSTypeImpl extends net.opengis.gml.x32.impl.AbstractCRSTypeImpl implements net.opengis.gml.x32.GeographicCRSType
{
    private static final long serialVersionUID = 1L;
    
    public GeographicCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESELLIPSOIDALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesEllipsoidalCS");
    private static final javax.xml.namespace.QName USESGEODETICDATUM$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesGeodeticDatum");
    
    
    /**
     * Gets the "usesEllipsoidalCS" element
     */
    public net.opengis.gml.x32.EllipsoidalCSPropertyType getUsesEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().find_element_user(USESELLIPSOIDALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesEllipsoidalCS" element
     */
    public void setUsesEllipsoidalCS(net.opengis.gml.x32.EllipsoidalCSPropertyType usesEllipsoidalCS)
    {
        generatedSetterHelperImpl(usesEllipsoidalCS, USESELLIPSOIDALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesEllipsoidalCS" element
     */
    public net.opengis.gml.x32.EllipsoidalCSPropertyType addNewUsesEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().add_element_user(USESELLIPSOIDALCS$0);
            return target;
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
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().find_element_user(USESGEODETICDATUM$2, 0);
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
        generatedSetterHelperImpl(usesGeodeticDatum, USESGEODETICDATUM$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().add_element_user(USESGEODETICDATUM$2);
            return target;
        }
    }
}
