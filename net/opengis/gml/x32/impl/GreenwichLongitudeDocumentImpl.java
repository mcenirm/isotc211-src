/*
 * An XML document type.
 * Localname: greenwichLongitude
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GreenwichLongitudeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one greenwichLongitude(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GreenwichLongitudeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GreenwichLongitudeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GreenwichLongitudeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GREENWICHLONGITUDE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "greenwichLongitude");
    
    
    /**
     * Gets the "greenwichLongitude" element
     */
    public net.opengis.gml.x32.AngleType getGreenwichLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AngleType target = null;
            target = (net.opengis.gml.x32.AngleType)get_store().find_element_user(GREENWICHLONGITUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "greenwichLongitude" element
     */
    public void setGreenwichLongitude(net.opengis.gml.x32.AngleType greenwichLongitude)
    {
        generatedSetterHelperImpl(greenwichLongitude, GREENWICHLONGITUDE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "greenwichLongitude" element
     */
    public net.opengis.gml.x32.AngleType addNewGreenwichLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AngleType target = null;
            target = (net.opengis.gml.x32.AngleType)get_store().add_element_user(GREENWICHLONGITUDE$0);
            return target;
        }
    }
}
