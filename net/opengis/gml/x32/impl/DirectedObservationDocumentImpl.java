/*
 * An XML document type.
 * Localname: DirectedObservation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DirectedObservationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one DirectedObservation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DirectedObservationDocumentImpl extends net.opengis.gml.x32.impl.ObservationDocumentImpl implements net.opengis.gml.x32.DirectedObservationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedObservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDOBSERVATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservation");
    private static final org.apache.xmlbeans.QNameSet DIRECTEDOBSERVATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservationAtDistance"),
    });
    
    
    /**
     * Gets the "DirectedObservation" element
     */
    public net.opengis.gml.x32.DirectedObservationType getDirectedObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedObservationType target = null;
            target = (net.opengis.gml.x32.DirectedObservationType)get_store().find_element_user(DIRECTEDOBSERVATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DirectedObservation" element
     */
    public void setDirectedObservation(net.opengis.gml.x32.DirectedObservationType directedObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedObservationType target = null;
            target = (net.opengis.gml.x32.DirectedObservationType)get_store().find_element_user(DIRECTEDOBSERVATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DirectedObservationType)get_store().add_element_user(DIRECTEDOBSERVATION$0);
            }
            target.set(directedObservation);
        }
    }
    
    /**
     * Appends and returns a new empty "DirectedObservation" element
     */
    public net.opengis.gml.x32.DirectedObservationType addNewDirectedObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedObservationType target = null;
            target = (net.opengis.gml.x32.DirectedObservationType)get_store().add_element_user(DIRECTEDOBSERVATION$0);
            return target;
        }
    }
}
