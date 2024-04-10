// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GreetingService.proto

// Protobuf Java Version: 4.26.1
package com.grpc;

/**
 * Protobuf type {@code com.grpc.HelloResponse}
 */
public final class HelloResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.grpc.HelloResponse)
    HelloResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      HelloResponse.class.getName());
  }
  // Use HelloResponse.newBuilder() to construct.
  private HelloResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private HelloResponse() {
    token_ = "";
    positions_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.GreetingServiceOuterClass.internal_static_com_grpc_HelloResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.GreetingServiceOuterClass.internal_static_com_grpc_HelloResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.HelloResponse.class, com.grpc.HelloResponse.Builder.class);
  }

  public static final int TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object token_ = "";
  /**
   * <code>string token = 1;</code>
   * @return The token.
   */
  @java.lang.Override
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <code>string token = 1;</code>
   * @return The bytes for token.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POSITIONS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.grpc.PlayerPosition> positions_;
  /**
   * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.grpc.PlayerPosition> getPositionsList() {
    return positions_;
  }
  /**
   * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.grpc.PlayerPositionOrBuilder> 
      getPositionsOrBuilderList() {
    return positions_;
  }
  /**
   * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
   */
  @java.lang.Override
  public int getPositionsCount() {
    return positions_.size();
  }
  /**
   * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
   */
  @java.lang.Override
  public com.grpc.PlayerPosition getPositions(int index) {
    return positions_.get(index);
  }
  /**
   * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
   */
  @java.lang.Override
  public com.grpc.PlayerPositionOrBuilder getPositionsOrBuilder(
      int index) {
    return positions_.get(index);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(token_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, token_);
    }
    for (int i = 0; i < positions_.size(); i++) {
      output.writeMessage(2, positions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(token_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, token_);
    }
    for (int i = 0; i < positions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, positions_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.HelloResponse)) {
      return super.equals(obj);
    }
    com.grpc.HelloResponse other = (com.grpc.HelloResponse) obj;

    if (!getToken()
        .equals(other.getToken())) return false;
    if (!getPositionsList()
        .equals(other.getPositionsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    if (getPositionsCount() > 0) {
      hash = (37 * hash) + POSITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPositionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.HelloResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.HelloResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.HelloResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.HelloResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.HelloResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.HelloResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.HelloResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.HelloResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.grpc.HelloResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.grpc.HelloResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.HelloResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.HelloResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.HelloResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.grpc.HelloResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.HelloResponse)
      com.grpc.HelloResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.GreetingServiceOuterClass.internal_static_com_grpc_HelloResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.GreetingServiceOuterClass.internal_static_com_grpc_HelloResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.HelloResponse.class, com.grpc.HelloResponse.Builder.class);
    }

    // Construct using com.grpc.HelloResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      token_ = "";
      if (positionsBuilder_ == null) {
        positions_ = java.util.Collections.emptyList();
      } else {
        positions_ = null;
        positionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.GreetingServiceOuterClass.internal_static_com_grpc_HelloResponse_descriptor;
    }

    @java.lang.Override
    public com.grpc.HelloResponse getDefaultInstanceForType() {
      return com.grpc.HelloResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.HelloResponse build() {
      com.grpc.HelloResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.HelloResponse buildPartial() {
      com.grpc.HelloResponse result = new com.grpc.HelloResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.grpc.HelloResponse result) {
      if (positionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          positions_ = java.util.Collections.unmodifiableList(positions_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.positions_ = positions_;
      } else {
        result.positions_ = positionsBuilder_.build();
      }
    }

    private void buildPartial0(com.grpc.HelloResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.token_ = token_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.HelloResponse) {
        return mergeFrom((com.grpc.HelloResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.HelloResponse other) {
      if (other == com.grpc.HelloResponse.getDefaultInstance()) return this;
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (positionsBuilder_ == null) {
        if (!other.positions_.isEmpty()) {
          if (positions_.isEmpty()) {
            positions_ = other.positions_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePositionsIsMutable();
            positions_.addAll(other.positions_);
          }
          onChanged();
        }
      } else {
        if (!other.positions_.isEmpty()) {
          if (positionsBuilder_.isEmpty()) {
            positionsBuilder_.dispose();
            positionsBuilder_ = null;
            positions_ = other.positions_;
            bitField0_ = (bitField0_ & ~0x00000002);
            positionsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPositionsFieldBuilder() : null;
          } else {
            positionsBuilder_.addAllMessages(other.positions_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              token_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.grpc.PlayerPosition m =
                  input.readMessage(
                      com.grpc.PlayerPosition.parser(),
                      extensionRegistry);
              if (positionsBuilder_ == null) {
                ensurePositionsIsMutable();
                positions_.add(m);
              } else {
                positionsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object token_ = "";
    /**
     * <code>string token = 1;</code>
     * @return The token.
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token = 1;</code>
     * @return The bytes for token.
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token = 1;</code>
     * @param value The token to set.
     * @return This builder for chaining.
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      token_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string token = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearToken() {
      token_ = getDefaultInstance().getToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string token = 1;</code>
     * @param value The bytes for token to set.
     * @return This builder for chaining.
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      token_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.grpc.PlayerPosition> positions_ =
      java.util.Collections.emptyList();
    private void ensurePositionsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        positions_ = new java.util.ArrayList<com.grpc.PlayerPosition>(positions_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.grpc.PlayerPosition, com.grpc.PlayerPosition.Builder, com.grpc.PlayerPositionOrBuilder> positionsBuilder_;

    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public java.util.List<com.grpc.PlayerPosition> getPositionsList() {
      if (positionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(positions_);
      } else {
        return positionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public int getPositionsCount() {
      if (positionsBuilder_ == null) {
        return positions_.size();
      } else {
        return positionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public com.grpc.PlayerPosition getPositions(int index) {
      if (positionsBuilder_ == null) {
        return positions_.get(index);
      } else {
        return positionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public Builder setPositions(
        int index, com.grpc.PlayerPosition value) {
      if (positionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePositionsIsMutable();
        positions_.set(index, value);
        onChanged();
      } else {
        positionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public Builder setPositions(
        int index, com.grpc.PlayerPosition.Builder builderForValue) {
      if (positionsBuilder_ == null) {
        ensurePositionsIsMutable();
        positions_.set(index, builderForValue.build());
        onChanged();
      } else {
        positionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public Builder addPositions(com.grpc.PlayerPosition value) {
      if (positionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePositionsIsMutable();
        positions_.add(value);
        onChanged();
      } else {
        positionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public Builder addPositions(
        int index, com.grpc.PlayerPosition value) {
      if (positionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePositionsIsMutable();
        positions_.add(index, value);
        onChanged();
      } else {
        positionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public Builder addPositions(
        com.grpc.PlayerPosition.Builder builderForValue) {
      if (positionsBuilder_ == null) {
        ensurePositionsIsMutable();
        positions_.add(builderForValue.build());
        onChanged();
      } else {
        positionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public Builder addPositions(
        int index, com.grpc.PlayerPosition.Builder builderForValue) {
      if (positionsBuilder_ == null) {
        ensurePositionsIsMutable();
        positions_.add(index, builderForValue.build());
        onChanged();
      } else {
        positionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public Builder addAllPositions(
        java.lang.Iterable<? extends com.grpc.PlayerPosition> values) {
      if (positionsBuilder_ == null) {
        ensurePositionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, positions_);
        onChanged();
      } else {
        positionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public Builder clearPositions() {
      if (positionsBuilder_ == null) {
        positions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        positionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public Builder removePositions(int index) {
      if (positionsBuilder_ == null) {
        ensurePositionsIsMutable();
        positions_.remove(index);
        onChanged();
      } else {
        positionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public com.grpc.PlayerPosition.Builder getPositionsBuilder(
        int index) {
      return getPositionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public com.grpc.PlayerPositionOrBuilder getPositionsOrBuilder(
        int index) {
      if (positionsBuilder_ == null) {
        return positions_.get(index);  } else {
        return positionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public java.util.List<? extends com.grpc.PlayerPositionOrBuilder> 
         getPositionsOrBuilderList() {
      if (positionsBuilder_ != null) {
        return positionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(positions_);
      }
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public com.grpc.PlayerPosition.Builder addPositionsBuilder() {
      return getPositionsFieldBuilder().addBuilder(
          com.grpc.PlayerPosition.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public com.grpc.PlayerPosition.Builder addPositionsBuilder(
        int index) {
      return getPositionsFieldBuilder().addBuilder(
          index, com.grpc.PlayerPosition.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.PlayerPosition positions = 2;</code>
     */
    public java.util.List<com.grpc.PlayerPosition.Builder> 
         getPositionsBuilderList() {
      return getPositionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.grpc.PlayerPosition, com.grpc.PlayerPosition.Builder, com.grpc.PlayerPositionOrBuilder> 
        getPositionsFieldBuilder() {
      if (positionsBuilder_ == null) {
        positionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.grpc.PlayerPosition, com.grpc.PlayerPosition.Builder, com.grpc.PlayerPositionOrBuilder>(
                positions_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        positions_ = null;
      }
      return positionsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.grpc.HelloResponse)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.HelloResponse)
  private static final com.grpc.HelloResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.HelloResponse();
  }

  public static com.grpc.HelloResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloResponse>
      PARSER = new com.google.protobuf.AbstractParser<HelloResponse>() {
    @java.lang.Override
    public HelloResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<HelloResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.HelloResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

