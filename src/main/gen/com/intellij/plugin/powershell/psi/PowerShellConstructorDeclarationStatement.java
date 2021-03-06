// This is a generated file. Not intended for manual editing.
package com.intellij.plugin.powershell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PowerShellConstructorDeclarationStatement extends PowerShellMemberDeclaration, PowerShellCallableDeclaration {

  @Nullable
  PowerShellBlockBody getBlockBody();

  @NotNull
  List<PowerShellComment> getCommentList();

  @NotNull
  PowerShellIdentifier getIdentifier();

  @NotNull
  List<PowerShellParameterClause> getParameterClauseList();

}
