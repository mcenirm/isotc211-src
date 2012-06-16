/*
 * XML Type:  EllipsoidType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EllipsoidType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML EllipsoidType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class EllipsoidTypeImpl extends net.opengis.gml.x32.impl.IdentifiedObjectTypeImpl implements net.opengis.gml.x32.EllipsoidType
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEMIMAJORAXIS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "semiMajorAxis");
    private static final javax.xml.namespace.QName SECONDDEFININGPARAMETER$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "secondDefiningParameter");
    
    
    /**
     * Gets the "semiMajorAxis" element
     */
    public net.opengis.gml.x32.MeasureType getSemiMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(SEMIMAJORAXIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "semiMajorAxis" element
     */
    public void setSemiMajorAxis(net.opengis.gml.x32.MeasureType semiMajorAxis)
    {
        generatedSetterHelperImpl(semiMajorAxis, SEMIMAJORAXIS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "semiMajorAxis" element
     */
    public net.opengis.gml.x32.MeasureType addNewSemiMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(SEMIMAJORAXIS$0);
            return target;
        }
    }
    
    /**
     * Gets the "secondDefiningParameter" element
     */
    public net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter getSecondDefiningParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter target = null;
            target = (net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter)get_store().find_element_user(SECONDDEFININGPARAMETER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "secondDefiningParameter" element
     */
    public void setSecondDefiningParameter(net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter secondDefiningParameter)
    {
        generatedSetterHelperImpl(secondDefiningParameter, SECONDDEFININGPARAMETER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "secondDefiningParameter" element
     */
    public net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter addNewSecondDefiningParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter target = null;
            target = (net.opengis.gml.x32.SecondDefiningParameterDocument.SecondDefiningParameter)get_store().add_element_user(SECONDDEFININGPARAMETER$2);
            return target;
        }
    }
}
