/*
 * An XML document type.
 * Localname: engineeringDatum
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EngineeringDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one engineeringDatum(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EngineeringDatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.EngineeringDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public EngineeringDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENGINEERINGDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "engineeringDatum");
    private static final org.apache.xmlbeans.QNameSet ENGINEERINGDATUM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "engineeringDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesEngineeringDatum"),
    });
    
    
    /**
     * Gets the "engineeringDatum" element
     */
    public net.opengis.gml.x32.EngineeringDatumPropertyType getEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().find_element_user(ENGINEERINGDATUM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "engineeringDatum" element
     */
    public void setEngineeringDatum(net.opengis.gml.x32.EngineeringDatumPropertyType engineeringDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().find_element_user(ENGINEERINGDATUM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().add_element_user(ENGINEERINGDATUM$0);
            }
            target.set(engineeringDatum);
        }
    }
    
    /**
     * Appends and returns a new empty "engineeringDatum" element
     */
    public net.opengis.gml.x32.EngineeringDatumPropertyType addNewEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().add_element_user(ENGINEERINGDATUM$0);
            return target;
        }
    }
}
