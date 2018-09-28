/**
 */
package thesis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thesis.Search#getDrives <em>Drives</em>}</li>
 *   <li>{@link thesis.Search#getSyncs <em>Syncs</em>}</li>
 * </ul>
 *
 * @see thesis.ThesisPackage#getSearch()
 * @model
 * @generated
 */
public interface Search extends EObject {
	/**
	 * Returns the value of the '<em><b>Drives</b></em>' containment reference list.
	 * The list contents are of type {@link thesis.Drive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drives</em>' containment reference list.
	 * @see thesis.ThesisPackage#getSearch_Drives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Drive> getDrives();

	/**
	 * Returns the value of the '<em><b>Syncs</b></em>' containment reference list.
	 * The list contents are of type {@link thesis.Sync}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syncs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syncs</em>' containment reference list.
	 * @see thesis.ThesisPackage#getSearch_Syncs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sync> getSyncs();

} // Search
