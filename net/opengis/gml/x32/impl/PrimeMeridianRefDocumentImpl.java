/*
 * An XML document type.
 * Localname: primeMeridianRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PrimeMeridianRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one primeMeridianRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PrimeMeridianRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PrimeMeridianRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrimeMeridianRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMEMERIDIANREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "primeMeridianRef");
    
    
    /**
     * Gets the "primeMeridianRef" element
     */
    public net.opengis.gml.x32.PrimeMeridianPropertyType getPrimeMeridianRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PrimeMeridianPropertyType target = null;
            target = (net.opengis.gml.x32.PrimeMeridianPropertyType)get_store().find_element_user(PRIMEMERIDIANREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "primeMeridianRef" element
     */
    public void setPrimeMeridianRef(net.opengis.gml.x32.PrimeMeridianPropertyType primeMeridianRef)
    {
        generatedSetterHelperImpl(primeMeridianRef, PRIMEMERIDIANREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "primeMeridianRef" element
     */
    public net.opengis.gml.x32.PrimeMeridianPropertyType addNewPrimeMeridianRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PrimeMeridianPropertyType target = null;
            target = (net.opengis.gml.x32.PrimeMeridianPropertyType)get_store().add_element_user(PRIMEMERIDIANREF$0);
            return target;
        }
    }
}
