/**
 * ReadSpaceshipResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics.grupp14;

public class ReadSpaceshipResponse  implements java.io.Serializable {
    private se.lu.ics.grupp14.Spaceship[] readSpaceshipResult;

    public ReadSpaceshipResponse() {
    }

    public ReadSpaceshipResponse(
           se.lu.ics.grupp14.Spaceship[] readSpaceshipResult) {
           this.readSpaceshipResult = readSpaceshipResult;
    }


    /**
     * Gets the readSpaceshipResult value for this ReadSpaceshipResponse.
     * 
     * @return readSpaceshipResult
     */
    public se.lu.ics.grupp14.Spaceship[] getReadSpaceshipResult() {
        return readSpaceshipResult;
    }


    /**
     * Sets the readSpaceshipResult value for this ReadSpaceshipResponse.
     * 
     * @param readSpaceshipResult
     */
    public void setReadSpaceshipResult(se.lu.ics.grupp14.Spaceship[] readSpaceshipResult) {
        this.readSpaceshipResult = readSpaceshipResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadSpaceshipResponse)) return false;
        ReadSpaceshipResponse other = (ReadSpaceshipResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.readSpaceshipResult==null && other.getReadSpaceshipResult()==null) || 
             (this.readSpaceshipResult!=null &&
              java.util.Arrays.equals(this.readSpaceshipResult, other.getReadSpaceshipResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReadSpaceshipResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReadSpaceshipResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReadSpaceshipResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadSpaceshipResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", ">ReadSpaceshipResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readSpaceshipResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "ReadSpaceshipResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "Spaceship"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://grupp14.ics.lu.se", "Spaceship"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
