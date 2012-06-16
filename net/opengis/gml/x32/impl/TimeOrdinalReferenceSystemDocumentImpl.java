/*
 * An XML document type.
 * Localname: TimeOrdinalReferenceSystem
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeOrdinalReferenceSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TimeOrdinalReferenceSystem(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeOrdinalReferenceSystemDocumentImpl extends net.opengis.gml.x32.impl.TimeReferenceSystemDocumentImpl implements net.opengis.gml.x32.TimeOrdinalReferenceSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeOrdinalReferenceSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEORDINALREFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeOrdinalReferenceSystem");
    
    
    /**
     * Gets the "TimeOrdinalReferenceSystem" element
     */
    public net.opengis.gml.x32.TimeOrdinalReferenceSystemType getTimeOrdinalReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalReferenceSystemType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalReferenceSystemType)get_store().find_element_user(TIMEORDINALREFERENCESYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeOrdinalReferenceSystem" element
     */
    public void setTimeOrdinalReferenceSystem(net.opengis.gml.x32.TimeOrdinalReferenceSystemType timeOrdinalReferenceSystem)
    {
        generatedSetterHelperImpl(timeOrdinalReferenceSystem, TIMEORDINALREFERENCESYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeOrdinalReferenceSystem" element
     */
    public net.opengis.gml.x32.TimeOrdinalReferenceSystemType addNewTimeOrdinalReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeOrdinalReferenceSystemType target = null;
            target = (net.opengis.gml.x32.TimeOrdinalReferenceSystemType)get_store().add_element_user(TIMEORDINALREFERENCESYSTEM$0);
            return target;
        }
    }
}
