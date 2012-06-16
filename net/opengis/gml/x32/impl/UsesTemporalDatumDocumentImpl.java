/*
 * An XML document type.
 * Localname: usesTemporalDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesTemporalDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesTemporalDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesTemporalDatumDocumentImpl extends net.opengis.gml.x32.impl.TemporalDatumDocumentImpl implements net.opengis.gml.x32.UsesTemporalDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesTemporalDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESTEMPORALDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesTemporalDatum");
    
    
    /**
     * Gets the "usesTemporalDatum" element
     */
    public net.opengis.gml.x32.TemporalDatumPropertyType getUsesTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().find_element_user(USESTEMPORALDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesTemporalDatum" element
     */
    public void setUsesTemporalDatum(net.opengis.gml.x32.TemporalDatumPropertyType usesTemporalDatum)
    {
        generatedSetterHelperImpl(usesTemporalDatum, USESTEMPORALDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesTemporalDatum" element
     */
    public net.opengis.gml.x32.TemporalDatumPropertyType addNewUsesTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().add_element_user(USESTEMPORALDATUM$0);
            return target;
        }
    }
}
