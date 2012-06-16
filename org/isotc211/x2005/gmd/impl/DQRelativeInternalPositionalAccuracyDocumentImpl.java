/*
 * An XML document type.
 * Localname: DQ_RelativeInternalPositionalAccuracy
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQRelativeInternalPositionalAccuracyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_RelativeInternalPositionalAccuracy(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQRelativeInternalPositionalAccuracyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQPositionalAccuracyDocumentImpl implements org.isotc211.x2005.gmd.DQRelativeInternalPositionalAccuracyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQRelativeInternalPositionalAccuracyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQRELATIVEINTERNALPOSITIONALACCURACY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_RelativeInternalPositionalAccuracy");
    
    
    /**
     * Gets the "DQ_RelativeInternalPositionalAccuracy" element
     */
    public org.isotc211.x2005.gmd.DQRelativeInternalPositionalAccuracyType getDQRelativeInternalPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQRelativeInternalPositionalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.DQRelativeInternalPositionalAccuracyType)get_store().find_element_user(DQRELATIVEINTERNALPOSITIONALACCURACY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_RelativeInternalPositionalAccuracy" element
     */
    public void setDQRelativeInternalPositionalAccuracy(org.isotc211.x2005.gmd.DQRelativeInternalPositionalAccuracyType dqRelativeInternalPositionalAccuracy)
    {
        generatedSetterHelperImpl(dqRelativeInternalPositionalAccuracy, DQRELATIVEINTERNALPOSITIONALACCURACY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_RelativeInternalPositionalAccuracy" element
     */
    public org.isotc211.x2005.gmd.DQRelativeInternalPositionalAccuracyType addNewDQRelativeInternalPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQRelativeInternalPositionalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.DQRelativeInternalPositionalAccuracyType)get_store().add_element_user(DQRELATIVEINTERNALPOSITIONALACCURACY$0);
            return target;
        }
    }
}
