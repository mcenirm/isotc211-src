/*
 * An XML document type.
 * Localname: Scale
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.ScaleDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one Scale(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class ScaleDocumentImpl extends org.isotc211.x2005.gco.impl.MeasureDocumentImpl implements org.isotc211.x2005.gco.ScaleDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScaleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCALE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Scale");
    
    
    /**
     * Gets the "Scale" element
     */
    public net.opengis.gml.x32.ScaleType getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ScaleType target = null;
            target = (net.opengis.gml.x32.ScaleType)get_store().find_element_user(SCALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Scale" element
     */
    public void setScale(net.opengis.gml.x32.ScaleType scale)
    {
        generatedSetterHelperImpl(scale, SCALE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Scale" element
     */
    public net.opengis.gml.x32.ScaleType addNewScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ScaleType target = null;
            target = (net.opengis.gml.x32.ScaleType)get_store().add_element_user(SCALE$0);
            return target;
        }
    }
}
