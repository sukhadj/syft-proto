// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: syft_proto/frameworks/torch/tensors/interpreters/v1/placeholder.proto

package org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1;

public final class PlaceholderOuterClass {
  private PlaceholderOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlaceholderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:syft_proto.frameworks.torch.tensors.interpreters.v1.Placeholder)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
     * @return Whether the id field is set.
     */
    boolean hasId();
    /**
     * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
     * @return The id.
     */
    org.openmined.syftproto.types.syft.v1.IdOuterClass.Id getId();
    /**
     * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
     */
    org.openmined.syftproto.types.syft.v1.IdOuterClass.IdOrBuilder getIdOrBuilder();

    /**
     * <code>repeated string tags = 2[json_name = "tags"];</code>
     * @return A list containing the tags.
     */
    java.util.List<java.lang.String>
        getTagsList();
    /**
     * <code>repeated string tags = 2[json_name = "tags"];</code>
     * @return The count of tags.
     */
    int getTagsCount();
    /**
     * <code>repeated string tags = 2[json_name = "tags"];</code>
     * @param index The index of the element to return.
     * @return The tags at the given index.
     */
    java.lang.String getTags(int index);
    /**
     * <code>repeated string tags = 2[json_name = "tags"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the tags at the given index.
     */
    com.google.protobuf.ByteString
        getTagsBytes(int index);

    /**
     * <code>string description = 3[json_name = "description"];</code>
     * @return The description.
     */
    java.lang.String getDescription();
    /**
     * <code>string description = 3[json_name = "description"];</code>
     * @return The bytes for description.
     */
    com.google.protobuf.ByteString
        getDescriptionBytes();
  }
  /**
   * Protobuf type {@code syft_proto.frameworks.torch.tensors.interpreters.v1.Placeholder}
   */
  public  static final class Placeholder extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:syft_proto.frameworks.torch.tensors.interpreters.v1.Placeholder)
      PlaceholderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Placeholder.newBuilder() to construct.
    private Placeholder(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Placeholder() {
      tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      description_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Placeholder();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Placeholder(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
              org.openmined.syftproto.types.syft.v1.IdOuterClass.Id.Builder subBuilder = null;
              if (id_ != null) {
                subBuilder = id_.toBuilder();
              }
              id_ = input.readMessage(org.openmined.syftproto.types.syft.v1.IdOuterClass.Id.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(id_);
                id_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                tags_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              tags_.add(s);
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              description_ = s;
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          tags_ = tags_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.internal_static_syft_proto_frameworks_torch_tensors_interpreters_v1_Placeholder_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.internal_static_syft_proto_frameworks_torch_tensors_interpreters_v1_Placeholder_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder.class, org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private org.openmined.syftproto.types.syft.v1.IdOuterClass.Id id_;
    /**
     * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return id_ != null;
    }
    /**
     * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
     * @return The id.
     */
    public org.openmined.syftproto.types.syft.v1.IdOuterClass.Id getId() {
      return id_ == null ? org.openmined.syftproto.types.syft.v1.IdOuterClass.Id.getDefaultInstance() : id_;
    }
    /**
     * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
     */
    public org.openmined.syftproto.types.syft.v1.IdOuterClass.IdOrBuilder getIdOrBuilder() {
      return getId();
    }

    public static final int TAGS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList tags_;
    /**
     * <code>repeated string tags = 2[json_name = "tags"];</code>
     * @return A list containing the tags.
     */
    public com.google.protobuf.ProtocolStringList
        getTagsList() {
      return tags_;
    }
    /**
     * <code>repeated string tags = 2[json_name = "tags"];</code>
     * @return The count of tags.
     */
    public int getTagsCount() {
      return tags_.size();
    }
    /**
     * <code>repeated string tags = 2[json_name = "tags"];</code>
     * @param index The index of the element to return.
     * @return The tags at the given index.
     */
    public java.lang.String getTags(int index) {
      return tags_.get(index);
    }
    /**
     * <code>repeated string tags = 2[json_name = "tags"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the tags at the given index.
     */
    public com.google.protobuf.ByteString
        getTagsBytes(int index) {
      return tags_.getByteString(index);
    }

    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    private volatile java.lang.Object description_;
    /**
     * <code>string description = 3[json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      }
    }
    /**
     * <code>string description = 3[json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
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
      if (id_ != null) {
        output.writeMessage(1, getId());
      }
      for (int i = 0; i < tags_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tags_.getRaw(i));
      }
      if (!getDescriptionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getId());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < tags_.size(); i++) {
          dataSize += computeStringSizeNoTag(tags_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getTagsList().size();
      }
      if (!getDescriptionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
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
      if (!(obj instanceof org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder)) {
        return super.equals(obj);
      }
      org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder other = (org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder) obj;

      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (!getId()
            .equals(other.getId())) return false;
      }
      if (!getTagsList()
          .equals(other.getTagsList())) return false;
      if (!getDescription()
          .equals(other.getDescription())) return false;
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
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId().hashCode();
      }
      if (getTagsCount() > 0) {
        hash = (37 * hash) + TAGS_FIELD_NUMBER;
        hash = (53 * hash) + getTagsList().hashCode();
      }
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parseFrom(
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
    public static Builder newBuilder(org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder prototype) {
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
     * Protobuf type {@code syft_proto.frameworks.torch.tensors.interpreters.v1.Placeholder}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:syft_proto.frameworks.torch.tensors.interpreters.v1.Placeholder)
        org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.PlaceholderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.internal_static_syft_proto_frameworks_torch_tensors_interpreters_v1_Placeholder_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.internal_static_syft_proto_frameworks_torch_tensors_interpreters_v1_Placeholder_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder.class, org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder.Builder.class);
      }

      // Construct using org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder.newBuilder()
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
        if (idBuilder_ == null) {
          id_ = null;
        } else {
          id_ = null;
          idBuilder_ = null;
        }
        tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        description_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.internal_static_syft_proto_frameworks_torch_tensors_interpreters_v1_Placeholder_descriptor;
      }

      @java.lang.Override
      public org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder getDefaultInstanceForType() {
        return org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder.getDefaultInstance();
      }

      @java.lang.Override
      public org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder build() {
        org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder buildPartial() {
        org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder result = new org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder(this);
        int from_bitField0_ = bitField0_;
        if (idBuilder_ == null) {
          result.id_ = id_;
        } else {
          result.id_ = idBuilder_.build();
        }
        if (((bitField0_ & 0x00000001) != 0)) {
          tags_ = tags_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tags_ = tags_;
        result.description_ = description_;
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
        if (other instanceof org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder) {
          return mergeFrom((org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder other) {
        if (other == org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder.getDefaultInstance()) return this;
        if (other.hasId()) {
          mergeId(other.getId());
        }
        if (!other.tags_.isEmpty()) {
          if (tags_.isEmpty()) {
            tags_ = other.tags_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTagsIsMutable();
            tags_.addAll(other.tags_);
          }
          onChanged();
        }
        if (!other.getDescription().isEmpty()) {
          description_ = other.description_;
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
        org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.openmined.syftproto.types.syft.v1.IdOuterClass.Id id_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.openmined.syftproto.types.syft.v1.IdOuterClass.Id, org.openmined.syftproto.types.syft.v1.IdOuterClass.Id.Builder, org.openmined.syftproto.types.syft.v1.IdOuterClass.IdOrBuilder> idBuilder_;
      /**
       * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
       * @return Whether the id field is set.
       */
      public boolean hasId() {
        return idBuilder_ != null || id_ != null;
      }
      /**
       * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
       * @return The id.
       */
      public org.openmined.syftproto.types.syft.v1.IdOuterClass.Id getId() {
        if (idBuilder_ == null) {
          return id_ == null ? org.openmined.syftproto.types.syft.v1.IdOuterClass.Id.getDefaultInstance() : id_;
        } else {
          return idBuilder_.getMessage();
        }
      }
      /**
       * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
       */
      public Builder setId(org.openmined.syftproto.types.syft.v1.IdOuterClass.Id value) {
        if (idBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          id_ = value;
          onChanged();
        } else {
          idBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
       */
      public Builder setId(
          org.openmined.syftproto.types.syft.v1.IdOuterClass.Id.Builder builderForValue) {
        if (idBuilder_ == null) {
          id_ = builderForValue.build();
          onChanged();
        } else {
          idBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
       */
      public Builder mergeId(org.openmined.syftproto.types.syft.v1.IdOuterClass.Id value) {
        if (idBuilder_ == null) {
          if (id_ != null) {
            id_ =
              org.openmined.syftproto.types.syft.v1.IdOuterClass.Id.newBuilder(id_).mergeFrom(value).buildPartial();
          } else {
            id_ = value;
          }
          onChanged();
        } else {
          idBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
       */
      public Builder clearId() {
        if (idBuilder_ == null) {
          id_ = null;
          onChanged();
        } else {
          id_ = null;
          idBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
       */
      public org.openmined.syftproto.types.syft.v1.IdOuterClass.Id.Builder getIdBuilder() {
        
        onChanged();
        return getIdFieldBuilder().getBuilder();
      }
      /**
       * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
       */
      public org.openmined.syftproto.types.syft.v1.IdOuterClass.IdOrBuilder getIdOrBuilder() {
        if (idBuilder_ != null) {
          return idBuilder_.getMessageOrBuilder();
        } else {
          return id_ == null ?
              org.openmined.syftproto.types.syft.v1.IdOuterClass.Id.getDefaultInstance() : id_;
        }
      }
      /**
       * <code>.syft_proto.types.syft.v1.Id id = 1[json_name = "id"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.openmined.syftproto.types.syft.v1.IdOuterClass.Id, org.openmined.syftproto.types.syft.v1.IdOuterClass.Id.Builder, org.openmined.syftproto.types.syft.v1.IdOuterClass.IdOrBuilder> 
          getIdFieldBuilder() {
        if (idBuilder_ == null) {
          idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.openmined.syftproto.types.syft.v1.IdOuterClass.Id, org.openmined.syftproto.types.syft.v1.IdOuterClass.Id.Builder, org.openmined.syftproto.types.syft.v1.IdOuterClass.IdOrBuilder>(
                  getId(),
                  getParentForChildren(),
                  isClean());
          id_ = null;
        }
        return idBuilder_;
      }

      private com.google.protobuf.LazyStringList tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureTagsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          tags_ = new com.google.protobuf.LazyStringArrayList(tags_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string tags = 2[json_name = "tags"];</code>
       * @return A list containing the tags.
       */
      public com.google.protobuf.ProtocolStringList
          getTagsList() {
        return tags_.getUnmodifiableView();
      }
      /**
       * <code>repeated string tags = 2[json_name = "tags"];</code>
       * @return The count of tags.
       */
      public int getTagsCount() {
        return tags_.size();
      }
      /**
       * <code>repeated string tags = 2[json_name = "tags"];</code>
       * @param index The index of the element to return.
       * @return The tags at the given index.
       */
      public java.lang.String getTags(int index) {
        return tags_.get(index);
      }
      /**
       * <code>repeated string tags = 2[json_name = "tags"];</code>
       * @param index The index of the value to return.
       * @return The bytes of the tags at the given index.
       */
      public com.google.protobuf.ByteString
          getTagsBytes(int index) {
        return tags_.getByteString(index);
      }
      /**
       * <code>repeated string tags = 2[json_name = "tags"];</code>
       * @param index The index to set the value at.
       * @param value The tags to set.
       * @return This builder for chaining.
       */
      public Builder setTags(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureTagsIsMutable();
        tags_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string tags = 2[json_name = "tags"];</code>
       * @param value The tags to add.
       * @return This builder for chaining.
       */
      public Builder addTags(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureTagsIsMutable();
        tags_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string tags = 2[json_name = "tags"];</code>
       * @param values The tags to add.
       * @return This builder for chaining.
       */
      public Builder addAllTags(
          java.lang.Iterable<java.lang.String> values) {
        ensureTagsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tags_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string tags = 2[json_name = "tags"];</code>
       * @return This builder for chaining.
       */
      public Builder clearTags() {
        tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string tags = 2[json_name = "tags"];</code>
       * @param value The bytes of the tags to add.
       * @return This builder for chaining.
       */
      public Builder addTagsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureTagsIsMutable();
        tags_.add(value);
        onChanged();
        return this;
      }

      private java.lang.Object description_ = "";
      /**
       * <code>string description = 3[json_name = "description"];</code>
       * @return The description.
       */
      public java.lang.String getDescription() {
        java.lang.Object ref = description_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          description_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string description = 3[json_name = "description"];</code>
       * @return The bytes for description.
       */
      public com.google.protobuf.ByteString
          getDescriptionBytes() {
        java.lang.Object ref = description_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          description_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string description = 3[json_name = "description"];</code>
       * @param value The description to set.
       * @return This builder for chaining.
       */
      public Builder setDescription(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        description_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string description = 3[json_name = "description"];</code>
       * @return This builder for chaining.
       */
      public Builder clearDescription() {
        
        description_ = getDefaultInstance().getDescription();
        onChanged();
        return this;
      }
      /**
       * <code>string description = 3[json_name = "description"];</code>
       * @param value The bytes for description to set.
       * @return This builder for chaining.
       */
      public Builder setDescriptionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        description_ = value;
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


      // @@protoc_insertion_point(builder_scope:syft_proto.frameworks.torch.tensors.interpreters.v1.Placeholder)
    }

    // @@protoc_insertion_point(class_scope:syft_proto.frameworks.torch.tensors.interpreters.v1.Placeholder)
    private static final org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder();
    }

    public static org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Placeholder>
        PARSER = new com.google.protobuf.AbstractParser<Placeholder>() {
      @java.lang.Override
      public Placeholder parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Placeholder(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Placeholder> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Placeholder> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.openmined.syftproto.frameworks.torch.tensors.interpreters.v1.PlaceholderOuterClass.Placeholder getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_syft_proto_frameworks_torch_tensors_interpreters_v1_Placeholder_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_syft_proto_frameworks_torch_tensors_interpreters_v1_Placeholder_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEsyft_proto/frameworks/torch/tensors/in" +
      "terpreters/v1/placeholder.proto\0223syft_pr" +
      "oto.frameworks.torch.tensors.interpreter" +
      "s.v1\032!syft_proto/types/syft/v1/id.proto\"" +
      "q\n\013Placeholder\022,\n\002id\030\001 \001(\0132\034.syft_proto." +
      "types.syft.v1.IdR\002id\022\022\n\004tags\030\002 \003(\tR\004tags" +
      "\022 \n\013description\030\003 \001(\tR\013descriptionBB\n@or" +
      "g.openmined.syftproto.frameworks.torch.t" +
      "ensors.interpreters.v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.openmined.syftproto.types.syft.v1.IdOuterClass.getDescriptor(),
        });
    internal_static_syft_proto_frameworks_torch_tensors_interpreters_v1_Placeholder_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_syft_proto_frameworks_torch_tensors_interpreters_v1_Placeholder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_syft_proto_frameworks_torch_tensors_interpreters_v1_Placeholder_descriptor,
        new java.lang.String[] { "Id", "Tags", "Description", });
    org.openmined.syftproto.types.syft.v1.IdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
