/*
 * An XML document type.
 * Localname: DQ_AbsoluteExternalPositionalAccuracy
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQAbsoluteExternalPositionalAccuracyDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_AbsoluteExternalPositionalAccuracy(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQAbsoluteExternalPositionalAccuracyDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQPositionalAccuracyDocumentImpl implements org.isotc211.x2005.gmd.DQAbsoluteExternalPositionalAccuracyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQAbsoluteExternalPositionalAccuracyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQABSOLUTEEXTERNALPOSITIONALACCURACY$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_AbsoluteExternalPositionalAccuracy");
    
    
    /**
     * Gets the "DQ_AbsoluteExternalPositionalAccuracy" element
     */
    public org.isotc211.x2005.gmd.DQAbsoluteExternalPositionalAccuracyType getDQAbsoluteExternalPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQAbsoluteExternalPositionalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.DQAbsoluteExternalPositionalAccuracyType)get_store().find_element_user(DQABSOLUTEEXTERNALPOSITIONALACCURACY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_AbsoluteExternalPositionalAccuracy" element
     */
    public void setDQAbsoluteExternalPositionalAccuracy(org.isotc211.x2005.gmd.DQAbsoluteExternalPositionalAccuracyType dqAbsoluteExternalPositionalAccuracy)
    {
        generatedSetterHelperImpl(dqAbsoluteExternalPositionalAccuracy, DQABSOLUTEEXTERNALPOSITIONALACCURACY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_AbsoluteExternalPositionalAccuracy" element
     */
    public org.isotc211.x2005.gmd.DQAbsoluteExternalPositionalAccuracyType addNewDQAbsoluteExternalPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQAbsoluteExternalPositionalAccuracyType target = null;
            target = (org.isotc211.x2005.gmd.DQAbsoluteExternalPositionalAccuracyType)get_store().add_element_user(DQABSOLUTEEXTERNALPOSITIONALACCURACY$0);
            return target;
        }
    }
}
