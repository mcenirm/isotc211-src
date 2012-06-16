/*
 * An XML document type.
 * Localname: Distance
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.DistanceDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one Distance(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class DistanceDocumentImpl extends org.isotc211.x2005.gco.impl.LengthDocumentImpl implements org.isotc211.x2005.gco.DistanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Distance");
    
    
    /**
     * Gets the "Distance" element
     */
    public net.opengis.gml.x32.LengthType getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().find_element_user(DISTANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Distance" element
     */
    public void setDistance(net.opengis.gml.x32.LengthType distance)
    {
        generatedSetterHelperImpl(distance, DISTANCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Distance" element
     */
    public net.opengis.gml.x32.LengthType addNewDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().add_element_user(DISTANCE$0);
            return target;
        }
    }
}
