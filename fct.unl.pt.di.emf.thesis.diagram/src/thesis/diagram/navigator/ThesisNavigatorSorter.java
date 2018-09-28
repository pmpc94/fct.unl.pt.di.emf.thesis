/*
* 
*/
package thesis.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import thesis.diagram.part.ThesisVisualIDRegistry;

/**
 * @generated
 */
public class ThesisNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7005;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7004;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ThesisNavigatorItem) {
			ThesisNavigatorItem item = (ThesisNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ThesisVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
