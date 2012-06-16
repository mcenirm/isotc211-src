/*
 * An XML document type.
 * Localname: cylindricalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CylindricalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one cylindricalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CylindricalCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CylindricalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public CylindricalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CYLINDRICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cylindricalCS");
    
    
    /**
     * Gets the "cylindricalCS" element
     */
    public net.opengis.gml.x32.CylindricalCSPropertyType getCylindricalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CylindricalCSPropertyType target = null;
            target = (net.opengis.gml.x32.CylindricalCSPropertyType)get_store().find_element_user(CYLINDRICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cylindricalCS" element
     */
    public void setCylindricalCS(net.opengis.gml.x32.CylindricalCSPropertyType cylindricalCS)
    {
        generatedSetterHelperImpl(cylindricalCS, CYLINDRICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cylindricalCS" element
     */
    public net.opengis.gml.x32.CylindricalCSPropertyType addNewCylindricalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CylindricalCSPropertyType target = null;
            target = (net.opengis.gml.x32.CylindricalCSPropertyType)get_store().add_element_user(CYLINDRICALCS$0);
            return target;
        }
    }
}
