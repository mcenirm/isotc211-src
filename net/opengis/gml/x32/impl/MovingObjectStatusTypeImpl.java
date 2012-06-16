/*
 * XML Type:  MovingObjectStatusType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MovingObjectStatusType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML MovingObjectStatusType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class MovingObjectStatusTypeImpl extends net.opengis.gml.x32.impl.AbstractTimeSliceTypeImpl implements net.opengis.gml.x32.MovingObjectStatusType
{
    private static final long serialVersionUID = 1L;
    
    public MovingObjectStatusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "position");
    private static final javax.xml.namespace.QName POS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos");
    private static final javax.xml.namespace.QName LOCATIONNAME$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "locationName");
    private static final javax.xml.namespace.QName LOCATIONREFERENCE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "locationReference");
    private static final javax.xml.namespace.QName LOCATION$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "location");
    private static final org.apache.xmlbeans.QNameSet LOCATION$9 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "location"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "priorityLocation"),
    });
    private static final javax.xml.namespace.QName SPEED$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "speed");
    private static final javax.xml.namespace.QName BEARING$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "bearing");
    private static final javax.xml.namespace.QName ACCELERATION$14 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "acceleration");
    private static final javax.xml.namespace.QName ELEVATION$16 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "elevation");
    private static final javax.xml.namespace.QName STATUS$18 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "status");
    private static final javax.xml.namespace.QName STATUSREFERENCE$20 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "statusReference");
    
    
    /**
     * Gets the "position" element
     */
    public net.opengis.gml.x32.GeometryPropertyType getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryPropertyType)get_store().find_element_user(POSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "position" element
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITION$0) != 0;
        }
    }
    
    /**
     * Sets the "position" element
     */
    public void setPosition(net.opengis.gml.x32.GeometryPropertyType position)
    {
        generatedSetterHelperImpl(position, POSITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "position" element
     */
    public net.opengis.gml.x32.GeometryPropertyType addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryPropertyType)get_store().add_element_user(POSITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "position" element
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITION$0, 0);
        }
    }
    
    /**
     * Gets the "pos" element
     */
    public net.opengis.gml.x32.DirectPositionType getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(POS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pos" element
     */
    public boolean isSetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POS$2) != 0;
        }
    }
    
    /**
     * Sets the "pos" element
     */
    public void setPos(net.opengis.gml.x32.DirectPositionType pos)
    {
        generatedSetterHelperImpl(pos, POS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pos" element
     */
    public net.opengis.gml.x32.DirectPositionType addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().add_element_user(POS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "pos" element
     */
    public void unsetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POS$2, 0);
        }
    }
    
    /**
     * Gets the "locationName" element
     */
    public net.opengis.gml.x32.CodeType getLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(LOCATIONNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "locationName" element
     */
    public boolean isSetLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "locationName" element
     */
    public void setLocationName(net.opengis.gml.x32.CodeType locationName)
    {
        generatedSetterHelperImpl(locationName, LOCATIONNAME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "locationName" element
     */
    public net.opengis.gml.x32.CodeType addNewLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(LOCATIONNAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "locationName" element
     */
    public void unsetLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONNAME$4, 0);
        }
    }
    
    /**
     * Gets the "locationReference" element
     */
    public net.opengis.gml.x32.ReferenceType getLocationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(LOCATIONREFERENCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "locationReference" element
     */
    public boolean isSetLocationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONREFERENCE$6) != 0;
        }
    }
    
    /**
     * Sets the "locationReference" element
     */
    public void setLocationReference(net.opengis.gml.x32.ReferenceType locationReference)
    {
        generatedSetterHelperImpl(locationReference, LOCATIONREFERENCE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "locationReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewLocationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(LOCATIONREFERENCE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "locationReference" element
     */
    public void unsetLocationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONREFERENCE$6, 0);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public net.opengis.gml.x32.LocationPropertyType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LocationPropertyType target = null;
            target = (net.opengis.gml.x32.LocationPropertyType)get_store().find_element_user(LOCATION$9, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$9) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(net.opengis.gml.x32.LocationPropertyType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LocationPropertyType target = null;
            target = (net.opengis.gml.x32.LocationPropertyType)get_store().find_element_user(LOCATION$9, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.LocationPropertyType)get_store().add_element_user(LOCATION$8);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public net.opengis.gml.x32.LocationPropertyType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LocationPropertyType target = null;
            target = (net.opengis.gml.x32.LocationPropertyType)get_store().add_element_user(LOCATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$9, 0);
        }
    }
    
    /**
     * Gets the "speed" element
     */
    public net.opengis.gml.x32.MeasureType getSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(SPEED$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "speed" element
     */
    public boolean isSetSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPEED$10) != 0;
        }
    }
    
    /**
     * Sets the "speed" element
     */
    public void setSpeed(net.opengis.gml.x32.MeasureType speed)
    {
        generatedSetterHelperImpl(speed, SPEED$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "speed" element
     */
    public net.opengis.gml.x32.MeasureType addNewSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(SPEED$10);
            return target;
        }
    }
    
    /**
     * Unsets the "speed" element
     */
    public void unsetSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPEED$10, 0);
        }
    }
    
    /**
     * Gets the "bearing" element
     */
    public net.opengis.gml.x32.DirectionPropertyType getBearing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectionPropertyType target = null;
            target = (net.opengis.gml.x32.DirectionPropertyType)get_store().find_element_user(BEARING$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bearing" element
     */
    public boolean isSetBearing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEARING$12) != 0;
        }
    }
    
    /**
     * Sets the "bearing" element
     */
    public void setBearing(net.opengis.gml.x32.DirectionPropertyType bearing)
    {
        generatedSetterHelperImpl(bearing, BEARING$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bearing" element
     */
    public net.opengis.gml.x32.DirectionPropertyType addNewBearing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectionPropertyType target = null;
            target = (net.opengis.gml.x32.DirectionPropertyType)get_store().add_element_user(BEARING$12);
            return target;
        }
    }
    
    /**
     * Unsets the "bearing" element
     */
    public void unsetBearing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEARING$12, 0);
        }
    }
    
    /**
     * Gets the "acceleration" element
     */
    public net.opengis.gml.x32.MeasureType getAcceleration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(ACCELERATION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "acceleration" element
     */
    public boolean isSetAcceleration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCELERATION$14) != 0;
        }
    }
    
    /**
     * Sets the "acceleration" element
     */
    public void setAcceleration(net.opengis.gml.x32.MeasureType acceleration)
    {
        generatedSetterHelperImpl(acceleration, ACCELERATION$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "acceleration" element
     */
    public net.opengis.gml.x32.MeasureType addNewAcceleration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(ACCELERATION$14);
            return target;
        }
    }
    
    /**
     * Unsets the "acceleration" element
     */
    public void unsetAcceleration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCELERATION$14, 0);
        }
    }
    
    /**
     * Gets the "elevation" element
     */
    public net.opengis.gml.x32.MeasureType getElevation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(ELEVATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "elevation" element
     */
    public boolean isSetElevation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEVATION$16) != 0;
        }
    }
    
    /**
     * Sets the "elevation" element
     */
    public void setElevation(net.opengis.gml.x32.MeasureType elevation)
    {
        generatedSetterHelperImpl(elevation, ELEVATION$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "elevation" element
     */
    public net.opengis.gml.x32.MeasureType addNewElevation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(ELEVATION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "elevation" element
     */
    public void unsetElevation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEVATION$16, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public net.opengis.gml.x32.StringOrRefType getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().find_element_user(STATUS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$18) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(net.opengis.gml.x32.StringOrRefType status)
    {
        generatedSetterHelperImpl(status, STATUS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public net.opengis.gml.x32.StringOrRefType addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.StringOrRefType target = null;
            target = (net.opengis.gml.x32.StringOrRefType)get_store().add_element_user(STATUS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$18, 0);
        }
    }
    
    /**
     * Gets the "statusReference" element
     */
    public net.opengis.gml.x32.ReferenceType getStatusReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(STATUSREFERENCE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "statusReference" element
     */
    public boolean isSetStatusReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSREFERENCE$20) != 0;
        }
    }
    
    /**
     * Sets the "statusReference" element
     */
    public void setStatusReference(net.opengis.gml.x32.ReferenceType statusReference)
    {
        generatedSetterHelperImpl(statusReference, STATUSREFERENCE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "statusReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewStatusReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(STATUSREFERENCE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "statusReference" element
     */
    public void unsetStatusReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSREFERENCE$20, 0);
        }
    }
}
