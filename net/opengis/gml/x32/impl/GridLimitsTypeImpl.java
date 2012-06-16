/*
 * XML Type:  GridLimitsType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GridLimitsType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML GridLimitsType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class GridLimitsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GridLimitsType
{
    private static final long serialVersionUID = 1L;
    
    public GridLimitsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDENVELOPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GridEnvelope");
    
    
    /**
     * Gets the "GridEnvelope" element
     */
    public net.opengis.gml.x32.GridEnvelopeType getGridEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GridEnvelopeType target = null;
            target = (net.opengis.gml.x32.GridEnvelopeType)get_store().find_element_user(GRIDENVELOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GridEnvelope" element
     */
    public void setGridEnvelope(net.opengis.gml.x32.GridEnvelopeType gridEnvelope)
    {
        generatedSetterHelperImpl(gridEnvelope, GRIDENVELOPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GridEnvelope" element
     */
    public net.opengis.gml.x32.GridEnvelopeType addNewGridEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GridEnvelopeType target = null;
            target = (net.opengis.gml.x32.GridEnvelopeType)get_store().add_element_user(GRIDENVELOPE$0);
            return target;
        }
    }
}
