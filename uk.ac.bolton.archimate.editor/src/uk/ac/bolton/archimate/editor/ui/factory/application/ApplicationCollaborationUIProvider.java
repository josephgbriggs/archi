/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.editor.ui.factory.application;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import uk.ac.bolton.archimate.editor.diagram.editparts.application.ApplicationCollaborationEditPart;
import uk.ac.bolton.archimate.editor.ui.IArchimateImages;
import uk.ac.bolton.archimate.model.IArchimatePackage;


/**
 * Application Collaboration UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class ApplicationCollaborationUIProvider extends AbstractApplicationUIProvider {

    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getApplicationCollaboration();
    }
    
    @Override
    public EditPart createEditPart() {
        return new ApplicationCollaborationEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.ApplicationCollaborationUIProvider_0;
    }

    @Override
    public String getDefaultShortName() {
        return Messages.ApplicationCollaborationUIProvider_1;
    }

    @Override
    public Image getImage() {
        return getImageWithUserFillColor(IArchimateImages.ICON_APPLICATION_COLLABORATION_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return getImageDescriptorWithUserFillColor(IArchimateImages.ICON_APPLICATION_COLLABORATION_16);
    }
}
