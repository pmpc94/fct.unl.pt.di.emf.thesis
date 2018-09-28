/**
 */
package thesis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import search.SearchPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see thesis.ThesisFactory
 * @model kind="package"
 * @generated
 */
public interface ThesisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "thesis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/thesis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "thesis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThesisPackage eINSTANCE = thesis.impl.ThesisPackageImpl.init();

	/**
	 * The meta object id for the '{@link thesis.impl.SearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thesis.impl.SearchImpl
	 * @see thesis.impl.ThesisPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 0;

	/**
	 * The feature id for the '<em><b>Drives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__DRIVES = 0;

	/**
	 * The feature id for the '<em><b>Syncs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__SYNCS = 1;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link thesis.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thesis.impl.FileImpl
	 * @see thesis.impl.ThesisPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 5;

	/**
	 * The feature id for the '<em><b>Is Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__IS_LAST = SearchPackage.BASE_CLASS__IS_LAST;

	/**
	 * The feature id for the '<em><b>Is First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__IS_FIRST = SearchPackage.BASE_CLASS__IS_FIRST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = SearchPackage.BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = SearchPackage.BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link thesis.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thesis.impl.FolderImpl
	 * @see thesis.impl.ThesisPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 2;

	/**
	 * The feature id for the '<em><b>Is Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__IS_LAST = FILE__IS_LAST;

	/**
	 * The feature id for the '<em><b>Is First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__IS_FIRST = FILE__IS_FIRST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CONTENTS = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link thesis.impl.DriveImpl <em>Drive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thesis.impl.DriveImpl
	 * @see thesis.impl.ThesisPackageImpl#getDrive()
	 * @generated
	 */
	int DRIVE = 1;

	/**
	 * The feature id for the '<em><b>Is Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE__IS_LAST = FOLDER__IS_LAST;

	/**
	 * The feature id for the '<em><b>Is First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE__IS_FIRST = FOLDER__IS_FIRST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE__NAME = FOLDER__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE__CONTENTS = FOLDER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Drive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_FEATURE_COUNT = FOLDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link thesis.impl.ShortcutImpl <em>Shortcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thesis.impl.ShortcutImpl
	 * @see thesis.impl.ThesisPackageImpl#getShortcut()
	 * @generated
	 */
	int SHORTCUT = 3;

	/**
	 * The feature id for the '<em><b>Is Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT__IS_LAST = FILE__IS_LAST;

	/**
	 * The feature id for the '<em><b>Is First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT__IS_FIRST = FILE__IS_FIRST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT__TARGET = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shortcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link thesis.impl.SyncImpl <em>Sync</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thesis.impl.SyncImpl
	 * @see thesis.impl.ThesisPackageImpl#getSync()
	 * @generated
	 */
	int SYNC = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Sync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link thesis.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see thesis.Search
	 * @generated
	 */
	EClass getSearch();

	/**
	 * Returns the meta object for the containment reference list '{@link thesis.Search#getDrives <em>Drives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drives</em>'.
	 * @see thesis.Search#getDrives()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Drives();

	/**
	 * Returns the meta object for the containment reference list '{@link thesis.Search#getSyncs <em>Syncs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Syncs</em>'.
	 * @see thesis.Search#getSyncs()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Syncs();

	/**
	 * Returns the meta object for class '{@link thesis.Drive <em>Drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drive</em>'.
	 * @see thesis.Drive
	 * @generated
	 */
	EClass getDrive();

	/**
	 * Returns the meta object for class '{@link thesis.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see thesis.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link thesis.Folder#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see thesis.Folder#getContents()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Contents();

	/**
	 * Returns the meta object for class '{@link thesis.Shortcut <em>Shortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shortcut</em>'.
	 * @see thesis.Shortcut
	 * @generated
	 */
	EClass getShortcut();

	/**
	 * Returns the meta object for the reference '{@link thesis.Shortcut#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see thesis.Shortcut#getTarget()
	 * @see #getShortcut()
	 * @generated
	 */
	EReference getShortcut_Target();

	/**
	 * Returns the meta object for class '{@link thesis.Sync <em>Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync</em>'.
	 * @see thesis.Sync
	 * @generated
	 */
	EClass getSync();

	/**
	 * Returns the meta object for the reference '{@link thesis.Sync#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see thesis.Sync#getSource()
	 * @see #getSync()
	 * @generated
	 */
	EReference getSync_Source();

	/**
	 * Returns the meta object for the reference '{@link thesis.Sync#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see thesis.Sync#getTarget()
	 * @see #getSync()
	 * @generated
	 */
	EReference getSync_Target();

	/**
	 * Returns the meta object for class '{@link thesis.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see thesis.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link thesis.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see thesis.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThesisFactory getThesisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link thesis.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thesis.impl.SearchImpl
		 * @see thesis.impl.ThesisPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '<em><b>Drives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__DRIVES = eINSTANCE.getSearch_Drives();

		/**
		 * The meta object literal for the '<em><b>Syncs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__SYNCS = eINSTANCE.getSearch_Syncs();

		/**
		 * The meta object literal for the '{@link thesis.impl.DriveImpl <em>Drive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thesis.impl.DriveImpl
		 * @see thesis.impl.ThesisPackageImpl#getDrive()
		 * @generated
		 */
		EClass DRIVE = eINSTANCE.getDrive();

		/**
		 * The meta object literal for the '{@link thesis.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thesis.impl.FolderImpl
		 * @see thesis.impl.ThesisPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__CONTENTS = eINSTANCE.getFolder_Contents();

		/**
		 * The meta object literal for the '{@link thesis.impl.ShortcutImpl <em>Shortcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thesis.impl.ShortcutImpl
		 * @see thesis.impl.ThesisPackageImpl#getShortcut()
		 * @generated
		 */
		EClass SHORTCUT = eINSTANCE.getShortcut();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORTCUT__TARGET = eINSTANCE.getShortcut_Target();

		/**
		 * The meta object literal for the '{@link thesis.impl.SyncImpl <em>Sync</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thesis.impl.SyncImpl
		 * @see thesis.impl.ThesisPackageImpl#getSync()
		 * @generated
		 */
		EClass SYNC = eINSTANCE.getSync();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNC__SOURCE = eINSTANCE.getSync_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNC__TARGET = eINSTANCE.getSync_Target();

		/**
		 * The meta object literal for the '{@link thesis.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thesis.impl.FileImpl
		 * @see thesis.impl.ThesisPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

	}

} //ThesisPackage
