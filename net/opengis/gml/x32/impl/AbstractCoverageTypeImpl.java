/*
 * XML Type:  AbstractCoverageType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractCoverageType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractCoverageType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractCoverageTypeImpl extends net.opengis.gml.x32.impl.AbstractFeatureTypeImpl implements net.opengis.gml.x32.AbstractCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINSET$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "domainSet");
    private static final org.apache.xmlbeans.QNameSet DOMAINSET$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiPointDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiCurveDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiSolidDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "gridDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "domainSet"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiSurfaceDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "rectifiedGridDomain"),
    });
    private static final javax.xml.namespace.QName RANGESET$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "rangeSet");
    
    
    /**
     * Gets the "domainSet" element
     */
    public net.opengis.gml.x32.DomainSetType getDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().find_element_user(DOMAINSET$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "domainSet" element
     */
    public void setDomainSet(net.opengis.gml.x32.DomainSetType domainSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().find_element_user(DOMAINSET$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DomainSetType)get_store().add_element_user(DOMAINSET$0);
            }
            target.set(domainSet);
        }
    }
    
    /**
     * Appends and returns a new empty "domainSet" element
     */
    public net.opengis.gml.x32.DomainSetType addNewDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().add_element_user(DOMAINSET$0);
            return target;
        }
    }
    
    /**
     * Gets the "rangeSet" element
     */
    public net.opengis.gml.x32.RangeSetType getRangeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RangeSetType target = null;
            target = (net.opengis.gml.x32.RangeSetType)get_store().find_element_user(RANGESET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeSet" element
     */
    public void setRangeSet(net.opengis.gml.x32.RangeSetType rangeSet)
    {
        generatedSetterHelperImpl(rangeSet, RANGESET$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeSet" element
     */
    public net.opengis.gml.x32.RangeSetType addNewRangeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.RangeSetType target = null;
            target = (net.opengis.gml.x32.RangeSetType)get_store().add_element_user(RANGESET$2);
            return target;
        }
    }
}
