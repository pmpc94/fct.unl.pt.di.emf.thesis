/**
 */
package thesis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import thesis.Drive;
import thesis.Search;
import thesis.Sync;
import thesis.ThesisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thesis.impl.SearchImpl#getDrives <em>Drives</em>}</li>
 *   <li>{@link thesis.impl.SearchImpl#getSyncs <em>Syncs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchImpl extends EObjectImpl implements Search {
	/**
	 * The cached value of the '{@link #getDrives() <em>Drives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrives()
	 * @generated
	 * @ordered
	 */
	protected EList<Drive> drives;

	/**
	 * The cached value of the '{@link #getSyncs() <em>Syncs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncs()
	 * @generated
	 * @ordered
	 */
	protected EList<Sync> syncs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThesisPackage.Literals.SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drive> getDrives() {
		if (drives == null) {
			drives = new EObjectContainmentEList<Drive>(Drive.class, this, ThesisPackage.SEARCH__DRIVES);
		}
		return drives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sync> getSyncs() {
		if (syncs == null) {
			syncs = new EObjectContainmentEList<Sync>(Sync.class, this, ThesisPackage.SEARCH__SYNCS);
		}
		return syncs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThesisPackage.SEARCH__DRIVES:
				return ((InternalEList<?>)getDrives()).basicRemove(otherEnd, msgs);
			case ThesisPackage.SEARCH__SYNCS:
				return ((InternalEList<?>)getSyncs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThesisPackage.SEARCH__DRIVES:
				return getDrives();
			case ThesisPackage.SEARCH__SYNCS:
				return getSyncs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ThesisPackage.SEARCH__DRIVES:
				getDrives().clear();
				getDrives().addAll((Collection<? extends Drive>)newValue);
				return;
			case ThesisPackage.SEARCH__SYNCS:
				getSyncs().clear();
				getSyncs().addAll((Collection<? extends Sync>)newValue);
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
			case ThesisPackage.SEARCH__DRIVES:
				getDrives().clear();
				return;
			case ThesisPackage.SEARCH__SYNCS:
				getSyncs().clear();
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
			case ThesisPackage.SEARCH__DRIVES:
				return drives != null && !drives.isEmpty();
			case ThesisPackage.SEARCH__SYNCS:
				return syncs != null && !syncs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SearchImpl
