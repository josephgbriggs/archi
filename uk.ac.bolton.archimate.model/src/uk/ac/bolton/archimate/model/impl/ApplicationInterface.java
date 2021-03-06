/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.bolton.archimate.model.IApplicationInterface;
import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IInterfaceElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.ApplicationInterface#getInterfaceType <em>Interface Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationInterface extends ArchimateElement implements IApplicationInterface {
    /**
     * The default value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterfaceType()
     * @generated
     * @ordered
     */
    protected static final int INTERFACE_TYPE_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterfaceType()
     * @generated
     * @ordered
     */
    protected int interfaceType = INTERFACE_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ApplicationInterface() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IArchimatePackage.Literals.APPLICATION_INTERFACE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getInterfaceType() {
        return interfaceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterfaceType(int newInterfaceType) {
        int oldInterfaceType = interfaceType;
        interfaceType = newInterfaceType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, IArchimatePackage.APPLICATION_INTERFACE__INTERFACE_TYPE, oldInterfaceType, interfaceType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case IArchimatePackage.APPLICATION_INTERFACE__INTERFACE_TYPE:
                return getInterfaceType();
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
            case IArchimatePackage.APPLICATION_INTERFACE__INTERFACE_TYPE:
                setInterfaceType((Integer)newValue);
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
            case IArchimatePackage.APPLICATION_INTERFACE__INTERFACE_TYPE:
                setInterfaceType(INTERFACE_TYPE_EDEFAULT);
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
            case IArchimatePackage.APPLICATION_INTERFACE__INTERFACE_TYPE:
                return interfaceType != INTERFACE_TYPE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == IInterfaceElement.class) {
            switch (derivedFeatureID) {
                case IArchimatePackage.APPLICATION_INTERFACE__INTERFACE_TYPE: return IArchimatePackage.INTERFACE_ELEMENT__INTERFACE_TYPE;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == IInterfaceElement.class) {
            switch (baseFeatureID) {
                case IArchimatePackage.INTERFACE_ELEMENT__INTERFACE_TYPE: return IArchimatePackage.APPLICATION_INTERFACE__INTERFACE_TYPE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (interfaceType: "); //$NON-NLS-1$
        result.append(interfaceType);
        result.append(')');
        return result.toString();
    }

} //ApplicationInterface
