/*
 * An XML document type.
 * Localname: DQ_CompletenessOmission
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQCompletenessOmissionDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_CompletenessOmission(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQCompletenessOmissionDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQCompletenessDocumentImpl implements org.isotc211.x2005.gmd.DQCompletenessOmissionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQCompletenessOmissionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQCOMPLETENESSOMISSION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_CompletenessOmission");
    
    
    /**
     * Gets the "DQ_CompletenessOmission" element
     */
    public org.isotc211.x2005.gmd.DQCompletenessOmissionType getDQCompletenessOmission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQCompletenessOmissionType target = null;
            target = (org.isotc211.x2005.gmd.DQCompletenessOmissionType)get_store().find_element_user(DQCOMPLETENESSOMISSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_CompletenessOmission" element
     */
    public void setDQCompletenessOmission(org.isotc211.x2005.gmd.DQCompletenessOmissionType dqCompletenessOmission)
    {
        generatedSetterHelperImpl(dqCompletenessOmission, DQCOMPLETENESSOMISSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_CompletenessOmission" element
     */
    public org.isotc211.x2005.gmd.DQCompletenessOmissionType addNewDQCompletenessOmission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQCompletenessOmissionType target = null;
            target = (org.isotc211.x2005.gmd.DQCompletenessOmissionType)get_store().add_element_user(DQCOMPLETENESSOMISSION$0);
            return target;
        }
    }
}
