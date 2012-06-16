/*
 * An XML document type.
 * Localname: PolarCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PolarCSDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one PolarCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PolarCSDocument2Impl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.PolarCSDocument2
{
    private static final long serialVersionUID = 1L;
    
    public PolarCSDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLARCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolarCS");
    
    
    /**
     * Gets the "PolarCS" element
     */
    public net.opengis.gml.x32.PolarCSType getPolarCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolarCSType target = null;
            target = (net.opengis.gml.x32.PolarCSType)get_store().find_element_user(POLARCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PolarCS" element
     */
    public void setPolarCS(net.opengis.gml.x32.PolarCSType polarCS)
    {
        generatedSetterHelperImpl(polarCS, POLARCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PolarCS" element
     */
    public net.opengis.gml.x32.PolarCSType addNewPolarCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolarCSType target = null;
            target = (net.opengis.gml.x32.PolarCSType)get_store().add_element_user(POLARCS$0);
            return target;
        }
    }
}
