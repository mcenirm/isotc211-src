/*
 * An XML document type.
 * Localname: angle
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AngleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one angle(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AngleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AngleDocument
{
    private static final long serialVersionUID = 1L;
    
    public AngleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANGLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "angle");
    
    
    /**
     * Gets the "angle" element
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
     * Sets the "angle" element
     */
    public void setAngle(net.opengis.gml.x32.AngleType angle)
    {
        generatedSetterHelperImpl(angle, ANGLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "angle" element
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
