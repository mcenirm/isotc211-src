/*
 * An XML document type.
 * Localname: DirectedObservationAtDistance
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DirectedObservationAtDistanceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one DirectedObservationAtDistance(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DirectedObservationAtDistanceDocumentImpl extends net.opengis.gml.x32.impl.DirectedObservationDocumentImpl implements net.opengis.gml.x32.DirectedObservationAtDistanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedObservationAtDistanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDOBSERVATIONATDISTANCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservationAtDistance");
    
    
    /**
     * Gets the "DirectedObservationAtDistance" element
     */
    public net.opengis.gml.x32.DirectedObservationAtDistanceType getDirectedObservationAtDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedObservationAtDistanceType target = null;
            target = (net.opengis.gml.x32.DirectedObservationAtDistanceType)get_store().find_element_user(DIRECTEDOBSERVATIONATDISTANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DirectedObservationAtDistance" element
     */
    public void setDirectedObservationAtDistance(net.opengis.gml.x32.DirectedObservationAtDistanceType directedObservationAtDistance)
    {
        generatedSetterHelperImpl(directedObservationAtDistance, DIRECTEDOBSERVATIONATDISTANCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DirectedObservationAtDistance" element
     */
    public net.opengis.gml.x32.DirectedObservationAtDistanceType addNewDirectedObservationAtDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedObservationAtDistanceType target = null;
            target = (net.opengis.gml.x32.DirectedObservationAtDistanceType)get_store().add_element_user(DIRECTEDOBSERVATIONATDISTANCE$0);
            return target;
        }
    }
}
