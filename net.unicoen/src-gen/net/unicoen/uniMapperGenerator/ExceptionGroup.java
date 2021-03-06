/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.ExceptionGroup#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.ExceptionGroup#getFinally <em>Finally</em>}</li>
 * </ul>
 *
 * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getExceptionGroup()
 * @model
 * @generated
 */
public interface ExceptionGroup extends EObject
{
  /**
   * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
   * The list contents are of type {@link net.unicoen.uniMapperGenerator.ExceptionHandler}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handlers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handlers</em>' containment reference list.
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getExceptionGroup_Handlers()
   * @model containment="true"
   * @generated
   */
  EList<ExceptionHandler> getHandlers();

  /**
   * Returns the value of the '<em><b>Finally</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finally</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finally</em>' containment reference.
   * @see #setFinally(FinallyClause)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getExceptionGroup_Finally()
   * @model containment="true"
   * @generated
   */
  FinallyClause getFinally();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.ExceptionGroup#getFinally <em>Finally</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finally</em>' containment reference.
   * @see #getFinally()
   * @generated
   */
  void setFinally(FinallyClause value);

} // ExceptionGroup
