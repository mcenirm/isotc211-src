/*
 * An XML document type.
 * Localname: AbstractObject
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractObjectDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractObject(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTOBJECT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractObject");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTOBJECT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCalendar"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGrid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Circle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PrimeMeridian"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ParameterValueGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ConventionalUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeometricComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeObject"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "QuantityExtent"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ConcatenatedOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DefinitionCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CylindricalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineStringSegment"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGML"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BSpline"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "UnitDefinition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coverageFunction"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationParameterGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodeticDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompoundCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValueList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CoverageMappingRule"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolyhedralSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OrientableCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CategoryExtent"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractFeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Bag"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationMethod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Count"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurveCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OffsetCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EnvelopeWithTimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EllipsoidalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolarCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByBulge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GridFunction"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractContinuousCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "QuantityList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Category"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CountList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ParameterValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimePrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeTopologyComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Boolean"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AffinePlacement"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Quantity"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurveSegment"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EngineeringCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DataBlock"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "File"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractImplicitGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AffineCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Shell"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CategoryList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GenericMetaData"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "SphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeTopologyPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Array"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractFeature"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ImageDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodeticCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeocentricCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractObject"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EngineeringDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractMetaData"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeClock"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LinearCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Arc"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PassThroughOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTopology"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Bezier"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcStringByBulge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservationAtDistance"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralParameterValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeEdge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeographicCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Node"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MovingObjectStatus"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Ellipsoid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ImageCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeature"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Clothoid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Dictionary"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CountExtent"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Grid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeInstant"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeSlice"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CoordinateSystemAxis"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CubicSpline"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ValueArray"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "UserDefinedCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Ring"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodesicString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ObliqueCartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Definition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DefinitionProxy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeOrdinalReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Geodesic"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BaseUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OrientableSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BooleanList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricAggregate"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ProjectedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Envelope"),
    });
    
    
    /**
     * Gets the "AbstractObject" element
     */
    public org.apache.xmlbeans.XmlObject getAbstractObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTOBJECT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractObject" element
     */
    public void setAbstractObject(org.apache.xmlbeans.XmlObject abstractObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTOBJECT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTOBJECT$0);
            }
            target.set(abstractObject);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractObject" element
     */
    public org.apache.xmlbeans.XmlObject addNewAbstractObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTOBJECT$0);
            return target;
        }
    }
}
