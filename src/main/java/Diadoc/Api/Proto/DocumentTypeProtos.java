// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DocumentType.proto

package Diadoc.Api.Proto;

public final class DocumentTypeProtos {
  private DocumentTypeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code Diadoc.Api.Proto.DocumentType}
   */
  public enum DocumentType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UnknownDocumentType = -1;</code>
     *
     * <pre>
     * reserved for backward compatibility
     * </pre>
     */
    UnknownDocumentType(0, -1),
    /**
     * <code>Nonformalized = 0;</code>
     */
    Nonformalized(1, 0),
    /**
     * <code>Invoice = 1;</code>
     */
    Invoice(2, 1),
    /**
     * <code>TrustConnectionRequest = 11;</code>
     */
    TrustConnectionRequest(3, 11),
    /**
     * <code>Torg12 = 12;</code>
     */
    Torg12(4, 12),
    /**
     * <code>InvoiceRevision = 13;</code>
     */
    InvoiceRevision(5, 13),
    /**
     * <code>InvoiceCorrection = 14;</code>
     */
    InvoiceCorrection(6, 14),
    /**
     * <code>InvoiceCorrectionRevision = 15;</code>
     */
    InvoiceCorrectionRevision(7, 15),
    /**
     * <code>AcceptanceCertificate = 16;</code>
     */
    AcceptanceCertificate(8, 16),
    /**
     * <code>ProformaInvoice = 18;</code>
     */
    ProformaInvoice(9, 18),
    /**
     * <code>XmlTorg12 = 19;</code>
     */
    XmlTorg12(10, 19),
    /**
     * <code>XmlAcceptanceCertificate = 20;</code>
     */
    XmlAcceptanceCertificate(11, 20),
    /**
     * <code>PriceList = 26;</code>
     */
    PriceList(12, 26),
    /**
     * <code>PriceListAgreement = 30;</code>
     */
    PriceListAgreement(13, 30),
    /**
     * <code>CertificateRegistry = 34;</code>
     */
    CertificateRegistry(14, 34),
    /**
     * <code>ReconciliationAct = 35;</code>
     */
    ReconciliationAct(15, 35),
    /**
     * <code>Contract = 36;</code>
     */
    Contract(16, 36),
    /**
     * <code>Torg13 = 37;</code>
     */
    Torg13(17, 37),
    /**
     * <code>ServiceDetails = 38;</code>
     */
    ServiceDetails(18, 38),
    /**
     * <code>SupplementaryAgreement = 40;</code>
     */
    SupplementaryAgreement(19, 40),
    /**
     * <code>UniversalTransferDocument = 41;</code>
     */
    UniversalTransferDocument(20, 41),
    ;

    /**
     * <code>UnknownDocumentType = -1;</code>
     *
     * <pre>
     * reserved for backward compatibility
     * </pre>
     */
    public static final int UnknownDocumentType_VALUE = -1;
    /**
     * <code>Nonformalized = 0;</code>
     */
    public static final int Nonformalized_VALUE = 0;
    /**
     * <code>Invoice = 1;</code>
     */
    public static final int Invoice_VALUE = 1;
    /**
     * <code>TrustConnectionRequest = 11;</code>
     */
    public static final int TrustConnectionRequest_VALUE = 11;
    /**
     * <code>Torg12 = 12;</code>
     */
    public static final int Torg12_VALUE = 12;
    /**
     * <code>InvoiceRevision = 13;</code>
     */
    public static final int InvoiceRevision_VALUE = 13;
    /**
     * <code>InvoiceCorrection = 14;</code>
     */
    public static final int InvoiceCorrection_VALUE = 14;
    /**
     * <code>InvoiceCorrectionRevision = 15;</code>
     */
    public static final int InvoiceCorrectionRevision_VALUE = 15;
    /**
     * <code>AcceptanceCertificate = 16;</code>
     */
    public static final int AcceptanceCertificate_VALUE = 16;
    /**
     * <code>ProformaInvoice = 18;</code>
     */
    public static final int ProformaInvoice_VALUE = 18;
    /**
     * <code>XmlTorg12 = 19;</code>
     */
    public static final int XmlTorg12_VALUE = 19;
    /**
     * <code>XmlAcceptanceCertificate = 20;</code>
     */
    public static final int XmlAcceptanceCertificate_VALUE = 20;
    /**
     * <code>PriceList = 26;</code>
     */
    public static final int PriceList_VALUE = 26;
    /**
     * <code>PriceListAgreement = 30;</code>
     */
    public static final int PriceListAgreement_VALUE = 30;
    /**
     * <code>CertificateRegistry = 34;</code>
     */
    public static final int CertificateRegistry_VALUE = 34;
    /**
     * <code>ReconciliationAct = 35;</code>
     */
    public static final int ReconciliationAct_VALUE = 35;
    /**
     * <code>Contract = 36;</code>
     */
    public static final int Contract_VALUE = 36;
    /**
     * <code>Torg13 = 37;</code>
     */
    public static final int Torg13_VALUE = 37;
    /**
     * <code>ServiceDetails = 38;</code>
     */
    public static final int ServiceDetails_VALUE = 38;
    /**
     * <code>SupplementaryAgreement = 40;</code>
     */
    public static final int SupplementaryAgreement_VALUE = 40;
    /**
     * <code>UniversalTransferDocument = 41;</code>
     */
    public static final int UniversalTransferDocument_VALUE = 41;


    public final int getNumber() { return value; }

    public static DocumentType valueOf(int value) {
      switch (value) {
        case -1: return UnknownDocumentType;
        case 0: return Nonformalized;
        case 1: return Invoice;
        case 11: return TrustConnectionRequest;
        case 12: return Torg12;
        case 13: return InvoiceRevision;
        case 14: return InvoiceCorrection;
        case 15: return InvoiceCorrectionRevision;
        case 16: return AcceptanceCertificate;
        case 18: return ProformaInvoice;
        case 19: return XmlTorg12;
        case 20: return XmlAcceptanceCertificate;
        case 26: return PriceList;
        case 30: return PriceListAgreement;
        case 34: return CertificateRegistry;
        case 35: return ReconciliationAct;
        case 36: return Contract;
        case 37: return Torg13;
        case 38: return ServiceDetails;
        case 40: return SupplementaryAgreement;
        case 41: return UniversalTransferDocument;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DocumentType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<DocumentType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DocumentType>() {
            public DocumentType findValueByNumber(int number) {
              return DocumentType.valueOf(number);
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
      return Diadoc.Api.Proto.DocumentTypeProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final DocumentType[] VALUES = values();

    public static DocumentType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private DocumentType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.DocumentType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022DocumentType.proto\022\020Diadoc.Api.Proto*\340" +
      "\003\n\014DocumentType\022 \n\023UnknownDocumentType\020\377" +
      "\377\377\377\377\377\377\377\377\001\022\021\n\rNonformalized\020\000\022\013\n\007Invoice\020" +
      "\001\022\032\n\026TrustConnectionRequest\020\013\022\n\n\006Torg12\020" +
      "\014\022\023\n\017InvoiceRevision\020\r\022\025\n\021InvoiceCorrect" +
      "ion\020\016\022\035\n\031InvoiceCorrectionRevision\020\017\022\031\n\025" +
      "AcceptanceCertificate\020\020\022\023\n\017ProformaInvoi" +
      "ce\020\022\022\r\n\tXmlTorg12\020\023\022\034\n\030XmlAcceptanceCert" +
      "ificate\020\024\022\r\n\tPriceList\020\032\022\026\n\022PriceListAgr" +
      "eement\020\036\022\027\n\023CertificateRegistry\020\"\022\025\n\021Rec",
      "onciliationAct\020#\022\014\n\010Contract\020$\022\n\n\006Torg13" +
      "\020%\022\022\n\016ServiceDetails\020&\022\032\n\026SupplementaryA" +
      "greement\020(\022\035\n\031UniversalTransferDocument\020" +
      ")B\024B\022DocumentTypeProtos"
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
