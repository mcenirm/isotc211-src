/*
 * An XML document type.
 * Localname: DQ_CompletenessCommission
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQCompletenessCommissionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_CompletenessCommission(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQCompletenessCommissionDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQCompletenessDocumentImpl implements org.isotc211.x2005.gmd.DQCompletenessCommissionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQCompletenessCommissionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQCOMPLETENESSCOMMISSION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_CompletenessCommission");
    
    
    /**
     * Gets the "DQ_CompletenessCommission" element
     */
    public org.isotc211.x2005.gmd.DQCompletenessCommissionType getDQCompletenessCommission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQCompletenessCommissionType target = null;
            target = (org.isotc211.x2005.gmd.DQCompletenessCommissionType)get_store().find_element_user(DQCOMPLETENESSCOMMISSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_CompletenessCommission" element
     */
    public void setDQCompletenessCommission(org.isotc211.x2005.gmd.DQCompletenessCommissionType dqCompletenessCommission)
    {
        generatedSetterHelperImpl(dqCompletenessCommission, DQCOMPLETENESSCOMMISSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_CompletenessCommission" element
     */
    public org.isotc211.x2005.gmd.DQCompletenessCommissionType addNewDQCompletenessCommission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQCompletenessCommissionType target = null;
            target = (org.isotc211.x2005.gmd.DQCompletenessCommissionType)get_store().add_element_user(DQCOMPLETENESSCOMMISSION$0);
            return target;
        }
    }
}
