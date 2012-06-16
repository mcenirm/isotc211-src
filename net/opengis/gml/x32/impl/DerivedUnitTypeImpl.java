/*
 * XML Type:  DerivedUnitType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DerivedUnitType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DerivedUnitType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DerivedUnitTypeImpl extends net.opengis.gml.x32.impl.UnitDefinitionTypeImpl implements net.opengis.gml.x32.DerivedUnitType
{
    private static final long serialVersionUID = 1L;
    
    public DerivedUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVATIONUNITTERM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "derivationUnitTerm");
    
    
    /**
     * Gets array of all "derivationUnitTerm" elements
     */
    public net.opengis.gml.x32.DerivationUnitTermType[] getDerivationUnitTermArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DERIVATIONUNITTERM$0, targetList);
            net.opengis.gml.x32.DerivationUnitTermType[] result = new net.opengis.gml.x32.DerivationUnitTermType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "derivationUnitTerm" element
     */
    public net.opengis.gml.x32.DerivationUnitTermType getDerivationUnitTermArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivationUnitTermType target = null;
            target = (net.opengis.gml.x32.DerivationUnitTermType)get_store().find_element_user(DERIVATIONUNITTERM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "derivationUnitTerm" element
     */
    public int sizeOfDerivationUnitTermArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DERIVATIONUNITTERM$0);
        }
    }
    
    /**
     * Sets array of all "derivationUnitTerm" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDerivationUnitTermArray(net.opengis.gml.x32.DerivationUnitTermType[] derivationUnitTermArray)
    {
        check_orphaned();
        arraySetterHelper(derivationUnitTermArray, DERIVATIONUNITTERM$0);
    }
    
    /**
     * Sets ith "derivationUnitTerm" element
     */
    public void setDerivationUnitTermArray(int i, net.opengis.gml.x32.DerivationUnitTermType derivationUnitTerm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivationUnitTermType target = null;
            target = (net.opengis.gml.x32.DerivationUnitTermType)get_store().find_element_user(DERIVATIONUNITTERM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(derivationUnitTerm);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "derivationUnitTerm" element
     */
    public net.opengis.gml.x32.DerivationUnitTermType insertNewDerivationUnitTerm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivationUnitTermType target = null;
            target = (net.opengis.gml.x32.DerivationUnitTermType)get_store().insert_element_user(DERIVATIONUNITTERM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "derivationUnitTerm" element
     */
    public net.opengis.gml.x32.DerivationUnitTermType addNewDerivationUnitTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivationUnitTermType target = null;
            target = (net.opengis.gml.x32.DerivationUnitTermType)get_store().add_element_user(DERIVATIONUNITTERM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "derivationUnitTerm" element
     */
    public void removeDerivationUnitTerm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DERIVATIONUNITTERM$0, i);
        }
    }
}
