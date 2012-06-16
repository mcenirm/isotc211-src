/*
 * An XML document type.
 * Localname: Cone
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ConeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Cone(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ConeDocumentImpl extends net.opengis.gml.x32.impl.AbstractGriddedSurfaceDocumentImpl implements net.opengis.gml.x32.ConeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Cone");
    
    
    /**
     * Gets the "Cone" element
     */
    public net.opengis.gml.x32.ConeType getCone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConeType target = null;
            target = (net.opengis.gml.x32.ConeType)get_store().find_element_user(CONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cone" element
     */
    public void setCone(net.opengis.gml.x32.ConeType cone)
    {
        generatedSetterHelperImpl(cone, CONE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Cone" element
     */
    public net.opengis.gml.x32.ConeType addNewCone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConeType target = null;
            target = (net.opengis.gml.x32.ConeType)get_store().add_element_user(CONE$0);
            return target;
        }
    }
}
