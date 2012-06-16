/*
 * An XML document type.
 * Localname: polarCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PolarCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one polarCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PolarCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PolarCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolarCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLARCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "polarCS");
    
    
    /**
     * Gets the "polarCS" element
     */
    public net.opengis.gml.x32.PolarCSPropertyType getPolarCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolarCSPropertyType target = null;
            target = (net.opengis.gml.x32.PolarCSPropertyType)get_store().find_element_user(POLARCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "polarCS" element
     */
    public void setPolarCS(net.opengis.gml.x32.PolarCSPropertyType polarCS)
    {
        generatedSetterHelperImpl(polarCS, POLARCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "polarCS" element
     */
    public net.opengis.gml.x32.PolarCSPropertyType addNewPolarCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolarCSPropertyType target = null;
            target = (net.opengis.gml.x32.PolarCSPropertyType)get_store().add_element_user(POLARCS$0);
            return target;
        }
    }
}
