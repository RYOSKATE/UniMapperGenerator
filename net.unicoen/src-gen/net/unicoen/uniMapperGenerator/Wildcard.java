/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.Wildcard#getDot <em>Dot</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.Wildcard#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getWildcard()
 * @model
 * @generated
 */
public interface Wildcard extends EObject
{
  /**
   * Returns the value of the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dot</em>' attribute.
   * @see #setDot(String)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getWildcard_Dot()
   * @model
   * @generated
   */
  String getDot();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.Wildcard#getDot <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dot</em>' attribute.
   * @see #getDot()
   * @generated
   */
  void setDot(String value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference.
   * @see #setOptions(ElementOptions)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getWildcard_Options()
   * @model containment="true"
   * @generated
   */
  ElementOptions getOptions();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.Wildcard#getOptions <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Options</em>' containment reference.
   * @see #getOptions()
   * @generated
   */
  void setOptions(ElementOptions value);

} // Wildcard
