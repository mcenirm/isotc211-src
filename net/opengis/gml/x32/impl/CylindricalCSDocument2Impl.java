/*
 * An XML document type.
 * Localname: CylindricalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CylindricalCSDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CylindricalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CylindricalCSDocument2Impl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.CylindricalCSDocument2
{
    private static final long serialVersionUID = 1L;
    
    public CylindricalCSDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CYLINDRICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CylindricalCS");
    
    
    /**
     * Gets the "CylindricalCS" element
     */
    public net.opengis.gml.x32.CylindricalCSType getCylindricalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CylindricalCSType target = null;
            target = (net.opengis.gml.x32.CylindricalCSType)get_store().find_element_user(CYLINDRICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CylindricalCS" element
     */
    public void setCylindricalCS(net.opengis.gml.x32.CylindricalCSType cylindricalCS)
    {
        generatedSetterHelperImpl(cylindricalCS, CYLINDRICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CylindricalCS" element
     */
    public net.opengis.gml.x32.CylindricalCSType addNewCylindricalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CylindricalCSType target = null;
            target = (net.opengis.gml.x32.CylindricalCSType)get_store().add_element_user(CYLINDRICALCS$0);
            return target;
        }
    }
}
