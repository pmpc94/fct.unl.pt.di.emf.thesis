/**
 */
package search;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link search.BaseClass#isIsLast <em>Is Last</em>}</li>
 *   <li>{@link search.BaseClass#isIsFirst <em>Is First</em>}</li>
 * </ul>
 *
 * @see search.SearchPackage#getBaseClass()
 * @model
 * @generated
 */
public interface BaseClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Last</em>' attribute.
	 * @see #setIsLast(boolean)
	 * @see search.SearchPackage#getBaseClass_IsLast()
	 * @model
	 * @generated
	 */
	boolean isIsLast();

	/**
	 * Sets the value of the '{@link search.BaseClass#isIsLast <em>Is Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Last</em>' attribute.
	 * @see #isIsLast()
	 * @generated
	 */
	void setIsLast(boolean value);

	/**
	 * Returns the value of the '<em><b>Is First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is First</em>' attribute.
	 * @see #setIsFirst(boolean)
	 * @see search.SearchPackage#getBaseClass_IsFirst()
	 * @model
	 * @generated
	 */
	boolean isIsFirst();

	/**
	 * Sets the value of the '{@link search.BaseClass#isIsFirst <em>Is First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is First</em>' attribute.
	 * @see #isIsFirst()
	 * @generated
	 */
	void setIsFirst(boolean value);

} // BaseClass
