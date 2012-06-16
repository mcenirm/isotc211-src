/*
 * An XML document type.
 * Localname: temporalDatumRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TemporalDatumRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one temporalDatumRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TemporalDatumRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TemporalDatumRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemporalDatumRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPORALDATUMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "temporalDatumRef");
    
    
    /**
     * Gets the "temporalDatumRef" element
     */
    public net.opengis.gml.x32.TemporalDatumPropertyType getTemporalDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().find_element_user(TEMPORALDATUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "temporalDatumRef" element
     */
    public void setTemporalDatumRef(net.opengis.gml.x32.TemporalDatumPropertyType temporalDatumRef)
    {
        generatedSetterHelperImpl(temporalDatumRef, TEMPORALDATUMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "temporalDatumRef" element
     */
    public net.opengis.gml.x32.TemporalDatumPropertyType addNewTemporalDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalDatumPropertyType target = null;
            target = (net.opengis.gml.x32.TemporalDatumPropertyType)get_store().add_element_user(TEMPORALDATUMREF$0);
            return target;
        }
    }
}
