/*
 * An XML document type.
 * Localname: TemporalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TemporalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TemporalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TemporalCSDocumentImpl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.TemporalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemporalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPORALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalCS");
    
    
    /**
     * Gets the "TemporalCS" element
     */
    public net.opengis.gml.x32.TemporalCSType getTemporalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalCSType target = null;
            target = (net.opengis.gml.x32.TemporalCSType)get_store().find_element_user(TEMPORALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TemporalCS" element
     */
    public void setTemporalCS(net.opengis.gml.x32.TemporalCSType temporalCS)
    {
        generatedSetterHelperImpl(temporalCS, TEMPORALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TemporalCS" element
     */
    public net.opengis.gml.x32.TemporalCSType addNewTemporalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalCSType target = null;
            target = (net.opengis.gml.x32.TemporalCSType)get_store().add_element_user(TEMPORALCS$0);
            return target;
        }
    }
}
