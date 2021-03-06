package com.medallies.lifemedid.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * The type Idp document.
 */
@Entity
@Table(name = "iDPDocuments")
public class IDPDocument implements Serializable {

    /**
     * The Idp document id.
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long idpDocumentId;

    /**
     * The Suffix.
     */
    @Column(name = "suffix")
    private String suffix;

    /**
     * The First name.
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * The Last name.
     */
    @Column(name = "last_name")
    private String lastName;

    /**
     * The Middle name.
     */
    @Column(name = "middle_name")
    private String middleName;

    /**
     * The Date of birth.
     */
    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "gender")
    private String gender;

    /**
     * The Issuing authority.
     */
    @Column(name = "issuing_authority")
    private String issuingAuthority;

    /**
     * The Issuing state.
     */
    @Column(name = "document_issuer")
    private String docIssuer;

    @Column(name = "document_issuance_date")
    private String docIssuanceDate;

    /**
     * The License expiration date.
     */
    @Column(name = "document_expiration_date")
    private String docExpirationDate;

    /**
     * The Document type.
     */
    @Column(name = "document_type")
    private String documentType;

    /**
     * The Document title.
     */
    @Column(name = "document_title")
    private String documentTitle;

    /**
     * The Document number.
     */
    @Column(name = "document_id")
    private String documentNumber;


    /**
     * The Applicant.
     */
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "application_id", referencedColumnName = "id")
    private Applicant applicant;

    @OneToMany(mappedBy = "idpDocument", cascade = { CascadeType.ALL })
    private List<TransactionDocs> transactionDocsList;

    /**
     * The Created date.
     */
    @Column(name = "created_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdDate;

    /**
     * The Updated date.
     */
    @Column(name = "updated_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedDate;

    /**
     * Gets idp document id.
     *
     * @return the idp document id
     */
    public long getIdpDocumentId () {
        return idpDocumentId;
    }

    /**
     * Sets idp document id.
     *
     * @param idpDocumentId the idp document id
     */
    public void setIdpDocumentId (long idpDocumentId) {
        this.idpDocumentId = idpDocumentId;
    }

    /**
     * Gets suffix.
     *
     * @return the suffix
     */
    public String getSuffix () {
        return suffix;
    }

    /**
     * Sets suffix.
     *
     * @param suffix the suffix
     */
    public void setSuffix (String suffix) {
        this.suffix = suffix;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName () {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName () {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets middle name.
     *
     * @return the middle name
     */
    public String getMiddleName () {
        return middleName;
    }

    /**
     * Sets middle name.
     *
     * @param middleName the middle name
     */
    public void setMiddleName (String middleName) {
        this.middleName = middleName;
    }

    /**
     * Gets date of birth.
     *
     * @return the date of birth
     */
    public String getDateOfBirth () {
        return dateOfBirth;
    }

    /**
     * Sets date of birth.
     *
     * @param dateOfBirth the date of birth
     */
    public void setDateOfBirth (String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender () {
        return gender;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    /**
     * Gets issuing authority.
     *
     * @return the issuing authority
     */
    public String getIssuingAuthority () {
        return issuingAuthority;
    }

    /**
     * Sets issuing authority.
     *
     * @param issuingAuthority the issuing authority
     */
    public void setIssuingAuthority (String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    /**
     * Gets issuing state.
     *
     * @return the issuing state
     */
    public String getDocIssuer () {
        return docIssuer;
    }

    /**
     * Sets issuing state.
     *
     * @param issuingState the issuing state
     */
    public void setDocIssuer (String issuingState) {
        this.docIssuer = issuingState;
    }

    public String getDocIssuanceDate () {
        return docIssuanceDate;
    }

    public void setDocIssuanceDate (String docIssuanceDate) {
        this.docIssuanceDate = docIssuanceDate;
    }

    /**
     * Gets license expiration date.
     *
     * @return the license expiration date
     */
    public String getDocExpirationDate () {
        return docExpirationDate;
    }

    /**
     * Sets license expiration date.
     *
     * @param licenseExpirationDate the license expiration date
     */
    public void setDocExpirationDate (String licenseExpirationDate) {
        this.docExpirationDate = licenseExpirationDate;
    }

    /**
     * Gets document type.
     *
     * @return the document type
     */
    public String getDocumentType () {
        return documentType;
    }

    /**
     * Sets document type.
     *
     * @param documentType the document type
     */
    public void setDocumentType (String documentType) {
        this.documentType = documentType;
    }

    /**
     * Gets document title.
     *
     * @return the document title
     */
    public String getDocumentTitle () {
        return documentTitle;
    }

    /**
     * Sets document title.
     *
     * @param documentTitle the document title
     */
    public void setDocumentTitle (String documentTitle) {
        this.documentTitle = documentTitle;
    }

    /**
     * Gets document number.
     *
     * @return the document number
     */
    public String getDocumentNumber () {
        return documentNumber;
    }

    /**
     * Sets document number.
     *
     * @param documentNumber the document number
     */
    public void setDocumentNumber (String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * Gets applicant.
     *
     * @return the applicant
     */
    public Applicant getApplicant () {
        return applicant;
    }

    /**
     * Sets applicant.
     *
     * @param applicant the applicant
     */
    public void setApplicant (Applicant applicant) {
        this.applicant = applicant;
    }

    public List<TransactionDocs> getTransactionDocsList () {
        return transactionDocsList;
    }

    public void setTransactionDocsList (List<TransactionDocs> transactionDocsList) {
        this.transactionDocsList = transactionDocsList;
    }

    /**
     * Gets created date.
     *
     * @return the created date
     */
    public Date getCreatedDate () {
        return createdDate;
    }

    /**
     * Sets created date.
     *
     * @param createdDate the created date
     */
    public void setCreatedDate (Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Gets updated date.
     *
     * @return the updated date
     */
    public Date getUpdatedDate () {
        return updatedDate;
    }

    /**
     * Sets updated date.
     *
     * @param updatedDate the updated date
     */
    public void setUpdatedDate (Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * Equals boolean.
     *
     * @param o the o
     * @return the boolean
     */
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!( o instanceof IDPDocument )) return false;

        IDPDocument that = (IDPDocument) o;

        if (!getFirstName( ).equals(that.getFirstName( ))) return false;
        if (!getLastName( ).equals(that.getLastName( ))) return false;
        if (!getMiddleName( ).equals(that.getMiddleName( ))) return false;
        if (!getDateOfBirth( ).equals(that.getDateOfBirth( ))) return false;
        if (!getIssuingAuthority( ).equals(that.getIssuingAuthority( ))) return false;
        if (!getDocIssuer( ).equals(that.getDocIssuer( ))) return false;
        if (!getDocExpirationDate( ).equals(that.getDocExpirationDate( ))) return false;
        if (!getDocumentType( ).equals(that.getDocumentType( ))) return false;
        if (!getDocumentTitle( ).equals(that.getDocumentTitle( ))) return false;
        return getDocumentNumber( ).equals(that.getDocumentNumber( ));

    }

    /**
     * Hash code int.
     *
     * @return the int
     */
    @Override
    public int hashCode () {
        int result = getFirstName( ).hashCode( );
        result = 31 * result + getLastName( ).hashCode( );
        result = 31 * result + getMiddleName( ).hashCode( );
        result = 31 * result + getDateOfBirth( ).hashCode( );
        result = 31 * result + getIssuingAuthority( ).hashCode( );
        result = 31 * result + getDocIssuer( ).hashCode( );
        result = 31 * result + getDocExpirationDate( ).hashCode( );
        result = 31 * result + getDocumentType( ).hashCode( );
        result = 31 * result + getDocumentTitle( ).hashCode( );
        result = 31 * result + getDocumentNumber( ).hashCode( );
        return result;
    }
}
