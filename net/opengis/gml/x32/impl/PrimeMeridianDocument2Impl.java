/*
 * An XML document type.
 * Localname: PrimeMeridian
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PrimeMeridianDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one PrimeMeridian(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PrimeMeridianDocument2Impl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.PrimeMeridianDocument2
{
    private static final long serialVersionUID = 1L;
    
    public PrimeMeridianDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMEMERIDIAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PrimeMeridian");
    
    
    /**
     * Gets the "PrimeMeridian" element
     */
    public net.opengis.gml.x32.PrimeMeridianType getPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PrimeMeridianType target = null;
            target = (net.opengis.gml.x32.PrimeMeridianType)get_store().find_element_user(PRIMEMERIDIAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimeMeridian" element
     */
    public void setPrimeMeridian(net.opengis.gml.x32.PrimeMeridianType primeMeridian)
    {
        generatedSetterHelperImpl(primeMeridian, PRIMEMERIDIAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PrimeMeridian" element
     */
    public net.opengis.gml.x32.PrimeMeridianType addNewPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PrimeMeridianType target = null;
            target = (net.opengis.gml.x32.PrimeMeridianType)get_store().add_element_user(PRIMEMERIDIAN$0);
            return target;
        }
    }
}
