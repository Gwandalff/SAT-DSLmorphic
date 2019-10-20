/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.sat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Solver</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.sat.SatPackage#getSolver()
 * @model
 * @generated
 */
public enum Solver implements Enumerator
{
  /**
   * The '<em><b>SAT4J JAVA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAT4J_JAVA_VALUE
   * @generated
   * @ordered
   */
  SAT4J_JAVA(0, "SAT4J_JAVA", "sat4j-java"),

  /**
   * The '<em><b>SAT4J JAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAT4J_JAR_VALUE
   * @generated
   * @ordered
   */
  SAT4J_JAR(1, "SAT4J_JAR", "sat4j-jar"),

  /**
   * The '<em><b>SAT4J COMP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAT4J_COMP_VALUE
   * @generated
   * @ordered
   */
  SAT4J_COMP(2, "SAT4J_COMP", "sat4j-maven");

  /**
   * The '<em><b>SAT4J JAVA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAT4J_JAVA
   * @model literal="sat4j-java"
   * @generated
   * @ordered
   */
  public static final int SAT4J_JAVA_VALUE = 0;

  /**
   * The '<em><b>SAT4J JAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAT4J_JAR
   * @model literal="sat4j-jar"
   * @generated
   * @ordered
   */
  public static final int SAT4J_JAR_VALUE = 1;

  /**
   * The '<em><b>SAT4J COMP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAT4J_COMP
   * @model literal="sat4j-maven"
   * @generated
   * @ordered
   */
  public static final int SAT4J_COMP_VALUE = 2;

  /**
   * An array of all the '<em><b>Solver</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Solver[] VALUES_ARRAY =
    new Solver[]
    {
      SAT4J_JAVA,
      SAT4J_JAR,
      SAT4J_COMP,
    };

  /**
   * A public read-only list of all the '<em><b>Solver</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Solver> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Solver</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Solver get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Solver result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Solver</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Solver getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Solver result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Solver</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Solver get(int value)
  {
    switch (value)
    {
      case SAT4J_JAVA_VALUE: return SAT4J_JAVA;
      case SAT4J_JAR_VALUE: return SAT4J_JAR;
      case SAT4J_COMP_VALUE: return SAT4J_COMP;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Solver(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Solver