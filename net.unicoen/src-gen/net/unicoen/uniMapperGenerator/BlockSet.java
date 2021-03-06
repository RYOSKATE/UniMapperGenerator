/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.BlockSet#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getBlockSet()
 * @model
 * @generated
 */
public interface BlockSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link net.unicoen.uniMapperGenerator.SetElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getBlockSet_Elements()
   * @model containment="true"
   * @generated
   */
  EList<SetElement> getElements();

} // BlockSet
