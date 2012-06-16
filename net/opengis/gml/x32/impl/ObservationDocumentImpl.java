/*
 * An XML document type.
 * Localname: Observation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ObservationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Observation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ObservationDocumentImpl extends net.opengis.gml.x32.impl.AbstractFeatureDocumentImpl implements net.opengis.gml.x32.ObservationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBSERVATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Observation");
    private static final org.apache.xmlbeans.QNameSet OBSERVATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservationAtDistance"),
    });
    
    
    /**
     * Gets the "Observation" element
     */
    public net.opengis.gml.x32.ObservationType getObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ObservationType target = null;
            target = (net.opengis.gml.x32.ObservationType)get_store().find_element_user(OBSERVATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Observation" element
     */
    public void setObservation(net.opengis.gml.x32.ObservationType observation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ObservationType target = null;
            target = (net.opengis.gml.x32.ObservationType)get_store().find_element_user(OBSERVATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.ObservationType)get_store().add_element_user(OBSERVATION$0);
            }
            target.set(observation);
        }
    }
    
    /**
     * Appends and returns a new empty "Observation" element
     */
    public net.opengis.gml.x32.ObservationType addNewObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ObservationType target = null;
            target = (net.opengis.gml.x32.ObservationType)get_store().add_element_user(OBSERVATION$0);
            return target;
        }
    }
}
