/*
 * An XML document type.
 * Localname: TemporalCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TemporalCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TemporalCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TemporalCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractSingleCRSDocumentImpl implements net.opengis.gml.x32.TemporalCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemporalCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPORALCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalCRS");
    
    
    /**
     * Gets the "TemporalCRS" element
     */
    public net.opengis.gml.x32.TemporalCRSType getTemporalCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalCRSType target = null;
            target = (net.opengis.gml.x32.TemporalCRSType)get_store().find_element_user(TEMPORALCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TemporalCRS" element
     */
    public void setTemporalCRS(net.opengis.gml.x32.TemporalCRSType temporalCRS)
    {
        generatedSetterHelperImpl(temporalCRS, TEMPORALCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TemporalCRS" element
     */
    public net.opengis.gml.x32.TemporalCRSType addNewTemporalCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TemporalCRSType target = null;
            target = (net.opengis.gml.x32.TemporalCRSType)get_store().add_element_user(TEMPORALCRS$0);
            return target;
        }
    }
}
