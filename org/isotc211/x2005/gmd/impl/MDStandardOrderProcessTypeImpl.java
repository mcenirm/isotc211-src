/*
 * XML Type:  MD_StandardOrderProcess_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDStandardOrderProcessType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_StandardOrderProcess_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDStandardOrderProcessTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDStandardOrderProcessType
{
    private static final long serialVersionUID = 1L;
    
    public MDStandardOrderProcessTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEES$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "fees");
    private static final javax.xml.namespace.QName PLANNEDAVAILABLEDATETIME$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "plannedAvailableDateTime");
    private static final javax.xml.namespace.QName ORDERINGINSTRUCTIONS$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "orderingInstructions");
    private static final javax.xml.namespace.QName TURNAROUND$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "turnaround");
    
    
    /**
     * Gets the "fees" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getFees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(FEES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fees" element
     */
    public boolean isSetFees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEES$0) != 0;
        }
    }
    
    /**
     * Sets the "fees" element
     */
    public void setFees(org.isotc211.x2005.gco.CharacterStringPropertyType fees)
    {
        generatedSetterHelperImpl(fees, FEES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fees" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewFees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(FEES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fees" element
     */
    public void unsetFees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEES$0, 0);
        }
    }
    
    /**
     * Gets the "plannedAvailableDateTime" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType getPlannedAvailableDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().find_element_user(PLANNEDAVAILABLEDATETIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "plannedAvailableDateTime" element
     */
    public boolean isSetPlannedAvailableDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANNEDAVAILABLEDATETIME$2) != 0;
        }
    }
    
    /**
     * Sets the "plannedAvailableDateTime" element
     */
    public void setPlannedAvailableDateTime(org.isotc211.x2005.gco.DateTimePropertyType plannedAvailableDateTime)
    {
        generatedSetterHelperImpl(plannedAvailableDateTime, PLANNEDAVAILABLEDATETIME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "plannedAvailableDateTime" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType addNewPlannedAvailableDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().add_element_user(PLANNEDAVAILABLEDATETIME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "plannedAvailableDateTime" element
     */
    public void unsetPlannedAvailableDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANNEDAVAILABLEDATETIME$2, 0);
        }
    }
    
    /**
     * Gets the "orderingInstructions" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getOrderingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ORDERINGINSTRUCTIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "orderingInstructions" element
     */
    public boolean isSetOrderingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERINGINSTRUCTIONS$4) != 0;
        }
    }
    
    /**
     * Sets the "orderingInstructions" element
     */
    public void setOrderingInstructions(org.isotc211.x2005.gco.CharacterStringPropertyType orderingInstructions)
    {
        generatedSetterHelperImpl(orderingInstructions, ORDERINGINSTRUCTIONS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "orderingInstructions" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewOrderingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ORDERINGINSTRUCTIONS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "orderingInstructions" element
     */
    public void unsetOrderingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERINGINSTRUCTIONS$4, 0);
        }
    }
    
    /**
     * Gets the "turnaround" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getTurnaround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(TURNAROUND$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "turnaround" element
     */
    public boolean isSetTurnaround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TURNAROUND$6) != 0;
        }
    }
    
    /**
     * Sets the "turnaround" element
     */
    public void setTurnaround(org.isotc211.x2005.gco.CharacterStringPropertyType turnaround)
    {
        generatedSetterHelperImpl(turnaround, TURNAROUND$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "turnaround" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewTurnaround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(TURNAROUND$6);
            return target;
        }
    }
    
    /**
     * Unsets the "turnaround" element
     */
    public void unsetTurnaround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TURNAROUND$6, 0);
        }
    }
}
