/**
 */
package search.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import search.BaseClass;
import search.SearchFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Base Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseClassTest extends TestCase {

	/**
	 * The fixture for this Base Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseClass fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BaseClassTest.class);
	}

	/**
	 * Constructs a new Base Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseClassTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Base Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BaseClass fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Base Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseClass getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SearchFactory.eINSTANCE.createBaseClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BaseClassTest
