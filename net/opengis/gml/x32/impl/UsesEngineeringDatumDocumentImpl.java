/*
 * An XML document type.
 * Localname: usesEngineeringDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesEngineeringDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesEngineeringDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesEngineeringDatumDocumentImpl extends net.opengis.gml.x32.impl.EngineeringDatumDocumentImpl implements net.opengis.gml.x32.UsesEngineeringDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesEngineeringDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESENGINEERINGDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesEngineeringDatum");
    
    
    /**
     * Gets the "usesEngineeringDatum" element
     */
    public net.opengis.gml.x32.EngineeringDatumPropertyType getUsesEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().find_element_user(USESENGINEERINGDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesEngineeringDatum" element
     */
    public void setUsesEngineeringDatum(net.opengis.gml.x32.EngineeringDatumPropertyType usesEngineeringDatum)
    {
        generatedSetterHelperImpl(usesEngineeringDatum, USESENGINEERINGDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesEngineeringDatum" element
     */
    public net.opengis.gml.x32.EngineeringDatumPropertyType addNewUsesEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().add_element_user(USESENGINEERINGDATUM$0);
            return target;
        }
    }
}
