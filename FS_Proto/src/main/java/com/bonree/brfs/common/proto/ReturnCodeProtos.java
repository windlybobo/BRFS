// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReturnCode.proto

package com.bonree.brfs.common.proto;

public final class ReturnCodeProtos {
  private ReturnCodeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum ReturnCodeEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    SUCCESS(0, 2000),
    AUTH_FAILED_ERROR(1, 3001),
    STORAGE_NAME_EXIST_ERROR(2, 4001),
    STORAGE_NAME_NOT_EXIST_ERROR(3, 4002),
    STORAGE_NAME_UPDATE_ERROR(4, 4003),
    DATA_DELETE_ERROR(5, 5001),
    DATA_WRITE_ERROR(6, 5002),
    DATA_READ_ERROR(7, 5003),
    ;
    
    public static final int SUCCESS_VALUE = 2000;
    public static final int AUTH_FAILED_ERROR_VALUE = 3001;
    public static final int STORAGE_NAME_EXIST_ERROR_VALUE = 4001;
    public static final int STORAGE_NAME_NOT_EXIST_ERROR_VALUE = 4002;
    public static final int STORAGE_NAME_UPDATE_ERROR_VALUE = 4003;
    public static final int DATA_DELETE_ERROR_VALUE = 5001;
    public static final int DATA_WRITE_ERROR_VALUE = 5002;
    public static final int DATA_READ_ERROR_VALUE = 5003;
    
    
    public final int getNumber() { return value; }
    
    public static ReturnCodeEnum valueOf(int value) {
      switch (value) {
        case 2000: return SUCCESS;
        case 3001: return AUTH_FAILED_ERROR;
        case 4001: return STORAGE_NAME_EXIST_ERROR;
        case 4002: return STORAGE_NAME_NOT_EXIST_ERROR;
        case 4003: return STORAGE_NAME_UPDATE_ERROR;
        case 5001: return DATA_DELETE_ERROR;
        case 5002: return DATA_WRITE_ERROR;
        case 5003: return DATA_READ_ERROR;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<ReturnCodeEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ReturnCodeEnum>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReturnCodeEnum>() {
            public ReturnCodeEnum findValueByNumber(int number) {
              return ReturnCodeEnum.valueOf(number);
            }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.bonree.brfs.common.proto.ReturnCodeProtos.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final ReturnCodeEnum[] VALUES = {
      SUCCESS, AUTH_FAILED_ERROR, STORAGE_NAME_EXIST_ERROR, STORAGE_NAME_NOT_EXIST_ERROR, STORAGE_NAME_UPDATE_ERROR, DATA_DELETE_ERROR, DATA_WRITE_ERROR, DATA_READ_ERROR, 
    };
    
    public static ReturnCodeEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private ReturnCodeEnum(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:brfs.proto.ReturnCodeEnum)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020ReturnCode.proto\022\nbrfs.proto*\335\001\n\016Retur" +
      "nCodeEnum\022\014\n\007SUCCESS\020\320\017\022\026\n\021AUTH_FAILED_E" +
      "RROR\020\271\027\022\035\n\030STORAGE_NAME_EXIST_ERROR\020\241\037\022!" +
      "\n\034STORAGE_NAME_NOT_EXIST_ERROR\020\242\037\022\036\n\031STO" +
      "RAGE_NAME_UPDATE_ERROR\020\243\037\022\026\n\021DATA_DELETE" +
      "_ERROR\020\211\'\022\025\n\020DATA_WRITE_ERROR\020\212\'\022\024\n\017DATA" +
      "_READ_ERROR\020\213\'B3\n\034com.bonree.brfs.common" +
      ".protoB\020ReturnCodeProtos\210\001\000"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}