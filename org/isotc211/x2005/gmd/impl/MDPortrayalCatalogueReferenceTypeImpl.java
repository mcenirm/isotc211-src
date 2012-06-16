/*
 * XML Type:  MD_PortrayalCatalogueReference_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDPortrayalCatalogueReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_PortrayalCatalogueReference_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDPortrayalCatalogueReferenceTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDPortrayalCatalogueReferenceType
{
    private static final long serialVersionUID = 1L;
    
    public MDPortrayalCatalogueReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PORTRAYALCATALOGUECITATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "portrayalCatalogueCitation");
    
    
    /**
     * Gets array of all "portrayalCatalogueCitation" elements
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType[] getPortrayalCatalogueCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PORTRAYALCATALOGUECITATION$0, targetList);
            org.isotc211.x2005.gmd.CICitationPropertyType[] result = new org.isotc211.x2005.gmd.CICitationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "portrayalCatalogueCitation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getPortrayalCatalogueCitationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(PORTRAYALCATALOGUECITATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "portrayalCatalogueCitation" element
     */
    public int sizeOfPortrayalCatalogueCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTRAYALCATALOGUECITATION$0);
        }
    }
    
    /**
     * Sets array of all "portrayalCatalogueCitation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPortrayalCatalogueCitationArray(org.isotc211.x2005.gmd.CICitationPropertyType[] portrayalCatalogueCitationArray)
    {
        check_orphaned();
        arraySetterHelper(portrayalCatalogueCitationArray, PORTRAYALCATALOGUECITATION$0);
    }
    
    /**
     * Sets ith "portrayalCatalogueCitation" element
     */
    public void setPortrayalCatalogueCitationArray(int i, org.isotc211.x2005.gmd.CICitationPropertyType portrayalCatalogueCitation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(PORTRAYALCATALOGUECITATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(portrayalCatalogueCitation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "portrayalCatalogueCitation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType insertNewPortrayalCatalogueCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().insert_element_user(PORTRAYALCATALOGUECITATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "portrayalCatalogueCitation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewPortrayalCatalogueCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(PORTRAYALCATALOGUECITATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "portrayalCatalogueCitation" element
     */
    public void removePortrayalCatalogueCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTRAYALCATALOGUECITATION$0, i);
        }
    }
}
