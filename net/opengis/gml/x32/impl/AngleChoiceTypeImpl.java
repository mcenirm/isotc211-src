/*
 * XML Type:  AngleChoiceType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AngleChoiceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AngleChoiceType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AngleChoiceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AngleChoiceType
{
    private static final long serialVersionUID = 1L;
    
    public AngleChoiceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANGLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "angle");
    private static final javax.xml.namespace.QName DMSANGLE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dmsAngle");
    
    
    /**
     * Gets the "angle" element
     */
    public net.opengis.gml.x32.AngleType getAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AngleType target = null;
            target = (net.opengis.gml.x32.AngleType)get_store().find_element_user(ANGLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "angle" element
     */
    public boolean isSetAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANGLE$0) != 0;
        }
    }
    
    /**
     * Sets the "angle" element
     */
    public void setAngle(net.opengis.gml.x32.AngleType angle)
    {
        generatedSetterHelperImpl(angle, ANGLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "angle" element
     */
    public net.opengis.gml.x32.AngleType addNewAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AngleType target = null;
            target = (net.opengis.gml.x32.AngleType)get_store().add_element_user(ANGLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "angle" element
     */
    public void unsetAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANGLE$0, 0);
        }
    }
    
    /**
     * Gets the "dmsAngle" element
     */
    public net.opengis.gml.x32.DMSAngleType getDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DMSAngleType target = null;
            target = (net.opengis.gml.x32.DMSAngleType)get_store().find_element_user(DMSANGLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dmsAngle" element
     */
    public boolean isSetDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DMSANGLE$2) != 0;
        }
    }
    
    /**
     * Sets the "dmsAngle" element
     */
    public void setDmsAngle(net.opengis.gml.x32.DMSAngleType dmsAngle)
    {
        generatedSetterHelperImpl(dmsAngle, DMSANGLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dmsAngle" element
     */
    public net.opengis.gml.x32.DMSAngleType addNewDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DMSAngleType target = null;
            target = (net.opengis.gml.x32.DMSAngleType)get_store().add_element_user(DMSANGLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "dmsAngle" element
     */
    public void unsetDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DMSANGLE$2, 0);
        }
    }
}
