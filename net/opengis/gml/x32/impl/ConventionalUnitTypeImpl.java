/*
 * XML Type:  ConventionalUnitType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ConventionalUnitType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ConventionalUnitType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ConventionalUnitTypeImpl extends net.opengis.gml.x32.impl.UnitDefinitionTypeImpl implements net.opengis.gml.x32.ConventionalUnitType
{
    private static final long serialVersionUID = 1L;
    
    public ConventionalUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSIONTOPREFERREDUNIT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "conversionToPreferredUnit");
    private static final javax.xml.namespace.QName ROUGHCONVERSIONTOPREFERREDUNIT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "roughConversionToPreferredUnit");
    private static final javax.xml.namespace.QName DERIVATIONUNITTERM$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "derivationUnitTerm");
    
    
    /**
     * Gets the "conversionToPreferredUnit" element
     */
    public net.opengis.gml.x32.ConversionToPreferredUnitType getConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.x32.ConversionToPreferredUnitType)get_store().find_element_user(CONVERSIONTOPREFERREDUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "conversionToPreferredUnit" element
     */
    public boolean isSetConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERSIONTOPREFERREDUNIT$0) != 0;
        }
    }
    
    /**
     * Sets the "conversionToPreferredUnit" element
     */
    public void setConversionToPreferredUnit(net.opengis.gml.x32.ConversionToPreferredUnitType conversionToPreferredUnit)
    {
        generatedSetterHelperImpl(conversionToPreferredUnit, CONVERSIONTOPREFERREDUNIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conversionToPreferredUnit" element
     */
    public net.opengis.gml.x32.ConversionToPreferredUnitType addNewConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.x32.ConversionToPreferredUnitType)get_store().add_element_user(CONVERSIONTOPREFERREDUNIT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "conversionToPreferredUnit" element
     */
    public void unsetConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERSIONTOPREFERREDUNIT$0, 0);
        }
    }
    
    /**
     * Gets the "roughConversionToPreferredUnit" element
     */
    public net.opengis.gml.x32.ConversionToPreferredUnitType getRoughConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.x32.ConversionToPreferredUnitType)get_store().find_element_user(ROUGHCONVERSIONTOPREFERREDUNIT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "roughConversionToPreferredUnit" element
     */
    public boolean isSetRoughConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUGHCONVERSIONTOPREFERREDUNIT$2) != 0;
        }
    }
    
    /**
     * Sets the "roughConversionToPreferredUnit" element
     */
    public void setRoughConversionToPreferredUnit(net.opengis.gml.x32.ConversionToPreferredUnitType roughConversionToPreferredUnit)
    {
        generatedSetterHelperImpl(roughConversionToPreferredUnit, ROUGHCONVERSIONTOPREFERREDUNIT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "roughConversionToPreferredUnit" element
     */
    public net.opengis.gml.x32.ConversionToPreferredUnitType addNewRoughConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.x32.ConversionToPreferredUnitType)get_store().add_element_user(ROUGHCONVERSIONTOPREFERREDUNIT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "roughConversionToPreferredUnit" element
     */
    public void unsetRoughConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUGHCONVERSIONTOPREFERREDUNIT$2, 0);
        }
    }
    
    /**
     * Gets array of all "derivationUnitTerm" elements
     */
    public net.opengis.gml.x32.DerivationUnitTermType[] getDerivationUnitTermArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DERIVATIONUNITTERM$4, targetList);
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
            target = (net.opengis.gml.x32.DerivationUnitTermType)get_store().find_element_user(DERIVATIONUNITTERM$4, i);
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
            return get_store().count_elements(DERIVATIONUNITTERM$4);
        }
    }
    
    /**
     * Sets array of all "derivationUnitTerm" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDerivationUnitTermArray(net.opengis.gml.x32.DerivationUnitTermType[] derivationUnitTermArray)
    {
        check_orphaned();
        arraySetterHelper(derivationUnitTermArray, DERIVATIONUNITTERM$4);
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
            target = (net.opengis.gml.x32.DerivationUnitTermType)get_store().find_element_user(DERIVATIONUNITTERM$4, i);
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
            target = (net.opengis.gml.x32.DerivationUnitTermType)get_store().insert_element_user(DERIVATIONUNITTERM$4, i);
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
            target = (net.opengis.gml.x32.DerivationUnitTermType)get_store().add_element_user(DERIVATIONUNITTERM$4);
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
            get_store().remove_element(DERIVATIONUNITTERM$4, i);
        }
    }
}
