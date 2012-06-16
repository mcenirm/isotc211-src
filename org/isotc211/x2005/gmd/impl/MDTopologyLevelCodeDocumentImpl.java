/*
 * An XML document type.
 * Localname: MD_TopologyLevelCode
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDTopologyLevelCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one MD_TopologyLevelCode(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class MDTopologyLevelCodeDocumentImpl extends org.isotc211.x2005.gco.impl.CharacterStringDocumentImpl implements org.isotc211.x2005.gmd.MDTopologyLevelCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MDTopologyLevelCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDTOPOLOGYLEVELCODE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "MD_TopologyLevelCode");
    
    
    /**
     * Gets the "MD_TopologyLevelCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType getMDTopologyLevelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().find_element_user(MDTOPOLOGYLEVELCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MD_TopologyLevelCode" element
     */
    public void setMDTopologyLevelCode(org.isotc211.x2005.gco.CodeListValueType mdTopologyLevelCode)
    {
        generatedSetterHelperImpl(mdTopologyLevelCode, MDTOPOLOGYLEVELCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MD_TopologyLevelCode" element
     */
    public org.isotc211.x2005.gco.CodeListValueType addNewMDTopologyLevelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CodeListValueType target = null;
            target = (org.isotc211.x2005.gco.CodeListValueType)get_store().add_element_user(MDTOPOLOGYLEVELCODE$0);
            return target;
        }
    }
}
