/*
 * XML Type:  GridFunctionType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GridFunctionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML GridFunctionType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class GridFunctionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GridFunctionType
{
    private static final long serialVersionUID = 1L;
    
    public GridFunctionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQUENCERULE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sequenceRule");
    private static final javax.xml.namespace.QName STARTPOINT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "startPoint");
    
    
    /**
     * Gets the "sequenceRule" element
     */
    public net.opengis.gml.x32.SequenceRuleType getSequenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SequenceRuleType target = null;
            target = (net.opengis.gml.x32.SequenceRuleType)get_store().find_element_user(SEQUENCERULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sequenceRule" element
     */
    public boolean isSetSequenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQUENCERULE$0) != 0;
        }
    }
    
    /**
     * Sets the "sequenceRule" element
     */
    public void setSequenceRule(net.opengis.gml.x32.SequenceRuleType sequenceRule)
    {
        generatedSetterHelperImpl(sequenceRule, SEQUENCERULE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sequenceRule" element
     */
    public net.opengis.gml.x32.SequenceRuleType addNewSequenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SequenceRuleType target = null;
            target = (net.opengis.gml.x32.SequenceRuleType)get_store().add_element_user(SEQUENCERULE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sequenceRule" element
     */
    public void unsetSequenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQUENCERULE$0, 0);
        }
    }
    
    /**
     * Gets the "startPoint" element
     */
    public java.util.List getStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTPOINT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "startPoint" element
     */
    public net.opengis.gml.x32.IntegerList xgetStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IntegerList target = null;
            target = (net.opengis.gml.x32.IntegerList)get_store().find_element_user(STARTPOINT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "startPoint" element
     */
    public boolean isSetStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTPOINT$2) != 0;
        }
    }
    
    /**
     * Sets the "startPoint" element
     */
    public void setStartPoint(java.util.List startPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTPOINT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTPOINT$2);
            }
            target.setListValue(startPoint);
        }
    }
    
    /**
     * Sets (as xml) the "startPoint" element
     */
    public void xsetStartPoint(net.opengis.gml.x32.IntegerList startPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IntegerList target = null;
            target = (net.opengis.gml.x32.IntegerList)get_store().find_element_user(STARTPOINT$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.IntegerList)get_store().add_element_user(STARTPOINT$2);
            }
            target.set(startPoint);
        }
    }
    
    /**
     * Unsets the "startPoint" element
     */
    public void unsetStartPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTPOINT$2, 0);
        }
    }
}
