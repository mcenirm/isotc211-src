/*
 * XML Type:  ObservationType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ObservationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ObservationType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ObservationTypeImpl extends net.opengis.gml.x32.impl.AbstractFeatureTypeImpl implements net.opengis.gml.x32.ObservationType
{
    private static final long serialVersionUID = 1L;
    
    public ObservationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDTIME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "validTime");
    private static final javax.xml.namespace.QName USING$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "using");
    private static final javax.xml.namespace.QName TARGET$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "target");
    private static final org.apache.xmlbeans.QNameSet TARGET$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "target"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "subject"),
    });
    private static final javax.xml.namespace.QName RESULTOF$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "resultOf");
    
    
    /**
     * Gets the "validTime" element
     */
    public net.opengis.gml.x32.TimePrimitivePropertyType getValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.TimePrimitivePropertyType)get_store().find_element_user(VALIDTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validTime" element
     */
    public void setValidTime(net.opengis.gml.x32.TimePrimitivePropertyType validTime)
    {
        generatedSetterHelperImpl(validTime, VALIDTIME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "validTime" element
     */
    public net.opengis.gml.x32.TimePrimitivePropertyType addNewValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimePrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.TimePrimitivePropertyType)get_store().add_element_user(VALIDTIME$0);
            return target;
        }
    }
    
    /**
     * Gets the "using" element
     */
    public net.opengis.gml.x32.ProcedurePropertyType getUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ProcedurePropertyType target = null;
            target = (net.opengis.gml.x32.ProcedurePropertyType)get_store().find_element_user(USING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "using" element
     */
    public boolean isSetUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USING$2) != 0;
        }
    }
    
    /**
     * Sets the "using" element
     */
    public void setUsing(net.opengis.gml.x32.ProcedurePropertyType using)
    {
        generatedSetterHelperImpl(using, USING$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "using" element
     */
    public net.opengis.gml.x32.ProcedurePropertyType addNewUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ProcedurePropertyType target = null;
            target = (net.opengis.gml.x32.ProcedurePropertyType)get_store().add_element_user(USING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "using" element
     */
    public void unsetUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USING$2, 0);
        }
    }
    
    /**
     * Gets the "target" element
     */
    public net.opengis.gml.x32.TargetPropertyType getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TargetPropertyType target = null;
            target = (net.opengis.gml.x32.TargetPropertyType)get_store().find_element_user(TARGET$5, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "target" element
     */
    public boolean isSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGET$5) != 0;
        }
    }
    
    /**
     * Sets the "target" element
     */
    public void setTarget(net.opengis.gml.x32.TargetPropertyType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TargetPropertyType target = null;
            target = (net.opengis.gml.x32.TargetPropertyType)get_store().find_element_user(TARGET$5, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.TargetPropertyType)get_store().add_element_user(TARGET$4);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "target" element
     */
    public net.opengis.gml.x32.TargetPropertyType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TargetPropertyType target = null;
            target = (net.opengis.gml.x32.TargetPropertyType)get_store().add_element_user(TARGET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "target" element
     */
    public void unsetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGET$5, 0);
        }
    }
    
    /**
     * Gets the "resultOf" element
     */
    public net.opengis.gml.x32.ResultType getResultOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ResultType target = null;
            target = (net.opengis.gml.x32.ResultType)get_store().find_element_user(RESULTOF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resultOf" element
     */
    public void setResultOf(net.opengis.gml.x32.ResultType resultOf)
    {
        generatedSetterHelperImpl(resultOf, RESULTOF$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resultOf" element
     */
    public net.opengis.gml.x32.ResultType addNewResultOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ResultType target = null;
            target = (net.opengis.gml.x32.ResultType)get_store().add_element_user(RESULTOF$6);
            return target;
        }
    }
}
