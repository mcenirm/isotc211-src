/*
 * An XML document type.
 * Localname: usesPrimeMeridian
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesPrimeMeridianDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesPrimeMeridian(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesPrimeMeridianDocumentImpl extends net.opengis.gml.x32.impl.PrimeMeridianDocumentImpl implements net.opengis.gml.x32.UsesPrimeMeridianDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesPrimeMeridianDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESPRIMEMERIDIAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesPrimeMeridian");
    
    
    /**
     * Gets the "usesPrimeMeridian" element
     */
    public net.opengis.gml.x32.PrimeMeridianPropertyType getUsesPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PrimeMeridianPropertyType target = null;
            target = (net.opengis.gml.x32.PrimeMeridianPropertyType)get_store().find_element_user(USESPRIMEMERIDIAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesPrimeMeridian" element
     */
    public void setUsesPrimeMeridian(net.opengis.gml.x32.PrimeMeridianPropertyType usesPrimeMeridian)
    {
        generatedSetterHelperImpl(usesPrimeMeridian, USESPRIMEMERIDIAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesPrimeMeridian" element
     */
    public net.opengis.gml.x32.PrimeMeridianPropertyType addNewUsesPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PrimeMeridianPropertyType target = null;
            target = (net.opengis.gml.x32.PrimeMeridianPropertyType)get_store().add_element_user(USESPRIMEMERIDIAN$0);
            return target;
        }
    }
}
