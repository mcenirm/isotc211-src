/*
 * An XML document type.
 * Localname: Solid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SolidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Solid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SolidDocumentImpl extends net.opengis.gml.x32.impl.AbstractSolidDocumentImpl implements net.opengis.gml.x32.SolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Solid");
    
    
    /**
     * Gets the "Solid" element
     */
    public net.opengis.gml.x32.SolidType getSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidType target = null;
            target = (net.opengis.gml.x32.SolidType)get_store().find_element_user(SOLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Solid" element
     */
    public void setSolid(net.opengis.gml.x32.SolidType solid)
    {
        generatedSetterHelperImpl(solid, SOLID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Solid" element
     */
    public net.opengis.gml.x32.SolidType addNewSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidType target = null;
            target = (net.opengis.gml.x32.SolidType)get_store().add_element_user(SOLID$0);
            return target;
        }
    }
}
