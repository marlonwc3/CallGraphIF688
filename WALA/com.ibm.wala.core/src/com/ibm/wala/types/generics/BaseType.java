/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.wala.types.generics;

import com.ibm.wala.types.TypeReference;

public class BaseType extends TypeSignature {

  private final TypeReference t;
  
  final static BaseType BOOLEAN = new BaseType(TypeReference.BooleanName.toString(),TypeReference.Boolean);
  final static BaseType BYTE     = new BaseType(TypeReference.ByteName.toString(),TypeReference.Byte);
  final static BaseType SHORT = new BaseType(TypeReference.ShortName.toString(),TypeReference.Short);
  final static BaseType INT = new BaseType(TypeReference.IntName.toString(),TypeReference.Int);
  final static BaseType LONG = new BaseType(TypeReference.LongName.toString(),TypeReference.Long);
  final static BaseType FLOAT = new BaseType(TypeReference.FloatName.toString(),TypeReference.Float);
  final static BaseType DOUBLE  = new BaseType(TypeReference.DoubleName.toString(),TypeReference.Double);
  final static BaseType CHAR = new BaseType(TypeReference.CharName.toString(),TypeReference.Char);
  final static BaseType VOID = new BaseType(TypeReference.VoidName.toString(),TypeReference.Void);
  
  private BaseType(String s, TypeReference t) {
    super(s);
    this.t = t;
  }

  @Override
  public boolean isClassTypeSignature() {
    return false;
  }

  @Override
  public boolean isTypeVariable() {
    return false;
  }

  public TypeReference getType() {
    return t;
  }

  @Override
  public boolean isArrayTypeSignature() {
    return false;
  }

  @Override
  public boolean isBaseType() {
    return true;
  }

}
