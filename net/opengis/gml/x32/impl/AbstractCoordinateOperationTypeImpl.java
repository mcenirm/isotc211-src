/*
 * XML Type:  AbstractCoordinateOperationType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractCoordinateOperationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractCoordinateOperationType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractCoordinateOperationTypeImpl extends net.opengis.gml.x32.impl.IdentifiedObjectTypeImpl implements net.opengis.gml.x32.AbstractCoordinateOperationType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCoordinateOperationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINOFVALIDITY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "domainOfValidity");
    private static final javax.xml.namespace.QName SCOPE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "scope");
    private static final javax.xml.namespace.QName OPERATIONVERSION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "operationVersion");
    private static final javax.xml.namespace.QName COORDINATEOPERATIONACCURACY$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinateOperationAccuracy");
    private static final javax.xml.namespace.QName SOURCECRS$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "sourceCRS");
    private static final javax.xml.namespace.QName TARGETCRS$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "targetCRS");
    
    
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
     * Gets the "operationVersion" element
     */
    public java.lang.String getOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONVERSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONVERSION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "operationVersion" element
     */
    public boolean isSetOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONVERSION$4) != 0;
        }
    }
    
    /**
     * Sets the "operationVersion" element
     */
    public void setOperationVersion(java.lang.String operationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONVERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONVERSION$4);
            }
            target.setStringValue(operationVersion);
        }
    }
    
    /**
     * Sets (as xml) the "operationVersion" element
     */
    public void xsetOperationVersion(org.apache.xmlbeans.XmlString operationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONVERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATIONVERSION$4);
            }
            target.set(operationVersion);
        }
    }
    
    /**
     * Unsets the "operationVersion" element
     */
    public void unsetOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONVERSION$4, 0);
        }
    }
    
    /**
     * Gets array of all "coordinateOperationAccuracy" elements
     */
    public net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy[] getCoordinateOperationAccuracyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COORDINATEOPERATIONACCURACY$6, targetList);
            net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy[] result = new net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "coordinateOperationAccuracy" element
     */
    public net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy getCoordinateOperationAccuracyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy target = null;
            target = (net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy)get_store().find_element_user(COORDINATEOPERATIONACCURACY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "coordinateOperationAccuracy" element
     */
    public int sizeOfCoordinateOperationAccuracyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORDINATEOPERATIONACCURACY$6);
        }
    }
    
    /**
     * Sets array of all "coordinateOperationAccuracy" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCoordinateOperationAccuracyArray(net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy[] coordinateOperationAccuracyArray)
    {
        check_orphaned();
        arraySetterHelper(coordinateOperationAccuracyArray, COORDINATEOPERATIONACCURACY$6);
    }
    
    /**
     * Sets ith "coordinateOperationAccuracy" element
     */
    public void setCoordinateOperationAccuracyArray(int i, net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy coordinateOperationAccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy target = null;
            target = (net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy)get_store().find_element_user(COORDINATEOPERATIONACCURACY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(coordinateOperationAccuracy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "coordinateOperationAccuracy" element
     */
    public net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy insertNewCoordinateOperationAccuracy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy target = null;
            target = (net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy)get_store().insert_element_user(COORDINATEOPERATIONACCURACY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coordinateOperationAccuracy" element
     */
    public net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy addNewCoordinateOperationAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy target = null;
            target = (net.opengis.gml.x32.CoordinateOperationAccuracyDocument.CoordinateOperationAccuracy)get_store().add_element_user(COORDINATEOPERATIONACCURACY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "coordinateOperationAccuracy" element
     */
    public void removeCoordinateOperationAccuracy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORDINATEOPERATIONACCURACY$6, i);
        }
    }
    
    /**
     * Gets the "sourceCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType getSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().find_element_user(SOURCECRS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sourceCRS" element
     */
    public boolean isSetSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCECRS$8) != 0;
        }
    }
    
    /**
     * Sets the "sourceCRS" element
     */
    public void setSourceCRS(net.opengis.gml.x32.CRSPropertyType sourceCRS)
    {
        generatedSetterHelperImpl(sourceCRS, SOURCECRS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sourceCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType addNewSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().add_element_user(SOURCECRS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "sourceCRS" element
     */
    public void unsetSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCECRS$8, 0);
        }
    }
    
    /**
     * Gets the "targetCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType getTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().find_element_user(TARGETCRS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "targetCRS" element
     */
    public boolean isSetTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETCRS$10) != 0;
        }
    }
    
    /**
     * Sets the "targetCRS" element
     */
    public void setTargetCRS(net.opengis.gml.x32.CRSPropertyType targetCRS)
    {
        generatedSetterHelperImpl(targetCRS, TARGETCRS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "targetCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType addNewTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().add_element_user(TARGETCRS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "targetCRS" element
     */
    public void unsetTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETCRS$10, 0);
        }
    }
}
