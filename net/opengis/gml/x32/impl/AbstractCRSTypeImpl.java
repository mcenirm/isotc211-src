/*
 * XML Type:  AbstractCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractCRSType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractCRSTypeImpl extends net.opengis.gml.x32.impl.IdentifiedObjectTypeImpl implements net.opengis.gml.x32.AbstractCRSType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINOFVALIDITY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "domainOfValidity");
    private static final javax.xml.namespace.QName SCOPE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "scope");
    
    
    /**
     * Gets array of all "domainOfValidity" elements
     */
    public net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity[] getDomainOfValidityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOMAINOFVALIDITY$0, targetList);
            net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity[] result = new net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "domainOfValidity" element
     */
    public net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity getDomainOfValidityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity target = null;
            target = (net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity)get_store().find_element_user(DOMAINOFVALIDITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "domainOfValidity" element
     */
    public int sizeOfDomainOfValidityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINOFVALIDITY$0);
        }
    }
    
    /**
     * Sets array of all "domainOfValidity" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDomainOfValidityArray(net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity[] domainOfValidityArray)
    {
        check_orphaned();
        arraySetterHelper(domainOfValidityArray, DOMAINOFVALIDITY$0);
    }
    
    /**
     * Sets ith "domainOfValidity" element
     */
    public void setDomainOfValidityArray(int i, net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity domainOfValidity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity target = null;
            target = (net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity)get_store().find_element_user(DOMAINOFVALIDITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(domainOfValidity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "domainOfValidity" element
     */
    public net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity insertNewDomainOfValidity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity target = null;
            target = (net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity)get_store().insert_element_user(DOMAINOFVALIDITY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "domainOfValidity" element
     */
    public net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity addNewDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity target = null;
            target = (net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity)get_store().add_element_user(DOMAINOFVALIDITY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "domainOfValidity" element
     */
    public void removeDomainOfValidity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINOFVALIDITY$0, i);
        }
    }
    
    /**
     * Gets array of all "scope" elements
     */
    public java.lang.String[] getScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCOPE$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "scope" element
     */
    public java.lang.String getScopeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "scope" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCOPE$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "scope" element
     */
    public org.apache.xmlbeans.XmlString xgetScopeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "scope" element
     */
    public int sizeOfScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPE$2);
        }
    }
    
    /**
     * Sets array of all "scope" element
     */
    public void setScopeArray(java.lang.String[] scopeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scopeArray, SCOPE$2);
        }
    }
    
    /**
     * Sets ith "scope" element
     */
    public void setScopeArray(int i, java.lang.String scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(scope);
        }
    }
    
    /**
     * Sets (as xml) array of all "scope" element
     */
    public void xsetScopeArray(org.apache.xmlbeans.XmlString[]scopeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scopeArray, SCOPE$2);
        }
    }
    
    /**
     * Sets (as xml) ith "scope" element
     */
    public void xsetScopeArray(int i, org.apache.xmlbeans.XmlString scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(scope);
        }
    }
    
    /**
     * Inserts the value as the ith "scope" element
     */
    public void insertScope(int i, java.lang.String scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SCOPE$2, i);
            target.setStringValue(scope);
        }
    }
    
    /**
     * Appends the value as the last "scope" element
     */
    public void addScope(java.lang.String scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPE$2);
            target.setStringValue(scope);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scope" element
     */
    public org.apache.xmlbeans.XmlString insertNewScope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SCOPE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scope" element
     */
    public org.apache.xmlbeans.XmlString addNewScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "scope" element
     */
    public void removeScope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPE$2, i);
        }
    }
}
