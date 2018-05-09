/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unicoen Type Identifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.UnicoenTypeIdentifiers#getName <em>Name</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.UnicoenTypeIdentifiers#getTypevalue <em>Typevalue</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.UnicoenTypeIdentifiers#getDir <em>Dir</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.UnicoenTypeIdentifiers#getFieldvalue <em>Fieldvalue</em>}</li>
 * </ul>
 *
 * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getUnicoenTypeIdentifiers()
 * @model
 * @generated
 */
public interface UnicoenTypeIdentifiers extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getUnicoenTypeIdentifiers_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.UnicoenTypeIdentifiers#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Typevalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typevalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typevalue</em>' attribute.
   * @see #setTypevalue(String)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getUnicoenTypeIdentifiers_Typevalue()
   * @model
   * @generated
   */
  String getTypevalue();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.UnicoenTypeIdentifiers#getTypevalue <em>Typevalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typevalue</em>' attribute.
   * @see #getTypevalue()
   * @generated
   */
  void setTypevalue(String value);

  /**
   * Returns the value of the '<em><b>Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dir</em>' attribute.
   * @see #setDir(String)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getUnicoenTypeIdentifiers_Dir()
   * @model
   * @generated
   */
  String getDir();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.UnicoenTypeIdentifiers#getDir <em>Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dir</em>' attribute.
   * @see #getDir()
   * @generated
   */
  void setDir(String value);

  /**
   * Returns the value of the '<em><b>Fieldvalue</b></em>' containment reference list.
   * The list contents are of type {@link net.unicoen.uniMapperGenerator.QualifiedId}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fieldvalue</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fieldvalue</em>' containment reference list.
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getUnicoenTypeIdentifiers_Fieldvalue()
   * @model containment="true"
   * @generated
   */
  EList<QualifiedId> getFieldvalue();

} // UnicoenTypeIdentifiers
