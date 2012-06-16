/*
 * An XML document type.
 * Localname: DQ_ThematicClassificationCorrectness
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQThematicClassificationCorrectnessDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DQ_ThematicClassificationCorrectness(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DQThematicClassificationCorrectnessDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDQThematicAccuracyDocumentImpl implements org.isotc211.x2005.gmd.DQThematicClassificationCorrectnessDocument
{
    private static final long serialVersionUID = 1L;
    
    public DQThematicClassificationCorrectnessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DQTHEMATICCLASSIFICATIONCORRECTNESS$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DQ_ThematicClassificationCorrectness");
    
    
    /**
     * Gets the "DQ_ThematicClassificationCorrectness" element
     */
    public org.isotc211.x2005.gmd.DQThematicClassificationCorrectnessType getDQThematicClassificationCorrectness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQThematicClassificationCorrectnessType target = null;
            target = (org.isotc211.x2005.gmd.DQThematicClassificationCorrectnessType)get_store().find_element_user(DQTHEMATICCLASSIFICATIONCORRECTNESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DQ_ThematicClassificationCorrectness" element
     */
    public void setDQThematicClassificationCorrectness(org.isotc211.x2005.gmd.DQThematicClassificationCorrectnessType dqThematicClassificationCorrectness)
    {
        generatedSetterHelperImpl(dqThematicClassificationCorrectness, DQTHEMATICCLASSIFICATIONCORRECTNESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DQ_ThematicClassificationCorrectness" element
     */
    public org.isotc211.x2005.gmd.DQThematicClassificationCorrectnessType addNewDQThematicClassificationCorrectness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQThematicClassificationCorrectnessType target = null;
            target = (org.isotc211.x2005.gmd.DQThematicClassificationCorrectnessType)get_store().add_element_user(DQTHEMATICCLASSIFICATIONCORRECTNESS$0);
            return target;
        }
    }
}
