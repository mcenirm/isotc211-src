/*
 * An XML document type.
 * Localname: DS_Initiative
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DSInitiativeDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * A document containing one DS_Initiative(@http://www.isotc211.org/2005/gmd) element.
 *
 * This is a complex type.
 */
public class DSInitiativeDocumentImpl extends org.isotc211.x2005.gmd.impl.AbstractDSAggregateDocumentImpl implements org.isotc211.x2005.gmd.DSInitiativeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DSInitiativeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DSINITIATIVE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "DS_Initiative");
    
    
    /**
     * Gets the "DS_Initiative" element
     */
    public org.isotc211.x2005.gmd.DSInitiativeType getDSInitiative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSInitiativeType target = null;
            target = (org.isotc211.x2005.gmd.DSInitiativeType)get_store().find_element_user(DSINITIATIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DS_Initiative" element
     */
    public void setDSInitiative(org.isotc211.x2005.gmd.DSInitiativeType dsInitiative)
    {
        generatedSetterHelperImpl(dsInitiative, DSINITIATIVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DS_Initiative" element
     */
    public org.isotc211.x2005.gmd.DSInitiativeType addNewDSInitiative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DSInitiativeType target = null;
            target = (org.isotc211.x2005.gmd.DSInitiativeType)get_store().add_element_user(DSINITIATIVE$0);
            return target;
        }
    }
}
