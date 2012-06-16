/*
 * An XML document type.
 * Localname: Tin
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TinDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Tin(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TinDocumentImpl extends net.opengis.gml.x32.impl.TriangulatedSurfaceDocumentImpl implements net.opengis.gml.x32.TinDocument
{
    private static final long serialVersionUID = 1L;
    
    public TinDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Tin");
    
    
    /**
     * Gets the "Tin" element
     */
    public net.opengis.gml.x32.TinType getTin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TinType target = null;
            target = (net.opengis.gml.x32.TinType)get_store().find_element_user(TIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Tin" element
     */
    public void setTin(net.opengis.gml.x32.TinType tin)
    {
        generatedSetterHelperImpl(tin, TIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Tin" element
     */
    public net.opengis.gml.x32.TinType addNewTin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TinType target = null;
            target = (net.opengis.gml.x32.TinType)get_store().add_element_user(TIN$0);
            return target;
        }
    }
}
