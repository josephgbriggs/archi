/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.editor.ui.factory.business;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import uk.ac.bolton.archimate.editor.diagram.editparts.business.BusinessInteractionEditPart;
import uk.ac.bolton.archimate.editor.ui.IArchimateImages;
import uk.ac.bolton.archimate.model.IArchimatePackage;


/**
 * Business Interaction UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class BusinessInteractionUIProvider extends AbstractBusinessUIProvider {

    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getBusinessInteraction();
    }
    
    @Override
    public EditPart createEditPart() {
        return new BusinessInteractionEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.BusinessInteractionUIProvider_0;
    }

    @Override
    public String getDefaultShortName() {
        return Messages.BusinessInteractionUIProvider_1;
    }

    @Override
    public Image getImage() {
        return getImageWithUserFillColor(IArchimateImages.ICON_BUSINESS_INTERACTION_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return getImageDescriptorWithUserFillColor(IArchimateImages.ICON_BUSINESS_INTERACTION_16);
    }
}
