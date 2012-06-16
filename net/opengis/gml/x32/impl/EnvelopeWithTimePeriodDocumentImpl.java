/*
 * An XML document type.
 * Localname: EnvelopeWithTimePeriod
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EnvelopeWithTimePeriodDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one EnvelopeWithTimePeriod(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EnvelopeWithTimePeriodDocumentImpl extends net.opengis.gml.x32.impl.EnvelopeDocumentImpl implements net.opengis.gml.x32.EnvelopeWithTimePeriodDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnvelopeWithTimePeriodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVELOPEWITHTIMEPERIOD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EnvelopeWithTimePeriod");
    
    
    /**
     * Gets the "EnvelopeWithTimePeriod" element
     */
    public net.opengis.gml.x32.EnvelopeWithTimePeriodType getEnvelopeWithTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EnvelopeWithTimePeriodType target = null;
            target = (net.opengis.gml.x32.EnvelopeWithTimePeriodType)get_store().find_element_user(ENVELOPEWITHTIMEPERIOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnvelopeWithTimePeriod" element
     */
    public void setEnvelopeWithTimePeriod(net.opengis.gml.x32.EnvelopeWithTimePeriodType envelopeWithTimePeriod)
    {
        generatedSetterHelperImpl(envelopeWithTimePeriod, ENVELOPEWITHTIMEPERIOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnvelopeWithTimePeriod" element
     */
    public net.opengis.gml.x32.EnvelopeWithTimePeriodType addNewEnvelopeWithTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EnvelopeWithTimePeriodType target = null;
            target = (net.opengis.gml.x32.EnvelopeWithTimePeriodType)get_store().add_element_user(ENVELOPEWITHTIMEPERIOD$0);
            return target;
        }
    }
}
