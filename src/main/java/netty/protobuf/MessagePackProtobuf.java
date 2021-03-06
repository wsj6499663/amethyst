// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessagePackProtobuf.proto

package netty.protobuf;

public final class MessagePackProtobuf {
  private MessagePackProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 version = 1;</code>
     */
    int getVersion();

    /**
     * <code>int64 requestId = 2;</code>
     */
    long getRequestId();

    /**
     * <code>string messageType = 3;</code>
     */
    String getMessageType();
    /**
     * <code>string messageType = 3;</code>
     */
    com.google.protobuf.ByteString
        getMessageTypeBytes();

    /**
     * <code>bytes message = 4;</code>
     */
    com.google.protobuf.ByteString getMessage();
  }
  /**
   * Protobuf type {@code Message}
   */
  public  static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Message)
      MessageOrBuilder {
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      version_ = 0;
      requestId_ = 0L;
      messageType_ = "";
      message_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              version_ = input.readInt32();
              break;
            }
            case 16: {

              requestId_ = input.readInt64();
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              messageType_ = s;
              break;
            }
            case 34: {

              message_ = input.readBytes();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessagePackProtobuf.internal_static_Message_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessagePackProtobuf.internal_static_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MessagePackProtobuf.Message.class, MessagePackProtobuf.Message.Builder.class);
    }

    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;
    /**
     * <code>int32 version = 1;</code>
     */
    public int getVersion() {
      return version_;
    }

    public static final int REQUESTID_FIELD_NUMBER = 2;
    private long requestId_;
    /**
     * <code>int64 requestId = 2;</code>
     */
    public long getRequestId() {
      return requestId_;
    }

    public static final int MESSAGETYPE_FIELD_NUMBER = 3;
    private volatile Object messageType_;
    /**
     * <code>string messageType = 3;</code>
     */
    public String getMessageType() {
      Object ref = messageType_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        messageType_ = s;
        return s;
      }
    }
    /**
     * <code>string messageType = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageTypeBytes() {
      Object ref = messageType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        messageType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString message_;
    /**
     * <code>bytes message = 4;</code>
     */
    public com.google.protobuf.ByteString getMessage() {
      return message_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (version_ != 0) {
        output.writeInt32(1, version_);
      }
      if (requestId_ != 0L) {
        output.writeInt64(2, requestId_);
      }
      if (!getMessageTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, messageType_);
      }
      if (!message_.isEmpty()) {
        output.writeBytes(4, message_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (version_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, version_);
      }
      if (requestId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, requestId_);
      }
      if (!getMessageTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, messageType_);
      }
      if (!message_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, message_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof MessagePackProtobuf.Message)) {
        return super.equals(obj);
      }
      MessagePackProtobuf.Message other = (MessagePackProtobuf.Message) obj;

      boolean result = true;
      result = result && (getVersion()
          == other.getVersion());
      result = result && (getRequestId()
          == other.getRequestId());
      result = result && getMessageType()
          .equals(other.getMessageType());
      result = result && getMessage()
          .equals(other.getMessage());
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion();
      hash = (37 * hash) + REQUESTID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRequestId());
      hash = (37 * hash) + MESSAGETYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMessageType().hashCode();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MessagePackProtobuf.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessagePackProtobuf.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessagePackProtobuf.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MessagePackProtobuf.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MessagePackProtobuf.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MessagePackProtobuf.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MessagePackProtobuf.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MessagePackProtobuf.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MessagePackProtobuf.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MessagePackProtobuf.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(MessagePackProtobuf.Message prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Message)
        MessagePackProtobuf.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MessagePackProtobuf.internal_static_Message_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MessagePackProtobuf.internal_static_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MessagePackProtobuf.Message.class, MessagePackProtobuf.Message.Builder.class);
      }

      // Construct using com.zhongan.amethyst.client.network.protobuf.MessagePackProtobuf.Message.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        version_ = 0;

        requestId_ = 0L;

        messageType_ = "";

        message_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MessagePackProtobuf.internal_static_Message_descriptor;
      }

      public MessagePackProtobuf.Message getDefaultInstanceForType() {
        return MessagePackProtobuf.Message.getDefaultInstance();
      }

      public MessagePackProtobuf.Message build() {
        MessagePackProtobuf.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MessagePackProtobuf.Message buildPartial() {
        MessagePackProtobuf.Message result = new MessagePackProtobuf.Message(this);
        result.version_ = version_;
        result.requestId_ = requestId_;
        result.messageType_ = messageType_;
        result.message_ = message_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MessagePackProtobuf.Message) {
          return mergeFrom((MessagePackProtobuf.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MessagePackProtobuf.Message other) {
        if (other == MessagePackProtobuf.Message.getDefaultInstance()) return this;
        if (other.getVersion() != 0) {
          setVersion(other.getVersion());
        }
        if (other.getRequestId() != 0L) {
          setRequestId(other.getRequestId());
        }
        if (!other.getMessageType().isEmpty()) {
          messageType_ = other.messageType_;
          onChanged();
        }
        if (other.getMessage() != com.google.protobuf.ByteString.EMPTY) {
          setMessage(other.getMessage());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MessagePackProtobuf.Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MessagePackProtobuf.Message) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int version_ ;
      /**
       * <code>int32 version = 1;</code>
       */
      public int getVersion() {
        return version_;
      }
      /**
       * <code>int32 version = 1;</code>
       */
      public Builder setVersion(int value) {

        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 version = 1;</code>
       */
      public Builder clearVersion() {

        version_ = 0;
        onChanged();
        return this;
      }

      private long requestId_ ;
      /**
       * <code>int64 requestId = 2;</code>
       */
      public long getRequestId() {
        return requestId_;
      }
      /**
       * <code>int64 requestId = 2;</code>
       */
      public Builder setRequestId(long value) {

        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 requestId = 2;</code>
       */
      public Builder clearRequestId() {

        requestId_ = 0L;
        onChanged();
        return this;
      }

      private Object messageType_ = "";
      /**
       * <code>string messageType = 3;</code>
       */
      public String getMessageType() {
        Object ref = messageType_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          messageType_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string messageType = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMessageTypeBytes() {
        Object ref = messageType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          messageType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string messageType = 3;</code>
       */
      public Builder setMessageType(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }

        messageType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string messageType = 3;</code>
       */
      public Builder clearMessageType() {

        messageType_ = getDefaultInstance().getMessageType();
        onChanged();
        return this;
      }
      /**
       * <code>string messageType = 3;</code>
       */
      public Builder setMessageTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

        messageType_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString message_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes message = 4;</code>
       */
      public com.google.protobuf.ByteString getMessage() {
        return message_;
      }
      /**
       * <code>bytes message = 4;</code>
       */
      public Builder setMessage(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }

        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes message = 4;</code>
       */
      public Builder clearMessage() {

        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:Message)
    }

    // @@protoc_insertion_point(class_scope:Message)
    private static final MessagePackProtobuf.Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MessagePackProtobuf.Message();
    }

    public static MessagePackProtobuf.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Message(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    public MessagePackProtobuf.Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\031MessagePackProtobuf.proto\"S\n\007Message\022\017" +
      "\n\007version\030\001 \001(\005\022\021\n\trequestId\030\002 \001(\003\022\023\n\013me" +
      "ssageType\030\003 \001(\t\022\017\n\007message\030\004 \001(\014B%\n#com." +
      "zhongan.amethyst.client.networkb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
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
    internal_static_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Message_descriptor,
        new String[] { "Version", "RequestId", "MessageType", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
