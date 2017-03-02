// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * PackageErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201702;

public class PackageErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PackageErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVAILD_PRODUCT_PACKAGE = "INVAILD_PRODUCT_PACKAGE";
    public static final java.lang.String _INACTIVE_RATE_CARD = "INACTIVE_RATE_CARD";
    public static final java.lang.String _PRODUCT_PACKAGE_NOT_IN_RATE_CARD = "PRODUCT_PACKAGE_NOT_IN_RATE_CARD";
    public static final java.lang.String _HAS_NO_UNARCHIVED_PRODUCT_PACKAGE_ITEM = "HAS_NO_UNARCHIVED_PRODUCT_PACKAGE_ITEM";
    public static final java.lang.String _NOT_SAME_RATE_CARD = "NOT_SAME_RATE_CARD";
    public static final java.lang.String _NOT_SAME_RATE_CARD_PRICING_MODEL = "NOT_SAME_RATE_CARD_PRICING_MODEL";
    public static final java.lang.String _NOT_SAME_RATE_CARD_WORKFLOW = "NOT_SAME_RATE_CARD_WORKFLOW";
    public static final java.lang.String _PACKAGES_NOT_ALLOWED_IN_PROGRAMMATIC_PROPOSALS = "PACKAGES_NOT_ALLOWED_IN_PROGRAMMATIC_PROPOSALS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final PackageErrorReason INVAILD_PRODUCT_PACKAGE = new PackageErrorReason(_INVAILD_PRODUCT_PACKAGE);
    public static final PackageErrorReason INACTIVE_RATE_CARD = new PackageErrorReason(_INACTIVE_RATE_CARD);
    public static final PackageErrorReason PRODUCT_PACKAGE_NOT_IN_RATE_CARD = new PackageErrorReason(_PRODUCT_PACKAGE_NOT_IN_RATE_CARD);
    public static final PackageErrorReason HAS_NO_UNARCHIVED_PRODUCT_PACKAGE_ITEM = new PackageErrorReason(_HAS_NO_UNARCHIVED_PRODUCT_PACKAGE_ITEM);
    public static final PackageErrorReason NOT_SAME_RATE_CARD = new PackageErrorReason(_NOT_SAME_RATE_CARD);
    public static final PackageErrorReason NOT_SAME_RATE_CARD_PRICING_MODEL = new PackageErrorReason(_NOT_SAME_RATE_CARD_PRICING_MODEL);
    public static final PackageErrorReason NOT_SAME_RATE_CARD_WORKFLOW = new PackageErrorReason(_NOT_SAME_RATE_CARD_WORKFLOW);
    public static final PackageErrorReason PACKAGES_NOT_ALLOWED_IN_PROGRAMMATIC_PROPOSALS = new PackageErrorReason(_PACKAGES_NOT_ALLOWED_IN_PROGRAMMATIC_PROPOSALS);
    public static final PackageErrorReason UNKNOWN = new PackageErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static PackageErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PackageErrorReason enumeration = (PackageErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PackageErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackageErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201702", "PackageError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}