/*
 * An XML document type.
 * Localname: primeMeridian
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PrimeMeridianDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one primeMeridian(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PrimeMeridianDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PrimeMeridianDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrimeMeridianDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMEMERIDIAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "primeMeridian");
    private static final org.apache.xmlbeans.QNameSet PRIMEMERIDIAN$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesPrimeMeridian"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "primeMeridian"),
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
}
