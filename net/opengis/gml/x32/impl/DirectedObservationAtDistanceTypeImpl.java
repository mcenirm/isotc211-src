/*
 * XML Type:  DirectedObservationAtDistanceType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DirectedObservationAtDistanceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DirectedObservationAtDistanceType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DirectedObservationAtDistanceTypeImpl extends net.opengis.gml.x32.impl.DirectedObservationTypeImpl implements net.opengis.gml.x32.DirectedObservationAtDistanceType
{
    private static final long serialVersionUID = 1L;
    
    public DirectedObservationAtDistanceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "distance");
    
    
    /**
     * Gets the "distance" element
     */
    public net.opengis.gml.x32.MeasureType getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(DISTANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "distance" element
     */
    public void setDistance(net.opengis.gml.x32.MeasureType distance)
    {
        generatedSetterHelperImpl(distance, DISTANCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "distance" element
     */
    public net.opengis.gml.x32.MeasureType addNewDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(DISTANCE$0);
            return target;
        }
    }
}
