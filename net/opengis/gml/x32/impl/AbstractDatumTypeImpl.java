/*
 * XML Type:  AbstractDatumType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractDatumType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractDatumType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractDatumTypeImpl extends net.opengis.gml.x32.impl.IdentifiedObjectTypeImpl implements net.opengis.gml.x32.AbstractDatumType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDatumTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINOFVALIDITY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "domainOfValidity");
    private static final javax.xml.namespace.QName SCOPE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "scope");
    private static final javax.xml.namespace.QName ANCHORDEFINITION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "anchorDefinition");
    private static final org.apache.xmlbeans.QNameSet ANCHORDEFINITION$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "anchorPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "anchorDefinition"),
    });
    private static final javax.xml.namespace.QName REALIZATIONEPOCH$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "realizationEpoch");
    
    
    /**
     * Gets the "domainOfValidity" element
     */
    public net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity getDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity target = null;
            target = (net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "domainOfValidity" element
     */
    public boolean isSetDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINOFVALIDITY$0) != 0;
        }
    }
    
    /**
     * Sets the "domainOfValidity" element
     */
    public void setDomainOfValidity(net.opengis.gml.x32.DomainOfValidityDocument.DomainOfValidity domainOfValidity)
    {
        generatedSetterHelperImpl(domainOfValidity, DOMAINOFVALIDITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "domainOfValidity" element
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
     * Unsets the "domainOfValidity" element
     */
    public void unsetDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINOFVALIDITY$0, 0);
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
    
    /**
     * Gets the "anchorDefinition" element
     */
    public net.opengis.gml.x32.CodeType getAnchorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(ANCHORDEFINITION$5, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "anchorDefinition" element
     */
    public boolean isSetAnchorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANCHORDEFINITION$5) != 0;
        }
    }
    
    /**
     * Sets the "anchorDefinition" element
     */
    public void setAnchorDefinition(net.opengis.gml.x32.CodeType anchorDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(ANCHORDEFINITION$5, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(ANCHORDEFINITION$4);
            }
            target.set(anchorDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "anchorDefinition" element
     */
    public net.opengis.gml.x32.CodeType addNewAnchorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(ANCHORDEFINITION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "anchorDefinition" element
     */
    public void unsetAnchorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANCHORDEFINITION$5, 0);
        }
    }
    
    /**
     * Gets the "realizationEpoch" element
     */
    public java.util.Calendar getRealizationEpoch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALIZATIONEPOCH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "realizationEpoch" element
     */
    public org.apache.xmlbeans.XmlDate xgetRealizationEpoch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(REALIZATIONEPOCH$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "realizationEpoch" element
     */
    public boolean isSetRealizationEpoch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALIZATIONEPOCH$6) != 0;
        }
    }
    
    /**
     * Sets the "realizationEpoch" element
     */
    public void setRealizationEpoch(java.util.Calendar realizationEpoch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALIZATIONEPOCH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REALIZATIONEPOCH$6);
            }
            target.setCalendarValue(realizationEpoch);
        }
    }
    
    /**
     * Sets (as xml) the "realizationEpoch" element
     */
    public void xsetRealizationEpoch(org.apache.xmlbeans.XmlDate realizationEpoch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(REALIZATIONEPOCH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(REALIZATIONEPOCH$6);
            }
            target.set(realizationEpoch);
        }
    }
    
    /**
     * Unsets the "realizationEpoch" element
     */
    public void unsetRealizationEpoch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALIZATIONEPOCH$6, 0);
        }
    }
}
