/*
 * 
 */
package thesis.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import thesis.ThesisPackage;
import thesis.diagram.edit.parts.DriveName2EditPart;
import thesis.diagram.edit.parts.DriveNameEditPart;
import thesis.diagram.edit.parts.FileNameEditPart;
import thesis.diagram.edit.parts.FolderNameEditPart;
import thesis.diagram.edit.parts.ShortcutNameEditPart;
import thesis.diagram.parsers.MessageFormatParser;
import thesis.diagram.part.ThesisVisualIDRegistry;

/**
 * @generated
 */
public class ThesisParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser driveName_5005Parser;

	/**
	* @generated
	*/
	private IParser getDriveName_5005Parser() {
		if (driveName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ThesisPackage.eINSTANCE.getFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			driveName_5005Parser = parser;
		}
		return driveName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser driveName_5004Parser;

	/**
	* @generated
	*/
	private IParser getDriveName_5004Parser() {
		if (driveName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ThesisPackage.eINSTANCE.getFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			driveName_5004Parser = parser;
		}
		return driveName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser folderName_5003Parser;

	/**
	* @generated
	*/
	private IParser getFolderName_5003Parser() {
		if (folderName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ThesisPackage.eINSTANCE.getFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			folderName_5003Parser = parser;
		}
		return folderName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser shortcutName_5001Parser;

	/**
	* @generated
	*/
	private IParser getShortcutName_5001Parser() {
		if (shortcutName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ThesisPackage.eINSTANCE.getFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			shortcutName_5001Parser = parser;
		}
		return shortcutName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser fileName_5002Parser;

	/**
	* @generated
	*/
	private IParser getFileName_5002Parser() {
		if (fileName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ThesisPackage.eINSTANCE.getFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fileName_5002Parser = parser;
		}
		return fileName_5002Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DriveNameEditPart.VISUAL_ID:
			return getDriveName_5005Parser();
		case DriveName2EditPart.VISUAL_ID:
			return getDriveName_5004Parser();
		case FolderNameEditPart.VISUAL_ID:
			return getFolderName_5003Parser();
		case ShortcutNameEditPart.VISUAL_ID:
			return getShortcutName_5001Parser();
		case FileNameEditPart.VISUAL_ID:
			return getFileName_5002Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ThesisVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ThesisVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ThesisElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
