/**
 */
package libraries;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link libraries.ModelVersion#getMajorVersionNumber <em>Major Version Number</em>}</li>
 *   <li>{@link libraries.ModelVersion#getMinorVersionNumber <em>Minor Version Number</em>}</li>
 *   <li>{@link libraries.ModelVersion#getLastModifiedFileStamp <em>Last Modified File Stamp</em>}</li>
 * </ul>
 *
 * @see libraries.LibrariesPackage#getModelVersion()
 * @model
 * @generated
 */
public interface ModelVersion extends LibraryAbstractElement {
	/**
	 * Returns the value of the '<em><b>Major Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major Version Number</em>' attribute.
	 * @see #setMajorVersionNumber(int)
	 * @see libraries.LibrariesPackage#getModelVersion_MajorVersionNumber()
	 * @model required="true"
	 * @generated
	 */
	int getMajorVersionNumber();

	/**
	 * Sets the value of the '{@link libraries.ModelVersion#getMajorVersionNumber <em>Major Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Version Number</em>' attribute.
	 * @see #getMajorVersionNumber()
	 * @generated
	 */
	void setMajorVersionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Minor Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor Version Number</em>' attribute.
	 * @see #setMinorVersionNumber(int)
	 * @see libraries.LibrariesPackage#getModelVersion_MinorVersionNumber()
	 * @model required="true"
	 * @generated
	 */
	int getMinorVersionNumber();

	/**
	 * Sets the value of the '{@link libraries.ModelVersion#getMinorVersionNumber <em>Minor Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Version Number</em>' attribute.
	 * @see #getMinorVersionNumber()
	 * @generated
	 */
	void setMinorVersionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Last Modified File Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified File Stamp</em>' attribute.
	 * @see #setLastModifiedFileStamp(long)
	 * @see libraries.LibrariesPackage#getModelVersion_LastModifiedFileStamp()
	 * @model
	 * @generated
	 */
	long getLastModifiedFileStamp();

	/**
	 * Sets the value of the '{@link libraries.ModelVersion#getLastModifiedFileStamp <em>Last Modified File Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified File Stamp</em>' attribute.
	 * @see #getLastModifiedFileStamp()
	 * @generated
	 */
	void setLastModifiedFileStamp(long value);

} // ModelVersion
