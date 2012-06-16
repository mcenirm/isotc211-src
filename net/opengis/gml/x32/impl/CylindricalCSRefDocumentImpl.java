/*
 * An XML document type.
 * Localname: cylindricalCSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CylindricalCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one cylindricalCSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CylindricalCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CylindricalCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CylindricalCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CYLINDRICALCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cylindricalCSRef");
    
    
    /**
     * Gets the "cylindricalCSRef" element
     */
    public net.opengis.gml.x32.CylindricalCSPropertyType getCylindricalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CylindricalCSPropertyType target = null;
            target = (net.opengis.gml.x32.CylindricalCSPropertyType)get_store().find_element_user(CYLINDRICALCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cylindricalCSRef" element
     */
    public void setCylindricalCSRef(net.opengis.gml.x32.CylindricalCSPropertyType cylindricalCSRef)
    {
        generatedSetterHelperImpl(cylindricalCSRef, CYLINDRICALCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cylindricalCSRef" element
     */
    public net.opengis.gml.x32.CylindricalCSPropertyType addNewCylindricalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CylindricalCSPropertyType target = null;
            target = (net.opengis.gml.x32.CylindricalCSPropertyType)get_store().add_element_user(CYLINDRICALCSREF$0);
            return target;
        }
    }
}
