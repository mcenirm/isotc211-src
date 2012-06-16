/*
 * An XML document type.
 * Localname: TimeOrdinalEra
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeOrdinalEraDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeOrdinalEra(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeOrdinalEraDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TimeOrdinalEraDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeOrdinalEraDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEORDINALERA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeOrdinalEra");
    
    
    /**
     * Gets the "TimeOrdinalEra" element
     */
    public net.opengis.gml.x32.TimeOrdinalEraType getTimeOrdinalEra()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalEraType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalEraType)get_store().find_element_user(TIMEORDINALERA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeOrdinalEra" element
     */
    public void setTimeOrdinalEra(net.opengis.gml.x32.TimeOrdinalEraType timeOrdinalEra)
    {
        generatedSetterHelperImpl(timeOrdinalEra, TIMEORDINALERA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeOrdinalEra" element
     */
    public net.opengis.gml.x32.TimeOrdinalEraType addNewTimeOrdinalEra()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalEraType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalEraType)get_store().add_element_user(TIMEORDINALERA$0);
            return target;
        }
    }
}
