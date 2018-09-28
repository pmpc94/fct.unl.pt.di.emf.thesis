/*
 * 
 */
package thesis.diagram.providers;

import thesis.diagram.part.ThesisDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ThesisDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ThesisDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
