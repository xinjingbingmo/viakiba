// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message/filedemo/adress.proto

package org.example.protobuf.message;

public final class AdressOuterClass {
  private AdressOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AdressOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.example.protobuf.message.Adress)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string adressName = 1;</code>
     * @return The adressName.
     */
    java.lang.String getAdressName();
    /**
     * <code>string adressName = 1;</code>
     * @return The bytes for adressName.
     */
    com.google.protobuf.ByteString
        getAdressNameBytes();
  }
  /**
   * Protobuf type {@code org.example.protobuf.message.Adress}
   */
  public static final class Adress extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.example.protobuf.message.Adress)
      AdressOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Adress.newBuilder() to construct.
    private Adress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Adress() {
      adressName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Adress();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Adress(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              adressName_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.protobuf.message.AdressOuterClass.internal_static_org_example_protobuf_message_Adress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.protobuf.message.AdressOuterClass.internal_static_org_example_protobuf_message_Adress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.protobuf.message.AdressOuterClass.Adress.class, org.example.protobuf.message.AdressOuterClass.Adress.Builder.class);
    }

    public static final int ADRESSNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object adressName_;
    /**
     * <code>string adressName = 1;</code>
     * @return The adressName.
     */
    @java.lang.Override
    public java.lang.String getAdressName() {
      java.lang.Object ref = adressName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        adressName_ = s;
        return s;
      }
    }
    /**
     * <code>string adressName = 1;</code>
     * @return The bytes for adressName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAdressNameBytes() {
      java.lang.Object ref = adressName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        adressName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getAdressNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, adressName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getAdressNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, adressName_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.example.protobuf.message.AdressOuterClass.Adress)) {
        return super.equals(obj);
      }
      org.example.protobuf.message.AdressOuterClass.Adress other = (org.example.protobuf.message.AdressOuterClass.Adress) obj;

      if (!getAdressName()
          .equals(other.getAdressName())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ADRESSNAME_FIELD_NUMBER;
      hash = (53 * hash) + getAdressName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.example.protobuf.message.AdressOuterClass.Adress parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.protobuf.message.AdressOuterClass.Adress parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.protobuf.message.AdressOuterClass.Adress parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.protobuf.message.AdressOuterClass.Adress parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.protobuf.message.AdressOuterClass.Adress parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.protobuf.message.AdressOuterClass.Adress parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.protobuf.message.AdressOuterClass.Adress parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.protobuf.message.AdressOuterClass.Adress parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.protobuf.message.AdressOuterClass.Adress parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.example.protobuf.message.AdressOuterClass.Adress parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.protobuf.message.AdressOuterClass.Adress parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.protobuf.message.AdressOuterClass.Adress parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.example.protobuf.message.AdressOuterClass.Adress prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.example.protobuf.message.Adress}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.example.protobuf.message.Adress)
        org.example.protobuf.message.AdressOuterClass.AdressOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.example.protobuf.message.AdressOuterClass.internal_static_org_example_protobuf_message_Adress_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.example.protobuf.message.AdressOuterClass.internal_static_org_example_protobuf_message_Adress_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.example.protobuf.message.AdressOuterClass.Adress.class, org.example.protobuf.message.AdressOuterClass.Adress.Builder.class);
      }

      // Construct using org.example.protobuf.message.AdressOuterClass.Adress.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        adressName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.example.protobuf.message.AdressOuterClass.internal_static_org_example_protobuf_message_Adress_descriptor;
      }

      @java.lang.Override
      public org.example.protobuf.message.AdressOuterClass.Adress getDefaultInstanceForType() {
        return org.example.protobuf.message.AdressOuterClass.Adress.getDefaultInstance();
      }

      @java.lang.Override
      public org.example.protobuf.message.AdressOuterClass.Adress build() {
        org.example.protobuf.message.AdressOuterClass.Adress result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.example.protobuf.message.AdressOuterClass.Adress buildPartial() {
        org.example.protobuf.message.AdressOuterClass.Adress result = new org.example.protobuf.message.AdressOuterClass.Adress(this);
        result.adressName_ = adressName_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.example.protobuf.message.AdressOuterClass.Adress) {
          return mergeFrom((org.example.protobuf.message.AdressOuterClass.Adress)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.example.protobuf.message.AdressOuterClass.Adress other) {
        if (other == org.example.protobuf.message.AdressOuterClass.Adress.getDefaultInstance()) return this;
        if (!other.getAdressName().isEmpty()) {
          adressName_ = other.adressName_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.example.protobuf.message.AdressOuterClass.Adress parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.example.protobuf.message.AdressOuterClass.Adress) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object adressName_ = "";
      /**
       * <code>string adressName = 1;</code>
       * @return The adressName.
       */
      public java.lang.String getAdressName() {
        java.lang.Object ref = adressName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          adressName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string adressName = 1;</code>
       * @return The bytes for adressName.
       */
      public com.google.protobuf.ByteString
          getAdressNameBytes() {
        java.lang.Object ref = adressName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          adressName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string adressName = 1;</code>
       * @param value The adressName to set.
       * @return This builder for chaining.
       */
      public Builder setAdressName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        adressName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string adressName = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAdressName() {
        
        adressName_ = getDefaultInstance().getAdressName();
        onChanged();
        return this;
      }
      /**
       * <code>string adressName = 1;</code>
       * @param value The bytes for adressName to set.
       * @return This builder for chaining.
       */
      public Builder setAdressNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        adressName_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.example.protobuf.message.Adress)
    }

    // @@protoc_insertion_point(class_scope:org.example.protobuf.message.Adress)
    private static final org.example.protobuf.message.AdressOuterClass.Adress DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.example.protobuf.message.AdressOuterClass.Adress();
    }

    public static org.example.protobuf.message.AdressOuterClass.Adress getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Adress>
        PARSER = new com.google.protobuf.AbstractParser<Adress>() {
      @java.lang.Override
      public Adress parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Adress(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Adress> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Adress> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.example.protobuf.message.AdressOuterClass.Adress getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_protobuf_message_Adress_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_protobuf_message_Adress_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035message/filedemo/adress.proto\022\034org.exa" +
      "mple.protobuf.message\"\034\n\006Adress\022\022\n\nadres" +
      "sName\030\001 \001(\tB\036\n\034org.example.protobuf.mess" +
      "ageb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_example_protobuf_message_Adress_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_example_protobuf_message_Adress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_protobuf_message_Adress_descriptor,
        new java.lang.String[] { "AdressName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
