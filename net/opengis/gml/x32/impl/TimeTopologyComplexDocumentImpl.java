/*
 * An XML document type.
 * Localname: TimeTopologyComplex
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeTopologyComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeTopologyComplex(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeTopologyComplexDocumentImpl extends net.opengis.gml.x32.impl.AbstractTimeComplexDocumentImpl implements net.opengis.gml.x32.TimeTopologyComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeTopologyComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMETOPOLOGYCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeTopologyComplex");
    
    
    /**
     * Gets the "TimeTopologyComplex" element
     */
    public net.opengis.gml.x32.TimeTopologyComplexType getTimeTopologyComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeTopologyComplexType target = null;
            target = (net.opengis.gml.x32.TimeTopologyComplexType)get_store().find_element_user(TIMETOPOLOGYCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeTopologyComplex" element
     */
    public void setTimeTopologyComplex(net.opengis.gml.x32.TimeTopologyComplexType timeTopologyComplex)
    {
        generatedSetterHelperImpl(timeTopologyComplex, TIMETOPOLOGYCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeTopologyComplex" element
     */
    public net.opengis.gml.x32.TimeTopologyComplexType addNewTimeTopologyComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeTopologyComplexType target = null;
            target = (net.opengis.gml.x32.TimeTopologyComplexType)get_store().add_element_user(TIMETOPOLOGYCOMPLEX$0);
            return target;
        }
    }
}
