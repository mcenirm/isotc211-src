/*
 * An XML document type.
 * Localname: LinearCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.LinearCSDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one LinearCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class LinearCSDocument2Impl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.LinearCSDocument2
{
    private static final long serialVersionUID = 1L;
    
    public LinearCSDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINEARCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LinearCS");
    
    
    /**
     * Gets the "LinearCS" element
     */
    public net.opengis.gml.x32.LinearCSType getLinearCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LinearCSType target = null;
            target = (net.opengis.gml.x32.LinearCSType)get_store().find_element_user(LINEARCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LinearCS" element
     */
    public void setLinearCS(net.opengis.gml.x32.LinearCSType linearCS)
    {
        generatedSetterHelperImpl(linearCS, LINEARCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LinearCS" element
     */
    public net.opengis.gml.x32.LinearCSType addNewLinearCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LinearCSType target = null;
            target = (net.opengis.gml.x32.LinearCSType)get_store().add_element_user(LINEARCS$0);
            return target;
        }
    }
}
