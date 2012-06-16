/*
 * An XML document type.
 * Localname: EngineeringDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EngineeringDatumDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one EngineeringDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EngineeringDatumDocument2Impl extends net.opengis.gml.x32.impl.AbstractDatumDocumentImpl implements net.opengis.gml.x32.EngineeringDatumDocument2
{
    private static final long serialVersionUID = 1L;
    
    public EngineeringDatumDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENGINEERINGDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EngineeringDatum");
    
    
    /**
     * Gets the "EngineeringDatum" element
     */
    public net.opengis.gml.x32.EngineeringDatumType getEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumType)get_store().find_element_user(ENGINEERINGDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EngineeringDatum" element
     */
    public void setEngineeringDatum(net.opengis.gml.x32.EngineeringDatumType engineeringDatum)
    {
        generatedSetterHelperImpl(engineeringDatum, ENGINEERINGDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EngineeringDatum" element
     */
    public net.opengis.gml.x32.EngineeringDatumType addNewEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumType)get_store().add_element_user(ENGINEERINGDATUM$0);
            return target;
        }
    }
}
