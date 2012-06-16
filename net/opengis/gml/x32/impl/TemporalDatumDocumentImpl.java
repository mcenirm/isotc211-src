/*
 * An XML document type.
 * Localname: temporalDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TemporalDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one temporalDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TemporalDatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TemporalDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemporalDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPORALDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "temporalDatum");
    private static final org.apache.xmlbeans.QNameSet TEMPORALDATUM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "temporalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesTemporalDatum"),
    });
    
    
    /**
     * Gets the "temporalDatum" element
     */
    public net.opengis.gml.x32.TemporalDatumPropertyType getTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().find_element_user(TEMPORALDATUM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "temporalDatum" element
     */
    public void setTemporalDatum(net.opengis.gml.x32.TemporalDatumPropertyType temporalDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().find_element_user(TEMPORALDATUM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().add_element_user(TEMPORALDATUM$0);
            }
            target.set(temporalDatum);
        }
    }
    
    /**
     * Appends and returns a new empty "temporalDatum" element
     */
    public net.opengis.gml.x32.TemporalDatumPropertyType addNewTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().add_element_user(TEMPORALDATUM$0);
            return target;
        }
    }
}
