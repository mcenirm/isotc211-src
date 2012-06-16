/*
 * An XML document type.
 * Localname: TemporalDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TemporalDatumDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TemporalDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TemporalDatumDocument2Impl extends net.opengis.gml.x32.impl.AbstractDatumDocumentImpl implements net.opengis.gml.x32.TemporalDatumDocument2
{
    private static final long serialVersionUID = 1L;
    
    public TemporalDatumDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPORALDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalDatum");
    
    
    /**
     * Gets the "TemporalDatum" element
     */
    public net.opengis.gml.x32.TemporalDatumType getTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumType target = null;
            target = (net.opengis.gml.x32.TemporalDatumType)get_store().find_element_user(TEMPORALDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TemporalDatum" element
     */
    public void setTemporalDatum(net.opengis.gml.x32.TemporalDatumType temporalDatum)
    {
        generatedSetterHelperImpl(temporalDatum, TEMPORALDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TemporalDatum" element
     */
    public net.opengis.gml.x32.TemporalDatumType addNewTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumType target = null;
            target = (net.opengis.gml.x32.TemporalDatumType)get_store().add_element_user(TEMPORALDATUM$0);
            return target;
        }
    }
}
