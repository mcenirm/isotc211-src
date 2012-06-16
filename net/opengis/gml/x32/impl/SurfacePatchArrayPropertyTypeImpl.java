/*
 * XML Type:  SurfacePatchArrayPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SurfacePatchArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML SurfacePatchArrayPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class SurfacePatchArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SurfacePatchArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public SurfacePatchArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSURFACEPATCH$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurfacePatch");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSURFACEPATCH$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolygonPatch"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Rectangle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Sphere"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractParametricCurveSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Cylinder"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Triangle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGriddedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurfacePatch"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Cone"),
    });
    
    
    /**
     * Gets array of all "AbstractSurfacePatch" elements
     */
    public net.opengis.gml.x32.AbstractSurfacePatchType[] getAbstractSurfacePatchArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSTRACTSURFACEPATCH$1, targetList);
            net.opengis.gml.x32.AbstractSurfacePatchType[] result = new net.opengis.gml.x32.AbstractSurfacePatchType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AbstractSurfacePatch" element
     */
    public net.opengis.gml.x32.AbstractSurfacePatchType getAbstractSurfacePatchArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.x32.AbstractSurfacePatchType)get_store().find_element_user(ABSTRACTSURFACEPATCH$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AbstractSurfacePatch" element
     */
    public int sizeOfAbstractSurfacePatchArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACTSURFACEPATCH$1);
        }
    }
    
    /**
     * Sets array of all "AbstractSurfacePatch" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbstractSurfacePatchArray(net.opengis.gml.x32.AbstractSurfacePatchType[] abstractSurfacePatchArray)
    {
        check_orphaned();
        arraySetterHelper(abstractSurfacePatchArray, ABSTRACTSURFACEPATCH$0, ABSTRACTSURFACEPATCH$1);
    }
    
    /**
     * Sets ith "AbstractSurfacePatch" element
     */
    public void setAbstractSurfacePatchArray(int i, net.opengis.gml.x32.AbstractSurfacePatchType abstractSurfacePatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.x32.AbstractSurfacePatchType)get_store().find_element_user(ABSTRACTSURFACEPATCH$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abstractSurfacePatch);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractSurfacePatch" element
     */
    public net.opengis.gml.x32.AbstractSurfacePatchType insertNewAbstractSurfacePatch(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.x32.AbstractSurfacePatchType)get_store().insert_element_user(ABSTRACTSURFACEPATCH$1, ABSTRACTSURFACEPATCH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractSurfacePatch" element
     */
    public net.opengis.gml.x32.AbstractSurfacePatchType addNewAbstractSurfacePatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.x32.AbstractSurfacePatchType)get_store().add_element_user(ABSTRACTSURFACEPATCH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AbstractSurfacePatch" element
     */
    public void removeAbstractSurfacePatch(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACTSURFACEPATCH$1, i);
        }
    }
}
