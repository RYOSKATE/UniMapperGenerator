/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.ElementOption#getQualifiedId <em>Qualified Id</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.ElementOption#getId <em>Id</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.ElementOption#getAssign <em>Assign</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.ElementOption#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getElementOption()
 * @model
 * @generated
 */
public interface ElementOption extends EObject
{
  /**
   * Returns the value of the '<em><b>Qualified Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Id</em>' containment reference.
   * @see #setQualifiedId(QualifiedId)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getElementOption_QualifiedId()
   * @model containment="true"
   * @generated
   */
  QualifiedId getQualifiedId();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.ElementOption#getQualifiedId <em>Qualified Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Id</em>' containment reference.
   * @see #getQualifiedId()
   * @generated
   */
  void setQualifiedId(QualifiedId value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getElementOption_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.ElementOption#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Assign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' attribute.
   * @see #setAssign(String)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getElementOption_Assign()
   * @model
   * @generated
   */
  String getAssign();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.ElementOption#getAssign <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign</em>' attribute.
   * @see #getAssign()
   * @generated
   */
  void setAssign(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(OptionValue)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getElementOption_Value()
   * @model containment="true"
   * @generated
   */
  OptionValue getValue();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.ElementOption#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(OptionValue value);

} // ElementOption
