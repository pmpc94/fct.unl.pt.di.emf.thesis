/**
 */
package search.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import search.BaseClass;
import search.SearchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link search.impl.BaseClassImpl#isIsLast <em>Is Last</em>}</li>
 *   <li>{@link search.impl.BaseClassImpl#isIsFirst <em>Is First</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseClassImpl extends EObjectImpl implements BaseClass {
	/**
	 * The default value of the '{@link #isIsLast() <em>Is Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLast() <em>Is Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLast()
	 * @generated
	 * @ordered
	 */
	protected boolean isLast = IS_LAST_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFirst() <em>Is First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FIRST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFirst() <em>Is First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean isFirst = IS_FIRST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchPackage.Literals.BASE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLast() {
		return isLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLast(boolean newIsLast) {
		boolean oldIsLast = isLast;
		isLast = newIsLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.BASE_CLASS__IS_LAST, oldIsLast, isLast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFirst() {
		return isFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFirst(boolean newIsFirst) {
		boolean oldIsFirst = isFirst;
		isFirst = newIsFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.BASE_CLASS__IS_FIRST, oldIsFirst, isFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SearchPackage.BASE_CLASS__IS_LAST:
				return isIsLast();
			case SearchPackage.BASE_CLASS__IS_FIRST:
				return isIsFirst();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SearchPackage.BASE_CLASS__IS_LAST:
				setIsLast((Boolean)newValue);
				return;
			case SearchPackage.BASE_CLASS__IS_FIRST:
				setIsFirst((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SearchPackage.BASE_CLASS__IS_LAST:
				setIsLast(IS_LAST_EDEFAULT);
				return;
			case SearchPackage.BASE_CLASS__IS_FIRST:
				setIsFirst(IS_FIRST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SearchPackage.BASE_CLASS__IS_LAST:
				return isLast != IS_LAST_EDEFAULT;
			case SearchPackage.BASE_CLASS__IS_FIRST:
				return isFirst != IS_FIRST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isLast: ");
		result.append(isLast);
		result.append(", isFirst: ");
		result.append(isFirst);
		result.append(')');
		return result.toString();
	}

} //BaseClassImpl
