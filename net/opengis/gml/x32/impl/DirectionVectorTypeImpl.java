/*
 * XML Type:  DirectionVectorType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DirectionVectorType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DirectionVectorType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DirectionVectorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DirectionVectorType
{
    private static final long serialVersionUID = 1L;
    
    public DirectionVectorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VECTOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "vector");
    private static final javax.xml.namespace.QName HORIZONTALANGLE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "horizontalAngle");
    private static final javax.xml.namespace.QName VERTICALANGLE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalAngle");
    
    
    /**
     * Gets the "vector" element
     */
    public net.opengis.gml.x32.VectorType getVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().find_element_user(VECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "vector" element
     */
    public boolean isSetVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VECTOR$0) != 0;
        }
    }
    
    /**
     * Sets the "vector" element
     */
    public void setVector(net.opengis.gml.x32.VectorType vector)
    {
        generatedSetterHelperImpl(vector, VECTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vector" element
     */
    public net.opengis.gml.x32.VectorType addNewVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VectorType target = null;
            target = (net.opengis.gml.x32.VectorType)get_store().add_element_user(VECTOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "vector" element
     */
    public void unsetVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VECTOR$0, 0);
        }
    }
    
    /**
     * Gets the "horizontalAngle" element
     */
    public net.opengis.gml.x32.AngleType getHorizontalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AngleType target = null;
            target = (net.opengis.gml.x32.AngleType)get_store().find_element_user(HORIZONTALANGLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "horizontalAngle" element
     */
    public boolean isSetHorizontalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HORIZONTALANGLE$2) != 0;
        }
    }
    
    /**
     * Sets the "horizontalAngle" element
     */
    public void setHorizontalAngle(net.opengis.gml.x32.AngleType horizontalAngle)
    {
        generatedSetterHelperImpl(horizontalAngle, HORIZONTALANGLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "horizontalAngle" element
     */
    public net.opengis.gml.x32.AngleType addNewHorizontalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AngleType target = null;
            target = (net.opengis.gml.x32.AngleType)get_store().add_element_user(HORIZONTALANGLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "horizontalAngle" element
     */
    public void unsetHorizontalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HORIZONTALANGLE$2, 0);
        }
    }
    
    /**
     * Gets the "verticalAngle" element
     */
    public net.opengis.gml.x32.AngleType getVerticalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AngleType target = null;
            target = (net.opengis.gml.x32.AngleType)get_store().find_element_user(VERTICALANGLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "verticalAngle" element
     */
    public boolean isSetVerticalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERTICALANGLE$4) != 0;
        }
    }
    
    /**
     * Sets the "verticalAngle" element
     */
    public void setVerticalAngle(net.opengis.gml.x32.AngleType verticalAngle)
    {
        generatedSetterHelperImpl(verticalAngle, VERTICALANGLE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalAngle" element
     */
    public net.opengis.gml.x32.AngleType addNewVerticalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AngleType target = null;
            target = (net.opengis.gml.x32.AngleType)get_store().add_element_user(VERTICALANGLE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "verticalAngle" element
     */
    public void unsetVerticalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERTICALANGLE$4, 0);
        }
    }
}
