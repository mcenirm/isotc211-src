/*
 * An XML document type.
 * Localname: usesSphericalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesSphericalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesSphericalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesSphericalCSDocumentImpl extends net.opengis.gml.x32.impl.SphericalCSDocumentImpl implements net.opengis.gml.x32.UsesSphericalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesSphericalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESSPHERICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesSphericalCS");
    
    
    /**
     * Gets the "usesSphericalCS" element
     */
    public net.opengis.gml.x32.SphericalCSPropertyType getUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().find_element_user(USESSPHERICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesSphericalCS" element
     */
    public void setUsesSphericalCS(net.opengis.gml.x32.SphericalCSPropertyType usesSphericalCS)
    {
        generatedSetterHelperImpl(usesSphericalCS, USESSPHERICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesSphericalCS" element
     */
    public net.opengis.gml.x32.SphericalCSPropertyType addNewUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SphericalCSPropertyType target = null;
            target = (net.opengis.gml.x32.SphericalCSPropertyType)get_store().add_element_user(USESSPHERICALCS$0);
            return target;
        }
    }
}
