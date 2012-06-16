/*
 * XML Type:  PrimeMeridianType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PrimeMeridianType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML PrimeMeridianType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class PrimeMeridianTypeImpl extends net.opengis.gml.x32.impl.IdentifiedObjectTypeImpl implements net.opengis.gml.x32.PrimeMeridianType
{
    private static final long serialVersionUID = 1L;
    
    public PrimeMeridianTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
