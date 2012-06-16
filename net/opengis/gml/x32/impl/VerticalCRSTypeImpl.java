/*
 * XML Type:  VerticalCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.VerticalCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML VerticalCRSType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class VerticalCRSTypeImpl extends net.opengis.gml.x32.impl.AbstractCRSTypeImpl implements net.opengis.gml.x32.VerticalCRSType
{
    private static final long serialVersionUID = 1L;
    
    public VerticalCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalCS");
    private static final org.apache.xmlbeans.QNameSet VERTICALCS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesVerticalCS"),
    });
    private static final javax.xml.namespace.QName VERTICALDATUM$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalDatum");
    private static final org.apache.xmlbeans.QNameSet VERTICALDATUM$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesVerticalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalDatum"),
    });
    
    
    /**
     * Gets the "verticalCS" element
     */
    public net.opengis.gml.x32.VerticalCSPropertyType getVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().find_element_user(VERTICALCS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalCS" element
     */
    public void setVerticalCS(net.opengis.gml.x32.VerticalCSPropertyType verticalCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().find_element_user(VERTICALCS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().add_element_user(VERTICALCS$0);
            }
            target.set(verticalCS);
        }
    }
    
    /**
     * Appends and returns a new empty "verticalCS" element
     */
    public net.opengis.gml.x32.VerticalCSPropertyType addNewVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().add_element_user(VERTICALCS$0);
            return target;
        }
    }
    
    /**
     * Gets the "verticalDatum" element
     */
    public net.opengis.gml.x32.VerticalDatumPropertyType getVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().find_element_user(VERTICALDATUM$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalDatum" element
     */
    public void setVerticalDatum(net.opengis.gml.x32.VerticalDatumPropertyType verticalDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().find_element_user(VERTICALDATUM$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().add_element_user(VERTICALDATUM$2);
            }
            target.set(verticalDatum);
        }
    }
    
    /**
     * Appends and returns a new empty "verticalDatum" element
     */
    public net.opengis.gml.x32.VerticalDatumPropertyType addNewVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalDatumPropertyType)get_store().add_element_user(VERTICALDATUM$2);
            return target;
        }
    }
}
