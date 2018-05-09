/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unicoen Type Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.UnicoenTypeDec#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getUnicoenTypeDec()
 * @model
 * @generated
 */
public interface UnicoenTypeDec extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(UnicoenTypeIdentifiers)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getUnicoenTypeDec_Type()
   * @model containment="true"
   * @generated
   */
  UnicoenTypeIdentifiers getType();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.UnicoenTypeDec#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(UnicoenTypeIdentifiers value);

} // UnicoenTypeDec
