/*
 * An XML document type.
 * Localname: TimeCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeCSDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeCSDocument2Impl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.TimeCSDocument2
{
    private static final long serialVersionUID = 1L;
    
    public TimeCSDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCS");
    
    
    /**
     * Gets the "TimeCS" element
     */
    public net.opengis.gml.x32.TimeCSType getTimeCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCSType target = null;
            target = (net.opengis.gml.x32.TimeCSType)get_store().find_element_user(TIMECS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeCS" element
     */
    public void setTimeCS(net.opengis.gml.x32.TimeCSType timeCS)
    {
        generatedSetterHelperImpl(timeCS, TIMECS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeCS" element
     */
    public net.opengis.gml.x32.TimeCSType addNewTimeCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCSType target = null;
            target = (net.opengis.gml.x32.TimeCSType)get_store().add_element_user(TIMECS$0);
            return target;
        }
    }
}
