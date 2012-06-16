/*
 * An XML document type.
 * Localname: Angle
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.AngleDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one Angle(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class AngleDocumentImpl extends org.isotc211.x2005.gco.impl.MeasureDocumentImpl implements org.isotc211.x2005.gco.AngleDocument
{
    private static final long serialVersionUID = 1L;
    
    public AngleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANGLE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Angle");
    
    
    /**
     * Gets the "Angle" element
     */
    public net.opengis.gml.x32.AngleType getAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AngleType target = null;
            target = (net.opengis.gml.x32.AngleType)get_store().find_element_user(ANGLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Angle" element
     */
    public void setAngle(net.opengis.gml.x32.AngleType angle)
    {
        generatedSetterHelperImpl(angle, ANGLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Angle" element
     */
    public net.opengis.gml.x32.AngleType addNewAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AngleType target = null;
            target = (net.opengis.gml.x32.AngleType)get_store().add_element_user(ANGLE$0);
            return target;
        }
    }
}
